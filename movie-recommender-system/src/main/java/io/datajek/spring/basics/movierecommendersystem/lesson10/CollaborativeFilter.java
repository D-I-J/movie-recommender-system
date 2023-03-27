package io.datajek.spring.basics.movierecommendersystem.lesson10;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

////Option 1
//@Scope("prototype")

//Option 2 // preferred approach
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter()
    {
        System.out.println("collaborative filter constructor called");
    }
    public String[] getRecommendations(String movie)
    {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }

}
