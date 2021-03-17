import java.util.Scanner;
import java.util.stream.IntStream;

public class TrafficData {
    public static int[] WeeklyTrafficData = new int[7];
    private static int currentWeek = 0;

    public static void main(String[] args) {
        getWeeklyTrafficDataFromConsole();
        describeWeeklyTrafficData(WeeklyTrafficData);

        System.exit(0);
    }

    public static void getWeeklyTrafficDataFromConsole() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.printf("Input %s's traffic data:%n", getWeekByIndexNumber(i));
            pushDailyTrafficData(scanner.nextInt(), WeeklyTrafficData);
        }
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static void describeWeeklyTrafficData(int[] weeklyTrafficData) {
        int maxLoadIndex = IntStream.range(0, 7).reduce(
                (index1, index2) -> weeklyTrafficData[index1] > weeklyTrafficData[index2] ? index1 : index2).getAsInt();
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s:%d%n", getWeekByIndexNumber(i), weeklyTrafficData[i]);
        }

        System.out.printf("%s has max load of %d", getWeekByIndexNumber(maxLoadIndex), weeklyTrafficData[maxLoadIndex]);
    }

    public static void pushDailyTrafficData(int data, int[] weeklyTrafficData) {
        weeklyTrafficData[currentWeek] = data;

        currentWeek++;
        if (currentWeek == 7) currentWeek = 0;
    }

    public static String getWeekByIndexNumber(int index) {
        String[] weeks = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };
        return weeks[index];
    }
}
