package bai13_tinhluongCN;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin LDPT: ");
		LDPT ld = new LDPT();
		ld.nhaptt();
		ld.intt();
		System.out.println("Nhap thong tin KS: ");
		KS ks = new KS();
		ks.nhaptt();
		ks.intt();
	}

}
