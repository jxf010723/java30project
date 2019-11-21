package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.All;
import com.accp.domain.Goods;
import com.accp.domain.Goodstype;
import com.accp.domain.Jurisdictiontype;
import com.accp.domain.Shop;
import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.mapper.JurisdictiontypeMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ShopService {
	@Autowired
	private UserMapper UMapper;
	
	@Autowired
	private ShopMapper sMapper;
	
	@Autowired
	StaffMapper fMapper;
	
	@Autowired
	JurisdictiontypeMapper jMapper;
	
	@Autowired
	UserMapper uMapper;
	
	
	/**
	 * 查询有商品的商品类型和查询商品类型id对应的商品
	 */
	public List<All> queryGoodstype(){
		List<All> zlist = new ArrayList<>();
		
		List<All> tlist = sMapper.queryGoodstype();
		
		for (All all : tlist) {
			List<Goods> glist = sMapper.queryGoods(all.getTypeid());
			All a = new All();
			a.setGlist(glist);
			a.setTypename(all.getTypename());
			zlist.add(a);
		}
		return zlist;
	}
	
	/**
	 * 查询订单表中前十条卖的最好的商品(订单中的商品数量)
	 */
	public List<All> queryTenGoods(){
		return sMapper.queryTenGoods();
	}
	
	/**
	 * 账户的修改
	 */
	public int updateUser(User user) {
		return UMapper.updateByPrimaryKey(user);
	}
	
	/**
	 * 账户的查询
	 */
	public User queryUser(Integer uid) {
		return uMapper.selectByPrimaryKey(uid);
	}
	
	/**
	 * 删除员工
	 */
	public int delEmployee(Integer staffid) {
		return fMapper.deleteByPrimaryKey(staffid);
	}
	
	/**
	 * 修改员工信息
	 */
	public int updatestaff(Staff staff) {
		return fMapper.updateByPrimaryKey(staff);
	}
	
	/**
	 * 新增员工
	 */
	public int insertstaff(Staff staff) {
		return fMapper.insert(staff);
	}
	
	/**
	 * 根据员工id查询对应员工
	 */
	public Staff selectBystaffid(Integer staffid) {
		return fMapper.selectByPrimaryKey(staffid);
	}
	
	/**
	 * 查询全部店铺
	 */
	public List<Shop> queryShop(){
		System.out.println(sMapper.selectByExample(null));
		return sMapper.selectByExample(null);
	}
	
	/**
	 * 查询全部职位
	 */
	public List<Jurisdictiontype> queryJurisdictiontype(){
		return jMapper.selectByExample(null);
	}
	
	/**
	 * 员工管理的查询
	 */
	public PageInfo<All> queryStaff(Integer pageNum,Integer pageSize,String shopname,String tname,String employeename){
		Page page=PageHelper.startPage(pageNum, pageSize);
		List<All> list = fMapper.queryStaff(shopname, tname, employeename);
		return page.toPageInfo();
	}
	
	/**
	 * 根据店铺id删除对应店铺
	 * @return
	 */
	public int delStoreById(Integer shopid) {
		return sMapper.deleteByPrimaryKey(shopid);
	}
	
	/**
	 * 根据店铺id修改对应店铺
	 */
	public int updateStoreById(Shop shop) {
		return sMapper.updateByPrimaryKey(shop);
	}
	
	/**
	 * 根据店铺id查询相关店铺
	 */
	public Shop selectByShopid(Integer shopid) {
		return sMapper.selectByPrimaryKey(shopid);
	}
	
	/**
	 * 新增店铺管理的店铺
	 */
	public int insertShop(Shop shop) {
		return sMapper.insert(shop);
	}
	
	/**
	 * 查找是否有根据用户名和密码查找到的用户
	 * @param user
	 * @return
	 */
	public User login(User user) {
		return UMapper.login(user);
	}
	
	/**
	 * 查询店铺管理里的门店列表
	 * @return
	 */
	public PageInfo<All> queryShopList(Integer pageNum,Integer pageSize){
		Page page=PageHelper.startPage(pageNum, pageSize);
		List<All> list = sMapper.queryShopList();
		return page.toPageInfo();
	}
}
