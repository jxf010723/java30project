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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.All;
import com.accp.domain.Cart;
import com.accp.domain.Integral;
import com.accp.domain.Jurisdictiontype;
import com.accp.domain.Order;
import com.accp.domain.Shop;
import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.service.ShopService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	ShopService service;
	
	/**
	 * 新增订单
	 */
	@RequestMapping("/insertOrder")
	@ResponseBody
	public int insertOrder(Order order) {
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
		
		File directory = new File("/E:/Y2/�ļ�/��Ŀ����/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : updateFiles) {
				String url = "/E:/Y2/�ļ�/��Ŀ����/images/";
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
		
		File directory = new File("//E:/Y2/�ļ�/��Ŀ����/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : insertFiles) {
				String url = "//E:/Y2/�ļ�/��Ŀ����/images/";
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
	public User login(User user,HttpServletRequest request) {
		//System.out.println(user.getUname()+"---"+user.getUpwd());
		user = service.login(user);
		if(user!=null) {
			HttpSession session=request.getSession();//��ȡsession����userName����session����
			session.setAttribute("user", user);
			System.out.println(111);
		}
		return user;
		
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
