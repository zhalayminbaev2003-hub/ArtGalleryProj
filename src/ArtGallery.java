import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArtGallery {
    private String galleryName;
    private ArrayList<Artwork> artworks;

    public ArtGallery(String galleryName) {
        this.galleryName = galleryName;
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public Artwork findArtwork(String title) {
        for (Artwork art : artworks) {
            if (art.getTitle().equalsIgnoreCase(title)) {
                return art;
            }
        }
        return null;
    }

    public ArrayList<Artwork> filterByArtist(String artistName) {
        ArrayList<Artwork> result = new ArrayList<>();
        for (Artwork art : artworks) {
            if (art.getArtist().getName().equalsIgnoreCase(artistName)) {
                result.add(art);
            }
        }
        return result;
    }

    public void sortArtworksByPrice() {
        Collections.sort(artworks);
    }

    public void printGallery() {
        System.out.println("Gallery: " + galleryName);
        for (Artwork art : artworks) {
            System.out.println(art);
        }
    }
}