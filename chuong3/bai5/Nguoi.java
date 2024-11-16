package baitap.chuong3.bai5;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gt;
	//contructor
	public Nguoi() {
		super();
	}
	public Nguoi(String ten, int tuoi, char gt) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gt = gt;
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
	public char getGt() {
		return gt;
	}
	public void setGt(char gt) {
		this.gt = gt;
	}
	
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gt=" + gt + "]";
	}
	
}
