package com.yyskt.entity.common;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yyskt.config.DateToLongSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class BaseEntity implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID",dataType = "int")
	private int id;

	@ApiModelProperty(value = "是否为空",dataType = "boolean")
    private boolean isValid;

	@ApiModelProperty(value = "创建时间",dataType = "date")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date createTime;

}
