package bai8_hinh3_15;

public class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle() {
		// TODO Auto-generated constructor stub
		super();
	}
	public ResizableCircle(double radius) {
		super(radius);
	}
	public void resize(int percent) {
		radius *= (1+percent/100.0);
	}
}
