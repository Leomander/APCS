package unit.six.e2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void main(String[] args) {
		
		
		try {
			Scanner scan = new Scanner(new File("./src/unit/six/e2/employees.txt"));
			
			while (scan.hasNextLine()) {
				employees.add(new Employee(scan.nextLine()));
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Employees:");
		for (Employee e : employees) {
			System.out.println("\t"+e);
		}
		
		String[] skills = {"Sales", "Marketing", "Delivery", "IT", "Support", "Management"};
		for (String s : skills) {
			System.out.println("Search for people in " + s + ": " + getEmployeesBySkill(s));
		}
		
		String[] projects = {"ProjectX", "ProjectY", "ProjectZ", "ProjectH", "NoProject", "ProjectK", "ProjectB"};
		for (String s : projects) {
			System.out.println("Search for people in " +s+": " + getEmployeesByProject(s));
		}
		
	}
	
	public static ArrayList<Employee> getEmployeesBySkill(String skill) {
		ArrayList<Employee> ret = new ArrayList<Employee>();
		for (int e = 0; e < employees.size(); e++) {
			if (employees.get(e).getSkills().contains(skill))
				ret.add(employees.get(e));
		}
		return ret;
	}
	
	public static ArrayList<Employee> getEmployeesByProject(String project) {
		ArrayList<Employee> ret = new ArrayList<Employee>();
		for (int e = 0; e < employees.size(); e++) {
			if (employees.get(e).getProjects().contains(project))
				ret.add(employees.get(e));
		}
		return ret;
	}
	
	public static ArrayList<Employee> search(String query) {
		ArrayList<Employee> ret = new ArrayList<Employee>();
		for (int e = 0; e < employees.size(); e++) {
			if (employees.get(e).getProjects().contains(query) || employees.get(e).getSkills().contains(query) || employees.get(e).getName().contains(query))
				ret.add(employees.get(e));
		}
		return ret;
	}
	
}
