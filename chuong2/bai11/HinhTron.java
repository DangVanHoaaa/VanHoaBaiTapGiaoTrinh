package baitap.chuong2.bai11;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh: ");
        double banKinh = scanner.nextDouble();

        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;

        System.out.println("Chu vi hinh tron la: " + chuVi);
        System.out.println("Dien tich hinh tron la: " + dienTich);
    }
}