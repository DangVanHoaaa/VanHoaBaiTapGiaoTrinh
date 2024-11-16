package baitap.chuong4.bai3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhap mot chuoi hoc 'DONE' de thoat): ");
            String input = scanner.nextLine();
            if (input.equals("DONE")) {
                break;
            }
            try {
                if (input.length() > 30) {
                    throw new StringTooLongException("chuoi qua dai: " + input.length() + " characters.");
                }
                System.out.println("chuoi hop le: " + input);
            } catch (StringTooLongException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}