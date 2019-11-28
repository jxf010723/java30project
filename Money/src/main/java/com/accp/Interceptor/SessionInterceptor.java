package com.accp.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
//����������
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
            }
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
            }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       
    	/* //��ͨ·������
        if ("/yanzheng".equals(arg0.getRequestURI()) || "/login".equals(arg0.getRequestURI())) {
            return true;}    
        //Ȩ��·������
        Object object = arg0.getSession().getAttribute("users");
        if (null == object) {
            arg1.sendRedirect("/login");
            return false;}*/
    	
    	
    	/*if(handler instanceof HandlerMethod) {
			HandlerMethod method = (HandlerMethod) handler;
			if(method.getBean() instanceof LoginController) {
				return true;
			}
		}
		//String path=request.getContextPath();
		User user=(User)request.getSession().getAttribute("user");
		if(user==null) {
			response.sendRedirect("/index");
			return false;
		}*/
        return true;
    }
}
