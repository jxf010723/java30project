package com.accp.domain;

public class Power {
    private Integer pid;

    private String pname;
    
    public Power() {
		// TODO Auto-generated constructor stub
	}

    public Power(String pname) {
		super();
		this.pname = pname;
	}
    

	public Power(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
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
}