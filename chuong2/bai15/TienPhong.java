package baitap.chuong2.bai15;

import java.util.Scanner;

public class TienPhong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so ngay lu tru: ");
        int soNgay = scanner.nextInt();
        System.out.print("Nhap don gia ngay dau: ");
        double donGia = scanner.nextDouble();

        double tongTien = 0;

        if (soNgay == 1) {
            tongTien = donGia;
        } else if (soNgay >= 2 && soNgay <= 4) {
            tongTien = donGia + (soNgay - 1) * donGia * 0.8;
        } else if (soNgay >= 5 && soNgay <= 10) {
            tongTien = donGia + 3 * donGia * 0.8 + (soNgay - 4) * donGia * 0.6;
        } else {
            tongTien = donGia + 3 * donGia * 0.8 + 6 * donGia * 0.6 + (soNgay - 10) * donGia * 0.4;
        }

        System.out.println("Tong tien phai thanh toan: " + tongTien);
    }
}
