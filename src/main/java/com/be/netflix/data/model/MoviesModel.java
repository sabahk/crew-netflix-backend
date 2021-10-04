package com.be.netflix.data.model;

public class MoviesModel {

    private String originalTitle;
    private int year;

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle){
        this.originalTitle = originalTitle;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "originalTitle='" + originalTitle + '\'' +
                ", year=" + year +
                '}';
    }
}
