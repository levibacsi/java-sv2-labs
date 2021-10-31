package day05;
public class MainMovie {
    public static void main(String[] args) {
        Movie movie = new Movie("Spider Man", 1990);
        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 4);
        System.out.println(movie.getAverageRating());
        viewer.watchMovie(movie, 5);
        System.out.println(movie.getAverageRating());
        viewer.watchMovie(movie, 5);
        System.out.println(movie.getAverageRating());
    }
}
