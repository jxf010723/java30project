package com.accp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Details;
import com.accp.domain.Goods;
import com.accp.domain.Goodsize;
import com.accp.domain.Goodstype;
import com.accp.domain.Purchase;
import com.accp.domain.Purchasedetails;
import com.accp.domain.Shop;
import com.accp.domain.Supplier;
import com.accp.domain.purchrvo;
import com.accp.domain.zongjivo;
import com.accp.mapper.GoodsMapper;
import com.accp.mapper.GoodsizeMapper;
import com.accp.mapper.GoodstypeMapper;
import com.accp.mapper.PurchaseMapper;
import com.accp.mapper.PurchasedetailsMapper;
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
	PurchaseMapper purch;
	@Autowired
	GoodsMapper goods;
	@Autowired
	GoodsizeMapper goodsize;
	@Autowired
	PurchasedetailsMapper purchasedetails;
	
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
	
	/**
	 * 根据供应商id查询
	 * @param suppid
	 * @return
	 */
	public Supplier supplierByid(String suppid) {
		return  supplier.selectByid(suppid);
	}
	
	
	public PageInfo<purchrvo> purchasepage(int pageNum,purchrvo purchr){
		PageHelper.startPage(pageNum, 5);
		List<purchrvo> list=purch.selectAll(purchr);
		PageInfo<purchrvo> page=new PageInfo<purchrvo>(list);
		return page;
	}
	/**
	 * 查询全部商品类别
	 * @return
	 */
	public List<Goodstype> goodstypeAll(){
		return goodstype.selectByExample(null);
	}
	/**
	 * 根据店长查询商品
	 */
	public PageInfo<Goods> selectgoodspage(int pageNum,String uid,String typeid,String numbers){
		PageHelper.startPage(pageNum, 5);
		
		List<Goods> list=goods.selectgoodsAll(uid, typeid, numbers);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		return page;
	}
	/*
	 * 查询商品的总计
	 */
	public zongjivo selectByzongji(String uid,String typeid,String numbers){
		System.out.println("asd"+numbers);
		return goods.selectByzongji(uid, typeid, numbers);
		
	}
	/**
	 * 导出商品的查询
	 * @param uid
	 * @param typeid
	 * @param numbers
	 * @return
	 */
	public List<Goods> selectgoodsAll(String uid,String typeid,String numbers) {
		return goods.selectgoodsAlls(uid, typeid, numbers);
	}
	
	public Goodstype selectBytypename(String typename){
		return goodstype.selectBytypename(typename);
	}
	
	public int insertSelective(Goods record){
		return goods.insertSelective(record);
	}
	public List<Goodsize> chicunquery(){
		return goodsize.selectByExample(null);
	}
	
	public int insertzhuxiang(Goods good) {
		int a=goods.insertzhuxiang(good);
		good.getGoodsid();
        //新增子表了
        for (Details e : good.getSpx()) {
        	e.setGoodsid(good.getGoodsid().toString());
        	goods.insertxiang(e);
		}
		return 1;
		
	}
//	public int insertxiang(Goods good) {
//		return goods.insertxiang(good);
//	}
	public List<Goods> goodsquery(){
		return goods.selectByExample(null);
	}
	public List<Supplier> supplierquery(){
		return supplier.selectByExample(null);
	}
	//查看指定日期有多少个单号
		public String selectdate(String datetime) {
			int a=purch.selectdate(datetime)+1;
			if(a<10) {
				return "00"+a;
			}else if(a<100){
				return "0"+a;
			}else if(a<100){
				return a+"";
			}
			return "";
		}
		
		//新增主表
		public int insertPurchase(Purchase purchase) {
	        int a=purch.insertSelective(purchase);
	        purchase.getPurchaseid();
	        //新增子表了
	        for (Purchasedetails e : purchase.getPurchasezi()) {
	        	e.setPurchaseid(purchase.getPurchaseid());
	        	purchasedetails.insertSelective(e);
			}
	        return 1;
		}
		//查看采购信息
		public  List<Purchase> selectPurchase(String purchasedate,String purchasedatejie) {
			 return purch.selectPurchase(purchasedate,purchasedatejie);
		}
		//查询店铺
	    public List<Shop> selectshop(String userid){
	    	return purch.selectshop(userid);
	    }
	  //修改采购状态
		public  int upda(Integer purchaseid){
			return purch.upda(purchaseid);	
		}
		//采购单删除
		public int deletePurchaseid(String purchaseid){
			return purch.deleteByid(purchaseid);
		}
		//查看
		public  List<Purchasedetails> bj(Integer purchaseid) {
			return purch.selectall(purchaseid);	
		}
		//修改采购表 查出所有表
		public Purchase xiou(Integer purchaseid) {
			Purchase p=purch.seleszhuid(purchaseid);
			p.setPurchasezi(purch.selectall(purchaseid));
			return p;	
		}
		
		//修改表
		public void updatazhu(Purchase purchase) {
			//修改主表
			purch.updatazhu(purchase.getSupplierid(), purchase.getSuppliername(), purchase.getUserid(), purchase.getUname(), purchase.getRemarks(), purchase.getPurchasezi().get(0).getPurchaseid());
			//删除子表
			purch.deleteByddd(purchase.getPurchasezi().get(0).getPurchaseid().toString());
			//新增子表
			for (Purchasedetails t : purchase.getPurchasezi()) {
				t.setPurchaseid(purchase.getPurchasezi().get(0).getPurchaseid());
				purchasedetails.insertSelective(t);
			}
		}
		public int deletegoods(String goodsid) {
			goods.deletegoods(goodsid);
			goods.deletedetails(goodsid);
			return 1;
		}
		//根据id查询主详
		public Goods selectBygoodsid(String goodsid){
			Goods goo=goods.selectgoodsbyid(goodsid);
			goo.setSpx(goods.selectdetailsbyid(goodsid));
			return goo;
		}
		//修改表goods
		public void updategoods(Goods good) {
			//修改主表
			goods.updategoods(good);
			//删除子表
			goods.deletedetails(good.getGoodsid().toString());
			//新增子表
			for (Details t : good.getSpx()) {
				t.setGoodsid(good.getGoodsid().toString());
				goods.insertxiang(t);
			}
		}
}
