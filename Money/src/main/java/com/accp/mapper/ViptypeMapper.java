package com.accp.mapper;

import com.accp.domain.Viptype;
import com.accp.domain.ViptypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ViptypeMapper {
	
	@Select("SELECT `vipType_id` FROM `viptype` WHERE vipType_name = #{name}")
	Integer selectViptypeByviptypeName(String name);
	
    int countByExample(ViptypeExample example);

    int deleteByExample(ViptypeExample example);

    int deleteByPrimaryKey(Integer viptypeId);

    int insert(Viptype record);

    int insertSelective(Viptype record);

    List<Viptype> selectByExample(ViptypeExample example);

    Viptype selectByPrimaryKey(Integer viptypeId);

    int updateByExampleSelective(@Param("record") Viptype record, @Param("example") ViptypeExample example);

    int updateByExample(@Param("record") Viptype record, @Param("example") ViptypeExample example);

    int updateByPrimaryKeySelective(Viptype record);

    int updateByPrimaryKey(Viptype record);
}