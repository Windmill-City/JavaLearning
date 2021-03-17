import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        createArtistsArrayAndSearch();
    }

    public static void createArtistsArrayAndSearch() {
        String[] artists = {
                "Artist 1",
                "Artist 2",
                "Artist 3",
                "Artist 4",
                "Artist 5"
        };
        linearSearch(artists, "Artist 3");
        linearSearch(artists, "Artist 6");
    }

    public static void linearSearch(String[] artists, String toSearch) {
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].equals(toSearch)) {
                System.out.printf("Found \"%s\" at %d in [%s]%n", toSearch, i,
                        Arrays.stream(artists).map(e -> String.format("%n%s,", e)).reduce("", String::concat));
                return;
            }
        }
        System.out.printf("\"%s\" not found in [%s]%n", toSearch,
                Arrays.stream(artists).map(e -> String.format("%n%s,", e)).reduce("", String::concat));
    }
}
