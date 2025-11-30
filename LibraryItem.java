
//Name: Moyo Ibikunle
//Lab: 9
//Date: 29/11/2025
public abstract class LibraryItem
{
    private String type;
    private String ID;

    public LibraryItem(String ID, String type)
    {
        this.type = type;
        this.ID = ID;
    }

    public String getType()
    {
        return type;
    }

    public String getID()
    {
        return ID;
    }
}