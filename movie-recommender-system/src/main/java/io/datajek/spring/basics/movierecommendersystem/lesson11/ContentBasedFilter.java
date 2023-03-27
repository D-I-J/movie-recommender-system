package io.datajek.spring.basics.movierecommendersystem.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class ContentBasedFilter implements Filter {

    public ContentBasedFilter(){
        super();
        logger.info("In ContentBasedFilter constructor method");
    }

    @PostConstruct
    private void postConstruct(){
        logger.info("In ContentBasedFilter postConstruct method");
    }
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public String[] getRecommendations(String movie)
    {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("In ContentBasedFilter preDestroy method");
    }
}
