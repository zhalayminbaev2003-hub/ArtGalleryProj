import java.util.Objects;

public abstract class Artwork implements Comparable<Artwork> {
    private String title;
    private Artist artist;
    private double price;

    public Artwork(String title, Artist artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Artwork other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + artist.getName() + " - $" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artwork artwork = (Artwork) o;
        return Double.compare(artwork.price, price) == 0 &&
                Objects.equals(title, artwork.title) &&
                Objects.equals(artist, artwork.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, price);
    }
}