package com.accp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Integral;
import com.accp.domain.IntegralExample;
import com.accp.domain.Order;
import com.accp.domain.OrderDetailsBysp;
import com.accp.domain.OrderExample;
import com.accp.domain.RechargeDeduction;
import com.accp.domain.RechargeDeductionExample;
import com.accp.domain.User;
import com.accp.domain.UserExample;
import com.accp.domain.Vip;
import com.accp.domain.Viptype;
import com.accp.domain.memberInfo;
import com.accp.mapper.IntegralMapper;
import com.accp.mapper.OrderMapper;
import com.accp.mapper.RechargeDeductionMapper;
import com.accp.mapper.UserMapper;
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
	
	@Autowired
	private IntegralMapper integralMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	/*
	 * 会员信息分页查询方法
	 */
	public PageInfo<memberInfo> queryByPageMember_info(Integer pageNum,Integer pageSize,String viptypeid,String searchname) {
		Page page = PageHelper.startPage(pageNum, pageSize);
		List<memberInfo> list=this.querylist(viptypeid, searchname);
		return page.toPageInfo();
	}
	
	public List<memberInfo> querylist(String viptypeid,String searchname){
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
		return list;
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
	public PageInfo<Order> queryBydd(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name) throws ParseException{
		Page<Order> page = PageHelper.startPage(pageNum, pageSize);
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
	public PageInfo<OrderDetailsBysp> queryBysp(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name) throws ParseException{
		Page<OrderDetailsBysp> page = PageHelper.startPage(pageNum, pageSize);
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
		for (OrderDetailsBysp orderDetailsBysp : page.toPageInfo().getList()) {
			System.out.println(orderDetailsBysp.getGoodsName());
		}
		return page.toPageInfo();
	}
	
	public int updateintegral(Integral record) {
		return integralMapper.update(record);
	}
	
	public Integral selectIntegral() {
		return integralMapper.selectIntegral();
	}
	
	public int addVip(Vip record) {
		//拿到session里的用户id?
		//搞不太清业务逻辑，
		//这里先用死值:userid //
		record.setVipTurnover(0);
		record.setTransactionPrice(0.0);
		record.setBalance(0.0);
		record.setIntegral(0);
		return vipMapper.insertSelective(record);
	}
	
	public Vip queryVipByid(Integer vipId) {
		return vipMapper.selectByPrimaryKey(vipId);
	}
	
	public int updateVip(Vip record) {
		return vipMapper.updateByPrimaryKey(record);
	}
	
	public String selectNameByUserid(Integer uid) {
		return userMapper.selectByPrimaryKey(uid).getUname();
	}
	
	public User selectUserByUserName(String uname) {
		return userMapper.selectUserByUserName(uname);
	}
	
	public Integer selectViptypeByviptypeName(String name) {
		return viptypeMappper.selectViptypeByviptypeName(name);
	}
	
	public List<Vip> queryvip() {
		return vipMapper.selectByExample(null);
	}
	
	public int UpdateVip(Integer vipId,Integer cz,Integer jf) throws ParseException {
		Vip vip=this.queryVipByid(vipId);
		//新增  充值抵扣记录表
		RechargeDeduction record=new RechargeDeduction();
		record.setRdDate(sdf.parse(sdf.format(new Date())));
		record.setRdVxid(vip.getVipPhone());
		record.setRdName(vip.getVipName());
		record.setRdPhone(vip.getVipPhone());
		record.setRdRecharge(cz);
		record.setRdPresentation(jf);
		record.setRdExpenditure(vip.getTransactionPrice());
		record.setRdBalance(vip.getBalance()+cz);
		rechargeDeductionMapper.insertSelective(record);
		//修改  vip会员表信息
		vip.setBalance(vip.getBalance()+cz);
		vip.setIntegral(vip.getIntegral()+jf);
		vipMapper.updateByPrimaryKey(vip);
		return 0;
	}
}
