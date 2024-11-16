package baitap.chuong3.bai4;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioiTinh;
	//contructor
	public Nguoi() {
		
	}
	public Nguoi(String ten, int tuoi, char gioiTinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	//get and set
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
	}
	
	
}
