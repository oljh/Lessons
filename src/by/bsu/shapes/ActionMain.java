package by.bsu.shapes;

import by.bsu.shapes.action.IShapeAction;
import by.bsu.shapes.entity.Rectangle;
import by.bsu.shapes.entity.RectangleAction;
import by.bsu.shapes.entity.Triangle;
import by.bsu.shapes.entity.TriangleAction;

import static java.lang.Math.PI;

public class ActionMain {
	public static void main(String[] args) {
		IShapeAction<Rectangle> action;
		Rectangle rectShape = new Rectangle(2,3);
			action = new RectangleAction();
			System.out.println("Square rectangle:" + action.computeSquare(rectShape));
			System.out.println("Perimetr rectangle:" + action.computePerimeter(rectShape));
		
			
			IShapeAction<Triangle> triAction;
		Triangle triShape = new Triangle(3,4,PI/6);
		triAction = new TriangleAction();
		System.out.println("Square rectangle:" + triAction.computeSquare(triShape));
		System.out.println("Perimetr rectangle:" + triAction.computePerimeter(triShape));
	
		
	} 
}
