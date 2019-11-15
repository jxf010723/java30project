package com.accp.mapper;

import com.accp.domain.Goodsize;
import com.accp.domain.GoodsizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsizeMapper {
    int countByExample(GoodsizeExample example);

    int deleteByExample(GoodsizeExample example);

    int deleteByPrimaryKey(Integer goodsizeid);

    int insert(Goodsize record);

    int insertSelective(Goodsize record);

    List<Goodsize> selectByExample(GoodsizeExample example);

    Goodsize selectByPrimaryKey(Integer goodsizeid);

    int updateByExampleSelective(@Param("record") Goodsize record, @Param("example") GoodsizeExample example);

    int updateByExample(@Param("record") Goodsize record, @Param("example") GoodsizeExample example);

    int updateByPrimaryKeySelective(Goodsize record);

    int updateByPrimaryKey(Goodsize record);
}