package io.datajek.spring.basics.movierecommendersystem.lesson7;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    // setter injection
    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter)
    {
        this.filter = filter;
        System.out.println("setter method invoked..");
    }

    public String[] recommendMovies(String movie)
    {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }




}
