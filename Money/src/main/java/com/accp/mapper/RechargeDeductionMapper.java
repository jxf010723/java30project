package com.accp.mapper;

import com.accp.domain.RechargeDeduction;
import com.accp.domain.RechargeDeductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeDeductionMapper {
    int countByExample(RechargeDeductionExample example);

    int deleteByExample(RechargeDeductionExample example);

    int deleteByPrimaryKey(Integer rdid);

    int insert(RechargeDeduction record);

    int insertSelective(RechargeDeduction record);

    List<RechargeDeduction> selectByExample(RechargeDeductionExample example);

    RechargeDeduction selectByPrimaryKey(Integer rdid);

    int updateByExampleSelective(@Param("record") RechargeDeduction record, @Param("example") RechargeDeductionExample example);

    int updateByExample(@Param("record") RechargeDeduction record, @Param("example") RechargeDeductionExample example);

    int updateByPrimaryKeySelective(RechargeDeduction record);

    int updateByPrimaryKey(RechargeDeduction record);
}