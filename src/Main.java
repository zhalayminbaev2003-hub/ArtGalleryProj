import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArtGallery myGallery = new ArtGallery("Astana Art");

        Artist artist1 = new Artist("Van Gogh", "Netherlands");
        Artist artist2 = new Artist("Da Vinci", "Italy");

        myGallery.addArtwork(new Painting("Starry Night", artist1, 100000, "Oil"));
        myGallery.addArtwork(new Painting("Mona Lisa", artist2, 850000, "Oil"));
        myGallery.addArtwork(new Sculpture("David", new Artist("Michelangelo", "Italy"), 200000, 5000));

        System.out.println("All Artworks ");
        myGallery.printGallery();

        System.out.println("\nSorted by Price ");
        myGallery.sortArtworksByPrice();
        myGallery.printGallery();

        System.out.println("\nSearch: 'Mona Lisa' ");
        System.out.println(myGallery.findArtwork("Mona Lisa"));

        System.out.println("\nFilter: Van Gogh ");
        List<Artwork> vanGoghWorks = myGallery.filterByArtist("Van Gogh");
        for (Artwork art : vanGoghWorks) {
            System.out.println(art);
        }
    }
}