package com.accp.mapper;

import com.accp.domain.Supplier;
import com.accp.domain.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    int updateBysupplier(Supplier record);
    
    int deleteBysuppiler(String id);
    
    List<Supplier> selectByExample(SupplierExample example);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    List<Supplier> selectAll(Supplier example);
    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);
}