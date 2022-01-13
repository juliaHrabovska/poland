package com.epam.test.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    static class RatingCompare implements Comparator<Movie> {
        public int compare(Movie m1, Movie m2) {
            return Double.compare(m1.getRating(), m2.getRating());
        }
    }

    static class NameCompare implements Comparator<Movie> {
        public int compare(Movie m1, Movie m2) {
            return m1.getName().compareTo(m2.getName());
        }
    }
}

class Main {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

//        Collections.sort(list);
//
//        System.out.println("Movies after sorting : ");
//        for (Movie movie : list) {
//            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
//        }

        System.out.println("Sorted by rating");
        Movie.RatingCompare ratingCompare = new Movie.RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        System.out.println("\nSorted by name");
        Movie.NameCompare nameCompare = new Movie.NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list)
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
    }
}
