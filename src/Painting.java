
public class Painting extends Artwork {
    private String paintingType;

    public Painting(String title, Artist artist, double price, String paintingType) {
        super(title, artist, price);
        this.paintingType = paintingType;
    }


    @Override
    public String toString() {
        return "Painting: " + super.toString() + " [" + paintingType + "]";
    }
}