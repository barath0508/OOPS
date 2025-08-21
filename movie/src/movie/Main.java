package movie;

public class Main {
    public static void main(String[] args) {
        // Create movie objects
        Movie movie1 = new Movie("Inception", "PG-13", 148);
        Movie movie2 = new Movie("The Lion King", "G", 88);
        Movie movie3 = new Movie("Avengers: Endgame", "PG-13", 181);

        // Store in array
        Movie[] movies = { movie1, movie2, movie3 };

        // Loop and display results
        for (Movie movie : movies) {
            System.out.println(movie);
            if (movie.isLongerThanTwoHours()) {
                System.out.println("-> This movie is longer than 2 hours.\n");
            } else {
                System.out.println("-> This movie is NOT longer than 2 hours.\n");
            }
        }
    }
}
