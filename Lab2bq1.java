//Name: Moyo Ibikunle
//Student ID: C00309427
//Date : 04/10/2025
class Rectangle{
    //Private instance variables to store length and width
    private double length;
    private double width;
    // No-argument constructor: initializes length and width to default value 1
    public Rectangle() {
        length = 1;
        width = 1;
    }

    // Setter for length with validation (must be >0.0 and <=40.0)
    public void setLength( double theLength)
    {
        
            
            if((theLength> 0.0 )&& (theLength <=40.0)){
                length = theLength;
            }

            else{
                System.out.println("Please enter a value between 0 and 40");
            }
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter for width with validation (must be >0.0 and <=40.0)
     
    public void setWidth( double theWidth)
    {

        if((theWidth> 0.0 )&& (theWidth <=40.0)){
            width = theWidth;
        }
        else{
                System.out.println("Please enter a value between 0 and 40");
            }
    }
    // Getter for width
    public double getWidth()
    {
        return width;
    }
    // toString method to return rectangle details as a string
    public String toString()
    {

        return "Length = " + getLength() + " Width = " + getWidth();
    }

     // Method to calculate the area of the rectangle
    public double getArea(){
        return (length*width);

    }

     // Method to calculate the perimeter of the rectangle
    public double getPerimeter(){
        return (length*2) +(width*2);
        
    }
// Method to print the rectangle using "*" 
    public void printRectangle ()
    {
        // Loop for each row
        for(int i=0; i<length; i++)
        {
            // Loop for each column in the row
            for(int j=0;j<width;j++)
            {
                if( i==0 || j==width-1 || j==0 || i==length-1)
                {
                    System.out.print("*");  // Print "*" for borders
                }
                else
                    System.out.print(" "); // Print space inside the rectangle
                
            }
            // Move to the next line after each row
            System.out.println();
        }
                    

    }
 }
            
        
       



    
    

