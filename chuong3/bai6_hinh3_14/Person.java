package bai6_hinh3_14;

import java.util.Scanner;

public class Person {
		private String name;
		private int age;
		private char gender;

		public Person() {
			// TODO Auto-generated constructor stub
		}
		public Person(String name, int age, char gender) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public void input() {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap ten: ");
			this.name = sc.next();
			System.out.println("nhap tuoi: ");
			this.age = sc.nextInt();
			System.out.println("nhap gioi tinh(M/F)");
			this.gender = sc.next().charAt(gender);
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
		
}
