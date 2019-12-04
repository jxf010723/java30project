package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.Details;
import com.accp.domain.Goods;
import com.accp.domain.GoodsExample;
import com.accp.domain.zongjivo;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer goodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer goodsid);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    List<Goods> selectgoodsAll(String uid,String typeid,String numbers);
    List<Goods> selectgoodsAlls(String uid,String typeid,String numbers);
    
    zongjivo selectByzongji(String uid,String typeid,String numbers);
    
    int insertzhuxiang(Goods good);
    int insertzhuxiang2(Goods good);
    int insertxiang(Details details);
    int deletegoods(@Param("goodsid") String goodsid);
    int deletedetails(@Param("goodsid") String goodsid);
    //查询主表
    @Select("select * from goods where goodsid=#{goodsid}")
    Goods selectgoodsbyid(String goodsid);
    //查询详表
    @Select("select * from details where goodsid=#{goodsid}")
    List<Details> selectdetailsbyid(String goodsid);
    //修改
    int updategoods(Goods goods);
}