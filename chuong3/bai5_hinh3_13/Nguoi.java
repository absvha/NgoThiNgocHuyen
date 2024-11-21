package bai5_hinh3_13;

public class Nguoi {
	private String ten;
	private int Tuoi;
	private char gioiTinh;
	public Nguoi() {
		this.ten = "";
		this.Tuoi = 0;
		this.gioiTinh = 'm';
	}
	public Nguoi(String ten, int Tuoi, char gioiTinh) {
		this.ten = ten;
		this.Tuoi = Tuoi;
		this.gioiTinh = gioiTinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return Tuoi;
	}
	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", Tuoi=" + Tuoi + ", gioiTinh=" + gioiTinh + "]";
	}
	
}
