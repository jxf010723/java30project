package com.accp.mapper;

import com.accp.domain.Vip;
import com.accp.domain.VipExample;
import com.accp.domain.memberInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface VipMapper {
    int countByExample(VipExample example);

    int deleteByExample(VipExample example);

    int deleteByPrimaryKey(Integer vipId);

    int insert(Vip record);

    int insertSelective(Vip record);

    List<Vip> selectByExample(VipExample example);

    Vip selectByPrimaryKey(Integer vipId);

    int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
    
    @Select("SELECT `vip_id` AS vipId,`user_id` AS userId,`vip_name` AS vipName,`vip_pwd` AS vipPwd,`vip_phone` AS vipPhone,`vipType_name` AS viptypeName,`vip_turnover` AS vipTurnover,`transaction_price` AS price,`balance` AS balance,`integral` AS integral,`vip_province` AS vipProvince,`vip_city` AS vipCity,`vip_region` AS vipRegion,`vip_street` AS vipStreet,\r\n" + 
    		"	(\r\n" + 
    		"		SELECT COUNT(*) AS DATE \r\n" + 
    		"		FROM `order` \r\n" + 
    		"		WHERE DATEDIFF(NOW(),`order_date`)<=6  AND `user_id`=v.`user_id`\r\n" + 
    		"		GROUP BY DAY(`order_date`)\r\n" + 
    		"	) AS zjcj,\r\n" + 
    		"	CONCAT(v.`vip_province`,v.`vip_city`,v.`vip_region`) AS address\r\n" + 
    		"	FROM `vip` v\r\n" + 
    		"	INNER JOIN `viptype` vt\r\n" + 
    		"	ON v.`vipType_id`=vt.`vipType_id`")
    List<memberInfo> queryByPageMember_info();
    
    @Select("SELECT `vip_id` AS vipId,`user_id` AS userId,`vip_name` AS vipName,`vip_pwd` AS vipPwd,`vip_phone` AS vipPhone,`vipType_name` AS viptypeName,`vip_turnover` AS vipTurnover,`transaction_price` AS price,`balance` AS balance,`integral` AS integral,`vip_province` AS vipProvince,`vip_city` AS vipCity,`vip_region` AS vipRegion,`vip_street` AS vipStreet,\r\n" +
    		"	(\r\n" + 
    		"		SELECT COUNT(*) AS DATE \r\n" + 
    		"		FROM `order` \r\n" + 
    		"		WHERE DATEDIFF(NOW(),`order_date`)<=6  AND `user_id`=v.`user_id`\r\n" + 
    		"		GROUP BY DAY(`order_date`)\r\n" + 
    		"	) AS zjcj,\r\n" + 
    		"	CONCAT(v.`vip_province`,v.`vip_city`,v.`vip_region`) AS address\r\n" + 
    		"	FROM `vip` v\r\n" + 
    		"	INNER JOIN `viptype` vt\r\n" + 
    		"	ON v.`vipType_id`=vt.`vipType_id`\r\n" + 
    		"	WHERE vt.`vipType_id`=#{viptypeid} AND v.`vip_name`LIKE'%${searchname}%'")
    List<memberInfo> queryByPageMember_infoByAll(@Param("viptypeid") String viptypeid,@Param("searchname") String searchname);
    
    @Select("SELECT `vip_id` AS vipId,`user_id` AS userId,`vip_name` AS vipName,`vip_pwd` AS vipPwd,`vip_phone` AS vipPhone,`vipType_name` AS viptypeName,`vip_turnover` AS vipTurnover,`transaction_price` AS price,`balance` AS balance,`integral` AS integral,`vip_province` AS vipProvince,`vip_city` AS vipCity,`vip_region` AS vipRegion,`vip_street` AS vipStreet,\r\n" +
    		"	(\r\n" + 
    		"		SELECT COUNT(*) AS DATE \r\n" + 
    		"		FROM `order` \r\n" + 
    		"		WHERE DATEDIFF(NOW(),`order_date`)<=6  AND `user_id`=v.`user_id`\r\n" + 
    		"		GROUP BY DAY(`order_date`)\r\n" + 
    		"	) AS zjcj,\r\n" + 
    		"	CONCAT(v.`vip_province`,v.`vip_city`,v.`vip_region`) AS address\r\n" + 
    		"	FROM `vip` v\r\n" + 
    		"	INNER JOIN `viptype` vt\r\n" + 
    		"	ON v.`vipType_id`=vt.`vipType_id`\r\n" + 
    		"	WHERE vt.`vipType_id`=#{viptypeid}")
    List<memberInfo> queryByPageMember_infoByviptypeid(@Param("viptypeid") String viptypeid);
    
    @Select("SELECT `vip_id` AS vipId,`user_id` AS userId,`vip_name` AS vipName,`vip_pwd` AS vipPwd,`vip_phone` AS vipPhone,`vipType_name` AS viptypeName,`vip_turnover` AS vipTurnover,`transaction_price` AS price,`balance` AS balance,`integral` AS integral,`vip_province` AS vipProvince,`vip_city` AS vipCity,`vip_region` AS vipRegion,`vip_street` AS vipStreet,\r\n" +
    		"	(\r\n" + 
    		"		SELECT COUNT(*) AS DATE \r\n" + 
    		"		FROM `order` \r\n" + 
    		"		WHERE DATEDIFF(NOW(),`order_date`)<=6  AND `user_id`=v.`user_id`\r\n" + 
    		"		GROUP BY DAY(`order_date`)\r\n" + 
    		"	) AS zjcj,\r\n" + 
    		"	CONCAT(v.`vip_province`,v.`vip_city`,v.`vip_region`) AS address\r\n" + 
    		"	FROM `vip` v\r\n" + 
    		"	INNER JOIN `viptype` vt\r\n" + 
    		"	ON v.`vipType_id`=vt.`vipType_id`\r\n" + 
    		"	WHERE v.`vip_name`LIKE'%${searchname}%'")
    List<memberInfo> queryByPageMember_infoBysearchname(@Param("searchname") String searchname);
}