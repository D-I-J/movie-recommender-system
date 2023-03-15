package io.datajek.spring.basics.movierecommendersystem.lesson6;

public interface Filter {
    String[] getRecommendations(String movie);
}
