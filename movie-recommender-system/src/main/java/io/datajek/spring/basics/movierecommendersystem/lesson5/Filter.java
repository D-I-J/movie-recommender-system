package io.datajek.spring.basics.movierecommendersystem.lesson5;

public interface Filter {
    String[] getRecommendations(String movie);
}
