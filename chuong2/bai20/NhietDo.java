package baitap.chuong2.bai20;

import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nhiet do C: ");
        double C = scanner.nextDouble();

        double F = C * 1.8 + 32;
        System.out.println("Nhiet do F: " + F);
    }
}