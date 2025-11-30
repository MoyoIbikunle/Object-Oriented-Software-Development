//Name: Moyo Ibikunle
//Lab: 9
//Date: 29/11/2025
public class testLibrary
{
    public static void main (String[] args)
    {
        LoanItem[] items = new LoanItem[2];

    items[0] = new Book ("B001", "Book", "Jane Dawson", "The Fancy Bee" , 250);
    items[1] = new CD("C001", "CD", "The Beatles", "The High Road", 5);
    
    
    for(int i = 0; i < items.length; i++)
    {
        LoanItem item = items[i];
        System.out.println(item.toString());
        System.out.println("Price: $"+ item.calculatePrice());
    }
    }
    

    
}