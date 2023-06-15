package Decorator;

public class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(Shape decoratedShape) {//new Circle()
		super(decoratedShape); //new Circle()
	}
	@Override
	public void draw() {
		decoratedShape.draw();  
		setRedBorder(decoratedShape);
	}
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color: Red");
	}
}