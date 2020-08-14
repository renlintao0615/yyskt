package com.yyskt.mapper;

import com.yyskt.entity.User;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

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
}
