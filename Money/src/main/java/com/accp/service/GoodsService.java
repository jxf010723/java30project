package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Goodstype;
import com.accp.domain.Purchase;
import com.accp.domain.Shop;
import com.accp.domain.Supplier;
import com.accp.domain.purchrvo;
import com.accp.mapper.GoodstypeMapper;
import com.accp.mapper.PurchaseMapper;
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
	@Autowired
	PurchaseMapper purchase;
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
	/**
	 * 供应商查询分页
	 * @param pageNum
	 * @param example
	 * @return
	 */
	public PageInfo<Supplier> supplierpage(int pageNum, Supplier example){
		PageHelper.startPage(pageNum, 5);
		List<Supplier> list=supplier.selectAll(example);
		PageInfo<Supplier> page=new PageInfo<Supplier>(list);
		return page;
	}
	/**
	 * 供应商新增
	 * @param supp
	 * @return
	 */
	public int supplierinsert(Supplier supp) {
		return supplier.insertSelective(supp);
	}
	/**
	 * 供应商修改
	 * @param supp
	 * @return
	 */
	public int supplierupdate(Supplier supp) {
		return supplier.updateBysupplier(supp);
	}
	/**
	 * 供应商删除
	 * @param id
	 * @return
	 */
	public int supplierdelete(String id) {
		return supplier.deleteBysuppiler(id);
	}
	
	public PageInfo<purchrvo> purchasepage(int pageNum,purchrvo purchr){
		PageHelper.startPage(pageNum, 5);
		List<purchrvo> list=purchase.selectAll(purchr);
		PageInfo<purchrvo> page=new PageInfo<purchrvo>(list);
		return page;
	}
	
}
