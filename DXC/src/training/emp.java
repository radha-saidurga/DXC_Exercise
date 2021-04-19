package training;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

class emp{
	private int id = 0;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	emp() {
		this.id += 1;
	}
	emp(String name, String dept, Date date, int age, int salary)
	{
		this.name = name;
		this.department = dept;
		this.dateOfJoining = date;
		this.age = age;
		this.salary = salary;
	}
	void setName(String name) {
		this.name = name;
	}
	void setDepartment(String dept) {
		this.department= dept;
	}
	void setDateOfJoining(Date date) {
		this.dateOfJoining = date;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	String getDepartment() {
		return department;
	}
	Date getDateOfJoining() {
		return dateOfJoining;
	}
	int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		String ans = String.format("%-15s %-30s %-30s %-10s %-10s\n", this.name, this.department, this.dateOfJoining, this.age, this.salary);
		return ans;
	}

}