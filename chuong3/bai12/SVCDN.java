package baitap.chuong3.bai12;

import java.util.Scanner;
public class SVCDN extends Nguoi {
    private double tongDiemKiemTra;
    private int soMonKiemTra;
    //contructor
    public SVCDN(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
        super(hoTen, ngaySinh, diaChi, loaiSinhVien);
    }

    public void nhapThongTin() {
    	super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tong cac mon kiem tra: ");
        tongDiemKiemTra = scanner.nextDouble();
        System.out.print("Nhap so mon kiem tra: ");
        soMonKiemTra = scanner.nextInt();
    }

    
    public double tinhDiem() {
        return tongDiemKiemTra / soMonKiemTra;
    }
}