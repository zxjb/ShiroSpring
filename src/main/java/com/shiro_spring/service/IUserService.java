package com.shiro_spring.service;

import java.util.Set;

import com.shiro_spring.pojo.User;

public interface IUserService {
	User getByUsername(String username);

	Set<String> getRoles(String username);

	Set<String> getPermissions(String username);
}
