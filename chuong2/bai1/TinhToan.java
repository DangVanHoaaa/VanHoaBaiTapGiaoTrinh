package baitap.chuong2.bai1;
import java.util.Scanner;
public class TinhToan {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int j,i;
	float a,b,c,d,e,f;
	System.out.println("nhap phan tu i ");
	i = sc.nextInt();
	System.out.println("nhap phan tu j ");
	j = sc.nextInt();
	a = i++ + ++j;
	b = --i + j--;
	c = i % j;
	d = i / j;
	e = (float)i/j;
	f = (float)i/(float)j;
	System.out.println("ket qua cua i++ + ++j la " + a );
	System.out.println("ket qua cua --i + j-- la "+ b);
	System.out.println("ket qua cua i % j la "+ c);
	System.out.println("ket qua cua i/j la "+ d);
	System.out.println("ket qua cua (float)i/j la "+ e);
	System.out.println("ket qua cua (float)i/(float)j la "+ f);
}
}
