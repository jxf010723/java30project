package com.accp.controller;

import org.springframework.stereotype.Controller;
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
		//System.out.println("qqq"+dataid);
		return dataid;
	}
}
