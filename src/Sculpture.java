public class Sculpture extends Artwork {
    private double weight;

    public Sculpture(String title, Artist artist, double price, double weight) {
        super(title, artist, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sculpture: " + super.toString() + " [" + weight + "kg]";
    }
}