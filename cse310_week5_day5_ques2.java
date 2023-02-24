import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String... vamsi) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean result = isBigger(a, b);
        System.out.println(result);
        scanner.close();
    }

    public static boolean isBigger(int a, int b) {
        return IntStream.of(a, b)
                        .allMatch(n -> n >= 10 && n <= 1000)
                        && a > b;
    }
}
