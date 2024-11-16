package baitap.chuong2.bai7;

import java.util.Scanner;

public class NhapThuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double so1 = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double so2 = scanner.nextDouble();

        System.out.print("Nhap phep tinh (A: cong, S: tru, M: nhan, D: chia): ");
        char phepTinh = scanner.next().charAt(0);

        switch (phepTinh) {
            case 'A':
                System.out.println("Tong: " + (so1 + so2));
                break;
            case 'S':
                System.out.println("Hieu: " + (so1 - so2));
                break;
            case 'M':
                System.out.println("Tich: " + (so1 * so2));
                break;
            case 'D':
                if (so2 == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.println("Thuong: " + (so1 / so2));
                }
                break;
            default:
                System.out.println("Phep tinh khong hop le");
        }
    }
}
