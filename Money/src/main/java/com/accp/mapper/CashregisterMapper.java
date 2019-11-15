package com.accp.mapper;

import com.accp.domain.Cashregister;
import com.accp.domain.CashregisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashregisterMapper {
    int countByExample(CashregisterExample example);

    int deleteByExample(CashregisterExample example);

    int deleteByPrimaryKey(Integer cashregisterid);

    int insert(Cashregister record);

    int insertSelective(Cashregister record);

    List<Cashregister> selectByExample(CashregisterExample example);

    Cashregister selectByPrimaryKey(Integer cashregisterid);

    int updateByExampleSelective(@Param("record") Cashregister record, @Param("example") CashregisterExample example);

    int updateByExample(@Param("record") Cashregister record, @Param("example") CashregisterExample example);

    int updateByPrimaryKeySelective(Cashregister record);

    int updateByPrimaryKey(Cashregister record);
}