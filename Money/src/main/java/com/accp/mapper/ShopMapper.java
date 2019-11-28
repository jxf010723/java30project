package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.domain.All;
import com.accp.domain.Cart;
import com.accp.domain.Jurisdictiontype;
import com.accp.domain.Module;
import com.accp.domain.Shop;
import com.accp.domain.ShopExample;
import com.accp.domain.Viptype;

public interface ShopMapper {
	@Select("SELECT * FROM `jurisdictiontype` j\r\n" + 
			"INNER JOIN `power` p ON(p.pid=j.tid)\r\n" + 
			"WHERE tid = #{tid}")
	All queryByTid(Integer tid);
	
	@Select("SELECT tid FROM `jurisdictiontype` WHERE tname = #{tname}")
	Jurisdictiontype queryByTname(String tname);
	
	@Insert("INSERT INTO `jurisdictiontype` (`tname`) VALUES (#{tname})")
	int insertModule(String tname);
	
	@Select("SELECT * FROM module WHERE parentid=#{parentid}")
	List<Module> queryByNoZero(Integer parentid);
	
	@Select("SELECT * FROM module WHERE parentid=0")
	List<Module> queryByZero();
	
	@Select("SELECT pid,pname FROM `power` p WHERE pid =(\r\n" + 
			" SELECT roleID FROM staff f INNER JOIN `user` u ON(f.uid=u.uid) WHERE f.`uid`=#{uid})")
	All queryByUserId(Integer uid);
	
	@Select("SELECT * FROM `module` m\r\n" + 
			" WHERE FIND_IN_SET(`mid`,#{mid})\r\n" + 
			" OR  FIND_IN_SET (parentid,#{parentid})")
	List<All> queryPower(@Param("mid") String mid,@Param("parentid") String parentid);
	
	//根据商品详情id和会员id修改数量
	@Update("UPDATE cart SET order_count = order_count+#{count} WHERE gdid = #{gdid} and vipid = #{vipid}")
	int updateGuaCount(@Param("count") Integer count,@Param("gdid") Integer gdid,@Param("vipid") Integer vipid);
	
	//修改该购物车的商品数量
	@Update("UPDATE cart SET order_count = #{count} WHERE cid = #{cid}")
	int updateCartCount(@Param("count") Integer count,@Param("cid") Integer cid);
	
	//查询该会员的商品详情id的购物车有没有
	@Select("SELECT * FROM cart WHERE gdid = #{gdid} AND vipid= #{vipid}")
	Cart queryHaveCart(@Param("gdid") Integer gdid,@Param("vipid") Integer vipid);
	
	//查询当前会员的购物车
	@Select("SELECT cid,gid,gdid,order_count orderCount,order_totalMoney orderTotalmoney,g.goodsname goodsName FROM cart c INNER JOIN goods g ON(c.gid=g.goodsid) WHERE vipid = #{vipid}")
	List<All> queryCartByvipid(Integer vipid);
	
	//查询所有购物车
	@Select("SELECT cid,gid,gdid,order_count orderCount,order_totalMoney orderTotalmoney,g.goodsname goodsName FROM cart c INNER JOIN goods g ON(c.gid=g.goodsid) ")
	List<All> queryAll();
	
	//修改会员的积分
	@Update("UPDATE `vip` SET balance=#{point} WHERE user_id = #{uid}")
	int updatePoint(@Param("point") Double point,@Param("uid")Integer uid);
	
	//查询类型对应的会员
	@Select("SELECT v.vip_id vipId,SUM(CASE WHEN order_sfMoney IS NULL THEN 0 ELSE order_sfMoney END) orderSfmoney,\r\n" + 
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