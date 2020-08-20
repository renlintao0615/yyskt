package com.yyskt.entity.user;

import java.io.Serializable;

import com.yyskt.entity.common.BaseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 任林涛
 * @since 2020-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
   
    @ApiModelProperty(value = "用户名称",required = true,dataType = "string")
    private String userName;

    @ApiModelProperty(value = "用户密码",required = true,dataType = "string")
    private String password;
   
}
