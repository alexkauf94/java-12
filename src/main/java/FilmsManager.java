public class FilmsManager {
    private int limitManager = 5;

    public FilmsPoster[] films = new FilmsPoster[0];

    public FilmsManager() {
    }

    public FilmsManager(int limitManager) {
        this.limitManager = limitManager;
    }

    public int getLimitManager() {
        return limitManager;
    }


    public void addFilm(FilmsPoster film) {
        FilmsPoster[] tmp = new FilmsPoster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmsPoster[] findAll() {
        return films;
    }


    public FilmsPoster[] findLast() {
        int resultLenght;
        if (limitManager == films.length) {
            resultLenght = films.length;
        } else {
            resultLenght = limitManager;
        }
        FilmsPoster[] result = new FilmsPoster[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
