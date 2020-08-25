package com.hzw.myspring2.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/20 20:15
 * @Description:
 */
@Data
public class User {

    String id;

    String birth;

    String name;

    Integer age;

    Date update_at;

    String code;

    String user_code;
}
