package baitap.chuong2.bai10;

import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
    }
}
