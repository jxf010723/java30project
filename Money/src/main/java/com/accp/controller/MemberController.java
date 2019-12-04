package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Integral;
import com.accp.domain.Order;
import com.accp.domain.OrderDetailsBysp;
import com.accp.domain.RechargeDeduction;
import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.domain.Vip;
import com.accp.domain.Viptype;
import com.accp.domain.memberInfo;
import com.accp.mapper.UserMapper;
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
	
	/*
	 * 下载模板
	 */
	@RequestMapping("/downloadExcel")
	public ResponseEntity<byte []> downloadExcel(){
		//下载本地Excel文件
		/*try {
			FileInputStream is = new FileInputStream("/D:/load/vipinfo.xlsx");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", new String("vip信息导入模版.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;*/
		//下载生成的Excel文件
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		
		Row titleRow = sheet.createRow(0);
		
		titleRow.createCell(0).setCellValue("用户名");
		titleRow.createCell(1).setCellValue("vip等级");
		titleRow.createCell(2).setCellValue("手机号");
		titleRow.createCell(3).setCellValue("vip名称");
		titleRow.createCell(4).setCellValue("密码");
		titleRow.createCell(5).setCellValue("省");
		titleRow.createCell(6).setCellValue("市");
		titleRow.createCell(7).setCellValue("地区");
		titleRow.createCell(8).setCellValue("街道");
		titleRow.createCell(9).setCellValue("余额");
		titleRow.createCell(10).setCellValue("积分");
		
		Row row = sheet.createRow(1);
		
		Cell userIdCell = row.createCell(0);
		userIdCell.setCellValue("18670802166");
		Cell viptypeIdCell = row.createCell(1);
		viptypeIdCell.setCellValue("svip");
		Cell vipPhoneCell = row.createCell(2);
		vipPhoneCell.setCellValue("15021512215");
		Cell vipNameCell = row.createCell(3);
		vipNameCell.setCellValue("zp");
		Cell vipPwdCell = row.createCell(4);
		vipPwdCell.setCellValue("123");
		Cell vipProvinceCell = row.createCell(5);
		vipProvinceCell.setCellValue("湖南省");
		Cell vipCityCell = row.createCell(6);
		vipCityCell.setCellValue("株洲市");
		Cell vipRegionCell = row.createCell(7);
		vipRegionCell.setCellValue("天元区");
		Cell vipStreetCell = row.createCell(8);
		vipStreetCell.setCellValue("泰山路");
		Cell balanceCell = row.createCell(9);
		balanceCell.setCellValue(500.00);
		Cell integralCell = row.createCell(10);
		integralCell.setCellValue(320);
		
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
	
	/*
	 * 导出
	 */
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String viptypeid,String searchname){
		List<memberInfo>list=service.querylist(viptypeid, searchname);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		
		Row titleRow = sheet.createRow(0);
		
		titleRow.createCell(0).setCellValue("用户名");
		titleRow.createCell(1).setCellValue("vip等级");
		titleRow.createCell(2).setCellValue("手机号");
		titleRow.createCell(3).setCellValue("vip名称");
		titleRow.createCell(4).setCellValue("密码");
		titleRow.createCell(5).setCellValue("省");
		titleRow.createCell(6).setCellValue("市");
		titleRow.createCell(7).setCellValue("地区");
		titleRow.createCell(8).setCellValue("街道");
		titleRow.createCell(9).setCellValue("余额");
		titleRow.createCell(10).setCellValue("积分");
		
		for (int i = 0; i < list.size(); i++) {
			Row row = sheet.createRow(i+1);
			Cell userIdCell = row.createCell(0);
			userIdCell.setCellValue(service.selectNameByUserid(list.get(i).getUserId()));
			Cell viptypeIdCell = row.createCell(1);
			viptypeIdCell.setCellValue(list.get(i).getViptypeName());
			Cell vipPhoneCell = row.createCell(2);
			vipPhoneCell.setCellValue(list.get(i).getVipPhone());
			Cell vipNameCell = row.createCell(3);
			vipNameCell.setCellValue(list.get(i).getVipName());
			Cell vipPwdCell = row.createCell(4);
			vipPwdCell.setCellValue(list.get(i).getVipPwd());
			Cell vipProvinceCell = row.createCell(5);
			vipProvinceCell.setCellValue(list.get(i).getVipProvince());
			Cell vipCityCell = row.createCell(6);
			vipCityCell.setCellValue(list.get(i).getVipCity());
			Cell vipRegionCell = row.createCell(7);
			vipRegionCell.setCellValue(list.get(i).getVipRegion());
			Cell vipStreetCell = row.createCell(8);
			vipStreetCell.setCellValue(list.get(i).getVipStreet());
			Cell balanceCell = row.createCell(9);
			balanceCell.setCellValue(list.get(i).getBalance());
			Cell integralCell = row.createCell(10);
			integralCell.setCellValue(list.get(i).getIntegral());
		}
		
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("导出的会员信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
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
	
	@RequestMapping("/addVip")
	@ResponseBody
	public int addVip(Vip record,HttpServletRequest request) {
		Staff user=(Staff) request.getSession().getAttribute("user");
		record.setUserId(user.getStaffid());
		return service.addVip(record);
	}
	
	@RequestMapping("/queryVipByid")
	@ResponseBody
	public Vip queryVipByid(Integer vipId) {
		return service.queryVipByid(vipId);
	}
	
	@RequestMapping("/updateVip")
	@ResponseBody
	public int updateVip(Vip record) {
		return service.updateVip(record);
	}
	
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile file) {
		try {
			//将传入的文件转换成excel
			Workbook wb = new XSSFWorkbook(file.getInputStream());
			//获取sheet业的个数
			int sheets = wb.getNumberOfSheets();
			for(int i=0;i<sheets;i++) {
				//根据下标获取sheet页
				Sheet sheet = wb.getSheetAt(i);
				//获取当前sheet页的行数
				int rows = sheet.getPhysicalNumberOfRows();
				for(int j=1;j<rows;j++) {
					//根据下标获取行
					Row row = sheet.getRow(j);
					Vip vip=new Vip();
					Cell userIdCell = row.getCell(0);
					vip.setUserId(service.selectUserByUserName(userIdCell.getStringCellValue()).getUid());
					Cell viptypeIdCell = row.getCell(1);
					vip.setViptypeId(service.selectViptypeByviptypeName(viptypeIdCell.getStringCellValue()));
					Cell vipPhoneCell = row.getCell(2);
					vip.setVipPhone(vipPhoneCell.getStringCellValue());
					Cell vipNameCell = row.getCell(3);
					vip.setVipName(vipNameCell.getStringCellValue());
					Cell vipPwdCell = row.getCell(4);
					vip.setVipPwd(vipPwdCell.getStringCellValue());
					Cell vipProvinceCell = row.getCell(5);
					vip.setVipProvince(vipProvinceCell.getStringCellValue());
					Cell vipCityCell = row.getCell(6);
					vip.setVipCity(vipCityCell.getStringCellValue());
					Cell vipRegionCell = row.getCell(7);
					vip.setVipRegion(vipRegionCell.getStringCellValue());
					Cell vipStreetCell = row.getCell(8);
					vip.setVipStreet(vipStreetCell.getStringCellValue());
					Cell balanceCell = row.getCell(9);
					vip.setBalance(balanceCell.getNumericCellValue());
					Cell integralCell = row.getCell(10);
					System.out.println(integralCell.getNumericCellValue());
					Double integral=integralCell.getNumericCellValue();
					vip.setIntegral(integral.intValue());
					service.addVip(vip);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	@RequestMapping("/queryvip")
	@ResponseBody
	public List<Vip> queryvip() {
		return service.queryvip();
	}
	
	@RequestMapping("/UpdateVip")
	@ResponseBody
	public int UpdateVip(Integer vipId,Integer cz,Integer jf) throws ParseException {
		service.UpdateVip(vipId,cz,jf);
		return 0; 
	}
}
