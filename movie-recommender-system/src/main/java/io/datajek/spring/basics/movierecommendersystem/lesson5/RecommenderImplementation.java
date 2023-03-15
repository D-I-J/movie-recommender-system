package io.datajek.spring.basics.movierecommendersystem.lesson5;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired      // Autowiring by name,
    private Filter collaborativeFilter;  // specifying the variable name
    // to choose the filter according to the name it should be same
    // as the interface name, and it has low presidency then @Primary Annotation.

    RecommenderImplementation(Filter filter)
    {
        super(); // unnecessary to write but causes no issue when written.
        this.collaborativeFilter = filter;
    }
    public String[] recommendMovies(String movie)
    {
        System.out.println("Name of the filter in use: " + collaborativeFilter + "\n");
        String[] results = collaborativeFilter.getRecommendations("Finding Dory");
        return results;
    }




}
