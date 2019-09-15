package com.aichong.model;

import com.aichong.bean.BaseBean;
import java.util.Date;
import lombok.Data;

/**
 * @author jingji.lin
 */
@Data
public class Pet {
    private String id;

    private String name;

    private String size;

    private Boolean dangerous;

    private String petUserId;

    private Integer isUser;

    private Boolean vaccine;

    private String vaccinePlace;

    private Date vaccineTime;

    private String desc;

    private String createUser;

    private Date createDate;

    private String delUser;

    private Date delDate;

    private String delInfo;
}