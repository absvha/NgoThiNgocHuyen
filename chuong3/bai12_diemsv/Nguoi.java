package bai12_diemsv;

import java.util.Scanner;

public abstract class Nguoi {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiSV;
	public Nguoi() {
		
	}
	public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSV = loaiSV;
	}
	public abstract double tinhDiem();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		this.hoTen = sc.next();
		System.out.println("Nhap ngay sinh: ");
		this.ngaySinh = sc.next();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("Loai SV: ");
		this.loaiSV = sc.next();
	}
	public void intt() {
		System.out.println("Ho va ten: " + this.hoTen + "Ngay sinh: " + this.ngaySinh + "Dia chi: " + this.diaChi + "Loai SV: " + this.loaiSV + "\nDTB: " + this.tinhDiem());
	}
}
