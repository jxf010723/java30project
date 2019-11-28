package com.accp.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.assertj.core.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.accp.domain.User;

@Component
public class LoginInterceptor implements HandlerInterceptor {
 
    //����������ڷ��ʽӿ�֮ǰִ�еģ�����ֻ��Ҫ������д��֤��½״̬��ҵ���߼����Ϳ������û�����ָ���ӿ�֮ǰ��֤��½״̬��
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //ÿһ����Ŀ���ڵ�½��ʵ���߼�����������������ʹ����򵥵�Session��ȡUser����֤��½��
        HttpSession session = request.getSession();
        System.out.println("��������������֤���ҽ�����");
        //�����User�ǵ�½ʱ����session��
        User user = (User) session.getAttribute("user");
        //���session��û��user����ʾû��½
        if (user == null){
        	System.out.println("��֤���û�û�е�¼");
            //�����������false��ʾ���Ե�ǰ�������һ���û���������Ҫ��½����ʹ�õĽӿڣ������û�е�½�����ֱ�Ӻ��Ե�
            //��Ȼ���������response���û�����һЩ��ʾ��Ϣ��������û��½
        	response.sendRedirect(request.getContextPath()+"/money?dataid='login'");
            return false;
        }else {
        	System.out.println("��֤���û��Ѿ���¼");
            return true;    //���session����user����ʾ���û��Ѿ���½�����У��û����ɼ��������Լ���Ҫ�Ľӿ�
        }
    }
 
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
//    }
// 
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
//    }
}