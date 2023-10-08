package Ports;

import java.util.List;

import Domain.MovieReview;
import Domain.MovieSearchRequest;

/* Интерфейс для подключения к базе отзывов
* */
public interface IFetchMovieReviews {

    //  Метод возвращает список отзывов
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
