package baitap.chuong2.bai2;

public class BieuThucLogic {
    public static void main(String[] args) {
        // a) 2 < 3 || 4 > 3
        boolean resultA = 2 < 3 || 4 > 3;
        System.out.println("a) " + resultA);

        // b) 2 < 3 && 4 > 3
        boolean resultB = 2 < 3 && 4 > 3;
        System.out.println("b) " + resultB);

        // c) 2 < 3 && 4 <= 3
        boolean resultC = 2 < 3 && 4 <= 3;
        System.out.println("c) " + resultC);

        // d) !(2 > 4)
        boolean resultD = !(2 > 4);
        System.out.println("d) " + resultD);
    }
}
