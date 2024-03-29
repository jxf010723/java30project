package com.accp.config;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.accp.Interceptor.MyInterceptor;


@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {
	
	@Autowired
	MyInterceptor my;

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
				.addResourceLocations("file:E:/Y2/文件/项目资料/images/").addResourceLocations("file:E:/Y2/文件/项目资料/images/");
		super.addResourceHandlers(registry);
	}

	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter string = new StringHttpMessageConverter(StandardCharsets.UTF_8);
		converters.add(string);
		converters.add(new MappingJackson2HttpMessageConverter());
		converters.add(new ByteArrayHttpMessageConverter());
		super.configureMessageConverters(converters);
	}
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(my).addPathPatterns("/**").excludePathPatterns("/module/**").excludePathPatterns("/js/**").excludePathPatterns("/verPerm");
		System.out.println("进来了MvcConfig");
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/shop/**").addPathPatterns("/goods/**")
		.addPathPatterns("/member/**").addPathPatterns("/user/**").excludePathPatterns("/shop/login")
		.excludePathPatterns("/shop/uploadAjax").excludePathPatterns("/shop/queryIntegral")
		.excludePathPatterns("/user/tc").excludePathPatterns("/shop/queryStock")
		.excludePathPatterns("/shop/updateDetailsCount").excludePathPatterns("/shop/updateGoodsStock")
		.excludePathPatterns("/shop/queryVipBalance").excludePathPatterns("/shop/updateVipprice")
		.excludePathPatterns("/shop/queryHaveCart").excludePathPatterns("/shop/queryCartByvipid")
		.excludePathPatterns("/shop/queryTenGoods").excludePathPatterns("/shop/queryGoodstype")
		.excludePathPatterns("/shop/queryByTid").excludePathPatterns("/shop/queryCartByvipid")
		.excludePathPatterns("/shop/queryVip").excludePathPatterns("/shop/queryCart")
		.excludePathPatterns("/shop/queryCartByvipid").excludePathPatterns("/shop/updateCartCount")
		.excludePathPatterns("/shop/selectBystaffid").excludePathPatterns("/shop/updateStoreById")
		.excludePathPatterns("/shop/selectByShopid").excludePathPatterns("/shop/queryModule")
		.excludePathPatterns("/shop/queryJurisdictiontype").excludePathPatterns("/shop/queryShop")
		.excludePathPatterns("/shop/queryViptype").excludePathPatterns("/goods/goodssupplierByid")
		.excludePathPatterns("/goods/goodstypeAll").excludePathPatterns("/goods/selectgoodsByzongji")
		.excludePathPatterns("/goods/downloadExcel").excludePathPatterns("/goods/chicunquery")
		.excludePathPatterns("/goods/upimgAjax").excludePathPatterns("/goods/goodsquery")
		.excludePathPatterns("/goods/supplierquery").excludePathPatterns("/goods/dateNew")
		.excludePathPatterns("/goods/selectshop").excludePathPatterns("/goods/bj")
		.excludePathPatterns("/goods/xiou2").excludePathPatterns("/goods/selectBygoodsid")
		.excludePathPatterns("/member/downloadExcel").excludePathPatterns("/member/queryVipType")
		.excludePathPatterns("/member/queryVipByid").excludePathPatterns("/member/queryVipTypeByid")
		.excludePathPatterns("/member/queryvipByViptypeid")
		.excludePathPatterns("/member/queryvip").excludePathPatterns("/hotcakes/querySpType")
		.excludePathPatterns("/hotcakes/queryShop").excludePathPatterns("/hotcakes/queryGoods2Byid")
		.excludePathPatterns("/index/**").excludePathPatterns("/user/getUser").excludePathPatterns("/user/updateUser").excludePathPatterns("/user/uploadFile");
		//super.addInterceptors(registry);
	}

}

