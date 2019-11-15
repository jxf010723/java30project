package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.All;
import com.accp.domain.User;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ShopService {
	@Autowired
	private UserMapper UMapper;
	
	@Autowired
	private ShopMapper sMapper;
	
	/**
	 * �����Ƿ��и����û�����������ҵ����û�
	 * @param user
	 * @return
	 */
	public User login(User user) {
		return UMapper.login(user);
	}
	
	/**
	 * ��ѯ���̹�������ŵ��б�
	 * @return
	 */
	public PageInfo<All> queryShopList(Integer pageNum,Integer pageSize){
		Page page=PageHelper.startPage(pageNum, pageSize);
		/*sMapper.queryShopList();
		System.out.println(page.toPageInfo());
		return page.toPageInfo();*/
		List<All> list = sMapper.queryShopList();
		return page.toPageInfo();
	}
}
