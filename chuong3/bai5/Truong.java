package baitap.chuong3.bai5;

public class Truong {
	private String ten;
	private String dc;
	private String hieuTruong;
	//contructor
	public Truong() {
		
	}
	public Truong(String ten, String dc, String hieuTruong) {
		super();
		this.ten = ten;
		this.dc = dc;
		this.hieuTruong = hieuTruong;
	}
	//get and set
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	
	public String toString() {
		return "Truong [ten=" + ten + ", dc=" + dc + ", hieuTruong=" + hieuTruong + "]";
	}
	
	
}
