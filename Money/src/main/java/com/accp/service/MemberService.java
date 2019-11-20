package com.accp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Order;
import com.accp.domain.OrderDetailsBysp;
import com.accp.domain.OrderExample;
import com.accp.domain.RechargeDeduction;
import com.accp.domain.RechargeDeductionExample;
import com.accp.domain.Viptype;
import com.accp.domain.memberInfo;
import com.accp.mapper.OrderMapper;
import com.accp.mapper.RechargeDeductionMapper;
import com.accp.mapper.VipMapper;
import com.accp.mapper.ViptypeMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private VipMapper vipMapper;
	
	@Autowired
	private ViptypeMapper viptypeMappper;
	
	@Autowired
	private RechargeDeductionMapper rechargeDeductionMapper;
	
	@Autowired
	private OrderMapper orderMapper;
	
	/*
	 * 会员信息分页查询方法
	 */
	public PageInfo<memberInfo> queryByPageMember_info(Integer pageNum,Integer pageSize,String viptypeid,String searchname) {
		Page page = PageHelper.startPage(pageNum, pageSize);
		List<memberInfo> list=null;
		if(!viptypeid.equals("全部等级")  || !searchname.equals("")) {
			if (!viptypeid.equals("全部等级") && !searchname.equals("")) {
				list=vipMapper.queryByPageMember_infoByAll(viptypeid,searchname);
			}else if(!viptypeid.equals("全部等级")) {
				list=vipMapper.queryByPageMember_infoByviptypeid(viptypeid);
			}else if(!searchname.equals("")) {
				list=vipMapper.queryByPageMember_infoBysearchname(searchname);
			}	
		}else {
			list=vipMapper.queryByPageMember_info();
		}
		return page.toPageInfo();
	}
	
	/*
	 * 查询会员等级方法
	 */
	public List<Viptype> queryVipType() {
		return viptypeMappper.selectByExample(null);
	}
	
	/*
	 * 根据id查询会员等级方法
	 */
	public Viptype queryVipTypeByid(Integer viptypeId) {
		return viptypeMappper.selectByPrimaryKey(viptypeId);
	}
	
	/*
	 * 新增会员等级方法
	 */
	public int addVipType(Viptype viptype) {
		return viptypeMappper.insertSelective(viptype);
	}
	
	/*
	 * 修改会员等级方法
	 */
	public int updateVipType(Viptype viptype) {
		return viptypeMappper.updateByPrimaryKey(viptype);
	}
	
	/*
	 * 删除会员等级方法
	 */
	public int delVipType(Integer viptypeId) {
		return viptypeMappper.deleteByPrimaryKey(viptypeId);
	}
	
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	/*
	 * 查询会员充值抵扣信息方法
	 */
	public List<RechargeDeduction> queryRechargeDeductions(String preDate,String afterDate,String name) throws ParseException{
		List<RechargeDeduction>list=null;
		if(!preDate.equals("") && !afterDate.equals("") || !name.equals("")){
			if(!preDate.equals("") && !afterDate.equals("") && !name.equals("")) {
				RechargeDeductionExample example=new RechargeDeductionExample();
				example.createCriteria().andRdDateBetween(sdf.parse(preDate), sdf.parse(afterDate)).andRdNameLike("%"+name+"%");
				list=rechargeDeductionMapper.selectByExample(example);
				if(list.size()==0) {
					RechargeDeductionExample example2=new RechargeDeductionExample();
					example2.createCriteria().andRdDateBetween(sdf.parse(preDate), sdf.parse(afterDate)).andRdVxidLike("%"+name+"%");
					list=rechargeDeductionMapper.selectByExample(example2);
				}
			}else if(!preDate.equals("") && !afterDate.equals("")) {
				RechargeDeductionExample example=new RechargeDeductionExample();
				example.createCriteria().andRdDateBetween(sdf.parse(preDate), sdf.parse(afterDate));
				list=rechargeDeductionMapper.selectByExample(example);
			}else if(!name.equals("")) {
				RechargeDeductionExample example=new RechargeDeductionExample();
				example.createCriteria().andRdNameLike("%"+name+"%");
				list=rechargeDeductionMapper.selectByExample(example);
				if(list.size()==0) {
					RechargeDeductionExample example2=new RechargeDeductionExample();
					example2.createCriteria().andRdVxidLike("%"+name+"%");
					list=rechargeDeductionMapper.selectByExample(example2);
				}
			}
		}else {
			list=rechargeDeductionMapper.selectByExample(null);
		}
		return list;
	}
	public PageInfo queryBydd(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name) throws ParseException{
		Page page = PageHelper.startPage(pageNum, pageSize);
		List<Order>list=null;
		if(!preDate.equals("") && !afterDate.equals("") || !name.equals("")){
			if(!preDate.equals("") && !afterDate.equals("") && !name.equals("")) {
				OrderExample example=new OrderExample();
				example.createCriteria().andOrderDateBetween(sdf.parse(preDate), sdf.parse(afterDate)).andOrderNameLike("%"+name+"%");
				list=orderMapper.selectByExample(example);
				if(list.size()==0) {
					OrderExample example2=new OrderExample();
					example2.createCriteria().andOrderDateBetween(sdf.parse(preDate), sdf.parse(afterDate)).andOrderPhoneLike("%"+name+"%");
					list=orderMapper.selectByExample(example2);
				}
			}else if(!preDate.equals("") && !afterDate.equals("")) {
				OrderExample example=new OrderExample();
				example.createCriteria().andOrderDateBetween(sdf.parse(preDate), sdf.parse(afterDate));
				list=orderMapper.selectByExample(example);
			}else if(!name.equals("")) {
				OrderExample example=new OrderExample();
				example.createCriteria().andOrderNameLike("%"+name+"%");
				list=orderMapper.selectByExample(example);
				if(list.size()==0) {
					OrderExample example2=new OrderExample();
					example2.createCriteria().andOrderPhoneLike("%"+name+"%");
					list=orderMapper.selectByExample(example2);
				}
			}
		}else {
			list=orderMapper.selectByExample(null);
		}
		return page.toPageInfo();
	}
	public PageInfo queryBysp(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name) throws ParseException{
		Page page = PageHelper.startPage(pageNum, pageSize);
		List<OrderDetailsBysp>list=null;
		if(!preDate.equals("") && !afterDate.equals("") || !name.equals("")){
			if(!preDate.equals("") && !afterDate.equals("") && !name.equals("")) {
				list=orderMapper.selectByspByAll(preDate, afterDate, name);
			}else if(!preDate.equals("") && !afterDate.equals("")) {
				list=orderMapper.selectByspBydate(preDate, afterDate);
			}else if(!name.equals("")) {
				list=orderMapper.selectByspByname(name);
			}
		}else {
			list=orderMapper.selectBysp();
		}
		return page.toPageInfo();
	}
}
