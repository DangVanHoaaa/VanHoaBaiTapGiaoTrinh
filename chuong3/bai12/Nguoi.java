package baitap.chuong3.bai12;

import java.util.Scanner;

abstract class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private String diaChi;
	private String loaiSinhVien;
	//contructor
	
	public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSinhVien = loaiSinhVien;
}

	public Nguoi() {
		super();
	}
	//nhap thong tin
	public void nhapThongTin() {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Nhap ho ten: ");
	   hoTen = scanner.nextLine();
	   System.out.print("Nhap ngay sinh: ");
	   ngaySinh = scanner.nextLine();
	   System.out.print("Nhap dia chi: ");
	   diaChi = scanner.nextLine();
	   System.out.print("Nhap loai sinh vien: ");
	   loaiSinhVien = scanner.nextLine();
	}
	// phuong thuc truu tuong
	public abstract double tinhDiem();
	
	public void inThongTin() {
	   System.out.println("Ho ten: " + hoTen);
	   System.out.println("Ngay sinh: " + ngaySinh);
	   System.out.println("dia chi: " + diaChi);
	   System.out.println("Loai sinh vien: " + loaiSinhVien);
	   System.out.println("diem trung binh: " + tinhDiem());
	}
	}
