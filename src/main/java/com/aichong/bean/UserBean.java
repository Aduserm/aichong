package com.aichong.bean;

import lombok.Data;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/9/14 14:31
 * @Version: 1.0
 */
@Data
public class UserBean extends BaseBean {
  private String id;

  private String relation;

  private Integer age;

  private String work;

  private String address;

  private String phone;

  private String createUser;

  private String createDate;

  private String delUser;

  private String delDate;

  private String delInfo;

  private Byte state;
}
