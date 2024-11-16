package baitap.chuong3.bai6;

public class Emplyee extends Person{
	private String id;
	private String heSo;
	public Emplyee() {
		super();
	}
	public Emplyee(String name, int age, char gt,String id, String heSo) {
		super(name, age, gt);
		this.id = id;
		this.heSo = heSo;
		
	}
	//get and set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHeSo() {
		return heSo;
	}
	public void setHeSo(String heSo) {
		this.heSo = heSo;
	}
	
	public String toString() {
		return super.toString()+"Emplyee [id=" + id + ", heSo=" + heSo + "]";
	}
	
	
}
