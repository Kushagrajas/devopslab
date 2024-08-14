package std;

import java.util.Scanner;

public class abc {
	
	Scanner s;
	int regno;
	String name,dept;
	
	void input() {
		s = new Scanner(System.in);
		System.out.println("Enter regno");
		regno = s.nextInt();
		System.out.println("Enter Name");
		name = s.next();
		System.out.println("Enter Dept");
		dept = s.next();
	}
	
	void display() {
		System.out.println("Regno"+regno);
		System.out.println("Name"+name);
		System.out.println("Dept"+dept);
	}

	public static void main(String[] args) {
		
		abc a = new abc();
		a.input();
		a.display();
		

	}

}
