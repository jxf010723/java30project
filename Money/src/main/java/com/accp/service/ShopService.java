package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.All;
import com.accp.domain.Cart;
import com.accp.domain.Integral;
import com.accp.domain.Jurisdictiontype;
import com.accp.domain.Order;
import com.accp.domain.Shop;
import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.domain.Viptype;
import com.accp.mapper.CartMapper;
import com.accp.mapper.IntegralMapper;
import com.accp.mapper.JurisdictiontypeMapper;
import com.accp.mapper.OrderMapper;
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
	
	@Autowired
	CartMapper cMapper;
	
	@Autowired
	IntegralMapper iMapper;
	
	@Autowired
	OrderMapper oMapper;
	
	/**
	 * 新增订单
	 */
	public int insertOrder(Order order) {
		return oMapper.insert(order);
	}
	
	/**
	 * 查询积分设置表是否可以使用积分
	 */
	public List<Integral> queryIntegral() {
		return iMapper.selectByExample(null);
	}
	
	/**
	 * 查询会员类型和对应的会员
	 */
	public List<All> queryVip(){
		List<All> zlist = new ArrayList<>();
		
		List<Viptype> tlist = sMapper.queryViptype();
		
		for (Viptype type : tlist) {
			List<All> glist = sMapper.queryVip(type.getViptypeId());
			System.out.println(glist.get(0).getUid());
			All a = new All();
			a.setVlist(glist);
			a.setViptypeName(type.getViptypeName());
			a.setViptypeDiscount(type.getViptypeDiscount());
			zlist.add(a);
		}
		return zlist;
	}
	
	/**
	 * 新增购物车
	 */
	public int insertCart(Cart cart) {
		return cMapper.insert(cart);
	}
	
	/**
	 * ��ѯ����Ʒ����Ʒ���ͺͲ�ѯ��Ʒ����id��Ӧ����Ʒ
	 */
	public List<All> queryGoodstype(){
		List<All> zlist = new ArrayList<>();
		
		List<All> tlist = sMapper.queryGoodstype();
		
		for (All all : tlist) {
			List<All> glist = sMapper.queryGoods(all.getTypeid());
			All a = new All();
			a.setGlist(glist);
			a.setTypename(all.getTypename());
			zlist.add(a);
		}
		return zlist;
	}
	
	/**
	 * ��ѯ��������ǰʮ��������õ���Ʒ(�����е���Ʒ����)
	 */
	public List<All> queryTenGoods(){
		return sMapper.queryTenGoods();
	}
	
	/**
	 * �˻����޸�
	 */
	public int updateUser(User user) {
		return UMapper.updateByPrimaryKey(user);
	}
	
	/**
	 * �˻��Ĳ�ѯ
	 */
	public User queryUser(Integer uid) {
		return uMapper.selectByPrimaryKey(uid);
	}
	
	/**
	 * ɾ��Ա��
	 */
	public int delEmployee(Integer staffid) {
		return fMapper.deleteByPrimaryKey(staffid);
	}
	
	/**
	 * �޸�Ա����Ϣ
	 */
	public int updatestaff(Staff staff) {
		return fMapper.updateByPrimaryKey(staff);
	}
	
	/**
	 * ����Ա��
	 */
	public int insertstaff(Staff staff) {
		return fMapper.insert(staff);
	}
	
	/**
	 * ����Ա��id��ѯ��ӦԱ��
	 */
	public Staff selectBystaffid(Integer staffid) {
		return fMapper.selectByPrimaryKey(staffid);
	}
	
	/**
	 * ��ѯȫ������
	 */
	public List<Shop> queryShop(){
		System.out.println(sMapper.selectByExample(null));
		return sMapper.selectByExample(null);
	}
	
	/**
	 * ��ѯȫ��ְλ
	 */
	public List<Jurisdictiontype> queryJurisdictiontype(){
		return jMapper.selectByExample(null);
	}
	
	/**
	 * Ա������Ĳ�ѯ
	 */
	public PageInfo<All> queryStaff(Integer pageNum,Integer pageSize,String shopname,String tname,String employeename){
		Page page=PageHelper.startPage(pageNum, pageSize);
		List<All> list = fMapper.queryStaff(shopname, tname, employeename);
		return page.toPageInfo();
	}
	
	/**
	 * ���ݵ���idɾ����Ӧ����
	 * @return
	 */
	public int delStoreById(Integer shopid) {
		return sMapper.deleteByPrimaryKey(shopid);
	}
	
	/**
	 * ���ݵ���id�޸Ķ�Ӧ����
	 */
	public int updateStoreById(Shop shop) {
		return sMapper.updateByPrimaryKey(shop);
	}
	
	/**
	 * ���ݵ���id��ѯ��ص���
	 */
	public Shop selectByShopid(Integer shopid) {
		return sMapper.selectByPrimaryKey(shopid);
	}
	
	/**
	 * �������̹���ĵ���
	 */
	public int insertShop(Shop shop) {
		return sMapper.insert(shop);
	}
	
	/**
	 * �����Ƿ��и����û�����������ҵ����û�
	 * @param user
	 * @return
	 */
	public User login(User user) {
		return UMapper.login(user);
	}
	
	/**
	 * ��ѯ���̹�������ŵ��б�
	 * @return
	 */
	public PageInfo<All> queryShopList(Integer pageNum,Integer pageSize){
		Page page=PageHelper.startPage(pageNum, pageSize);
		List<All> list = sMapper.queryShopList();
		return page.toPageInfo();
	}
}
