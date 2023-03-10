import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String statement = scanner.nextLine().trim();
        int N = Integer.parseInt(scanner.nextLine().trim());

        if (N < 1 || N > 10) {
            System.out.println("Invalid Input");
        } else {
            String[] words = statement.split("\\s+");
            int count = 0;
            for (String word : words) {
                if (word.length() == N) {
                    count++;
                }
            }

            
            System.out.println(count);
        }

        scanner.close();
    }
}
