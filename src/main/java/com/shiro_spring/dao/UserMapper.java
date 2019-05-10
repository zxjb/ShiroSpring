package com.shiro_spring.dao;

import java.util.Set;

import com.shiro_spring.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    public User getByUsername(String username);

    public Set<String> getRoles(String username);

    public Set<String> getPermissions(String username);
}