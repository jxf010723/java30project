package com.accp.service;

import java.text.ParseException;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Goods;
import com.accp.domain.Goods2;
import com.accp.domain.Goodstype;
import com.accp.domain.RechargeDeduction;
import com.accp.domain.RechargeDeductionExample;
import com.accp.domain.Shop;
import com.accp.domain.Viptype;
import com.accp.mapper.GoodsMapper;
import com.accp.mapper.GoodstypeMapper;
import com.accp.mapper.ShopMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class HotcakesService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Autowired
	private GoodstypeMapper goodstypeMapper;
	
	@Autowired
	private ShopMapper shopMapper;
	
	public PageInfo querySp(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name,String shopid,String typeid) throws ParseException{
		Page page = PageHelper.startPage(pageNum, pageSize);
		List<Goods2>list=null;
		if(!preDate.equals("") && !afterDate.equals("") || !name.equals("") || !shopid.equals("全部店铺") || !typeid.equals("全部类别")){
			if(!preDate.equals("") && !afterDate.equals("") && !name.equals("") && !shopid.equals("全部店铺") && !typeid.equals("全部类别")) {
				list=goodsMapper.querySp1(preDate, afterDate, name, Integer.parseInt(shopid), Integer.parseInt(typeid));
			}else if(!preDate.equals("") && !afterDate.equals("") && !shopid.equals("全部店铺") && !typeid.equals("全部类别")) {
				list=goodsMapper.querySp11(preDate, afterDate, Integer.parseInt(shopid), Integer.parseInt(typeid));
			}else if(!preDate.equals("") && !afterDate.equals("") && !name.equals("") && !shopid.equals("全部店铺")) {
				list=goodsMapper.querySp2(preDate, afterDate, name, Integer.parseInt(shopid));
			}else if(!preDate.equals("") && !afterDate.equals("") && !name.equals("") && !typeid.equals("全部类别")) {
				list=goodsMapper.querySp3(preDate, afterDate, name, Integer.parseInt(typeid));
			}else if(!preDate.equals("") && !afterDate.equals("") && !name.equals("")) {
				list=goodsMapper.querySp4(preDate, afterDate, name);
			}else if(!preDate.equals("") && !afterDate.equals("")) {
				list=goodsMapper.querySp9(preDate, afterDate);
			}else if(!shopid.equals("全部店铺") && !typeid.equals("全部类别")) {
				list=goodsMapper.querySp10(Integer.parseInt(shopid), Integer.parseInt(typeid));
			}else if(!name.equals("")) {
				list=goodsMapper.querySp6(name);
			}else if(!shopid.equals("全部店铺")) {
				list=goodsMapper.querySp7(Integer.parseInt(shopid));
			}else if(!typeid.equals("全部类别")) {
				list=goodsMapper.querySp8(Integer.parseInt(typeid));
			}
			
		}else {
			list=goodsMapper.querySp5();
		}
		return page.toPageInfo();
	}
	
	public List<Goodstype> querySpType() {
		return goodstypeMapper.selectByExample(null);
	}
	
	public List<Shop> queryShop() {
		return shopMapper.selectByExample(null);
	}
	
	public Goods2 queryGoods2Byid(Integer goodsid) {
		return goodsMapper.queryGoods2Byid(goodsid);
	}
}
