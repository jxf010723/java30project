package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Goodstype;
import com.accp.domain.Purchase;
import com.accp.domain.Shop;
import com.accp.domain.Supplier;
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
	
	@RequestMapping("/goodssupplierpage")
	@ResponseBody
	public PageInfo<Supplier> goodssupplierpage(int pageNum,String sheng,String shi,String ming){
		
		
		Supplier supp=new Supplier(ming,sheng,shi);
		System.out.println("进入"+sheng);
		PageInfo<Supplier> page=goods.supplierpage(pageNum, supp);
		for (Supplier list : page.getList()) {
			System.out.println("ss"+list);
			
		}
		return page;
	}
	@RequestMapping("/supplierinsert")
	@ResponseBody
	public int supplierinsert(@RequestBody Supplier supplier) {
		System.out.println("新增");
		System.out.println(supplier);
		return goods.supplierinsert(supplier);
	}
	
	@RequestMapping("/supplierupdate")
	@ResponseBody
	public int supplierupdate(@RequestBody Supplier supplier) {
		System.out.println("修改");
		System.out.println(supplier);
		return goods.supplierupdate(supplier);
	}
	
	@RequestMapping("/supplierdelete")
	@ResponseBody
	public int supplierupdate(String id) {
		return goods.supplierdelete(id);
	}
	@RequestMapping("/goodspurchasepage")
	@ResponseBody
	public PageInfo<Purchase> goodspurchasepage(int pageNum){
	System.out.println(pageNum);
		PageInfo<Purchase> page=goods.purchasepage(pageNum);
		for (Purchase list : page.getList()) {
			System.out.println("ss"+list);
			
		}
		return page;
	}
	
}
