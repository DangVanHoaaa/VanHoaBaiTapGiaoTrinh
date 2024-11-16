package baitap.chuong3.bai5;

public class Main {
	public static void main(String[] args) {
		Truong tg = new Truong("thpt","hung yen","van hoa ");
		SinhVien sv = new SinhVien("van hoa",19,'m',"ktpm3","cntt",tg);
		System.out.println(sv.toString());
	}
}
