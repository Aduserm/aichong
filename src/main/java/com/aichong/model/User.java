package com.aichong.model;

import java.util.Date;
import lombok.Data;

/**
 * @author jingji.lin
 */
@Data
public class User {

    private String id;

    private String relation;

    private Integer age;

    private String work;

    private String address;

    private String phone;

    private String createUser;

    private Date createDate;

    private String delUser;

    private Date delDate;

    private String delInfo;

    private Byte state;
}