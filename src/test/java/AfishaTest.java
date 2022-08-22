import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void shouldShowAllMovies() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] actual =  afisha.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldShowLastMoviesInCustomLimit() {
        Afisha afisha = new Afisha(12);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");
        afisha.add("Movie 11");
        afisha.add("Movie 12");

        String[] actual = afisha.findLast();
        String[] expected = { "Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1" };

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldShowLast10Movies() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");

        String[] actual = afisha.findLast();
        String[] expected = { "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1" };

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldShowLastMoviesIfLessThan10() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");

        String[] actual = afisha.findLast();
        String[] expected = { "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1" };

        Assertions.assertArrayEquals(actual, expected);

    }





}
