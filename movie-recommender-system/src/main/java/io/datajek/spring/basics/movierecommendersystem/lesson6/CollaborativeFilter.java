package io.datajek.spring.basics.movierecommendersystem.lesson6;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie)
    {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
