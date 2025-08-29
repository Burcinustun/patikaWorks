package MovieFiltering;

public class Movie {
    private  String  movieName;
    private  int releaseYear;
    private  String movieGenre;
    private  double imdbPoint;

    // Şimdi bu özelliklerle bir constructor oluşturalım.

    public Movie(String movieName, int releaseYear, String movieGenre, double imdbPoint) {

        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.movieGenre = movieGenre;
        this.imdbPoint = imdbPoint;
    }

// Bir de bunların getter metotlarını oluşturalım.

    public String getMovieName() {
        return movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public double getImdbPoint() {
        return imdbPoint;
    }

    // Filmler listelenirken anlamlı görünmeleri için toString override edelim.

    @Override
    public String toString() {
        return movieName + " (" + releaseYear + ") - " + movieGenre + " - IMDB: " + imdbPoint;
    }

}
