package com.yyskt.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.yyskt.entity.ResultParam;
import com.yyskt.entity.User;
import com.yyskt.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 任林涛
 * @since 2020-08-12
 */
@Api(value = "/UserController", tags = "用户接口模块")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	@Autowired
	HttpServletRequest request;
	
	@ApiOperation(value="用户获取", notes="用户获取接口")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "userName", value = "用户名", required = false ,dataType = "string"),
    @ApiImplicitParam(name = "password", value = "密码", required = false ,dataType = "string")})
	@GetMapping("/selectUser")
	public ResultParam selectUser() throws Exception
	{
		request.getSession().setAttribute("AA", "BB");
		ResultParam resultParam=new ResultParam();
		User user=new User();
		List<User> select = userService.select(user);
		resultParam.setList(select);
		resultParam.setObj(request.getSession().getAttribute("AA"));
		return resultParam;
	}
}
