package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item){
        catalogItems.add(item);
    }

    public double averagePageNumberOver(int pageNumber){
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int pages = 0;
        int counter = 0;
        for (CatalogItem item: catalogItems){
            if (item.numberOfPagesAtOneItem() >= pageNumber){
                pages += item.numberOfPagesAtOneItem();
                counter++;
            }
        }
        if (pages == 0) {
            throw new IllegalArgumentException("No page");
        }
        return ((double) pages) / counter;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        List<CatalogItem> toRemove = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNumber)) {
                toRemove.add(catalogItem);
            }
        }
        catalogItems.removeAll(toRemove);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (passByCriteria(catalogItem, searchCriteria)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    private boolean passByCriteria(CatalogItem catalogItem, SearchCriteria searchCriteria) {
        boolean passTitle = !searchCriteria.hasTitle() || catalogItem.getTitles().contains(searchCriteria.getTitle());
        boolean passContributor = !searchCriteria.hasContributor() || catalogItem.getContributors().contains(searchCriteria.getContributor());
        return passTitle && passContributor;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem catalogItem : catalogItems) {
            sum += catalogItem.numberOfPagesAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        Catalog catalog = new Catalog();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                catalog.addItem(catalogItem);
            }
        }
        return catalog.catalogItems;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem catalogItem : catalogItems) {
            sum += catalogItem.fullLengthAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedLibraryItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                printedLibraryItems.add(catalogItem);
            }
        }
        return printedLibraryItems;
    }
}
