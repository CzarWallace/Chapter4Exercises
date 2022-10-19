package Chapter4Exercises;

public class Triangle {

	// private static final boolean IllegalTriangleSideException = false;
	double side1, side2, side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	void checkSides() throws IllegalTriangleSideException {
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side1) {
			System.out.println(true);
		} else {
			String.format(" IllegalTringleSideException");
		}

	}

	public String toString() {
		return String.format("Triangle[%.1f, %.1f, %.1f]", side1, side2, side3);
	}

}