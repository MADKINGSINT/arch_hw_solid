package Domain;

/* Класс возвращающий аргумент запроса
* */
public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

    public String getMovieName() {
        return request;
    }
}
