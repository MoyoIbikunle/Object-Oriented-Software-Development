//Name: Moyo Ibikunle
//Lab: 9
//Date: 29/11/2025
public class Book extends LibraryItem implements LoanItem
{
    private String author;
    private String title;
    private int numPages;

    public Book(String ID,String type, String author, String title, int numPages )
        {
            super(ID, type);
            this.author = author;
            this.title = title;
            this.numPages = numPages;
        }

        public double calculatePrice()
    {
        return numPages* 0.5;
    }

    public String toString()
    {
        return "Book:" + title + " by " + author + " has " + numPages + " pages.";
    }
}