package com.accp.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Goods2;
import com.accp.domain.Goodstype;
import com.accp.domain.Shop;
import com.accp.domain.Viptype;
import com.accp.service.HotcakesService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/hotcakes")
public class HotcakesController {
	
	@Autowired
	private HotcakesService service;
	
	@RequestMapping("/querySp")
	@ResponseBody
	public PageInfo querySp(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name,String shopid,String typeid) throws ParseException {
		return service.querySp(pageNum,pageSize,preDate,afterDate,name,shopid,typeid);
	}
	
	@RequestMapping("/querySpType")
	@ResponseBody
	public List<Goodstype> querySpType() {
		return service.querySpType();
	}
	
	@RequestMapping("/queryShop")
	@ResponseBody
	public List<Shop> queryShop() {
		return service.queryShop();
	}
	
	@RequestMapping("/queryGoods2Byid")
	@ResponseBody
	public Goods2 queryGoods2Byid(Integer goodsid) {
		return service.queryGoods2Byid(goodsid);
	}
	
}
