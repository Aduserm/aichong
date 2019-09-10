package com.aichong.model;

import java.util.Date;
import lombok.Data;

/**
 * @author jingji.lin
 */
@Data
public class User extends BaseBean {

    private String id;

    private String nickName;

    private String relation;

    private Boolean sex;

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