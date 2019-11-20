package com.accp.Interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component//��spring��������������󣬱�ʾ�����齨
public class MyInterceptor  implements HandlerInterceptor {
	
	/*@Autowired
	ModuleService mService;

	*//***
	 * 
	 * ִ�п�����֮ǰִ�и÷���������false��ʾ��ִ�п�����
	 * 
	 *//*
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandler");
		HttpSession session = request.getSession();
		List<Module> list = (List<Module>)session.getAttribute("prem");
		if(list==null) {
			list = mService.findModuleListByUserId(1);
			session.setAttribute("perm", list);
		}
		String path = request.getRequestURI();
		boolean flag = false;
		for(Module m : list) {
			if(path.equals(m.getPath())) {
				System.out.println("��Ȩ��.....");
				flag = true;
				return true;
			}
		}
		System.out.println("û��Ȩ��....");
		return flag;
	}*/
	
	/**
	 * 
	 * ���Ƴɹ�ִ�У�û�з����쳣���
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandler");
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	/**
	 * �����Ƿ����쳣���ᱻִ��
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCOmpletion");
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
