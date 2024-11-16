package baitap.chuong2.bai13;

import java.util.Scanner;

public class GiaBan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap gia ban: ");
        double giaBan = scanner.nextDouble();

        System.out.print("Nhap phan tram giam: ");
        double phanTramGiam = scanner.nextDouble();

        double giaGiam = giaBan * phanTramGiam / 100;
        double giaSauGiam = giaBan - giaGiam;

        System.out.println("Gia sau khi giam la: " + giaSauGiam);
    }
}
