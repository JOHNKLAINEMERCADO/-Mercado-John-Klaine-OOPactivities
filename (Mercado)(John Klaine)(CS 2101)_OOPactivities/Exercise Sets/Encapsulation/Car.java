public class Car {
    private
    String color;
    double price;
    char size;
    
    public Car(String color, double price, char size){
        this.color = color;
        this.price = price;
        this.size = size;
    }
//getters
    public String getColor(){
        return this.color;
    }
    public double getPrice(){
        return this.price;
    }
    public char getSize(){
        return this.size;
    }
//setters
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setSize(char size){
        this.size = Character.toUpperCase(size);
    }

    public String toString(){
        String size = "string";
        switch(this.size){
            case 'L': size = "large";
            break;
            case 'M': size = "medium";
            break;
            case 'S': size = "small";
            break;
            default: System.out.println("Method resulted in Error");
        }
        String car = "Car (" + color + ") - P" + String.format("%.2f", price) + " - " + size;
        return car;
    }
    
    public static void main(String[] args){
        Car car = new Car("white", 8.00, 'S');
        System.out.println(car.toString());
    }
}