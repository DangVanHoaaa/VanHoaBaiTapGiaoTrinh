package baitap.chuong2.bai3;

public class PhepToan {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;

        int resultA = a | b;
        int resultB = a & b;
        int resultC = a ^ b;
        int resultD = ~a;
        int resultE = a >> 2;
        int resultF = b << 2;

        System.out.println("a) a | b = " + resultA);
        System.out.println("b) a & b = " + resultB);
        System.out.println("c) a ^ b = " + resultC);
        System.out.println("d) ~a = " + resultD);
        System.out.println("e) a >> 2 = " + resultE);
        System.out.println("f) b << 2 = " + resultF);
    }
}