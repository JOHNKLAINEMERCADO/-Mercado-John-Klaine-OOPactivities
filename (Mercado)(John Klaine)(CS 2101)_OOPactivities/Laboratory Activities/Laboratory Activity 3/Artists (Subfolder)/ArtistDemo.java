public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Nayeon Im", "Korean", 29, "Choreo", DanceStyle.BALLET);
        dancer.displayInfo();

        Painter painter = new Painter("Nayeon Im", "Korean", 29, "Art", Medium.ACRYLIC);
        painter.displayInfo();

        Writer writer = new Writer("Name1", "Nationality1", 20, "Literature", WritingStyle.DRAMA);
        writer.displayInfo();
    }
}