package com.accp.mapper;

import com.accp.domain.Purchasedetails;
import com.accp.domain.PurchasedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasedetailsMapper {
    int countByExample(PurchasedetailsExample example);

    int deleteByExample(PurchasedetailsExample example);

    int deleteByPrimaryKey(Integer purchasedetailsid);

    int insert(Purchasedetails record);

    int insertSelective(Purchasedetails record);

    List<Purchasedetails> selectByExample(PurchasedetailsExample example);

    Purchasedetails selectByPrimaryKey(Integer purchasedetailsid);

    int updateByExampleSelective(@Param("record") Purchasedetails record, @Param("example") PurchasedetailsExample example);

    int updateByExample(@Param("record") Purchasedetails record, @Param("example") PurchasedetailsExample example);

    int updateByPrimaryKeySelective(Purchasedetails record);

    int updateByPrimaryKey(Purchasedetails record);
}