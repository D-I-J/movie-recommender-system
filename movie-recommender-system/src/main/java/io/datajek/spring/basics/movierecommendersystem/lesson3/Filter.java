package io.datajek.spring.basics.movierecommendersystem.lesson3;

public interface Filter {
    String[] getRecommendations(String movie);
}
