package com.accp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.All;
import com.accp.domain.Jurisdictiontype;
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
	 * 删除员工
	 */
	@RequestMapping("/delEmployee")
	@ResponseBody
	public int delEmployee(Integer staffid) {
		return service.delEmployee(staffid);
	}
	
	/**
	 * 修改员工信息
	 */
	@RequestMapping("/updatestaff")
	@ResponseBody
	public int updatestaff(Staff staff) {
		return service.updatestaff(staff);
	}
	
	/**
	 * 新增员工
	 */
	@RequestMapping("/insertstaff")
	@ResponseBody
	public String insertstaff(Staff staff) {
		service.insertstaff(staff);
		return "success";
	}
	
	/**
	 * 根据员工id查询对应员工
	 */
	@RequestMapping("/selectBystaffid")
	@ResponseBody
	public Staff selectBystaffid(Integer staffid) {
		return service.selectBystaffid(staffid);
	}
	
	/**
	 * 查询全部店铺
	 */
	@RequestMapping("/queryShop")
	@ResponseBody
	public List<Shop> queryShop(){
		return service.queryShop();
	}
	
	/**
	 * 查询全部职位
	 */
	@RequestMapping("/queryJurisdictiontype")
	@ResponseBody
	public List<Jurisdictiontype> queryJurisdictiontype(){
		return service.queryJurisdictiontype();
	}
	
	/**
	 * 员工管理的查询
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
		System.out.println(shopname+tname+ employeename);
		return page;
	}
	
	/**
	 * 根据店铺id删除对应店铺
	 * @return
	 */
	@RequestMapping("/delStoreById")
	@ResponseBody
	public int delStoreById(Integer shopid) {
		return service.delStoreById(shopid);
	}
	
	/**
	 * 根据店铺id修改对应店铺
	 */
	@RequestMapping("/updateStoreById")
	@ResponseBody
	public String updateStoreById(MultipartFile[] updateFiles,Shop shop) {
		shop.setAddress(shop.getProvince()+shop.getCity()+shop.getRegion());
		shop.setShopuser(shop.getPhonenumber());
		
		File directory = new File("/C:/Users/Administrator/git/java30project/Money/src/main/resources/static/images/file");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : updateFiles) {
				String url = "/C:/Users/Administrator/git/java30project/Money/src/main/resources/static/images/file/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				System.out.println(l.getOriginalFilename()+"hhh");
				shop.setShopimg(l.getOriginalFilename());
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		service.updateStoreById(shop);
		return "success";
	}
	
	/**
	 * 根据店铺id查询相关店铺
	 */
	@RequestMapping("/selectByShopid")
	@ResponseBody
	public Shop selectByShopid(Integer shopid) {
		return service.selectByShopid(shopid);
	}
	
	/**
	 * 新增店铺管理的店铺
	 */
	@RequestMapping("/insertShop")
	@ResponseBody
	public String insertShop(Shop shop) {
		shop.setAddress(shop.getProvince()+shop.getCity()+shop.getRegion());
		shop.setShopuser(shop.getPhonenumber());
		service.insertShop(shop);
		System.out.println("进来了");
		return "success";
	}
	
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile[] insertFiles,Shop shop) {
		shop.setAddress(shop.getProvince()+shop.getCity()+shop.getRegion());
		shop.setShopuser(shop.getPhonenumber());
		
		File directory = new File("/C:/Users/Administrator/git/java30project/Money/src/main/resources/static/images/file");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : insertFiles) {
				String url = "/C:/Users/Administrator/git/java30project/Money/src/main/resources/static/images/file/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				System.out.println(l.getOriginalFilename());
				shop.setShopimg(l.getOriginalFilename());
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		service.insertShop(shop);
		return "success";
	}
	
	/**
	 * 查找是否有根据用户名和密码查找到的用户
	 * @param user
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public User login(User user,HttpServletRequest request) {
		//System.out.println(user.getUname()+"---"+user.getUpwd());
		user = service.login(user);
		if(user!=null) {
			HttpSession session=request.getSession();//获取session并将userName存入session对象
			session.setAttribute("user", user);
			System.out.println(111);
		}
		return user;
		
	}
	
	/**
	 * 查询店铺管理里的门店列表
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
