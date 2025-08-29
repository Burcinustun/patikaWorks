package MovieFiltering;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilteringMovie {
    // IMBb puanına göre listeleyen metot;

    public static void sortByImdb (ArrayList <Movie> movies){

        movies.sort((movie1, movie2) -> Double.compare(movie2.getImdbPoint(), movie1.getImdbPoint()));
        System.out.println(movies);

    }


    // Yayın yılına göre listeleyen metot;

    public static void sortByReleaseYear (ArrayList <Movie> movies){
        movies.sort((movie1, movie2) -> Integer.compare(movie1.getReleaseYear(), movie2.getReleaseYear()));
        System.out.println(movies);
    }

    // Film türüne göre filtreleme metodu;

    public static ArrayList<Movie> filterByGenre(ArrayList<Movie> movies, String genre) {
        ArrayList<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getMovieGenre().equalsIgnoreCase(genre)) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }

}
