package com.yyskt.service;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.yyskt.entity.user.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 任林涛
 * @since 2020-08-12
 */
public interface IUserService{

	@CachePut(value="userCache",key = "#p0.id")
	public User add(User user);

	@CachePut(value="userCache",key = "#p0.id")
	public User update(User user);

	@CacheEvict(value="userCache",key = "#id")
	public int delete(int id);

	@Cacheable(value = "userAllCache",key = "#p0")
	public List<User> select(User user);
	
	@Cacheable(value = "userCache",key = "#id")
	public User selectUserById(int id);
}
