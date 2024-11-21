package bai12_diemsv;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin sv: ");
		SVCDN a = new SVCDN();
		a.nhaptt();
		a.intt();
		System.out.println("Nhap thong tin sv: ");
		SVCDCQ b = new SVCDCQ();
		b.nhaptt();
		b.intt();
	}
}
