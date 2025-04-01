package titles.model;

import titles.calcs.Classification;

public class Episodes implements Classification {
    private int epNumber;
    private String epTitle;
    private Series serie;
    private int totalViews;

    public void setEpNumber(int epNumber) {
        this.epNumber = epNumber;
    }

    public void setEpTitle(String epTitle) {
        this.epTitle = epTitle;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getEpNumber() {
        return epNumber;
    }

    public String getEpTitle() {
        return epTitle;
    }

    public Series getSerie() {
        return serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    @Override
    public int getClassification() {
        if(totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}

