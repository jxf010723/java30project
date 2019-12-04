package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.domain.Purchase;
import com.accp.domain.PurchaseExample;
import com.accp.domain.Purchasedetails;
import com.accp.domain.Shop;
import com.accp.domain.purchrvo;

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
    
    List<purchrvo> selectAll(purchrvo purchr);
  //查看指定日期有多少个单号
    @Select("SELECT  COUNT(*) FROM `purchase` WHERE purchase.`deliverytime`=#{datetime}")
    int selectdate(String datetime);
    
  //按日期查找表
    List<Purchase> selectPurchase(@Param("purchasedate") String purchasedate,@Param("purchasedatejie") String purchasedatejie,@Param("shopid") String shopid,@Param("odd") String odd);
    
    //查询店铺
    List<Shop> selectshop(@Param("userid") String userid);
  //通过审核
    @Update("UPDATE `purchase` SET`shenghe` = '0' WHERE purchaseid = #{purchaseid}")
    int upda(Integer Purchaseid);
    	
    int  deleteByid(@Param("purchaseid") String purchaseid);
  //查询
    @Select("SELECT * FROM `purchasedetails` where purchaseid=#{purchaseid}")
    List<Purchasedetails> selectall(Integer purchaseid);
    //查询主表
    @Select("SELECT * FROM purchase WHERE purchaseid=#{purchaseid}")
    Purchase seleszhuid(Integer purchaseid);
    
    
  //修改主表
    @Update("UPDATE  `purchase`  \r\n" + 
    		"SET  `supplierid` = #{supplierid},\r\n" + 
    		"`suppliername` = #{suppliername}, `userid` = #{userid},\r\n" + 
    		"`uname` = #{uname}, `remarks` = #{remarks} WHERE `purchaseid` = #{purchaseid}")
    int updatazhu(@Param("supplierid") Integer Supplierid,@Param("suppliername") String suppliername,@Param("userid") Integer userid,@Param("uname") String uname,@Param("remarks") String remarks,@Param("purchaseid") Integer purchaseid);
    int  deleteByddd(@Param("purchaseid") String purchaseid);
}