package baitap.chuong3.bai6;

public class Person {
	private String name;
	private int age;
	private char gt;
	//contructor
	public Person() {
		
	}
	public Person(String name, int age, char gt) {
		
		this.name = name;
		this.age = age;
		this.gt = gt;
	}
	//get and set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGt() {
		return gt;
	}
	public void setGt(char gt) {
		this.gt = gt;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gt=" + gt + "]";
	}
	
	
	
}
