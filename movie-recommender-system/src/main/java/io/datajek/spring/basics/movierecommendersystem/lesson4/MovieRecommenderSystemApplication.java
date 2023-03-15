package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class,args);

		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}

}
