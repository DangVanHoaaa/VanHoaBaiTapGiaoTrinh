package baitap.chuong2.bai14;

import java.util.Scanner;

import java.util.Scanner;

public class DonGia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dien tieu thu: ");
        double soDien = scanner.nextDouble();

        double donGia = 0;
        if (soDien <= 50) {
            donGia = 1484;
        } else if (soDien <= 100) {
            donGia = 1533;
        } else if (soDien <= 200) {
            donGia = 1786;
        } else {
            donGia = 2242;
        }

        double tongTien = soDien * donGia;

        System.out.println("Tong so tien can thanh toan: " + tongTien + " dong");
    }
}