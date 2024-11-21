package bai4_hinh3_12;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhVien;

	public BenhNhan() {
		// TODO Auto-generated constructor stub
		super();
	}
	public BenhNhan(String ten, int tuoi, String gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tiền sử: ");
			this.tienSu = sc.next();
			System.out.println("Nhập chuẩn đoán: ");
			this.chuanDoan = sc.next();
		}
	@Override
	public String toString() {
		return super.toString() + "BenhNhan [tienSu=" + tienSu + ", chuanDoan=" + chuanDoan + ", benhVien=" + benhVien + "]";
	}
	
}
