package com.accp.mapper;

import com.accp.domain.Integral;
import com.accp.domain.IntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {
    int countByExample(IntegralExample example);

    int deleteByExample(IntegralExample example);

    int insert(Integral record);

    int insertSelective(Integral record);

    List<Integral> selectByExample(IntegralExample example);

    int updateByExampleSelective(@Param("record") Integral record, @Param("example") IntegralExample example);

    int updateByExample(@Param("record") Integral record, @Param("example") IntegralExample example);
}