package com.yyskt.service.impl;

import com.yyskt.entity.User;
import com.yyskt.mapper.UserMapper;
import com.yyskt.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 任林涛
 * @since 2020-08-12
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper usermapper;
	
	@Override
	public int add(User user)
	{
		return usermapper.add(user);
	}
	
	@Override
	public int update(User user)
	{
		return usermapper.update(user);
	}
	
	@Override
	public int delete(int id)
	{
		return usermapper.delete(id);
	}

	@Override
	@Cacheable(value = "redisCache",key = "111")
	public List<User> select(User user)
	{
		return usermapper.selectUser(user);
	}
}
