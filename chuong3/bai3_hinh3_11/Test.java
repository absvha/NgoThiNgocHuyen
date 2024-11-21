package bai3_hinh3_11;

import bai2_3_10.DiaChi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiaChi dc = new DiaChi("Korea","Korea","Korea","Korea");
		NhanVien nv = new NhanVien();
		nv.setName("Kim HyukKyu");
		nv.getName();
		nv.setAddress(dc);
		nv.getAddress();
		nv.setDob("23/10/1996");
		nv.getDob();
		nv.setGender('M');
		nv.getGender();
		System.out.println(nv);
	}

}
