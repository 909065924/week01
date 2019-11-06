package com.bwei.beans;

public class Goods {
	
	private Integer gid;
	private String gname;
	private String gdy;
	private Double gprice;
	private String gdate;
	private Integer gtime;
	private String gtype;
	private Integer gdatetime;
	private String gchina;
	private Integer gzt;
	
	private String gdateId;
	private String gtimeId;
	private String gdatetimeId;
	
	private Double egprice;
	private String egdate;
	private Integer egtime;
	
	public Double getEgprice() {
		return egprice;
	}
	public void setEgprice(Double egprice) {
		this.egprice = egprice;
	}
	public String getEgdate() {
		return egdate;
	}
	public void setEgdate(String egdate) {
		this.egdate = egdate;
	}
	public Integer getEgtime() {
		return egtime;
	}
	public void setEgtime(Integer egtime) {
		this.egtime = egtime;
	}
	public String getGdateId() {
		return gdateId;
	}
	public void setGdateId(String gdateId) {
		this.gdateId = gdateId;
	}
	public String getGtimeId() {
		return gtimeId;
	}
	public void setGtimeId(String gtimeId) {
		this.gtimeId = gtimeId;
	}
	public String getGdatetimeId() {
		return gdatetimeId;
	}
	public void setGdatetimeId(String gdatetimeId) {
		this.gdatetimeId = gdatetimeId;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gdy=" + gdy + ", gprice=" + gprice + ", gdate=" + gdate
				+ ", gtime=" + gtime + ", gtype=" + gtype + ", gdatetime=" + gdatetime + ", gchina=" + gchina + ", gzt="
				+ gzt + "]";
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGdy() {
		return gdy;
	}
	public void setGdy(String gdy) {
		this.gdy = gdy;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}
	public String getGdate() {
		return gdate;
	}
	public void setGdate(String gdate) {
		this.gdate = gdate;
	}
	public Integer getGtime() {
		return gtime;
	}
	public void setGtime(Integer gtime) {
		this.gtime = gtime;
	}
	public String getGtype() {
		return gtype;
	}
	public void setGtype(String gtype) {
		this.gtype = gtype;
	}
	public Integer getGdatetime() {
		return gdatetime;
	}
	public void setGdatetime(Integer gdatetime) {
		this.gdatetime = gdatetime;
	}
	public String getGchina() {
		return gchina;
	}
	public void setGchina(String gchina) {
		this.gchina = gchina;
	}
	public Integer getGzt() {
		return gzt;
	}
	public void setGzt(Integer gzt) {
		this.gzt = gzt;
	}
	public Goods(Integer gid, String gname, String gdy, Double gprice, String gdate, Integer gtime, String gtype,
			Integer gdatetime, String gchina, Integer gzt) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gdy = gdy;
		this.gprice = gprice;
		this.gdate = gdate;
		this.gtime = gtime;
		this.gtype = gtype;
		this.gdatetime = gdatetime;
		this.gchina = gchina;
		this.gzt = gzt;
	}
	public Goods() {
		super();
	}
	

}
