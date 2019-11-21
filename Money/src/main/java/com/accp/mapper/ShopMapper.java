package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.All;
import com.accp.domain.Integral;
import com.accp.domain.Shop;
import com.accp.domain.ShopExample;
import com.accp.domain.Viptype;

public interface ShopMapper {
	//查询类型对应的会员
	@Select("SELECT SUM(CASE WHEN order_sfMoney IS NULL THEN 0 ELSE order_sfMoney END) orderSfmoney,\r\n" + 
			"v.balance,v.vip_name vipName,v.vip_phone vipPhone,v.vipType_id viptypeId,v.user_id uid,v.integral FROM `order` o RIGHT JOIN vip v ON(o.user_id=v.user_id)\r\n" + 
			" WHERE v.vipType_id = #{typeid}  GROUP BY v.user_id")
	List<All> queryVip(Integer typeid);
	
	//查询会员类型
	@Select("SELECT vipType_id AS viptypeId,vipType_name AS viptypeName, vipType_discount AS viptypeDiscount FROM viptype")
	List<Viptype> queryViptype();
	
	//��ѯ��Ʒ����id��Ӧ����Ʒ
	@Select("SELECT * FROM `goods` g inner JOIN `details` d ON(g.goodsid=d.goodsid) WHERE typeid = #{typeid}")
	List<All> queryGoods(Integer typeid);
	
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