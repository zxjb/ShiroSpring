package com.shiro_spring.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiro_spring.dao.UserMapper;
import com.shiro_spring.pojo.User;
import com.shiro_spring.service.IUserService;

@Service("iUserService")
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getByUsername(String username) {
		return userMapper.getByUsername(username);
	}

	@Override
	public Set<String> getRoles(String username) {
		return userMapper.getRoles(username);
	}

	@Override
	public Set<String> getPermissions(String username) {
		return userMapper.getPermissions(username);
	}
	
	
	

}
