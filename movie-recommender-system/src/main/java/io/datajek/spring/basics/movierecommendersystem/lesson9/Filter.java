package io.datajek.spring.basics.movierecommendersystem.lesson9;

public interface Filter {
    String[] getRecommendations(String movie);
}
