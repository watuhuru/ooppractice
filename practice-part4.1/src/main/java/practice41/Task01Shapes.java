package practice41;
import java.util.List;
public class Task01Shapes {
 static class Shape {
  protected String color; protected boolean filled;
  Shape(){this("unknown",false);} Shape(String color,boolean filled){this.color=color;this.filled=filled;}
  String getType(){return "Shape";} double getArea(){return 0;} double getPerimeter(){return 0;}
  public String toString(){return getType()+"[color="+color+", filled="+filled+"]";}
 }
 static class Circle extends Shape {
  private final double radius;
  Circle(double radius,String color,boolean filled){super(color,filled);if(radius<=0)throw new IllegalArgumentException("Радиус должен быть положительным");this.radius=radius;}
  String getType(){return "Circle";} double getArea(){return Math.PI*radius*radius;} double getPerimeter(){return 2*Math.PI*radius;}
  public String toString(){return super.toString()+"[radius="+radius+"]";}
 }
 static class Rectangle extends Shape {
  protected final double width,length;
  Rectangle(double width,double length,String color,boolean filled){super(color,filled);if(width<=0||length<=0)throw new IllegalArgumentException("Стороны должны быть положительными");this.width=width;this.length=length;}
  String getType(){return "Rectangle";} double getArea(){return width*length;} double getPerimeter(){return 2*(width+length);}
  public String toString(){return super.toString()+"[width="+width+", length="+length+"]";}
 }
 static class Square extends Rectangle {
  Square(double side,String color,boolean filled){super(side,side,color,filled);}
  String getType(){return "Square";}
  public String toString(){return "Square[color="+color+", filled="+filled+", side="+width+"]";}
 }
 public static void main(String[] args){
  List<Shape> shapes=List.of(new Circle(5.5,"red",false),new Rectangle(4,7,"blue",true),new Square(3,"green",true));
  for(Shape s:shapes)System.out.printf("%s%nТип: %s, площадь: %.2f, периметр: %.2f%n%n",s,s.getType(),s.getArea(),s.getPerimeter());
 }
}
