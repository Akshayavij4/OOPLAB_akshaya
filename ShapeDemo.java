abstract class Shape
{
int h=10,w=5;
abstract void printArea();
}
class Rectangle extends Shape
{
void printArea()
{
float area=h*w;
System.out.println("The Area of rectangle is:" +area);
}
}
class Triangle extends Shape
{
void printArea()
{
float area=0.5f*h*w;
System.out.println("The Area of Triangle is:" +area);
}
}
class Circle extends Shape
{
void printArea()
{
float area=3.14f*h*w;
System.out.println("The area of Circle is:" +area);
}
}
class ShapeDemo
{
public static void main(String args[])
{
Rectangle ob = new Rectangle ();
Triangle ob1 = new Triangle (); 
Circle ob2 = new Circle ();
ob.printArea (); 
ob1.printArea (); 
ob2.printArea ();
}
}
