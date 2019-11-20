package com.accp.mapper;

import com.accp.domain.Order;
import com.accp.domain.OrderDetailsBysp;
import com.accp.domain.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.hibernate.validator.constraints.ParameterScriptAssert;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    @Select("SELECT `order_details_id`,`goods_name`,`goods_count`,`goods_price`,`order_date`\r\n" + 
    		"FROM `order_details` od\r\n" + 
    		"INNER JOIN `order`\r\n" + 
    		"ON `order`.`order_id`=od.`order_id`\r\n")
    List<OrderDetailsBysp> selectBysp();
    
    @Select("SELECT `order_details_id`,`goods_name`,`goods_count`,`goods_price`,`order_date`\r\n" + 
    		"FROM `order_details` od\r\n" + 
    		"INNER JOIN `order`\r\n" + 
    		"ON `order`.`order_id`=od.`order_id`\r\n" + 
    		"WHERE `order`.`order_date` BETWEEN #{preDate} AND #{afterDate} AND od.`goods_name` LIKE'%${name}%'")
    List<OrderDetailsBysp> selectByspByAll(@Param("preDate") String preDate,@Param("afterDate") String afterDate,@Param("name") String name);
    
    @Select("SELECT `order_details_id`,`goods_name`,`goods_count`,`goods_price`,`order_date`\r\n" + 
    		"FROM `order_details` od\r\n" + 
    		"INNER JOIN `order`\r\n" + 
    		"ON `order`.`order_id`=od.`order_id`\r\n" + 
    		"WHERE `order`.`order_date` BETWEEN #{preDate} AND #{afterDate}")
    List<OrderDetailsBysp> selectByspBydate(@Param("preDate") String preDate,@Param("afterDate") String afterDate);
    
    @Select("SELECT `order_details_id`,`goods_name`,`goods_count`,`goods_price`,`order_date`\r\n" + 
    		"FROM `order_details` od\r\n" + 
    		"INNER JOIN `order`\r\n" + 
    		"ON `order`.`order_id`=od.`order_id`\r\n" + 
    		"WHERE od.`goods_name` LIKE'%${name}%'")
    List<OrderDetailsBysp> selectByspByname(@Param("name") String name);
}