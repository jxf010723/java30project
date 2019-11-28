package com.accp.controller;

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
	public String money(String dataid) {
		System.out.println("qqq"+dataid);
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
