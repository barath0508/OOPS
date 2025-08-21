package movie;

public class Movie {
    private String title;
    private String rating;
    private int duration; // in minutes

    // Constructor
    public Movie(String title, String rating, int duration) {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    // Method to check if movie is longer than 2 hours
    public boolean isLongerThanTwoHours() {
        return duration > 120;
    }

    // Override toString to print movie details
    @Override
    public String toString() {
        return "🎬 Title: " + title + "\nRating: " + rating + "\nDuration: " + duration + " minutes";
    }
}
