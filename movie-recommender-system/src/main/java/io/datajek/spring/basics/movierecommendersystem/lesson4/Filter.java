package io.datajek.spring.basics.movierecommendersystem.lesson4;

public interface Filter {
    String[] getRecommendations(String movie);
}
