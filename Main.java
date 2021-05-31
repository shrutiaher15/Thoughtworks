import java.util.ArrayList;

class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static ArrayList<Movie> getPG(Movie[] movies){
        ArrayList<Movie> pgMovies = new ArrayList<>();

        for (int i = 0; i < movies.length; i++){
            if(movies[i].rating.equals("PG"))
                pgMovies.add(movies[i]);
        }

        return pgMovies;
    }

}

public class Main{
    public static void main(String[] args) {
        Movie movie = new Movie("Casino Royale", "Eon Productions", "PG-13");

    }
}