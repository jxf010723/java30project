package com.accp.mapper;

import com.accp.domain.All;
import com.accp.domain.Shop;
import com.accp.domain.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ShopMapper {
	@Select("SELECT s.shopid,s.shopuser,s.shopname,f.employeename,s.contacts,s.phonenumber,s.phone,s.address,COUNT(f.staffid) staffcount "
			+ " FROM `shop` s INNER JOIN `staff` f ON(f.shopid=s.shopid) GROUP BY f.shopid")
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