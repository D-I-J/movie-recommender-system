package io.datajek.spring.basics.movierecommendersystem.lesson7;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie)
    {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
