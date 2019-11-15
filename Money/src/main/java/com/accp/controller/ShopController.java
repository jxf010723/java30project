package com.accp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.All;
import com.accp.domain.User;
import com.accp.service.ShopService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	ShopService service;
	
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
			pageSize = 1;
		}
		System.out.println("pageNum==="+pageNum+"pageSize==="+pageSize);
		PageInfo<All> page = service.queryShopList(pageNum,pageSize);
		return page;
	}

}
