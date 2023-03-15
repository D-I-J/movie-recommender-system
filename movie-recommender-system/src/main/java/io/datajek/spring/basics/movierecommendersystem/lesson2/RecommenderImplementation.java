package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {

    private Filter filter;

    RecommenderImplementation(Filter filter)
    {
        super(); // unnecessary to write but causes no issue when written.
        this.filter = filter;
    }
    public String[] recommendMovies(String movie)
    {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }




}