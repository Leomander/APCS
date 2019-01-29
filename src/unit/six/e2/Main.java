package unit.six.e2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			Scanner scan = new Scanner(new File("./src/unit/six/e2/employees.txt"));
			
			while (scan.hasNextLine()) {
				employees.add(new Employee(scan.nextLine()));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(employees.toString());
		
	}
	
}
