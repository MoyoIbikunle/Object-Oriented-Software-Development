//Name : Moyo Ibikunle
//Date: 21/11/2025
//Lab: Lab 8
public class Rectangle extends TwoDShape
    {

        private double length;
        private double breadth;

        public Rectangle(String name, String colour, double length, double breadth)
            {
                super(name, colour);
                this.length = length;
                this.breadth = breadth;

            }

        public double area ()
                {
                    return length*breadth;
                }

        public String toString()
                {
                    return (super.toString() + "\nLength = " + length + "\nBreadth = " + breadth);
                }
    }