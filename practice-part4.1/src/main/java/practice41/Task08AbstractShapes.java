package practice41;
import java.util.List;
public class Task08AbstractShapes {
 static abstract class Shape {
  protected String color;protected boolean filled;
  Shape(String color,boolean filled){this.color=color;this.filled=filled;}
  String getColor(){return color;}void setColor(String c){color=c;}boolean isFilled(){return filled;}void setFilled(boolean f){filled=f;}
  abstract double getArea();abstract double getPerimeter();abstract String getType();
  public String toString(){return getType()+"[color="+color+", filled="+filled+", area="+String.format("%.2f",getArea())+", perimeter="+String.format("%.2f",getPerimeter())+"]";}
 }
 static class Circle extends Shape {private final double radius;Circle(double radius,String color,boolean filled){super(color,filled);this.radius=radius;}double getArea(){return Math.PI*radius*radius;}double getPerimeter(){return 2*Math.PI*radius;}String getType(){return "Circle";}double getRadius(){return radius;}}
 static class Rectangle extends Shape {protected final double length,width;Rectangle(double length,double width,String color,boolean filled){super(color,filled);this.length=length;this.width=width;}double getArea(){return length*width;}double getPerimeter(){return 2*(length+width);}String getType(){return "Rectangle";}double getLength(){return length;}double getWidth(){return width;}}
 static class Square extends Rectangle {Square(double side,String color,boolean filled){super(side,side,color,filled);}String getType(){return "Square";}double getSide(){return length;}}
 public static void main(String[] args){Shape c=new Circle(5.5,"red",false),r=new Rectangle(4,7,"blue",true),s=new Square(3,"green",true);for(Shape x:List.of(c,r,s)){System.out.println(x);System.out.println("Цвет: "+x.getColor()+", заливка: "+x.isFilled());}if(c instanceof Circle circle)System.out.println("Радиус: "+circle.getRadius());}
}
