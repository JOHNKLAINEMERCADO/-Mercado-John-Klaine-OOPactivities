package Shapes;

public class ShapeCollection {
    private Shape[] shapes;

    ShapeCollection(Shape[] shapes){
        this.shapes = shapes;
    }

    public void getPropertyValues(){
        for(int i = 0; i < shapes.length; i++){
            shapes[i].printShapeType();
            System.out.println(String.format("%.2f", shapes[i].getArea()));
            System.out.println(String.format("%.2f", shapes[i].getArea()) + "\n");
        }
    }
}
