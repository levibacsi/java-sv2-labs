package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private final int price;
    private final String registrationNumber;


    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.features.addAll(Arrays.asList(features));
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem(){
        int length = 0;
        for (Feature feature: features){
            if (feature.getClass().equals(AudioFeatures.class)){
                length += ((AudioFeatures) feature).getLength();
            }
        }
        return length;
    }

    public List<String> getContributors(){
        List<String> contributors = new ArrayList<>();
        for (Feature feature: features){
            contributors.addAll(feature.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature: features){
            titles.add(feature.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature feature: features) {
            if (feature.getClass().equals(AudioFeatures.class)){
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for (Feature feature: features){
            if (feature.getClass().equals(PrintedFeatures.class)){
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem(){
        int pages = 0;
        for (Feature feature: features){
            if (feature.getClass().equals(PrintedFeatures.class)){
                pages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return pages;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
