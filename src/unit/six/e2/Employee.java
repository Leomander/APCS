package unit.six.e2;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	
	private int id;
	private String name;
	private String dob;
	private ArrayList<String> skills = new ArrayList<String>();
	private ArrayList<String>  projects = new ArrayList<String>();
	
	public Employee() {}
	public Employee(int id, String name, String dob, ArrayList<String> skills, ArrayList<String> projects) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.skills = skills;
		this.projects = projects;
	}
	public Employee(String parse) {
		Scanner scan = new Scanner(parse);
		scan.useDelimiter(";");
		this.id = scan.nextInt();
		this.name = scan.next();
		this.dob = scan.next();
		
		String skilltemp = scan.next();
		Scanner skill = new Scanner(skilltemp);
		skill.useDelimiter(",");
		while(skill.hasNext()) {
			skills.add(skill.next());
		}
		skill.close();
		
		String projtemp = scan.next();
		Scanner proj = new Scanner(projtemp);
		proj.useDelimiter(",");
		while (proj.hasNext()) {
			projects.add(proj.next());
		}
		proj.close();
		
		scan.close();
	}
	
	public String toString() {
		return name + " [" + id + "]: " + dob + " | Skills:" + skills.toString() + " | Projects:" + projects.toString(); 
	}
	
	public int getID() {return id;}
	public String getName() {return name;}
	public String getDOB() {return dob;}
	public ArrayList<String> getSkills() {return skills;}
	public ArrayList<String> getProjects() {return projects;}
	
	public void setID(int id) {this.id = id;}
	public void setName(String name) {this.name = name;}
	public void setDOB(String dob) {this.dob = dob;}
	public void setSkills(ArrayList<String> skills) {this.skills = skills;}
	public void setProjects(ArrayList<String> projects) {this.projects = projects;}
	
}
