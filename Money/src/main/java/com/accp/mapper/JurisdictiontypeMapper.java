package com.accp.mapper;

import com.accp.domain.Jurisdictiontype;
import com.accp.domain.JurisdictiontypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JurisdictiontypeMapper {
    int countByExample(JurisdictiontypeExample example);

    int deleteByExample(JurisdictiontypeExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Jurisdictiontype record);

    int insertSelective(Jurisdictiontype record);

    List<Jurisdictiontype> selectByExample(JurisdictiontypeExample example);

    Jurisdictiontype selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Jurisdictiontype record, @Param("example") JurisdictiontypeExample example);

    int updateByExample(@Param("record") Jurisdictiontype record, @Param("example") JurisdictiontypeExample example);

    int updateByPrimaryKeySelective(Jurisdictiontype record);

    int updateByPrimaryKey(Jurisdictiontype record);
}