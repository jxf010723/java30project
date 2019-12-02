package com.accp.mapper;

import com.accp.domain.RolesModule;
import com.accp.domain.RolesModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolesModuleMapper {
    int countByExample(RolesModuleExample example);

    int deleteByExample(RolesModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolesModule record);

    int insertSelective(RolesModule record);

    List<RolesModule> selectByExample(RolesModuleExample example);

    RolesModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolesModule record, @Param("example") RolesModuleExample example);

    int updateByExample(@Param("record") RolesModule record, @Param("example") RolesModuleExample example);

    int updateByPrimaryKeySelective(RolesModule record);

    int updateByPrimaryKey(RolesModule record);
}