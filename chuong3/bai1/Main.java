package baitap.chuong3.bai1;

public class Main {
	public static void main(String[] args) {
		//kiem tra cac phuong thuc
		Person nguoi = new Person("van hoa","19/10/2005","hung yen",'m',"vanhoa@gmai.com","0981758013");
		System.out.println(nguoi.getName());
		nguoi.setName("van huy ");
		System.out.println(nguoi.toString());
	}
}
