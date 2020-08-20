package com.yyskt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyskt.entity.user.User;
import com.yyskt.mapper.UserMapper;
import com.yyskt.service.IUserService;

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
	public User add(User user)
	{
		int add = usermapper.add(user);
		return add == 1 ? usermapper.selectUserById(user.getId()) : new User();
	}
	
	@Override
	public User update(User user)
	{
		int update = usermapper.update(user);
		return update == 1 ? usermapper.selectUserById(user.getId()) : new User();
	}
	
	@Override
	public int delete(int id)
	{
		return usermapper.delete(id);
	}

	@Override
	public List<User> select(User user)
	{
		return usermapper.selectUser(user);
	}

	@Override
	public User selectUserById(int id) {
		return usermapper.selectUserById(id);
	}
}
