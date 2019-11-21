package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Integral;
import com.accp.domain.Order;
import com.accp.domain.OrderDetailsBysp;
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
	 * ��Ա��Ϣ��ҳ��ѯ
	 */
	@RequestMapping("/queryMember")
	@ResponseBody
	public PageInfo queryByPageMember_info(Integer pageNum,Integer pageSize,String viptypeid,String searchname) {
		return service.queryByPageMember_info(pageNum,pageSize,viptypeid,searchname);
	}
	
	/*
	 * ��ѯ��Ա�ȼ�
	 */
	@RequestMapping("/queryVipType")
	@ResponseBody
	public List<Viptype> queryVipType() {
		return service.queryVipType();
	}
	
	/*
	 *����id��ѯ��Ա�ȼ�
	 */
	@RequestMapping("/queryVipTypeByid")
	@ResponseBody
	public Viptype queryVipTypeByid(Integer viptypeId) {
		return service.queryVipTypeByid(viptypeId);
	}
	
	/*
	 * ������Ա�ȼ�
	 */
	@RequestMapping("/addVipType")
	@ResponseBody
	public int addVipType(Viptype viptype) {
		return service.addVipType(viptype);
	}
	
	/*
	 * �޸Ļ�Ա�ȼ�
	 */
	@RequestMapping("/updateVipType")
	@ResponseBody
	public int updateVipType(Viptype viptype) {
		return service.updateVipType(viptype);
	}
	
	/*
	 * ɾ��������Ա�ȼ�
	 */
	@RequestMapping("/delVipType")
	@ResponseBody
	public int delVipType(Integer viptypeId) {
		return service.delVipType(viptypeId);
	}
	
	/*
	 *��ѯ��Ա��ֵ�ֿ���Ϣ
	 */
	@RequestMapping("/queryRechargeDeductions")
	@ResponseBody
	public List<RechargeDeduction> queryRechargeDeductions(String preDate,String afterDate,String name) throws ParseException {
		return service.queryRechargeDeductions(preDate,afterDate,name);
	}
	
	@RequestMapping("/queryBydd")
	@ResponseBody
	public PageInfo<Order> queryBydd(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name) throws ParseException {
		return service.queryBydd(pageNum,pageSize,preDate,afterDate,name);
	}
	
	@RequestMapping("/queryBysp")
	@ResponseBody
	public PageInfo<OrderDetailsBysp> queryBysp(Integer pageNum,Integer pageSize,String preDate,String afterDate,String name) throws ParseException {
		return service.queryBysp(pageNum,pageSize,preDate,afterDate,name);
	}
	
	@RequestMapping("/downloadExcel")
	public ResponseEntity<byte []> exportExcel(){
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		
		Row titleRow = sheet.createRow(0);
		
		titleRow.createCell(0).setCellValue("学生姓名");
		titleRow.createCell(1).setCellValue("学生年龄");
		titleRow.createCell(2).setCellValue("学生生日");
		
		Row row = sheet.createRow(1);
		
		Cell nameCell = row.createCell(0);
		nameCell.setCellValue("1");
		Cell ageCell = row.createCell(1);
		ageCell.setCellValue("2");
		Cell birtydayCell = row.createCell(2);
		birtydayCell.setCellValue("3");
		
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("vip信息导入模板.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	
	@RequestMapping("/selectintegral")
	@ResponseBody
	public Integral selectintegral() {
		return service.selectIntegral();
	}
	
	@RequestMapping("/updateintegral")
	@ResponseBody
	public int updateintegral(Integral record) {
		return service.updateintegral(record);
	}
	
}
