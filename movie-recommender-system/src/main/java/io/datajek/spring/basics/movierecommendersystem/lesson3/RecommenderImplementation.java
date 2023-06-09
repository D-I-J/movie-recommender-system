package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
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
