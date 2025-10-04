//Name: Moyo Ibikunle
//Student ID: C00309427
//Date : 04/10/2025
class Rectanglemeasure{

    public static void main(String[] args) {
         // Creates a new Rectangle object called shape1
        Rectangle shape1 = new Rectangle();
        // Set the length of the rectangle to 5
        shape1.setLength(5);
        
        // Set the width of the rectangle to 10
        shape1.setWidth(10);

        // Prints the rectangle's details using the toString() method
        System.out.println(shape1);
        // Calls getArea() and getPerimeter() methods from Rectangle class
        System.out.println("The area of this rectangle is " + shape1.getArea() + " and the perimeter of this rectangle is "+ shape1.getPerimeter());
        // Calls the printRectangle() method from Rectangle class and prints the rectangle using "*" characters
        shape1.printRectangle();
    }
    
    
}