package baitap.chuong2.bai18;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();

        boolean isPrime = true; 

        if (n <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
