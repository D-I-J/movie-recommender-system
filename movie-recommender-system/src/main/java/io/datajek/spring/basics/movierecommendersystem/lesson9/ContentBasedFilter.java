package io.datajek.spring.basics.movierecommendersystem.lesson9;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    private static int instances = 0;

    @Autowired
    private Movie movie;
    public ContentBasedFilter()
    {
        instances += 1;
        System.out.println("content-based filter constructor called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    public String[] getRecommendations(String movie)
    {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
