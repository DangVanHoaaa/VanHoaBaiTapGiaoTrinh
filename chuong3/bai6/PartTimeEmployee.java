package baitap.chuong3.bai6;

public class PartTimeEmployee extends Emplyee{
	private String gioLam;
	//contructor

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, int age, char gt, String id, String heSo,String gioLam) {
		super(name, age, gt, id, heSo);
		this.gioLam = gioLam;
		
	}
	//get and set

	public String getGioLam() {
		return gioLam;
	}

	public void setGioLam(String gioLam) {
		this.gioLam = gioLam;
	}


	public String toString() {
		return super.toString()+"PartTimeEmployee [gioLam=" + gioLam + "]";
	}
	
	
	
	
	
}
