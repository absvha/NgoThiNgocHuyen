package bai11_gv;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thong tin gv co huu: ");
		GVCoHuu ch = new GVCoHuu();
		ch.nhaptt();
		System.out.println("nhap thong tin gv thinh giang: ");
		GVThinhGiang tg = new GVThinhGiang();
		tg.nhaptt();
		ch.intt();
		tg.intt();
	}

}
