package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Goods;
import com.accp.domain.Goodsize;
import com.accp.domain.Goodstype;
import com.accp.domain.Purchase;
import com.accp.domain.Purchasedetails;
import com.accp.domain.Shop;
import com.accp.domain.Staff;
import com.accp.domain.Supplier;
import com.accp.domain.purchrvo;
import com.accp.domain.zongjivo;
import com.accp.service.GoodsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	GoodsService goods;
	/**
	 * 商品类型分页查询
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/goodstypepage")
	@ResponseBody
	public PageInfo<Goodstype> goodstypepage(int pageNum){
		
		PageInfo<Goodstype> page=goods.goodstypepage(pageNum);
		for (Goodstype list : page.getList()) {
			System.out.println(list);
		}
		return page;
	}
	/**
	 * 商品类型新增
	 * @param typename
	 * @return
	 */
	@RequestMapping("/goodstypeinsert")
	@ResponseBody
	public int goodstypeinsert(String typename) {
		return goods.goodstypeinsert(typename);
	}
	/**
	 * 商品类型修改
	 * @param typename
	 * @param id
	 * @return
	 */
	@RequestMapping("/goodstypeupdate")
	@ResponseBody
	public int goodstypeupdate(String typename,String id) {
		System.out.println(typename);
		System.out.println(id);
		return goods.goodstypeupdate(typename,id);
	}
	/**
	 * 商品类型删除
	 * @param typeid
	 * @return
	 */
	@RequestMapping("/goodstypedelete")
	@ResponseBody
	public int goodstypedelete(Integer typeid) {
		return goods.goodstypedelete(typeid);
	}
	@RequestMapping("/queryshop")
	@ResponseBody
	public List<Shop> queryshop(){
		return goods.queryshop();
	}
	/**
	 * 供应商分页查询   带多条件
	 * @param pageNum
	 * @param sheng
	 * @param shi
	 * @param ming
	 * @return
	 */
	@RequestMapping("/goodssupplierpage")
	@ResponseBody
	public PageInfo<Supplier> goodssupplierpage(int pageNum,String sheng,String shi,String ming){
		
		
		Supplier supp=new Supplier(ming,sheng,shi);
		System.out.println("进入"+sheng);
		PageInfo<Supplier> page=goods.supplierpage(pageNum, supp);
		for (Supplier list : page.getList()) {
			System.out.println("ss"+list);
			
		}
		return page;
	}
	/**
	 * 供应商新增
	 * @param supplier
	 * @return
	 */
	@RequestMapping("/supplierinsert")
	@ResponseBody
	public int supplierinsert(@RequestBody Supplier supplier) {
		System.out.println("新增");
		System.out.println(supplier);
		return goods.supplierinsert(supplier);
	}
	/**
	 * 供应商修改
	 * @param supplier
	 * @return
	 */
	@RequestMapping("/supplierupdate")
	@ResponseBody
	public int supplierupdate(@RequestBody Supplier supplier) {
		System.out.println("修改");
		System.out.println(supplier);
		return goods.supplierupdate(supplier);
	}
	/**
	 * 供应商根据id查询
	 * @param supplier
	 * @return
	 */
	@RequestMapping("/goodssupplierByid")
	@ResponseBody
	public Supplier goodssupplierByid(String suppid) {
		return goods.supplierByid(suppid);
	}
	
	/**
	 * 供应商删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/supplierdelete")
	@ResponseBody
	public int supplierupdate(String id) {
		return goods.supplierdelete(id);
	}
	
	@RequestMapping("/goodspurchasepage")
	@ResponseBody
	public PageInfo<purchrvo> goodspurchasepage(int pageNum,String kstime,String jstime,String ming,String supp){
		purchrvo pur=new purchrvo(ming,kstime,jstime,supp);
		PageInfo<purchrvo> page=goods.purchasepage(pageNum,pur);
		for (purchrvo list : page.getList()) {
			System.out.println("ss"+list);
			
		}
		return page;
	}
	/**
	 * 查询商品类别全部
	 * @return
	 */
	@RequestMapping("/goodstypeAll")
	@ResponseBody
	public List<Goodstype> goodstypeAll(){
		return goods.goodstypeAll();
	}
	/**
	 * 商品分页查询   带多条件
	 * @param pageNum
	 * @param kstime
	 * @param jstime
	 * @param ming
	 * @param supp
	 * @return
	 */
	@RequestMapping("/selectgoodspage")
	@ResponseBody
	public PageInfo<Goods> selectgoodspage(int pageNum,String typeid,String numbers,String shopid){
		
		PageInfo<Goods> page=goods.selectgoodspage(pageNum,typeid, "%"+numbers+"%",shopid);
		for (Goods list : page.getList()) {
			
			
		}
		return page;
	}
	
	@RequestMapping("/selectgoodsByzongji")
	@ResponseBody
	public zongjivo selectgoodsByzongji(String typeid,String numbers,String shopid){
		
		return goods.selectByzongji( typeid, "%"+numbers+"%",shopid);
	}
	
	@RequestMapping("/downloadExcel")
	public ResponseEntity<byte []> downloadExcel(){
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		
		Row titleRow = sheet.createRow(0);
		
		titleRow.createCell(0).setCellValue("类别");
		titleRow.createCell(1).setCellValue("商品编码(条码)");
		titleRow.createCell(2).setCellValue("商品名称");
		titleRow.createCell(3).setCellValue("款号/型号");
		titleRow.createCell(4).setCellValue("颜色");
		titleRow.createCell(5).setCellValue("尺码");
		titleRow.createCell(6).setCellValue("铭牌价");
		titleRow.createCell(7).setCellValue("数量");
		titleRow.createCell(8).setCellValue("进货成本");
		
		Row row = sheet.createRow(1);
		
		Cell userIdCell = row.createCell(0);
		userIdCell.setCellValue("裤子");
		
		Cell viptypeIdCell = row.createCell(1);
		viptypeIdCell.setCellValue("00001");
		
		Cell vipPhoneCell = row.createCell(2);
		vipPhoneCell.setCellValue("优衣库韩版长裤");
		Cell vipNameCell = row.createCell(3);
		vipNameCell.setCellValue("00215");
		Cell vipPwdCell = row.createCell(4);
		vipPwdCell.setCellValue("红色");
		Cell vipProvinceCell = row.createCell(5);
		vipProvinceCell.setCellValue("S");
		Cell vipCityCell = row.createCell(6);
		vipCityCell.setCellValue("128");
		Cell vipRegionCell = row.createCell(7);
		vipRegionCell.setCellValue("1");
		Cell vipStreetCell = row.createCell(8);
		vipStreetCell.setCellValue("32");
		
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("商品导入模板.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String typeid,String numbers){
		//查询出需要导出的学生
				List<Goods> list = goods.selectgoodsAll(typeid, numbers);
				//导出学生信息为excel
				System.out.println("aqa"+list);
				Workbook wb = new XSSFWorkbook();
				Sheet sheet = wb.createSheet();
				Row titleRow = sheet.createRow(0);
				titleRow.createCell(0).setCellValue("类别");
				titleRow.createCell(1).setCellValue("商品编码(条码)");
				titleRow.createCell(2).setCellValue("商品名称");
				titleRow.createCell(3).setCellValue("款号/型号");
				titleRow.createCell(4).setCellValue("颜色");
				titleRow.createCell(5).setCellValue("尺码");
				titleRow.createCell(6).setCellValue("铭牌价");
				titleRow.createCell(7).setCellValue("数量");
				titleRow.createCell(8).setCellValue("进货成本");
				for(int i=0;i<list.size();i++) {
					Row row = sheet.createRow(i+1);
					Cell typenameCell = row.createCell(0);
					typenameCell.setCellValue(list.get(i).getTypename());
					Cell numbersCell = row.createCell(1);
					numbersCell.setCellValue(list.get(i).getNumbers());
					Cell goodsnameCell = row.createCell(2);
					goodsnameCell.setCellValue(list.get(i).getGoodsname());
					Cell bianhaoCell = row.createCell(3);
					bianhaoCell.setCellValue(list.get(i).getBianhao());
					Cell colourCell = row.createCell(4);
					colourCell.setCellValue(list.get(i).getColour());
					Cell specificationCell = row.createCell(5);
					specificationCell.setCellValue(list.get(i).getSpecification());
					Cell salespriceCell = row.createCell(6);
					salespriceCell.setCellValue(list.get(i).getSalesprice());
					Cell stockCell = row.createCell(7);
					stockCell.setCellValue(list.get(i).getStock());
					Cell costpriceCell = row.createCell(8);
					costpriceCell.setCellValue(list.get(i).getCostprice());
				}
				HttpHeaders headers = new HttpHeaders();
				ByteArrayOutputStream bot = new ByteArrayOutputStream();
				try {
					wb.write(bot);
					headers.setContentDispositionFormData("attachment", new String("导出的商品信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
					headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public int excelUpload(MultipartFile file) {
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
					Cell typenameCell = row.getCell(0);
					System.out.println("qqqqqqqqqqqqqqqqqqqq"+typenameCell.getStringCellValue());
					Cell numbersCell = row.getCell(1);
					numbersCell.setCellType(CellType.STRING);
					Cell goodsnameCell = row.getCell(2);
					Cell bianhaoCell = row.getCell(3);
					Cell colourCell = row.getCell(4);
					Cell specificationCell = row.getCell(5);
					Cell salespriceCell = row.getCell(6);
					salespriceCell.setCellType(CellType.STRING);
					Cell stockCell = row.getCell(7);
					stockCell.setCellType(CellType.STRING);
					Cell costpriceCell = row.getCell(8);
					costpriceCell.setCellType(CellType.STRING);
					Goodstype ty=goods.selectBytypename(typenameCell.getStringCellValue());
					Goods good=new Goods();
					good.setTypeid(ty.getTypeid());
				
					//good.setTypeid(typenameCell.getStringCellValue());
					good.setNumbers(numbersCell.getStringCellValue());
					good.setGoodsname(goodsnameCell.getStringCellValue());
					good.setBianhao(bianhaoCell.getStringCellValue());
					good.setColour(colourCell.getStringCellValue());
					good.setSpecification(specificationCell.getStringCellValue());
					System.out.println(stockCell.getStringCellValue());
					good.setStock(Integer.parseInt(stockCell.getStringCellValue()));
					
					good.setCostprice(Float.parseFloat(costpriceCell.getStringCellValue()) );
					
					good.setSalesprice(Float.parseFloat(salespriceCell.getStringCellValue()) );
					good.setAgio(1);
					good.setShopid(1);
					good.setGoodsphoto("1.jpg");
					System.out.println("qwer"+good.getGoodsname());
					goods.insertSelective(good);
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@RequestMapping("chicunquery")
	@ResponseBody
	public List<Goodsize> chicunquery(){
		return goods.chicunquery();
	}
	
	@RequestMapping("/upimgAjax")
	@ResponseBody
	public String upimgAjax(MultipartFile [] files) {
		File directory = new File("/E:/Y2/文件/项目资料/images");
		String imgname="";
		String ententionName="";
		String newName="";
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				System.out.println("进来");
				
				newName = UUID.randomUUID().toString().replaceAll("-", "");
				 ententionName = l.getOriginalFilename().substring(l.getOriginalFilename().lastIndexOf("."));
				String url = "/E:/Y2/文件/项目资料/images";
				url = url+"/"+newName+ententionName;
				System.out.println(url);
				File f = new File(url);
				l.transferTo(f);
				
				imgname=l.getOriginalFilename();
				System.out.println(url);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newName+ententionName;
	}
	@RequestMapping("insertzhuxiang")
	@ResponseBody
	public int insertzhuxiang(@RequestBody Goods good){
		System.out.println(good);
		
		return goods.insertzhuxiang(good);
	}
	@RequestMapping("goodsquery")
	@ResponseBody
	public List<Goods> goodsquery(){
		System.out.println(goods.goodsquery());
		return goods.goodsquery();
	}
	@RequestMapping("supplierquery")
	@ResponseBody
	public List<Supplier> supplierquery(){
		System.out.println(goods.goodsquery());
		return goods.supplierquery();
	}
	//根据时间自动生成单号
		@RequestMapping("/dateNew")
		@ResponseBody
		public String selectdate(String datetime) {
			System.out.println(datetime+"sss");
			return goods.selectdate(datetime);
		}
		//新增采购单
		@RequestMapping("/inserzhu")
		@ResponseBody
		public String selectidall(@RequestBody Purchase purchase) {
			 return goods.insertPurchase(purchase)+"";
		}
		//查询
		@RequestMapping("/seleall")
		@ResponseBody
		public List<Purchase> selece(String purchasedate,String purchasedatejie,String shopid,String odd) {
			System.out.println("qweeee"+shopid);
			return goods.selectPurchase(purchasedate, purchasedatejie,shopid,odd);
		}
		@RequestMapping("/selectshop")
		@ResponseBody
		public List<Shop> selectshop() {
			return goods.selectshop();
		}
		//修改状态
		@RequestMapping("/upda")
		@ResponseBody
		public String upda(Integer purchaseid) {
			System.out.println(purchaseid);
			goods.upda(purchaseid);
			return "1";
		}
		//采购单删除
		@RequestMapping("/deletePurchaseid")
		@ResponseBody
		public int deletePurchaseid(String purchaseid){
			return goods.deletePurchaseid(purchaseid);
		}
		//采购单查看
		@RequestMapping("/bj")
		@ResponseBody
		public List<Purchasedetails> bj(Integer purchaseid) {
			System.out.println(purchaseid);
			return goods.bj(purchaseid);
				
		}
		//修改传值
		@RequestMapping("/xiou2")
		@ResponseBody
		public Purchase xiou2(Integer purchaseid,HttpServletRequest request) {
			System.out.println(purchaseid);
			Purchase p=goods.xiou(purchaseid);
			HttpSession session=request.getSession();//��ȡsession����userName����session����
			Staff user=(Staff) session.getAttribute("user");
			p.setUname(user.getEmployeename());
			return p;			
		}
		//新增采购单
		@RequestMapping("/xiou3")
		@ResponseBody
		public String selectidalls(@RequestBody Purchase purchase) {
			System.out.println(purchase);
			System.out.println(purchase.getPurchasezi().get(0).getPurchaseid());
			goods.updatazhu(purchase);
			 return "s";
		}
		//删除商品
		@RequestMapping("/deletegoods")
		@ResponseBody
		public int deletegoods(String goodsid) {
			
			 return goods.deletegoods(goodsid);
		}
		@RequestMapping("/selectBygoodsid")
		@ResponseBody
		//根据id查询主详selectBygoodsid
		public Goods selectBygoodsid(String goodsid){
			return goods.selectBygoodsid(goodsid);
		}
		//修改商品
		@RequestMapping("/updatezhuxing")
		@ResponseBody
		public String selectidalls(@RequestBody Goods good) {
			System.out.println(good.getGoodsid());
			
			goods.updategoods(good);
			return "s";
		}
}
