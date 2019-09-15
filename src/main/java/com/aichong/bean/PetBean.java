package com.aichong.bean;

import lombok.Data;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/9/14 14:32
 * @Version: 1.0
 */
@Data
public class PetBean extends BaseBean {
  private String id;

  private String name;

  private String size;

  private Boolean dangerous;

  private String petUserId;

  private Integer isUser;

  private Boolean vaccine;

  private String vaccinePlace;

  private String vaccineTime;

  private String desc;

  private String createUser;

  private String createDate;

  private String delUser;

  private String delDate;

  private String delInfo;
}
