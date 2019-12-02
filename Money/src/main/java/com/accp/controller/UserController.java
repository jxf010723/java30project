package com.accp.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
//页面取session赋值再修改
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public Staff getUser(HttpServletRequest request) {
		HttpSession session=request.getSession();//��ȡsession����userName����session����
		Staff user=(Staff) session.getAttribute("user");
		return user;
		
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public int updateUser(Staff staff,HttpServletRequest request) {
		userService.updateUser(staff);
		//修改session的user
		HttpSession session=request.getSession();//��ȡsession����userName����session����
		session.setAttribute("user",userService.queryUserById(staff.getStaffid()));
		return 0;
		
	}
	
	@RequestMapping("/uploadFile")
	@ResponseBody
	public String uploadFile(MultipartFile file,HttpServletRequest request) {
		File directory = new File("/D:/Y2/文件/项目资料/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			String url = "/D:/Y2/文件/项目资料/images/";
			url = url+"/"+file.getOriginalFilename();
			Staff user=(Staff) request.getSession().getAttribute("user");
			user.setHeadportrait(file.getOriginalFilename());
			userService.updateUser(user);
			File f = new File(url);
			file.transferTo(f);
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
}
