package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.UserMapper;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private StaffMapper fMapper;
	
	public int updateUser(Staff staff) {
		return fMapper.updateByPrimaryKeySelective(staff);
	}
	
	public Staff queryUserById(Integer staffid) {
		return fMapper.selectByPrimaryKey(staffid);
	}
}
