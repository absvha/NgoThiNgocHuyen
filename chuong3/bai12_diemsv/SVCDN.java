package bai12_diemsv;

import java.util.Scanner;

public class SVCDN extends Nguoi {
	private float TDKT;
	private int SMKT;
	public SVCDN() {
		// TODO Auto-generated constructor stub
		super();
	}
	public SVCDN(String hoTen, String ngaySinh, String diaChi, String loaiSV, float TDKT, int SMKT) {
		super(hoTen, ngaySinh, diaChi, loaiSV);
		this.TDKT = TDKT;
		this.SMKT = SMKT;
	}
	public double tinhDiem() {
		return TDKT/SMKT;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tong cac mon ktra: ");
		this.TDKT = sc.nextFloat();
		System.out.println("Nhap so mon ktra: ");
		this.SMKT = sc.nextInt();
	}
}
