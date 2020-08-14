package com.yyskt.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyskt.entity.ResultParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
    public ResultParam handle(Exception e,HttpServletRequest  request) {
        log.error(request.getRequestURI()+"系统异常",e);
        ResultParam resultParam=new ResultParam();
        resultParam.setSuccess(false);
        resultParam.setMsg("系统异常");
        return resultParam;
    }
}
