package com.accp.mapper;

import com.accp.domain.Jurisdictiontwo;
import com.accp.domain.JurisdictiontwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JurisdictiontwoMapper {
    int countByExample(JurisdictiontwoExample example);

    int deleteByExample(JurisdictiontwoExample example);

    int deleteByPrimaryKey(Integer jtwoid);

    int insert(Jurisdictiontwo record);

    int insertSelective(Jurisdictiontwo record);

    List<Jurisdictiontwo> selectByExample(JurisdictiontwoExample example);

    Jurisdictiontwo selectByPrimaryKey(Integer jtwoid);

    int updateByExampleSelective(@Param("record") Jurisdictiontwo record, @Param("example") JurisdictiontwoExample example);

    int updateByExample(@Param("record") Jurisdictiontwo record, @Param("example") JurisdictiontwoExample example);

    int updateByPrimaryKeySelective(Jurisdictiontwo record);

    int updateByPrimaryKey(Jurisdictiontwo record);
}