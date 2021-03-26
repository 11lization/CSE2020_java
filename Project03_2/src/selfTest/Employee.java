package selfTest;

public class Employee {

	private String name;
	private int age;
	private String position = "Engineer";
	private int salary = 15000;
	private int vacationDays = 20;
	
	public Employee() {}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age, String position, int salary) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}
	
	public Employee(String name, int age, String position, int salary, int vacationDays) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.vacationDays = vacationDays;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void outInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("position : " + position);
		System.out.println("salary : " + salary);
		System.out.println("vacationDays : " + vacationDays);
	}
	
	public String vacation(int vacationDays) {
		if(this.vacationDays >= vacationDays) {
			this.vacationDays -= vacationDays;
			return "Possible";
		}
		else
			return "Impossible";
	}
	
	public boolean equals(Employee person) {
		if(this.name.equals(person.name) && this.age == person.age && this.position.equals(person.position))
			return true;
		else
			return false;
	}
	
}
