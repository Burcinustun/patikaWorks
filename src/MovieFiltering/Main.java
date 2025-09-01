package MovieFiltering;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Öncelikle oluşturulan filmleri ekleyeceğimiz bir liste açalım.

        ArrayList<Movie> movieList = new ArrayList<>();

        /* Ben bu ödevde filmleri kendim oluşturmak yerine
        kullanıcıdan film oluşturmasını talep edeceğim.
        Bunun için scanner açarak kullanıcıdan gerekli bilgileri alalım.
         */
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {      // Beş film oluşturacağımız için beş kez tekrar eden for döngüsü

            System.out.print("Please enter the name of the movie you want to add: ");
            String movieName = input.nextLine();

            System.out.print("Release year of the movie:");
            int releaseYear = input.nextInt();
            input.nextLine();


            System.out.print("Genre of the movie: ");
            String movieGenre = input.nextLine();

            System.out.print("IMDB point of the movie:");
            double imdbPoint = input.nextDouble();
            input.nextLine();

            // Bilgileri aldık. Artık yeni nesne oluşturabiliriz.

            Movie movie = new Movie(movieName, releaseYear, movieGenre, imdbPoint);

            // Oluşturduğumuz movie öğesini listeye atalım.

            movieList.add(movie);
        }


        // IMDB puanına göre sıralayalım.

        System.out.println("List sorted by IMDb point: \n");
        FilteringMovie.sortByImdb(movieList);

        // Yayım yılına göre sıralayalım.

        System.out.println("List sorted by release year: \n");
        FilteringMovie.sortByReleaseYear(movieList);


        // Türe göre sıralamak için de kullanıcıdan giriş alalım.

        System.out.println("Enter a genre to filter the movies: ");
        String enteredGenre = input.nextLine();

        ArrayList<Movie> filteredMovies = FilteringMovie.filterByGenre(movieList, enteredGenre);

        if (filteredMovies.isEmpty()) {
            System.out.println("No movies found for genre: " + enteredGenre);
        } else {
            System.out.println("Movies in genre " + enteredGenre + ":");
            for (Movie m : filteredMovies) {
                System.out.println(m);
            }
        }
    }
}
