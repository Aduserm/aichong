package com.aichong.model;

import java.util.Date;
import lombok.Data;

/**
 * @author jingji.lin
 */
@Data
public class Category extends BaseBean {
    private String id;

    private String name;

    private Date createDate;

    private String createUser;

    private String delUser;

    private Date delDate;

    private String delInfo;
}