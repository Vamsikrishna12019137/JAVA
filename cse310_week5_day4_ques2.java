import java.util.Scanner;

public class Main {
    public static void main(String... vamsi) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        int stringCount = 0;
        int intCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].matches("\\d+")) {
                intCount++;
            } else {
                stringCount++;
            }
        }

        System.out.println(intCount);
        System.out.println(stringCount);
    }
}
