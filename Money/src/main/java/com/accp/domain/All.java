package com.accp.domain;

import java.util.Date;
import java.util.List;

public class All {
	//权限有关实体属性
	private Integer mid;

    private String mname;

    private Integer parentid;

    private Integer catalog;

    private String path;

    private String column1;

    private String column2;

    private String column3;
    
    private Integer pid;

    private String pname;
    
    
	
	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public Integer getCatalog() {
		return catalog;
	}

	public void setCatalog(Integer catalog) {
		this.catalog = catalog;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public String getColumn3() {
		return column3;
	}

	public void setColumn3(String column3) {
		this.column3 = column3;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	//装会员的集合
	private List<All> vlist;
	
	private Integer cid;

    private Integer gid;
    
    private Integer gdid;

    private Integer userid;

    private Integer status;
	
    private Integer vipId;

    private Integer viptypeId;

    private String vipPhone;

    private String vipName;

    private String vipPwd;

    private String vipProvince;

    private String vipCity;

    private String vipRegion;

    private String vipStreet;

    private Integer vipTurnover;

    private Double transactionPrice;

    private Double balance;

    private String viptypeName;

    private Double viptypeDiscount;

    private Double moneylv;
    
    private Integer detailsid;

    private String goodssize;

    private String color;

    private Integer goodsstock;

    private String shapecode;

    private Integer count;
    
	
	public Integer getGdid() {
		return gdid;
	}

	public void setGdid(Integer gdid) {
		this.gdid = gdid;
	}

	public List<All> getVlist() {
		return vlist;
	}

	public void setVlist(List<All> vlist) {
		this.vlist = vlist;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getVipId() {
		return vipId;
	}

	public void setVipId(Integer vipId) {
		this.vipId = vipId;
	}

	public Integer getViptypeId() {
		return viptypeId;
	}

	public void setViptypeId(Integer viptypeId) {
		this.viptypeId = viptypeId;
	}

	public String getVipPhone() {
		return vipPhone;
	}

	public void setVipPhone(String vipPhone) {
		this.vipPhone = vipPhone;
	}

	public String getVipName() {
		return vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getVipPwd() {
		return vipPwd;
	}

	public void setVipPwd(String vipPwd) {
		this.vipPwd = vipPwd;
	}

	public String getVipProvince() {
		return vipProvince;
	}

	public void setVipProvince(String vipProvince) {
		this.vipProvince = vipProvince;
	}

	public String getVipCity() {
		return vipCity;
	}

	public void setVipCity(String vipCity) {
		this.vipCity = vipCity;
	}

	public String getVipRegion() {
		return vipRegion;
	}

	public void setVipRegion(String vipRegion) {
		this.vipRegion = vipRegion;
	}

	public String getVipStreet() {
		return vipStreet;
	}

	public void setVipStreet(String vipStreet) {
		this.vipStreet = vipStreet;
	}

	public Integer getVipTurnover() {
		return vipTurnover;
	}

	public void setVipTurnover(Integer vipTurnover) {
		this.vipTurnover = vipTurnover;
	}

	public Double getTransactionPrice() {
		return transactionPrice;
	}

	public void setTransactionPrice(Double transactionPrice) {
		this.transactionPrice = transactionPrice;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getViptypeName() {
		return viptypeName;
	}

	public void setViptypeName(String viptypeName) {
		this.viptypeName = viptypeName;
	}

	public Double getViptypeDiscount() {
		return viptypeDiscount;
	}

	public void setViptypeDiscount(Double viptypeDiscount) {
		this.viptypeDiscount = viptypeDiscount;
	}

	public Double getMoneylv() {
		return moneylv;
	}

	public void setMoneylv(Double moneylv) {
		this.moneylv = moneylv;
	}

	public Integer getDetailsid() {
		return detailsid;
	}

	public void setDetailsid(Integer detailsid) {
		this.detailsid = detailsid;
	}

	public String getGoodssize() {
		return goodssize;
	}

	public void setGoodssize(String goodssize) {
		this.goodssize = goodssize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getGoodsstock() {
		return goodsstock;
	}

	public void setGoodsstock(Integer goodsstock) {
		this.goodsstock = goodsstock;
	}

	public String getShapecode() {
		return shapecode;
	}

	public void setShapecode(String shapecode) {
		this.shapecode = shapecode;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	//装商品的list
	private List<All> glist;
	
	public List<All> getGlist() {
		return glist;
	}

	public void setGlist(List<All> glist) {
		this.glist = glist;
	}

	
	private int gcount;
	
	private int staffcount;

    private String tname;
	
	private Integer uid;

    private String trade;

    private String uname;

    private String upwd;

    private String uphone;

    private String headportrait;

    private Integer tid;
    
 	private Integer shopid;

    private Integer shopuser;

    private String shopname;

    private Integer staffid;

    private String contacts;

    private Integer phonenumber;

    private Integer phone;

    private String address;

    private String starttime;

    private String endtime;

    private String province;

    private String city;

    private String region;

    private String introduction;

    private String shopimg;

    private Integer roleid;

    private String jobnumber;

    private String employeename;

    private String password;
    
    private String detailaddress;
    
    private Integer goodsid;

    private Integer typeid;

    private Integer supplierid;

    private String goodsbrand;

    private String goodsname;

    private String goodsphoto;

    private String numbers;

    private String specification;

    private Integer stock;

    private Float salesprice;

    private Float costprice;

    private Integer agio;
    
    private String typename;
    
    private String orderId;

    private Integer userId;

    private String orderName;

    private String orderPhone;

    private Integer orderCount;

    private Double orderTotalmoney;

    private Double orderSfmoney;

    private Double integralDeductionmoney;

    private String orderPayment;

    private Date orderDate;

    private Integer integral;
    
    private Integer orderDetailsId;

    private Integer goodsId;

    private String goodsName;

    private Double goodsPrice;

    private Integer goodsCount;

    private Double orderDetailsDiscount;
    

	public Integer getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public String getGoodsbrand() {
		return goodsbrand;
	}

	public void setGoodsbrand(String goodsbrand) {
		this.goodsbrand = goodsbrand;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getGoodsphoto() {
		return goodsphoto;
	}

	public void setGoodsphoto(String goodsphoto) {
		this.goodsphoto = goodsphoto;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Float getSalesprice() {
		return salesprice;
	}

	public void setSalesprice(Float salesprice) {
		this.salesprice = salesprice;
	}

	public Float getCostprice() {
		return costprice;
	}

	public void setCostprice(Float costprice) {
		this.costprice = costprice;
	}

	public Integer getAgio() {
		return agio;
	}

	public void setAgio(Integer agio) {
		this.agio = agio;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Double getOrderTotalmoney() {
		return orderTotalmoney;
	}

	public void setOrderTotalmoney(Double orderTotalmoney) {
		this.orderTotalmoney = orderTotalmoney;
	}

	public Double getOrderSfmoney() {
		return orderSfmoney;
	}

	public void setOrderSfmoney(Double orderSfmoney) {
		this.orderSfmoney = orderSfmoney;
	}

	public Double getIntegralDeductionmoney() {
		return integralDeductionmoney;
	}

	public void setIntegralDeductionmoney(Double integralDeductionmoney) {
		this.integralDeductionmoney = integralDeductionmoney;
	}

	public String getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(String orderPayment) {
		this.orderPayment = orderPayment;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Double getOrderDetailsDiscount() {
		return orderDetailsDiscount;
	}

	public void setOrderDetailsDiscount(Double orderDetailsDiscount) {
		this.orderDetailsDiscount = orderDetailsDiscount;
	}

	public int getStaffcount() {
		return staffcount;
	}

	public void setStaffcount(int staffcount) {
		this.staffcount = staffcount;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	

	public String getDetailaddress() {
		return detailaddress;
	}

	public void setDetailaddress(String detailaddress) {
		this.detailaddress = detailaddress;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getHeadportrait() {
		return headportrait;
	}

	public void setHeadportrait(String headportrait) {
		this.headportrait = headportrait;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getShopid() {
		return shopid;
	}

	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}

	public Integer getShopuser() {
		return shopuser;
	}

	public void setShopuser(Integer shopuser) {
		this.shopuser = shopuser;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public Integer getStaffid() {
		return staffid;
	}

	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public Integer getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getShopimg() {
		return shopimg;
	}

	public void setShopimg(String shopimg) {
		this.shopimg = shopimg;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getJobnumber() {
		return jobnumber;
	}

	public void setJobnumber(String jobnumber) {
		this.jobnumber = jobnumber;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getGcount() {
		return gcount;
	}

	public void setGcount(int gcount) {
		this.gcount = gcount;
	}
	    
}
