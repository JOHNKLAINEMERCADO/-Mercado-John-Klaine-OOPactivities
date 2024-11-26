package Shapes;
import java.lang.Math;

public class Square implements Shape{
    private double side;

    Square(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        double area = Math.pow(side, 2);
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 4*side;
        return perimeter;
    }

    @Override
    public void printShapeType(){
        System.out.println("Square");
    }
    
}
