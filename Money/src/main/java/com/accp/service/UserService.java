package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.User;
import com.accp.mapper.UserMapper;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}
	
	public User queryUserById(Integer uid) {
		return userMapper.selectByPrimaryKey(uid);
	}
}
