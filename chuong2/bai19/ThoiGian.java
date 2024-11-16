package baitap.chuong2.bai19;

import java.util.Scanner;

public class ThoiGian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so gio: ");
        int gio = scanner.nextInt();
        System.out.print("Nhap so phut: ");
        int phut = scanner.nextInt();
        System.out.print("Nhap so giay: ");
        int giay = scanner.nextInt();

        int tongGiay = gio * 3600 + phut * 60 + giay;
        System.out.println("Tong so giay: " + tongGiay);
    }
}
