//Name : Moyo Ibikunle
//Date: 21/11/2025
//Lab: Lab 8
public class Cylinder extends ThreeDShape
    {

        private double radius;
        private double height;

        public Cylinder(String name, String colour, double radius, double height)
            {
                super(name,colour);
                this.radius = radius;
                this.height = height;


            }

            public double area()
                {
                    // Surface area of a cylinder = 2πr² + 2πrh
                    return (2 * Math.PI * radius * radius) +
                     (2 * Math.PI * radius * height);
                }

             public double volume()
                {
                    // Volume of cylinder
                    return Math.PI * radius * radius * height;
                }

        public String toString ()
            {
                return (super.toString() + "\nRadius = " + radius + "\nHeight = " +height);
            }
    }