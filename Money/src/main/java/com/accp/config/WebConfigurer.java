package com.accp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.accp.Interceptor.LoginInterceptor;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
	 @Autowired
	 private LoginInterceptor loginInterceptor;
	
	  // ����������������þ�̬��Դ�ģ�����html��js��css���ȵ�
	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  }
	 
	  // �����������ע���������������Լ�д�õ���������Ҫͨ���������ע�������Ч
	  @Override
	  public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns("/**") ��ʾ�������е�����
	        // excludePathPatterns("/login", "/register") ��ʾ���˵�½��ע��֮�⣬��Ϊ��½ע�᲻��Ҫ��½Ҳ���Է���
		  	System.out.println("WebConfigurer������");
	        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login", "/register");
	        //super.addInterceptors(registry);    //����Spring Boot�İ汾���������ֱ��ȥ��������ᱨ��
	  }
}
