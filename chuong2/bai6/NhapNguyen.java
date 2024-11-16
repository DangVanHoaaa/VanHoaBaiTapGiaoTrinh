package baitap.chuong2.bai6;

import java.util.Scanner;

public class NhapNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int so2 = scanner.nextInt();

        int tong = so1 + so2;
        int hieu = so1 - so2;
        int tich = so1 * so2;
        double thuong = (double) so1 / so2; 

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
    }
}
