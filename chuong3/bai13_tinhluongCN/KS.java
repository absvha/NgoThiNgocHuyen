package bai13_tinhluongCN;

import java.util.Scanner;

public class KS extends NguoiLaoDong {
	private float LCB;
	private float HSL;
	private int SNC;
	public KS() {
		// TODO Auto-generated constructor stub
		super();
	}
	public KS(String hoten, String diachi, String loaiLD, float LCB, float HSL, int SNC) {
		super(hoten,diachi,loaiLD);
		this.LCB = LCB;
		this.HSL = HSL;
		this.SNC = SNC;
	}
	public double tinhLuong() {
		float Thuong = 0;
		if( SNC >= 25) {
			Thuong = 2000000;
		}
		else if(SNC>15 && SNC <25) {
			Thuong = 1000000;
		}
		else {
			Thuong = 500000;
		}
		return LCB * HSL + Thuong;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap LCB: ");
		this.LCB = sc.nextFloat();
		System.out.println("Nhap HSL: ");
		this.HSL = sc.nextFloat();
		System.out.println("Nhap SNC: ");
		this.SNC = sc.nextInt();
	}
	

}
