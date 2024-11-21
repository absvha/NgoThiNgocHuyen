package bai6_hinh3_14;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap n: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		PartTimeEmployee[] arr = new PartTimeEmployee[n];
		for(int i=0; i<n; i++) {
			arr[i] = new PartTimeEmployee();
			arr[i].input();
		}
		for(PartTimeEmployee x:arr) {
			System.out.println(x.toString());
		}
	}
}