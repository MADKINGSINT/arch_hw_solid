package Domain;

import Application.MovieApp;

/* Запуск логики домена (domain's MovieApp use case start)
* */
public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void Run(MovieSearchRequest userCommand)
    {
        movieApp.accept(userCommand);
    }
}
