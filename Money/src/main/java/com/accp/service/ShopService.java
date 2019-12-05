package com.accp.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.All;
import com.accp.domain.Cart;
import com.accp.domain.Integral;
import com.accp.domain.Jurisdictiontype;
import com.accp.domain.Module;
import com.accp.domain.Order;
import com.accp.domain.Power;
import com.accp.domain.RolesModule;
import com.accp.domain.Shop;
import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.domain.Vip;
import com.accp.domain.Viptype;
import com.accp.mapper.CartMapper;
import com.accp.mapper.IntegralMapper;
import com.accp.mapper.JurisdictiontypeMapper;
import com.accp.mapper.OrderDetailsMapper;
import com.accp.mapper.OrderMapper;
import com.accp.mapper.PowerMapper;
import com.accp.mapper.RolesModuleMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.UserMapper;
import com.accp.mapper.VipMapper;
import com.accp.mapper.ViptypeMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
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
	
	@Autowired
	OrderDetailsMapper dMapper;
	
	@Autowired
	RolesModuleMapper rMapper;
	
	@Autowired
	PowerMapper pMapper;
	
	@Autowired
	ViptypeMapper vtMapper;
	
	@Autowired
	VipMapper vMapper;
	
	//修改商品明细表数量
	public int updateDetailsCount(Integer count,Integer detailsid) {
		return sMapper.updateDetailsCount(count, detailsid);
	}
	
	//修改商品表库存列
	public int updateGoodsStock(Integer stock,Integer goodsid) {
		return sMapper.updateGoodsStock(stock, goodsid);
	}
	
	//统计(查出所有类型)
	public List<Viptype> queryViptype(){
		return vtMapper.selectByExample(null);
	}
	
	//统计(右边的折现柱形图)对应会员类型对应上个月哪天的销售额
	public List<All> queryZheshan(){
		Calendar cal = Calendar.getInstance();
		int nowmonth = cal.get(Calendar.MONTH)+1; 	//这个月
		int nowyear = cal.get(Calendar.YEAR); //当前年
		int nowday = cal.get(Calendar.DATE);	//当前日
		Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
		int day=aCalendar.getActualMaximum(Calendar.DATE);
		String vipdate = "";
		System.out.println("这个月的天数："+day);
		List<All> zlist = new ArrayList<>();
		for (int i = 1; i <= day; i++) {
			vipdate = nowyear+"-"+nowmonth+"-"+i;
			//System.out.println("日期为vipdate："+vipdate);
			List<Viptype> vtlist = vtMapper.selectByExample(null);
			List<All> tlist = new ArrayList<>();
			//Hashtable<Integer, Double> tlist = new Hashtable<>();
			for (Viptype viptype : vtlist) {
				All a = sMapper.queryZheshan(vipdate,viptype.getViptypeId());
				if(a!=null) {
					a.setTname(viptype.getViptypeName());
					tlist.add(a);
				}
				
			}
			
			All a = new All();
			List<All> glist = new ArrayList<>();
			for (All all : tlist) {
				All ltlist = sMapper.queryByTypeId(all.getViptypeId(),vipdate);
				glist.add(ltlist);
				a.setTname(all.getTname());
			}
			a.setTlist(glist);
			System.out.println("第一个tlist的个数"+tlist.size());
			//System.out.println("第二个tlist的个数"+a.getTlist().size());
			a.setSdate(vipdate);
			//a.setTname();
			zlist.add(a);
		}
		System.out.println("集合的个数"+zlist.size());
		return zlist;
	}
	
	//统计
	public List<All> queryTongJi(){
		return sMapper.queryTongJi();
	}
	
	//职位类型表修改
	public int updateJurisdictiontype(Jurisdictiontype jurisdictiontype) {
		return jMapper.updateByPrimaryKey(jurisdictiontype);
	}
	
	//权限关系表修改
	public int updateRolesModule(RolesModule role) {
		return rMapper.updateByPrimaryKey(role);
	}
	
	//权限组表修改
	public int updatePower(Power power) {
		return pMapper.updateByPrimaryKey(power);
	}
	
	public All queryByTid(Integer tid) {
		return sMapper.queryByTid(tid);
	}
	
	public Jurisdictiontype queryByTname(String tname) {
		return sMapper.queryByTname(tname);
	}
	
	public int insertModule(String tname) {
		return sMapper.insertModule(tname);
	}
	
	public int insertRolesModule(RolesModule rm) {
		return rMapper.insert(rm);
	}
	
	public int insertPower(Power power) {
		return pMapper.insert(power);
	}
	
	public List<Module> queryModule(){
		List<Module> mlist = new ArrayList<>();
		List<Module> zlist = sMapper.queryByZero();
		for (Module module : zlist) {
			List<Module> nlist = sMapper.queryByNoZero(module.getMid());
			Module m = new Module();
			m.setDlist(nlist);
			m.setMname(module.getMname());
			m.setMid(module.getMid());
			mlist.add(m);
		}
		return mlist;
	}
	
	public List<Jurisdictiontype> queryTtype(){
		return jMapper.selectByExample(null);
	}
	
	/*根据用户ID查询用户拥有的所有权限*/
	public List<All> queryByUserId(Integer uid){
		All power = sMapper.queryByUserId(uid);
		return sMapper.queryPower(power.getPname(),power.getPname());
	}

	
	/**
	 * 根据商品详情id和会员id修改数量
	 */
	public int updateGuaCount(Integer count,Integer gdid,Integer vipid){
		return sMapper.updateGuaCount(count, gdid, vipid);
	}
	
	/**
	 * 查询该商品详情id(gdid)的购物车有没有，有则做下面的修改操作
	 */
	public Cart queryHaveCart(Integer gdid,Integer vipid) {
		return sMapper.queryHaveCart(gdid, vipid);
	}
	
	/**
	 * 修改该购物车的商品数量
	 */
	public int updateCartCount(Integer count,Integer cid) {
		return sMapper.updateCartCount(count, cid);
	}
	
	/**
	 * 根据购物车id清空购物车
	 */
	public int deleteCart(Integer cid) {
		return cMapper.deleteByPrimaryKey(cid);
	}
	
	/**
	 * 查询购物车所有
	 */
	public List<All> queryCart(){
		return sMapper.queryAll();
	}
	
	/**
	 * 根据会员id查询购物车
	 */
	public List<All> queryCartByvipid(Integer vipid){
		return sMapper.queryCartByvipid(vipid);
	}
	
	/**
	 * 修改会员的余额和成交金额
	 */
	public int updateVipprice(Double balance,Double transactionprice,Integer vipid) {
		return sMapper.updateVipprice(balance, transactionprice, vipid);
	}
	
	/**
	 * 查询会员的余额
	 */
	public Vip queryVipBalance(Integer vipid) {
		return vMapper.selectByPrimaryKey(vipid);
	}
	
	/**
	 * 修改会员的积分
	 */
	public int updatePoint(Double point,Integer uid) {
		return sMapper.updatePoint(point,uid);
	}
	
	/**
	 * 新增订单
	 */
	public int insertOrder(Order order) {
		oMapper.insert(order);
		return dMapper.addEach(order.getDetails(), order.getOrderId());
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
	public Staff login(Staff staff) {
		return fMapper.login(staff);
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
