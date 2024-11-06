package in.quastech.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("102")
	private int rollno;
	@Value("Soham")
	private String name;
	@Value("85.0")
	
	private double marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("Marks="+marks);
	}

}
