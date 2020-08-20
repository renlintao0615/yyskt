package com.yyskt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yyskt.entity.common.ResultParam;
import com.yyskt.entity.user.User;
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
	
	@ApiOperation(value="用户获取ALL", notes="用户获取ALL接口")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "id", value = "用户id",dataType = "int"),
    @ApiImplicitParam(name = "userName", value = "用户名",dataType = "string"),
    @ApiImplicitParam(name = "password", value = "密码",dataType = "string")})
	@GetMapping("/selectUser")
	public ResultParam selectUser() throws Exception
	{
		ResultParam resultParam=new ResultParam();
		User user=new User();
		resultParam.setList(userService.select(user));
		return resultParam;
	}
	
	@ApiOperation(value="用户获取", notes="用户获取接口")
	@ApiImplicitParam(name = "id",paramType = "path", value = "用户id", required = true ,dataType = "int")
	@GetMapping("/selectUserById/{id}")
	public ResultParam selectUserById(@PathVariable("id") int id) throws Exception
	{
		ResultParam resultParam=new ResultParam();
		User selectUserById = userService.selectUserById(id);
		resultParam.setObj(selectUserById);
		return resultParam;
	}

	@ApiOperation(value="用户新增", notes="用户新增接口")
	@PostMapping("/addUser")
	public ResultParam addUser(@RequestBody User user) throws Exception
	{
		ResultParam resultParam=new ResultParam();
		userService.add(user);
		return resultParam;
	}
	
	@ApiOperation(value="用户修改", notes="用户修改接口")
	@PutMapping("/updateUser")
	public ResultParam updateUser(@RequestBody User user) throws Exception
	{
		ResultParam resultParam=new ResultParam();
		userService.update(user);
		return resultParam;
	}
	
	@ApiOperation(value="用户删除", notes="用户删除接口")
	@ApiImplicitParam(name = "id",paramType = "path", value = "用户id", required = true ,dataType = "int")
	@DeleteMapping("/delUser/{id}")
	public ResultParam delUser(@PathVariable("id") int id) throws Exception
	{
		ResultParam resultParam=new ResultParam();
		userService.delete(id);
		return resultParam;
	}
}
