package io.datajek.spring.basics.movierecommendersystem.lesson11;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS) // used to inject prototype bean into singleton bean after it is created.
public class Movie {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static int instances = 0;
    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie(){
        logger.info("In Movie constructor method");
    }

    public static int getInstances(){
        return Movie.instances;
    }

    @PostConstruct
    private void postConstruct(){
        logger.info("In Movie postConstruct method");
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("In Movie preDestroy method");
    }
}
