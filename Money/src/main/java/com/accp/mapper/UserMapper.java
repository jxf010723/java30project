package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.User;
import com.accp.domain.UserExample;

public interface UserMapper {
	//�����Ƿ��и����û�����������ҵ����û�
	@Select("SELECT * FROM `user` WHERE uname =  #{uname} and upwd = #{upwd} LIMIT 1")
	User login(User user);
	
	@Select("SELECT * FROM `user` WHERE uname =  #{uname} LIMIT 1")
	User selectUserByUserName(String uname);
	
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}