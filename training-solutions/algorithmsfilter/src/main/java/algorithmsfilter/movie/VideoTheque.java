package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList (){
        return movieList;
    }

    public void addMovie (Movie movie){
        movieList.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category){
        List<Movie> goodMovieList = new ArrayList<>();
        for (Movie m: movieList){
            if (category == m.getCategory() && m.getRating() >= 3){
                goodMovieList.add(m);
            }
        }
        return goodMovieList;
    }
}
