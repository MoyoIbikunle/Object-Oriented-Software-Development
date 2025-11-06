// Author : Moyo Ibikunle
// Date : November 2025
// Purpose : A superclass program 
public class Point
{
    // Protected variables so subclasses e.g.Circle can access them directly if needed
    protected int x;
    protected int y;

    public Point(int theX, int theY)
        {
            x= theX;
            y = theY;
        }

    public void setX( int theX)
        {
            x = theX;
        }

    public void setY( int theY)
        {
            y = theY;
        }

    public int getX()
        {
            return x;
        }

    public int getY()
        {
            return y;
        }

        // Returns a string of the point
    public String toString()
        {
            String coordinates;
            coordinates = "(" + x + "," + y + ")";
            return coordinates;
        }








}