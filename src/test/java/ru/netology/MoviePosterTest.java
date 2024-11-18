package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterTest {

    @Test
    public void showFindAll() {

        MoviePoster moviePoster = new MoviePoster();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        moviePoster.add(movie1);
        moviePoster.add(movie2);
        moviePoster.add(movie3);
        moviePoster.add(movie4);
        moviePoster.add(movie5);
        moviePoster.add(movie6);
        moviePoster.add(movie7);

        String[] actual = moviePoster.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showIfLimit() {

        MoviePoster moviePoster = new MoviePoster();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";

        moviePoster.add(movie1);
        moviePoster.add(movie2);
        moviePoster.add(movie3);

        String[] actual = moviePoster.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastMoreLimit() {

        MoviePoster moviePoster = new MoviePoster(4);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";

        moviePoster.add(movie1);
        moviePoster.add(movie2);
        moviePoster.add(movie3);
        moviePoster.add(movie4);
        moviePoster.add(movie5);

        String[] actual = moviePoster.findLast();
        String[] expected = {movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);
    }
}

