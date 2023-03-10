import java.util.*;

public class Solution {

    public static void main(String... vamsi) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scan.close();
    }

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        boolean[] visited = new boolean[n];
        return explore(game, 0, leap, visited);
    }

    public static boolean explore(int[] game, int pos, int leap, boolean[] visited) {
        if (pos < 0 || game[pos] == 1 || visited[pos]) {
            return false;
        }
        if (pos + leap >= game.length || pos == game.length - 1) {
            return true;
        }
        visited[pos] = true;
        return explore(game, pos + 1, leap, visited) || 
               explore(game, pos - 1, leap, visited) ||
               explore(game, pos + leap, leap, visited);
    }
}
