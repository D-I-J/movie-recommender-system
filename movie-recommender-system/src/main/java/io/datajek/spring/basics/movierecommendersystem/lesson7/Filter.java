package io.datajek.spring.basics.movierecommendersystem.lesson7;

public interface Filter {
    String[] getRecommendations(String movie);
}
