package com.aichong.bean;

import lombok.Data;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/9/14 13:14
 * @Version: 1.0
 */
@Data
public class CategoryBean extends BaseBean {
  private String id;

  private String name;

  private String createDate;

  private String createUser;

  private String delUser;

  private String delDate;

  private String delInfo;
}
