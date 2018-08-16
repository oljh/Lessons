package by.bsu.shapes.entity;

import by.bsu.shapes.action.IShapeAction;

public class TriangleAction implements IShapeAction<Triangle> {

	@Override
	public double computePerimeter(Triangle shape) {
		double perimetr;
			perimetr = shape.getA() + shape.getB() + shape.getC();
		return perimetr;
	}

	@Override
	public double computeSquare(Triangle shape) {
		double square;
		if (shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
	
			square = 1 / 2 * triangle.getA() * triangle.getB() * Math.sin(triangle.getAngle());
		}
		else {
			throw new IllegalArgumentException("Incompatible shape" + shape.getClass());
		}
		return square;
	}

}
