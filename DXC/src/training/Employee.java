package training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<emp> employees = new ArrayList<emp>();

//		}
		SimpleDateFormat obj = new SimpleDateFormat("dd-mm-yyyy");
		employees.add(new emp("Rohini", "DataAnalysis", obj.parse("10-10-2000"), 45, 90000));
		employees.add(new emp("Ranganathan", "Production", obj.parse("09-10-2000"), 45, 92000));
		employees.add(new emp("Pankaj", "Marketing", obj.parse("02-02-2002"), 38, 75000));
		
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of\r\n" + "joining");
		System.out.println("Enter Your Choice");
		int choice = in.nextInt();
		switch(choice)
		{
			case 1: {
						Collections.sort(employees, new salaryComparator());
						System.out.println(String.format("%-15s %-30s %-30s %-10s %-10s\n", "Employee Name", "Department", "DOJ", "Age", "Salary"));
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						
						break;
					}
			case 2: {
						Collections.sort(employees, new AgeComparator());
						System.out.println(String.format("%-15s %-30s %-30s %-10s %-10s\n", "Employee Name", "Department", "DOJ", "Age", "Salary"));
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						break;
					}
			default:
					break;
		}
	
	}
}
