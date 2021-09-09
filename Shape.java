import java.util.*;
abstract class Shapes{
    abstract void draw();
    abstract void erase();
}
class circle extends Shapes {
    @Override
    void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius = sc.nextInt();
        System.out.println("Area of circle:"+(3.14f*radius*radius));
    }
    @Override
    void erase() {
        System.out.println("Erased Circle");
    }
}
class square extends Shapes {
    @Override
    void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length:");
        int side = sc.nextInt();
        System.out.println("Area of Square:"+(side*side));
    }
    @Override
    void erase() {
        System.out.println("Erased square");
    }
}
class triangle extends Shapes {
    @Override
    void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base:");
        int base = sc.nextInt();
        System.out.println("Enter the height:");
        int height = sc.nextInt();
        System.out.println("Area of Triangle:"+((0.5f)*(base*height)));
    }
    @Override
    void erase() {
        System.out.println("Erased Triangle");
    }
}
public class Shape {
    public static void main(String args[]){
        Shapes sh = new circle();
        sh.draw();
        sh.erase();
        sh = new triangle();
        sh.draw();
        sh.erase();
        sh = new square();
        sh.draw();
        sh.erase();
    }
}