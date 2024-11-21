package bai7_hinh3_16;

import java.util.Scanner;

public class Triangle extends Shape {
	private int base;
	private int height;
	public Triangle() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	public double getArea() {
		return 0.5*base*height;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap do dai canh day: ");
		this.base = sc.nextInt();
		System.out.println("nhap do dai chieu cao: ");
		this.height = sc.nextInt();
	}
}
