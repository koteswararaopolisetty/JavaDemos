package Ui;

import java.util.Scanner;

import util.Gender;
import bean.Student;

public class Test {
	public static void main(String[] args) {
		Gender gender;
//		Gender gender = Gender.Male;
		System.out.println("Select Male or Female");
		String g = new Scanner(System.in).next();
		gender = Gender.valueOf(g);
		
//		if(g.equalsIgnoreCase("Male"))
//			gender = Gender.Male;
//		else
//			gender = Gender.Female;
		System.out.println(gender);
	}
}
