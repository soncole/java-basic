package sec3;

public class ShapeEx1 {

	public static void main(String[] args) {
		Shape one = new Shape();
		
		one.setShapeType(0);
		
		Shape tr = new Shape();
		
		tr.setShapeType(3);
		
		System.out.println("원의 넓이 : "+one.shapeArea(10));
		System.out.println("삼각형의 넓이 : "+tr.shapeArea(10, 7));
	}

}
