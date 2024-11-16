package baitap.chuong3.bai2;

public class Main {
	public static void main(String[] args) {
		//tao 1 doi tuong
		DiaChi dc = new DiaChi("tam da","tam da","phu cu","hung yen");
		//kiem tra phuong thuc
		System.out.println(dc.getTinh());
		dc.setTinh("ha noi");
		System.out.println(dc.toString());
	}
}
