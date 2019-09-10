package com.aichong.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @Author: jingji.lin
 * @Description: ${description}
 * @Date: 2019/9/10 13:20
 * @Version: 1.0
 */
@Data
@JsonInclude(Include.NON_NULL)
public class BaseBean implements Serializable {

    private static final Long serialVersionUID = 8078206827726774278L;

    private String createUser;

    private String createDate;

    @JsonIgnore
    private String lastUpdateUser;

    @JsonIgnore
    private Date lastUpdateDate;

    @JsonIgnore
    private Boolean delInfo;

    @JsonIgnore
    private String delUser;

    @JsonIgnore
    private String delDate;

    @JsonIgnore
    private String currentUser;

}
