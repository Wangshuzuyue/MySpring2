package com.hzw.myspring2;

import com.hzw.myspring2.demo.entity.User;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/20 20:07
 * @Description:
 */
public class JdbcTest {

    public static void main(String[] args) {
        User condition = new User();
        condition.setAge(25);
        List<?> result = select(condition);
        System.out.println("结果：" + result);
    }

    private static List<?> select(Object condition){
        Class<?> entityClass = condition.getClass();
        Field[] fields = entityClass.getDeclaredFields();
        List<Object> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //1.加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hzwPlay?useUnicode=true&characterEncoding=utf8", "root", "12345678");
            //3.创建语句集
            String sql = "select * from user";
            pstm = conn.prepareStatement(sql);
            //4.执行语句集
            rs = pstm.executeQuery();

            //MetaData 保存了处理真正数值以外的其他全部信息
            int columnCount = rs.getMetaData().getColumnCount();
            //5.获取结果集
            while (rs.next()){
                Object entity = entityClass.newInstance();
                for(int i = 0; i <= columnCount; i++){
                    String columnName = rs.getMetaData().getColumnName(i);
                    Field field = entityClass.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(entity, rs.getObject(columnName));
                }

                list.add(entity);
            }

            //6.关闭结果集、关闭语句集、关闭连接
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (conn != null){
                    conn.close();
                }
                if (pstm != null){
                    pstm.close();
                }
                if (rs != null){
                    rs.close();
                }
            }catch (Exception e){
             e.printStackTrace();
            }

        }
        return list;
    }
}
