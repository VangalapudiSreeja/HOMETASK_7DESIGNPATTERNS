package BRIDGE;

public class APP {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColour());
		pent.applyColor();
	}


}
