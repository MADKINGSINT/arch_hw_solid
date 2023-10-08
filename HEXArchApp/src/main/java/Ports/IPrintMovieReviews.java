package Ports;


import java.util.List;

import Domain.MovieReview;

/* Интерфейс для печати отзыва в консоль
* */
public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
