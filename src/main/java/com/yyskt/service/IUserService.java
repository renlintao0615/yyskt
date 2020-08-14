package com.yyskt.service;

import java.util.List;

import com.yyskt.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 任林涛
 * @since 2020-08-12
 */
public interface IUserService{

	public int add(User user);
	
	public int update(User user);
	
	public int delete(int id);

	public List<User> select(User user);
}
