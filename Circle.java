// Author : Moyo Ibikunle
// Date : November 2025
// Purpose : This class defines a Circle object that extends the Point class.
// It adds a radius attribute to represent a circle's size
public class Circle extends Point
{
    private int radius;

    // Constructor: initializes the x and y coordinates and the radius of the circle
    public Circle(int theX, int theY, int theRadius)
        {
            // Calls the constructor of the Point superclass to set x and y
            super(theX,theY);
            //calls both methods not declaring
            setRadius(theRadius);
            getRadius();
           
        }

        public void setRadius(int theRadius)
            {
                radius = theRadius;
            }

        public int getRadius()
            {
                return radius;
            }

        // Returns a string of the circle's details, showing x, y, and radius values
        public String toString()
            {
            String coordinates;
            coordinates = "(" + x + "," + y + "," + radius + ")";
            return coordinates;
            }
}