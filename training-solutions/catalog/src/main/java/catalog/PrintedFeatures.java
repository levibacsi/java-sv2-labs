package catalog;

import java.util.List;

public class PrintedFeatures implements Feature{
    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("invalid number of pages");
        }
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("no author");
        }

        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    public List<String> getContributors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
