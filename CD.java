//Name: Moyo Ibikunle
//Lab: 9
//Date: 29/11/2025
public class CD extends LibraryItem implements LoanItem
{
    String band;
    String title;
    int numTracks;

    public CD(String ID, String type, String band, String title, int numTracks)
    {
        super(ID, type);
        this.title = title;
        this.band = band;
        this.numTracks = numTracks;
    }

   
    public double calculatePrice()
    {
        return numTracks *2.0;
    }

    public String toString()
    {
        return "CD: " + title + " by " + band + " has " + numTracks + " tracks.";
    }

}