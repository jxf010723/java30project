package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Goodstype;
import com.accp.domain.Shop;
import com.accp.service.GoodsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	GoodsService goods;
	/**
	 * 商品类型分页查询
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/goodstypepage")
	@ResponseBody
	public PageInfo<Goodstype> goodstypepage(int pageNum){
		
		PageInfo<Goodstype> page=goods.goodstypepage(pageNum);
		for (Goodstype list : page.getList()) {
			System.out.println(list);
		}
		return page;
	}
	/**
	 * 商品类型新增
	 * @param typename
	 * @return
	 */
	@RequestMapping("/goodstypeinsert")
	@ResponseBody
	public int goodstypeinsert(String typename) {
		return goods.goodstypeinsert(typename);
	}
	/**
	 * 商品类型修改
	 * @param typename
	 * @param id
	 * @return
	 */
	@RequestMapping("/goodstypeupdate")
	@ResponseBody
	public int goodstypeupdate(String typename,String id) {
		System.out.println(id);
		return goods.goodstypeupdate(typename, id);
	}
	/**
	 * 商品类型删除
	 * @param typeid
	 * @return
	 */
	@RequestMapping("/goodstypedelete")
	@ResponseBody
	public int goodstypedelete(Integer typeid) {
		return goods.goodstypedelete(typeid);
	}
	@RequestMapping("/queryshop")
	@ResponseBody
	public List<Shop> queryshop(){
		return goods.queryshop();
	}
}
