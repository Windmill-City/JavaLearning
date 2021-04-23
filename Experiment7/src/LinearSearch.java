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
        String[] toSearches = {"Artist 3", "Artist 6"};
        for (String toSearch : toSearches) {
            int index = linearSearch(artists, toSearch);
            if (index != -1)
                System.out.printf("Found \"%s\" at %d in [%s]%n", toSearch, index,
                        Arrays.stream(artists).map(e -> String.format("%n%s,", e)).reduce("", String::concat));
            else
                System.out.printf("\"%s\" not found in [%s]%n", toSearch,
                        Arrays.stream(artists).map(e -> String.format("%n%s,", e)).reduce("", String::concat));
        }
    }

    public static int linearSearch(String[] artists, String toSearch) {
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].equals(toSearch)) {
                return i;
            }
        }
        return -1;
    }
}
