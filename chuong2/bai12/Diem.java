package baitap.chuong2.bai12;

import java.util.Scanner;

public class Diem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem: ");
        double diem = scanner.nextDouble();

        String xepLoai;
        if (diem >= 90) {
            xepLoai = "A";
        } else if (diem >= 80) {
            xepLoai = "B";
        } else if (diem >= 70) {
            xepLoai = "C";
        } else if (diem >= 50) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }

        System.out.println("Xep loai: " + xepLoai);
    }
}