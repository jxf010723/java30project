package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.All;
import com.accp.domain.Goods;
import com.accp.domain.Shop;
import com.accp.domain.ShopExample;

public interface ShopMapper {
	//��ѯ��Ʒ����id��Ӧ����Ʒ
	@Select("SELECT * FROM goods WHERE typeid = #{typeid}")
	List<Goods> queryGoods(Integer typeid);
	
	//��ѯ����Ʒ����Ʒ����
	@Select("SELECT t.typeid,t.typename FROM goodstype t INNER JOIN goods g ON(t.typeid = g.typeid) GROUP BY t.typeid")
	List<All> queryGoodstype();
	
	//��ѯ��������ǰʮ��������õ���Ʒ(�����е���Ʒ����)
	@Select("SELECT gdid AS goodsid,goods_name AS goodsname, goods_price AS goodsPrice,\r\n" + 
			"goods_count AS goodsCount,COUNT(*) FROM `order_details` GROUP BY gdid LIMIT 0,10")
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