package baitap.chuong3.bai12;

import java.util.Scanner;
public class SVCDCQ extends Nguoi {
    private double tongDiemKiemTra;
    private int soMonKiemTra;
    private double diemThiKetThucHP;

    //contructor

	public SVCDCQ(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
        super(hoTen, ngaySinh, diaChi, loaiSinhVien);
    }

    public void nhapThongTin() {
    	super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tong diem cac mon kiem tra: ");
        tongDiemKiemTra = scanner.nextDouble();
        System.out.print("Nhap so mon kiem tra: ");
        soMonKiemTra = scanner.nextInt();
        System.out.print("Nhap diem thi kthp: ");
        diemThiKetThucHP = scanner.nextDouble();
    }

    
    public double tinhDiem() {
        return (tongDiemKiemTra / soMonKiemTra + diemThiKetThucHP) / 3;
    }
}
