package com.yyskt.entity.common;

import java.util.List;

import lombok.Data;

@Data
public class ResultParam {
	public List<?> list;
	
	public Object obj;
	
	public String msg;
	
	public boolean isSuccess = true;
	
}
