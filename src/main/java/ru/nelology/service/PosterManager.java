package ru.nelology.service;

public class PosterManager {
    private String[] movies;
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
        this.movies = new String[0];
    }


    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {

        return movies;
    }

    public String[] findLast() {
        int resultLength = Math.min(limit, movies.length);
        String[] result = new String[resultLength];

        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }

        return result; // Возвращаем массив с фильмами
    }

//    public String[] findLast() {
//        int resultLength;
//        if (movies.length < limit) {
//            resultLength = movies.length;
//        } else {
//            resultLength = limit;
//        }
//
//        String[] tmp = new String[resultLength];
//        for (int i = 0; i < tmp.length; i++) {
//            tmp[i] = movies[movies.length - 1 - i];
//        }
//        return tmp;
//    }
}

