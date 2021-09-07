import java.util.Scanner;
interface Shape
{ 
void perimeter();
void Area();
}
class Circle implements Shape
{ Scanner sc = new Scanner(System.in);
  int ra;
Circle()
{ System.out.println("Enter the radius");
  ra=sc.nextInt(); 
}
public void perimeter()
{ double p=2*3.14*ra;
  System.out.println("Perimeter of circle: "+p); 
}
public void Area()
{ double a=3.14*ra*ra;
  System.out.println("Area of circle: "+a);
}
}
class Rectangle implements Shape
{ Scanner sc = new Scanner(System.in);
  int l,b;
Rectangle()
{ System.out.println("Enter length and breadth");
  l=sc.nextInt();
  b=sc.nextInt();
 }
public void perimeter()
{ int p=2*(l+b);
  System.out.println("Perimeter of rectangle: "+p);
 }
public void Area()
{ int a=l*b;
  System.out.println("Area of rectangle: "+a); 
} 
}
class Hello
{
public static void main(String args[])
{ 
Circle c=new Circle();
Rectangle ra=new Rectangle();
Scanner sc=new Scanner(System.in);
int opt;
do{
System.out.println("\nEnter your choice");
System.out.println("1.Area of Circle\n2.Area of Rectangle\n3.Perimeter of Circle\n4.Perimeter of Rectangle\n5.Exit\n");
opt=sc.nextInt();
switch (opt)
{
case 1: c.Area();
break;
case 2: ra.Area();
break;
case 3: c.perimeter();
break;
case 4: ra.perimeter();
break;
case 5: System.exit(0);

}
} while(opt!=5);
} 
}