package baitap.chuong2.bai16;

import java.util.Scanner;

public class GIaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();

        long giaiThua = 1;

        for (int i = 2; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println("Giai thua cua " + n + " la: " + giaiThua);
    }
}