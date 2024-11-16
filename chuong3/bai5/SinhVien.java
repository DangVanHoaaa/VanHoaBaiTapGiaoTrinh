package baitap.chuong3.bai5;

public class SinhVien extends Nguoi{
	private String lop;
	private String nganh;
	private Truong truong;
	//contructor
	public SinhVien() {
		super();
	}
	public SinhVien(String ten, int tuoi, char gt,String lop,String nganh,Truong truong) {
		super(ten, tuoi, gt);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
		
	}
	//get and set
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	
	public String toString() {
		return super.toString()+"SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}
	
	
}
