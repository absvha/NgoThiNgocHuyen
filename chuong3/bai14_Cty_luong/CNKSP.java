package bai14_Cty_luong;

public class CNKSP extends CongNhan {
	private int soSP;
	private float DG;
	private float Thuong;
	public CNKSP() {
		// TODO Auto-generated constructor stub
		super();
	}
	public CNKSP(String hoten, String diachi, String loaiCN, int soSP, float DG, float Thuong) {
		super(hoten, diachi,loaiCN);
		this.soSP = soSP;
		this.DG = DG;
		this.Thuong = Thuong;
	}
	public double tinhLuong() {
		int MQD = 1000;
		if(soSP <= MQD) {
			Thuong = 0;
		}
		else if(soSP >= MQD + 100) {
			Thuong = 1000000;
		}
		else if(soSP >= MQD + 150) {
			Thuong = 1500000;
		}
	return soSP*DG+Thuong;
	}
}
