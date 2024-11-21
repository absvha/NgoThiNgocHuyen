package bai10_hocphi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			HocvienDH dh = new HocvienDH();
			System.out.println("nhap thong tin hv do hoa: ");
			dh.nhaptt();
			HocvienLT lt = new HocvienLT();
			System.out.println("nhap thong tin hv lap trinh: ");
			lt.nhaptt();
			dh.intt();
			lt.intt();
		}
	}

