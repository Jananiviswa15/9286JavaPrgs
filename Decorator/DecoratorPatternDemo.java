package Decorator;

public class DecoratorPatternDemo {
public static void main(String[] args) {
Shape circle = new Circle();  //rt
Shape redCircle = new RedShapeDecorator(new Circle()); //redCircle.decoratedshape ="circle 
Shape redRectangle = new RedShapeDecorator(new Rectangle());///redRectangle.decoratedShape = "recmem
System.out.println("Circle with normal border");
circle.draw();
System.out.println("\nCircle of red border");
redCircle.draw();
System.out.println("\nRectangle of red border");
redRectangle.draw();
}
}
