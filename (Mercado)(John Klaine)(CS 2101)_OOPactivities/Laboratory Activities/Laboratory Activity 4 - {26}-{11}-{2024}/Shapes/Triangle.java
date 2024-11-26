package Shapes;
import java.lang.Math;

public class Triangle implements Shape{
    private double a, b, c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea(){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = a+b+c;
        return perimeter;
    }

    @Override
    public void printShapeType(){
        System.out.println("Triangle");
    }
}
