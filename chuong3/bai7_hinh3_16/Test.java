package bai7_hinh3_16;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangle hcn = new Rectangle();
			hcn.input();
			System.out.println("dien tich hinh chu nha: " + hcn.getArea());
			Triangle tg = new Triangle();
			tg.input();
			System.out.println("\ndien tich hinh tam giac: " + tg.getArea());
	}

}
