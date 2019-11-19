package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Goodstype;
import com.accp.domain.Shop;
import com.accp.domain.Supplier;
import com.accp.domain.SupplierExample;
import com.accp.mapper.GoodstypeMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.SupplierMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class GoodsService {
	@Autowired
	GoodstypeMapper goodstype;
	@Autowired
	ShopMapper shop;
	@Autowired
	SupplierMapper supplier;
	
	/**
	 * 商品类型查询分页
	 * @param pageNum
	 * @return
	 */
	public PageInfo<Goodstype> goodstypepage(int pageNum){
		PageHelper.startPage(pageNum, 5);
		List<Goodstype> list=goodstype.selectByExample(null);
		PageInfo<Goodstype> page=new PageInfo<Goodstype>(list);
		return page;
	}
	/**
	 * 商品类型新增
	 * @param typename
	 * @return
	 */
	public int goodstypeinsert(String typename) {
		return goodstype.insert(typename);
	}
	/**
	 * 商品类型修改
	 * @param name
	 * @param id
	 * @return
	 */
	public int goodstypeupdate(String name,String id) {
		return goodstype.updateByPrimaryKey(name, id);
	}
	/**
	 * 商品类型删除
	 * @param typeid
	 * @return
	 */
	public int goodstypedelete(Integer typeid) {
		return goodstype.deleteByPrimaryKey(typeid);
	}
	
	public List<Shop> queryshop(){
		return shop.selectByExample(null);
	}
	
	public PageInfo<Supplier> supplierpage(int pageNum, Supplier example){
		PageHelper.startPage(pageNum, 5);
		List<Supplier> list=supplier.selectAll(example);
		PageInfo<Supplier> page=new PageInfo<Supplier>(list);
		return page;
	}
}
