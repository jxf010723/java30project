package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.Details;
import com.accp.domain.Goods;
import com.accp.domain.Goods2;
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
    
    List<Goods> selectgoodsAll(@Param("uid")String uid,@Param("typeid")String typeid,@Param("numbers")String numbers,@Param("shopid")String shopid);
    
    List<Goods> selectgoodsAlls(@Param("uid")String uid,@Param("typeid")String typeid,@Param("numbers")String numbers);
    
    zongjivo selectByzongji(@Param("uid")String uid,@Param("typeid")String typeid,@Param("numbers")String numbers,@Param("shopid")String shopid);
    
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
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `shopid`=#{shopid} and `typeid`=#{typeid} and `goodsname` like '%${name}%' AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"    AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp1(@Param("preDate") String preDate,@Param("afterDate") String afterDate,@Param("name") String name,@Param("shopid") Integer shopid,@Param("typeid") Integer typeid);

    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `shopid`=#{shopid} and `goodsname` like '%${name}%' AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"    AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp2(@Param("preDate") String preDate,@Param("afterDate") String afterDate,@Param("name") String name,@Param("shopid") Integer shopid);
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `typeid`=#{typeid} and `goodsname` like '%${name}%' AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"    AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp3(@Param("preDate") String preDate,@Param("afterDate") String afterDate,@Param("name") String name,@Param("typeid") Integer typeid);
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `goodsname` like '%${name}%' AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"    AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp4(@Param("preDate") String preDate,@Param("afterDate") String afterDate,@Param("name") String name);
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp5();
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `goodsname` like '%${name}%'\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp6(@Param("name") String name);
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `shopid`=#{shopid} \r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp7(@Param("shopid") Integer shopid);
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `typeid`=#{typeid} \r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp8(@Param("typeid") Integer typeid);
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"    AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp9(@Param("preDate") String preDate,@Param("afterDate") String afterDate);

    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `shopid`=#{shopid} and `typeid`=#{typeid}\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp10(@Param("shopid") Integer shopid,@Param("typeid") Integer typeid);
    
    @Select("SELECT g.*, \r\n" + 
    		"( \r\n" + 
    		"   SELECT COUNT(*)\r\n" + 
    		"   FROM `order_details` o \r\n" + 
    		"   INNER JOIN `order`oo \r\n" + 
    		"   ON oo.`order_id`=o.`order_id`\r\n" + 
    		"   INNER JOIN `details` d\r\n" + 
    		"   ON o.`gdid`=d.`detailsid`\r\n" + 
    		"   WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		"   AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"   ) AS COUNT \r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `details` d\r\n" + 
    		"ON g.`goodsid`=d.`goodsid`\r\n" + 
    		"INNER JOIN `order_details` o\r\n" + 
    		"ON o.`gdid`=d.`detailsid`\r\n" + 
    		"INNER JOIN `order`oo\r\n" + 
    		"ON oo.`order_id`=o.`order_id`\r\n" + 
    		"WHERE `shopid`=#{shopid} and `typeid`=#{typeid} AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"GROUP BY `goodsid`\r\n" + 
    		"ORDER BY ( \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o  \r\n" + 
    		"    INNER JOIN `order`oo\r\n" + 
    		"    ON oo.`order_id`=o.`order_id`\r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`  \r\n" + 
    		"    AND oo.`order_date` BETWEEN #{preDate} and #{afterDate}\r\n" + 
    		"\r\n" + 
    		" ) DESC")
    List<Goods2> querySp11(@Param("preDate") String preDate,@Param("afterDate") String afterDate,@Param("shopid") Integer shopid,@Param("typeid") Integer typeid);
    
    @Select("SELECT g.*, \r\n" + 
    		"(  \r\n" + 
    		"    SELECT COUNT(*)\r\n" + 
    		"    FROM `order_details` o \r\n" + 
    		"    INNER JOIN `details` d\r\n" + 
    		"    ON o.`gdid`=d.`detailsid`\r\n" + 
    		"    WHERE g.`goodsid`=d.`goodsid`\r\n" + 
    		") AS COUNT, s.`shopName` AS goodsbrand\r\n" + 
    		"FROM `goods` g\r\n" + 
    		"INNER JOIN `shop` s\r\n" + 
    		"ON s.`shopid`=g.`shopid`\r\n" + 
    		"WHERE `goodsid`=#{goodsid}")
    Goods2 queryGoods2Byid(@Param("goodsid") Integer goodsid);
}