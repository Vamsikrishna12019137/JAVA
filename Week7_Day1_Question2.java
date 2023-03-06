import java.util.Scanner;

public class NthWordOccurrence {
    public static void main(String... vamsi) {
    Scanner scanner = new Scanner(System.in);

    String paragraph = scanner.nextLine().toLowerCase();

    String[] input = scanner.nextLine().split(" ");
    String word = input[0].toLowerCase();
    int n = Integer.parseInt(input[1]);

    int count = 0;
    int index = -1;
    for (int i = 0; i < paragraph.length(); i++) {
        if (paragraph.indexOf(word, i) == i) {
            count++;
            if (count == n) {
                index = i;
                break;
            }
        }
    }

    if (index == -1) {
        System.out.println("Not Present");
    } else {
        System.out.println(index);
    }
}
}
