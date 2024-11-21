package bai13_tinhluongCN;

import java.util.Scanner;

public abstract class NguoiLaoDong {
	protected String hoten;
	protected String diachi;
	protected String loaiLD;
	public NguoiLaoDong() {
		
	}
	public NguoiLaoDong(String hoten, String diachi, String loaiLD) {
		this.hoten = hoten;
		this.diachi = diachi;
		this.loaiLD = loaiLD;
	}
	public abstract double tinhLuong();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		this.hoten = sc.next();
		System.out.println("Nhap dia chi: ");
		this.diachi = sc.next();
		System.out.println("Nhap loai lao dong: ");
		this.loaiLD = sc.next();
	}
	public void intt() {
		System.out.println("Ho va ten: " + this.hoten + " Dia chi: " + this.diachi + " Loai lao dong: " + this.loaiLD + "\nLuong thang: " + this.tinhLuong());
	}
}
