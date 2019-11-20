package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Purchase;
import com.accp.domain.PurchaseExample;

public interface PurchaseMapper {
    int countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(Integer purchaseid);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(Integer purchaseid);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);
    
    List<Purchase> selectAll();
}