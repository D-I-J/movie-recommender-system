package io.datajek.spring.basics.movierecommendersystem.lesson10;

public interface Filter {
    String[] getRecommendations(String movie);
}
