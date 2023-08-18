import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class FilmsManagerTest {
    FilmsManager manager = new FilmsManager();
    FilmsManager manager2 = new FilmsManager(3);

    FilmsManager manager3 = new FilmsManager(7);


    FilmsPoster film1 = new FilmsPoster(1, "Бладшот", "боевик");
    FilmsPoster film2 = new FilmsPoster(2, "Вперёд", "мультфильм");
    FilmsPoster film3 = new FilmsPoster(3, "Отель \"Белград\"", "комедия");
    FilmsPoster film4 = new FilmsPoster(4, "Джентельмены", "боевик");
    FilmsPoster film5 = new FilmsPoster(5, "Человек-невидимка", "ужасы");
    FilmsPoster film6 = new FilmsPoster(6, "Тролли. Мировой тур", "мультфильм");
    FilmsPoster film7 = new FilmsPoster(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
    }

    @BeforeEach
    public void setup2() {
        manager2.addFilm(film1);
        manager2.addFilm(film2);
        manager2.addFilm(film3);
        manager2.addFilm(film4);
        manager2.addFilm(film5);
        manager2.addFilm(film6);
        manager2.addFilm(film7);
    }

    @BeforeEach
    public void setup3() {
        manager3.addFilm(film1);
        manager3.addFilm(film2);
        manager3.addFilm(film3);
        manager3.addFilm(film4);
        manager3.addFilm(film5);
        manager3.addFilm(film6);
        manager3.addFilm(film7);
    }


    @Test
    public void testLimitManager() {

        Assertions.assertEquals(5, manager.getLimitManager());
    }

    @Test
    public void testLimitManagerIf3() {

        Assertions.assertEquals(3, manager2.getLimitManager());
    }

    @Test
    public void testLimitManageIf7() {

        Assertions.assertEquals(7, manager3.getLimitManager());
    }

    @Test
    public void addFilm() {

        FilmsPoster[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmsPoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        FilmsPoster[] expected = {film7, film6, film5, film4, film3};
        FilmsPoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIf7() {

        FilmsPoster[] expected = {film7, film6, film5, film4, film3, film2, film1};
        FilmsPoster[] actual = manager3.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIf3() {

        FilmsPoster[] expected = {film7, film6, film5};
        FilmsPoster[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
