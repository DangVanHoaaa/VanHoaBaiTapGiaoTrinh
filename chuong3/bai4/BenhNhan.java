package baitap.chuong3.bai4;

public class BenhNhan extends Nguoi {
	private String tienSu;
	private String chuanDoan;
	private BenhVien bv;
	public BenhNhan() {
		super();
	}
	public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chuanDoan,BenhVien bv) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		this.bv = bv;
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public BenhVien getBv() {
		return bv;
	}
	public void setBv(BenhVien bv) {
		this.bv = bv;
	}
	
	public String toString() {
		return super.toString()+"BenhNhan [tienSu=" + tienSu + ", chuanDoan=" + chuanDoan + ", bv=" + bv + "]";
	}
	
		
}
