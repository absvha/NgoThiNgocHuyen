package bai5_hinh3_13;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truong tr = new Truong("congNghiep","HaNoi","abc");
		SinhVien sv = new SinhVien();
		sv.setTen("Nguyen");
		sv.setTuoi(19);
		sv.setGioiTinh('m');
		sv.setLop("cntt01");
		sv.setNganh("cntt");
		sv.getTen(); sv.getTuoi(); sv.getGioiTinh(); sv.getLop(); sv.getNganh();
		sv.setTruong(tr);
		sv.getTruong();
		System.out.println(sv);
	}

}
