package com.accp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//������תҳ��
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/money")
	public String money(String dataid,HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		if(!dataid.equals("login")) {
			if(request.getSession().getAttribute("user")==null) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('请先登录!');</script>");
				//return "redirect:index";跳不动。会造成index页面里嵌套index页面
				dataid="login";
			}
		}
		return dataid;
	}
	
	@RequestMapping("/money2")
	public String money2(String dataid,String purchaseid,Model model) {
		System.out.println("mmmmm"+purchaseid);
		System.out.println("www"+dataid);
		model.addAttribute("purchaseid",purchaseid);
		return dataid;
	}
}
