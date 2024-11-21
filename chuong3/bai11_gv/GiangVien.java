package bai11_gv;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGV;
	public GiangVien() {
		
	}
	public GiangVien(String hoTen, String diaChi, String loaiGV) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
	}
	public abstract double tinhLuong();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		this.hoTen = sc.next();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("Nhap loai GV (TG || CH): ");
		this.loaiGV = sc.next();
		}
	public void intt() {
		System.out.println("hoten: "+this.hoTen + "\ndiachi: "+this.diaChi + "\nloai giang vien: " + this.loaiGV + "\nluong thang: " + tinhLuong());
	}
}
