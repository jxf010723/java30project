package com.accp.Interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.accp.domain.All;
import com.accp.service.ShopService;



@Component
public class MyInterceptor implements HandlerInterceptor{
	@Autowired
	ShopService sService;

	/***
	 * 
	 * 执行控制器之前执行该方法，返回false表示不执行控制器
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandler");
		
		HttpSession session = request.getSession();
		List<All> list = (List<All>)session.getAttribute("perm");
		/*if(list==null) {
			list = sService.queryByUserId(1);
			session.setAttribute("perm", list);
		}*/
		String path = request.getRequestURI();
		boolean flag = false;
		for(All m : list) {
			System.out.println(m.getPath());
			if(path.equals(m.getPath())) {
				flag = true;
				return true;
			}
		}
		
		return flag;
	}
	/**
	 * 
	 * 控制成功执行，没有发生异常情况
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
	 * 不管是否发生异常都会被执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCOmpletion");
		System.out.println("进入");
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
