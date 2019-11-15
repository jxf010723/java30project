package com.accp.mapper;

import com.accp.domain.Jurisdictionone;
import com.accp.domain.JurisdictiononeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JurisdictiononeMapper {
    int countByExample(JurisdictiononeExample example);

    int deleteByExample(JurisdictiononeExample example);

    int deleteByPrimaryKey(Integer joneid);

    int insert(Jurisdictionone record);

    int insertSelective(Jurisdictionone record);

    List<Jurisdictionone> selectByExample(JurisdictiononeExample example);

    Jurisdictionone selectByPrimaryKey(Integer joneid);

    int updateByExampleSelective(@Param("record") Jurisdictionone record, @Param("example") JurisdictiononeExample example);

    int updateByExample(@Param("record") Jurisdictionone record, @Param("example") JurisdictiononeExample example);

    int updateByPrimaryKeySelective(Jurisdictionone record);

    int updateByPrimaryKey(Jurisdictionone record);
}