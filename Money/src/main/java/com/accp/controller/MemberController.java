package com.accp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.RechargeDeduction;
import com.accp.domain.Viptype;
import com.accp.service.MemberService;
import com.github.pagehelper.PageInfo;

@RequestMapping("/member")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	/*
	 * 会员信息分页查询
	 */
	@RequestMapping("/queryMember")
	@ResponseBody
	public PageInfo queryByPageMember_info(Integer pageNum,Integer pageSize,String viptypeid,String searchname) {
		return service.queryByPageMember_info(pageNum,pageSize,viptypeid,searchname);
	}
	
	/*
	 * 查询会员等级
	 */
	@RequestMapping("/queryVipType")
	@ResponseBody
	public List<Viptype> queryVipType() {
		return service.queryVipType();
	}
	
	/*
	 *根据id查询会员等级
	 */
	@RequestMapping("/queryVipTypeByid")
	@ResponseBody
	public Viptype queryVipTypeByid(Integer viptypeId) {
		return service.queryVipTypeByid(viptypeId);
	}
	
	/*
	 * 新增会员等级
	 */
	@RequestMapping("/addVipType")
	@ResponseBody
	public int addVipType(Viptype viptype) {
		return service.addVipType(viptype);
	}
	
	/*
	 * 修改会员等级
	 */
	@RequestMapping("/updateVipType")
	@ResponseBody
	public int updateVipType(Viptype viptype) {
		return service.updateVipType(viptype);
	}
	
	/*
	 * 删除新增会员等级
	 */
	@RequestMapping("/delVipType")
	@ResponseBody
	public int delVipType(Integer viptypeId) {
		return service.delVipType(viptypeId);
	}
	
	/*
	 *查询会员充值抵扣信息
	 */
	@RequestMapping("/queryRechargeDeductions")
	@ResponseBody
	public List<RechargeDeduction> queryRechargeDeductions(String preDate,String afterDate,String name) {
		return service.queryRechargeDeductions(preDate,afterDate,name);
	}
}
