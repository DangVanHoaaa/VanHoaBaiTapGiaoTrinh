package baitap.chuong3.bai4;



public class Main {
	public static void main(String[] args) {
		BenhVien bv = new BenhVien("bach mai","ha noi","van hoa");
		BenhNhan bn = new BenhNhan("huy",20,'m',"ung thu","ung thu",bv);
		System.out.println(bn.toString());
		
	}
}
