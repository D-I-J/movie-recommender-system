package io.datajek.spring.basics.movierecommendersystem.lesson11;

public interface Filter {
    String[] getRecommendations(String movie);
}
