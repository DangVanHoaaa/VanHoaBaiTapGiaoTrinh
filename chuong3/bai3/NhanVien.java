package baitap.chuong3.bai3;

public class NhanVien {
	private String name;
	private DiaChi dc;
	private String dob;
	private char gt;
	//contructor
	public NhanVien() {
		super();
	}
	public NhanVien(String name, DiaChi dc, String dob, char gt) {
		super();
		this.name = name;
		this.dc = dc;
		this.dob = dob;
		this.gt = gt;
	}
	//get and set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DiaChi getDc() {
		return dc;
	}
	public void setDc(DiaChi dc) {
		this.dc = dc;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGt() {
		return gt;
	}
	public void setGt(char gt) {
		this.gt = gt;
	}
	
	public String toString() {
		return "NhanVien [name=" + name + ", dc=" + dc + ", dob=" + dob + ", gt=" + gt + "]";
	}
	
}
