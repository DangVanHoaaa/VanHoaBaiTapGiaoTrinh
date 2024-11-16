package baitap.chuong2.bai24;

import java.util.Scanner;

public class DiemThi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sv: ");
        int n = scanner.nextInt();

        int[] diem = new int[n];
        System.out.println("Nhap diem sv:");
        for (int i = 0; i < n; i++) {
            diem[i] = scanner.nextInt();
        }

        System.out.print("Nhap diem can tim: ");
        int diemCanTim = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (diem[i] == diemCanTim) {
                System.out.println("Co sv co diem " + diemCanTim + " o vi tri " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong co sinh vien co diem " + diemCanTim);
        }
    }
}
