package baitap.chuong2.bai22;

import java.util.Scanner;

public class TongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        System.out.println("Nhap gia tri:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Tong cac phan tu la: " + sum);
    }
}
