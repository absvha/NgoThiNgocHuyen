package bai13_tinhluongCN;

import java.util.Scanner;

public class LDPT extends NguoiLaoDong{
	private int SNC;
	private float DGNC;
	private float Thuong;
	public LDPT() {
		// TODO Auto-generated constructor stub
		super();
	}
	public LDPT(String hoten, String diachi, String loaiLD, int SNC, float DGNC, float Thuong) {
		super(hoten, diachi, loaiLD);
		this.SNC = SNC;
		this.DGNC = DGNC;
		this.Thuong = Thuong;
	}
	public double tinhLuong() {
		if(SNC >= 5) {
			Thuong = 1000000;
		}
		else {
			Thuong = 700000;
		}
		return SNC * DGNC + Thuong;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ngay cong: ");
		this.SNC = sc.nextInt();
		System.out.println("Nhap don gia ngay cong: ");
		this.DGNC = sc.nextFloat();
	}
}
