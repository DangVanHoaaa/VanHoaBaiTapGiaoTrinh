package baitap.chuong2.bai17;

public class HienThi {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    int so = a * 100 + b * 10 + c;
                    if (a * a + b * b + c * c == so) {
                        System.out.println(so);
                    }
                }
            }
        }
    }
}