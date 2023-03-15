package io.datajek.spring.basics.movierecommendersystem.lesson8;

public interface Filter {
    String[] getRecommendations(String movie);
}
