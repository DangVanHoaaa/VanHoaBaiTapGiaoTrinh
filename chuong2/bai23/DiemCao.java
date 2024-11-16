package baitap.chuong2.bai23;

import java.util.Scanner;

public class DiemCao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sv: ");
        int n = scanner.nextInt();

        int[] diem = new int[n];
        System.out.println("Nhap diem sinh vien:");
        for (int i = 0; i < n; i++) {
            diem[i] = scanner.nextInt();
        }

        int maxDiem = diem[0];
        int indexMax = 0;

        for (int i = 1; i < n; i++) {
            if (diem[i] > maxDiem) {
                maxDiem = diem[i];
                indexMax = i;
            }
        }

        System.out.println("diem cao nhat: " + maxDiem);
        System.out.println("sv co diem cao nhat: " + (indexMax + 1));
    }
}
