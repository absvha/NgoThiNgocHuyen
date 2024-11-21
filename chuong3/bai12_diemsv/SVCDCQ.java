package bai12_diemsv;

import java.util.Scanner;

public class SVCDCQ extends Nguoi{
	protected float TDKT;
	protected int SMKT;
	protected float DTKTHP;
	public SVCDCQ() {
		// TODO Auto-generated constructor stub
		super();
	}
	public SVCDCQ(String hoTen, String ngaySinh, String diaChi, String loaiSV, float TDKT, int SMKT, float DTKTHP) {
		super(hoTen, ngaySinh, diaChi, loaiSV);
		this.TDKT = TDKT;
		this.SMKT = SMKT;
		this.DTKTHP = DTKTHP;
	}
	public double tinhDiem() {
		return ((TDKT/SMKT) + DTKTHP)/3;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tong diem cac mon ktra: ");
		this.TDKT = sc.nextFloat();
		System.out.println("Nhap so mon ktra: ");
		this.SMKT = sc.nextInt();
		System.out.println("Nhap diem thi kthuc hp: ");
		this.DTKTHP = sc.nextFloat();
	}
}
