package bai4_hinh3_12;

import java.util.Scanner;

public class BenhVien {
	private String ten;
	private String diaChi;
	private String giamDoc;
	public BenhVien() {
		
	}
	public BenhVien(String ten, String diaChi, String giamDoc) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGiamDoc() {
		return giamDoc;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tên: ");
			this.ten = sc.next();
			System.out.println("Nhập địa chỉ: ");
			this.diaChi = sc.next();
			System.out.println("Nhập giám đốc: ");
			this.giamDoc = sc.next();
	}
	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	
}
