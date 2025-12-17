public class Artwork {
    private String title;
    private int year;
    private double price;

    private Artist artist;

    public Artwork(String title,int year,double price,Artist artist) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.artist = artist;
    }
    public double getPrice(){
        return price;
    }

    public Artist getArtist(){
        return artist;
    }

    public int getYear(){
        return year;
    }

    public String getTitle(){
        return title;
    }
    public void displayInfo() {
        System.out.println("Art: \"" + title + "\", Artist : " + artist.toString());
    }
}
