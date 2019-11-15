package com.accp.mapper;

import com.accp.domain.Handover;
import com.accp.domain.HandoverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandoverMapper {
    int countByExample(HandoverExample example);

    int deleteByExample(HandoverExample example);

    int deleteByPrimaryKey(Integer handoverid);

    int insert(Handover record);

    int insertSelective(Handover record);

    List<Handover> selectByExample(HandoverExample example);

    Handover selectByPrimaryKey(Integer handoverid);

    int updateByExampleSelective(@Param("record") Handover record, @Param("example") HandoverExample example);

    int updateByExample(@Param("record") Handover record, @Param("example") HandoverExample example);

    int updateByPrimaryKeySelective(Handover record);

    int updateByPrimaryKey(Handover record);
}