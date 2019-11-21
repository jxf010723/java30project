package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.All;
import com.accp.domain.Goods;
import com.accp.domain.Shop;
import com.accp.domain.ShopExample;

public interface ShopMapper {
	//查询商品类型id对应的商品
	@Select("SELECT * FROM goods WHERE typeid = #{typeid}")
	List<Goods> queryGoods(Integer typeid);
	
	//查询有商品的商品类型
	@Select("SELECT t.typeid,t.typename FROM goodstype t INNER JOIN goods g ON(t.typeid = g.typeid) GROUP BY t.typeid")
	List<All> queryGoodstype();
	
	//查询订单表中前十条卖的最好的商品(订单中的商品数量)
	@Select("#查询订单表中前十条卖的最好的商品(订单中的商品数量)\r\n" + 
			"SELECT goods_id AS goodsid,goods_name AS goodsname, goods_price AS goodsPrice,\r\n" + 
			"goods_count AS goodsCount,COUNT(*) FROM `order_details` GROUP BY goods_id LIMIT 0,10")
	List<All> queryTenGoods();
	
	@Select("SELECT s.*, ( SELECT COUNT(*) FROM staff AS r WHERE r.shopid=s.shopid\r\n" + 
			"GROUP BY r. shopid\r\n" + 
			")AS `staffcount` FROM shop AS s")
	List<All> queryShopList();
	
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer shopid);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}