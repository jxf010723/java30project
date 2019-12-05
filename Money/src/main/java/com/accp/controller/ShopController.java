package com.accp.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
import com.accp.service.ShopService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	ShopService service;
	
	//统计(查出所有类型)
	@RequestMapping("/queryViptype")
	@ResponseBody
	public List<Viptype> queryViptype(){
		return service.queryViptype();
	}
	
	//统计(右边的折现柱形图)对应会员类型对应上个月哪天的销售额
	@RequestMapping("/queryZheshan")
	@ResponseBody
	public List<All> queryZheshan(){
		return service.queryZheshan();
	}
	
	//统计
	@RequestMapping("/queryTongJi")
	@ResponseBody
	public List<All> queryTongJi(){
		return service.queryTongJi();
	}
	
	@RequestMapping("/queryByTid")
	@ResponseBody
	public All queryByTid(Integer tid) {
		return service.queryByTid(tid);
	}
	
	//修改商品明细表数量
	@RequestMapping("/updateDetailsCount")
	@ResponseBody
	public int updateDetailsCount(Integer count,Integer detailsid) {
		System.out.println("count==="+count+"detailsid==="+detailsid);
		return service.updateDetailsCount(count, detailsid);
	}
	
	//修改商品表库存列
	@RequestMapping("/updateGoodsStock")
	@ResponseBody
	public int updateGoodsStock(Integer stock,Integer goodsid) {
		System.out.println("stock==="+stock+"goodsid==="+goodsid);
		return service.updateGoodsStock(stock, goodsid);
	}
	
	//修改权限
	@RequestMapping("/updateModule")
	@ResponseBody
	public String updateModule(@RequestParam("tname") String tname,Integer tid,@RequestParam(value = "arr[]") String[] arr) {
		boolean f=false;
		System.out.println("tname==="+tname+"tid==="+tid+"arr长度=="+arr.length);
		Jurisdictiontype jurisdictiontype = new Jurisdictiontype();
		jurisdictiontype.setTid(tid);
		jurisdictiontype.setTname(tname);
		if(service.updateJurisdictiontype(jurisdictiontype)>0) {
			//权限组表修改
			StringBuffer sb = new StringBuffer();
    		String pname = null;
    		for (int i = 0; i < arr.length; i++) {
    			pname = sb.append(arr[i]+",").toString();
			}
    		String name = pname.substring(0,pname.length()-1);
    		Power p = new Power(tid, name);
    		p.setPid(tid);
    		p.setPname(name);
			if(service.updatePower(p)>0) {
				//权限关系表修改
				for (int i = 0; i < arr.length; i++) {
					RolesModule role = new RolesModule();
					role.setRid(tid);
					role.setMid(Integer.parseInt(arr[i]));
					role.setId((i+1));
					if(service.updateRolesModule(role)>0) {
						f=true;
					}
				}
			}
		}
		System.out.println(f);
		if(f) {
    		return "success";
    	}else {
    		return "shibai";
    	}
	}
	
	
	
	//新增职位
	@RequestMapping("/insertModule")
	@ResponseBody
	public String insertpositionBypname(@RequestParam("tname") String tname, @RequestParam(value = "arr[]")String [] arr) {
		/* 首先新增职位名称 */
		System.out.println(tname);
		System.out.println(arr);
		boolean f=false;
		//新增职位类型表
    	if (service.insertModule(tname)>0) {
			/* 根据职位名称查询pid */
    		Jurisdictiontype position=service.queryByTname(tname);
    		//新增权限组表
    		StringBuffer sb = new StringBuffer();
    		String pname = null;
    		for (int i = 0; i < arr.length; i++) {
    			pname = sb.append(arr[i]+",").toString();
			}
    		String name = pname.substring(0,pname.length()-1);
    		System.out.println("pname==="+pname+"name==="+name);
    		Power power = new Power();
    		power.setPname(name);
    		if(service.insertPower(power)>0) {
    			/*根据pid新增职位权限表*/
        		for(String s:arr) {
        			int moid=Integer.parseInt(s);
        			RolesModule mm=new RolesModule();
        			mm.setRid(position.getTid());
        			mm.setMid(moid);
        			if(service.insertRolesModule(mm)>0) {
        				f=true;
        			}
        		}
    		}
    		
		 }
    	if(f) {
    		return "0";
    	}else {
    		return "1";
    	}
		 
    }
	
	@RequestMapping("/queryModule")
	@ResponseBody
	public List<Module> queryModule(){
		return service.queryModule();
	}
	
	@RequestMapping("/queryTtype")
	@ResponseBody
	public List<Jurisdictiontype> queryTtype(){
		return service.queryTtype();
	}
	
	/**
	 * 根据商品详情id和会员id修改数量
	 */
	@RequestMapping("/updateGuaCount")
	@ResponseBody
	public int updateGuaCount(Integer count,Integer gdid,Integer vipid){
		return service.updateGuaCount(count, gdid, vipid);
	}
	
	/**
	 * 查询该cid的购物车有没有，有则做下面的修改操作
	 */
	@RequestMapping("/queryHaveCart")
	@ResponseBody
	public Cart queryHaveCart(Integer gdid,Integer vipid) {
		return service.queryHaveCart(gdid, vipid);
	}
	
	/**
	 * 修改该购物车的商品数量
	 */
	@RequestMapping("/updateCartCount")
	@ResponseBody
	public int updateCartCount(Integer count,Integer cid) {
		return service.updateCartCount(count, cid);
	}
	
	/**
	 * 根据购物车id清空购物车
	 */
	@RequestMapping("/deleteCart")
	@ResponseBody
	public int deleteCart(Integer cid) {
		return service.deleteCart(cid);
	}
	
	/**
	 * 根据会员id查询购物车
	 */
	@RequestMapping("/queryCartByvipid")
	@ResponseBody
	public List<All> queryCartByvipid(Integer vipid){
		List<All> list = service.queryCartByvipid(vipid);
		for (All all : list) {
			all.setCount(all.getOrderCount());
		}
		return list;
	}
	
	/**
	 * 查询购物车所有
	 */
	@RequestMapping("/queryCart")
	@ResponseBody
	public List<All> queryCart(){
		return service.queryCart();
	}
	
	/**
	 * 修改会员的余额和成交金额
	 */
	@RequestMapping("/updateVipprice")
	@ResponseBody
	public int updateVipprice(Double balance,Double transactionprice,Integer vipid) {
		return service.updateVipprice(balance, transactionprice, vipid);
	}
	
	/**
	 * 查询会员的余额
	 */
	@RequestMapping("/queryVipBalance")
	@ResponseBody
	public Vip queryVipBalance(Integer vipid) {
		return service.queryVipBalance(vipid);
	}
	
	/**
	 * 修改会员的积分
	 */
	@RequestMapping("/updatePoint")
	@ResponseBody
	public int updatePoint(Double point,Integer uid) {
		return service.updatePoint(point,uid);
	}
	
	/**
	 * 新增订单
	 */
	@RequestMapping("/insertOrder")
	@ResponseBody
	public int insertOrder(@RequestBody Order order) {
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
		Calendar calendar = Calendar.getInstance();
		String dateName = df.format(calendar.getTime());

		Random ne=new Random();//实例化一个random的对象ne
		int x = ne.nextInt(999-100+1)+100;//为变量赋随机值100-999
		String random_order = String.valueOf(x);
		String order_id = dateName+random_order;
		order.setOrderId(order_id);
		
		Date date = new Date();
		order.setOrderDate(date);
		return service.insertOrder(order);
	}
	
	/**
	 * 查询积分设置表是否可以使用积分
	 */
	@RequestMapping("/queryIntegral")
	@ResponseBody
	public List<Integral> queryIntegral() {
		return service.queryIntegral();
	}
	
	/**
	 * 查询会员类型和对应的会员
	 */
	@RequestMapping("/queryVip")
	@ResponseBody
	public List<All> queryVip(){
		return service.queryVip();
	}
	
	/**
	 * 新增购物车
	 */
	@RequestMapping("/insertCart")
	@ResponseBody
	public int insertCart(Cart cart) {
		Date date = new Date();
		cart.setOrderDate(date);
		return service.insertCart(cart);
	}
	
	/**
	 * ��ѯ����Ʒ����Ʒ����
	 */
	@RequestMapping("/queryGoodstype")
	@ResponseBody
	public List<All> queryGoodstype(){
		return service.queryGoodstype();
	}
	
	/**
	 * ��ѯ��������ǰʮ��������õ���Ʒ(�����е���Ʒ����)
	 */
	@RequestMapping("/queryTenGoods")
	@ResponseBody
	public List<All> queryTenGoods(){
		return service.queryTenGoods();
	}
	
	/**
	 * �˻����޸�
	 */
	@RequestMapping("/updateUser")
	@ResponseBody
	public int updateUser(User user) {
		return service.updateUser(user);
	}
	
	/**
	 * �˻��Ĳ�ѯ
	 */
	@RequestMapping("/queryUser")
	@ResponseBody
	public User queryUser(Integer uid) {
		return service.queryUser(uid);
	}
	
	/**
	 * ɾ��Ա��
	 */
	@RequestMapping("/delEmployee")
	@ResponseBody
	public int delEmployee(Integer staffid) {
		return service.delEmployee(staffid);
	}
	
	/**
	 * �޸�Ա����Ϣ
	 */
	@RequestMapping("/updatestaff")
	@ResponseBody
	public int updatestaff(Staff staff) {
		return service.updatestaff(staff);
	}
	
	/**
	 * ����Ա��
	 */
	@RequestMapping("/insertstaff")
	@ResponseBody
	public String insertstaff(Staff staff) {
		service.insertstaff(staff);
		return "success";
	}
	
	/**
	 * ����Ա��id��ѯ��ӦԱ��
	 */
	@RequestMapping("/selectBystaffid")
	@ResponseBody
	public Staff selectBystaffid(Integer staffid) {
		return service.selectBystaffid(staffid);
	}
	
	/**
	 * ��ѯȫ������
	 */
	@RequestMapping("/queryShop")
	@ResponseBody
	public List<Shop> queryShop(){
		return service.queryShop();
	}
	
	/**
	 * ��ѯȫ��ְλ
	 */
	@RequestMapping("/queryJurisdictiontype")
	@ResponseBody
	public List<Jurisdictiontype> queryJurisdictiontype(){
		return service.queryJurisdictiontype();
	}
	
	/**
	 * Ա������Ĳ�ѯ
	 */
	@RequestMapping("/queryStaff")
	@ResponseBody
	public PageInfo<All> queryStaff(Integer pageNum,Integer pageSize,String shopname,String tname,String employeename){
		if(pageNum==null) {
			pageNum = 1;
		}
		if(pageSize==null) {
			pageSize = 5;
		}
		PageInfo<All> page = service.queryStaff(pageNum,pageSize, shopname, tname, employeename);
		System.out.println(shopname+tname+ employeename+"111");
		return page;
	}
	
	/**
	 * ���ݵ���idɾ����Ӧ����
	 * @return
	 */
	@RequestMapping("/delStoreById")
	@ResponseBody
	public int delStoreById(Integer shopid) {
		return service.delStoreById(shopid);
	}
	
	/**
	 * ���ݵ���id�޸Ķ�Ӧ����
	 */
	@RequestMapping("/updateStoreById")
	@ResponseBody
	public String updateStoreById(MultipartFile[] updateFiles,Shop shop) {
		shop.setAddress(shop.getProvince()+shop.getCity()+shop.getRegion());
		shop.setShopuser(shop.getPhonenumber());
		
		File directory = new File("/E:/Y2/文件/项目资料/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : updateFiles) {
				String url = "/E:/Y2/文件/项目资料/images/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				System.out.println(l.getOriginalFilename()+"hhh");
				shop.setShopimg(l.getOriginalFilename());
			}
			System.out.println("to�ɹ���");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		service.updateStoreById(shop);
		return "success";
	}
	
	/**
	 * ���ݵ���id��ѯ��ص���
	 */
	@RequestMapping("/selectByShopid")
	@ResponseBody
	public Shop selectByShopid(Integer shopid) {
		return service.selectByShopid(shopid);
	}
	
	/**
	 * �������̹���ĵ���
	 */
	@RequestMapping("/insertShop")
	@ResponseBody
	public String insertShop(Shop shop) {
		shop.setAddress(shop.getProvince()+shop.getCity()+shop.getRegion());
		shop.setShopuser(shop.getPhonenumber());
		service.insertShop(shop);
		System.out.println("������");
		return "success";
	}
	
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile[] insertFiles,Shop shop) {
		shop.setAddress(shop.getProvince()+shop.getCity()+shop.getRegion());
		shop.setShopuser(shop.getPhonenumber());
		
		File directory = new File("/E:/Y2/文件/项目资料/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : insertFiles) {
				String url = "/E:/Y2/文件/项目资料/images/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				System.out.println(l.getOriginalFilename());
				shop.setShopimg(l.getOriginalFilename());
			}
			System.out.println("to�ɹ���");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		service.insertShop(shop);
		return "success";
	}
	
	/**
	 * �����Ƿ��и����û�����������ҵ����û�
	 * @param user
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Staff login(Staff staff,HttpServletRequest request) {
		//System.out.println(user.getUname()+"---"+user.getUpwd());
		staff = service.login(staff);
		if(staff!=null) {
			HttpSession session=request.getSession();//��ȡsession����userName����session����
			session.setAttribute("user", staff);
			List<All> list = service.queryByUserId(staff.getStaffid());
			session.setAttribute("perm", list);
			System.out.println("路径有"+list.get(0).getPath());
		}
		return staff;
		
	}
	
	/**
	 * ��ѯ���̹�������ŵ��б�
	 * @return
	 */
	@RequestMapping("/queryShopList")
	@ResponseBody
	public PageInfo<All> queryShopList(Integer pageNum,Integer pageSize){
		if(pageNum==null) {
			pageNum = 1;
		}
		if(pageSize==null) {
			pageSize = 5;
		}
		//System.out.println("pageNum==="+pageNum+"pageSize==="+pageSize);
		PageInfo<All> page = service.queryShopList(pageNum,pageSize);
		return page;
	}

}
