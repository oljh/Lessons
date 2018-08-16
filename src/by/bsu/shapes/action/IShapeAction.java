package by.bsu.shapes.action;

import by.bsu.shapes.entity.AbstractShape;

public interface IShapeAction<T extends AbstractShape> {
	double computeSquare(T shape);

	double computePerimeter(T shape);
}
