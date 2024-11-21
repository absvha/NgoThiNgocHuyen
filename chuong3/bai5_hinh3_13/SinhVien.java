package bai5_hinh3_13;

public class SinhVien extends Nguoi {
	private String lop;
	private String nganh;
	private Truong truong;
	public SinhVien() {
		// TODO Auto-generated constructor stub
		super();
	}
	public SinhVien(String ten, int Tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
		super(ten, Tuoi, gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	@Override
	public String toString() {
		return super.toString() + "SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}

	
	
}
