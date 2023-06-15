package Decorator;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;  //circle
	//shape obj = new circle();
	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape; //new Circle()
		//redCircle.decorated shape = new Circle()
	}
	public void draw(){
		decoratedShape.draw();
	}
}