package com.example.remoteapis;

public class MovieResponse {

    private String original_title;
    private String tagline;

    private String overview;
    private int budget;
    private String revenue;

    public MovieResponse() {
    }

    public MovieResponse(int budget, String original_title, String tagline, String revenue,String overview) {
        this.budget = budget;
        this.original_title = original_title;
        this.tagline = tagline;
        this.revenue = revenue;
        this.overview=overview;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }



    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }
}
