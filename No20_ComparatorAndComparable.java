package TenToTwenty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> { // implement only for comparable, then the compareTo method gets
													// overridden.
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int compareTo(Employee that) {
		if (this.id > that.id) {
			return 1;
		} else
			return -1;
	}
}

public class No20_ComparatorAndComparable {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(3, "B", 15000));
		empList.add(new Employee(1, "C", 25000));
		empList.add(new Employee(2, "A", 35000));

//		Comparator<Employee> com = new Comparator<Employee>() { //This method is optional as it can be done with method referencing.
//
//			public int compare(Employee i, Employee j) {
//				if(i.getId()>j.getId()) return 1;
//				else return -1;
//			}
//		};

		Comparator<Employee> com = (Employee i, Employee j) -> i.getId() > j.getId() ? 1 : -1; // lambda expression of
																								// the above

		Comparator<Employee> compName = new Comparator<Employee>() { // Comparator method

			public int compare(Employee i, Employee j) {
				if (i.getName().charAt(0) > j.getName().charAt(0))
					return 1;
				else
					return -1;
			}
		};

		System.out.println("SORTING BY ID - COMPARATOR");

		Collections.sort(empList, com); // Lambda Expression.
		for (Employee e : empList) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
		}

		System.out.println("---------------------");
		System.out.println("SORTING BY NAME - COMPARATOR");

		Collections.sort(empList, compName); // using comparator
		for (Employee e : empList) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
		}

		System.out.println("---------------------");
		System.out.println("SORTING BY ID - COMPARABLE");

		Collections.sort(empList); // using Comparable
		for (Employee e : empList) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
		}

		System.out.println("---------------------");
		System.out.println("SORTING BY NAME - COMPARATOR: METHOD REFERENCING");

		// Method Referencing:
		Collections.sort(empList, Comparator.comparing(Employee::getName));
		for (Employee e : empList) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
		}
	}

}
