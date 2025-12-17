public class Main {
    public static void main(String[] args){
        Artist artist1 = new Artist("Leonardo Da Vinchi", "Italy");
        Artist artist2 = new Artist("Adilkhan Kasteev", "Kazakh");

        ArtGallery mygall = new ArtGallery("Louvre","Paris");

        Artwork art1 = new Artwork("Mona Lisa",1503,8000000,artist1);
        Artwork art2 = new Artwork("Kazakh Dalasy",1953,50000,artist2);
        art1.displayInfo();

        System.out.println("Salystyru");
        if (art1.getPrice() > art2.getPrice()){
            System.out.println("Mona Liza is expensive");
        }

        if (art1.getArtist() ==art2.getArtist()){
            System.out.println("This art have same Artist");
        }
    }
}