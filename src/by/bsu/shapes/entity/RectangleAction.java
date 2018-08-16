package by.bsu.shapes.entity;

import by.bsu.shapes.action.IShapeAction;

public class RectangleAction implements IShapeAction<Rectangle> {

	public double computePerimeter(Rectangle shape) {
		double perimetr;
			perimetr = 2*(shape.getA() + shape.getB());
		
		return perimetr;
	}

	public double computeSquare(Rectangle shape) {
		double square;
			square = shape.getA() * shape.getB();
			//square = 1 / 2 * triangle.getA() * triangle.getB() * Math.sin(triangle.getAngle());
		return square;
	}

}
