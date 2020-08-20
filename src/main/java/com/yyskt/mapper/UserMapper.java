package com.yyskt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yyskt.entity.user.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 任林涛
 * @since 2020-08-12
 */
@Mapper
public interface UserMapper{
	public int add(User user);
	
	public int update(User user);
	
	public int delete(int id);

	public List<User> selectUser(User user);

	public User selectUserById(int id);
}
