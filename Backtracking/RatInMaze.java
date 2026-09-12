package Backtracking;
import java.util.*;

public class RatInMaze{
    public static ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> ans = new ArrayList<>();
        
        // Return empty list if start or destination is blocked
        if (arr[0][0] == 0 || arr[n - 1][n - 1] == 0) {
            return ans;
        }
        
        boolean[][] visits = new boolean[n][n];
        findPathHelper(arr, visits, n, 0, 0, "", ans);
        return ans;
    }

    public static boolean isValid(int i, int j, int[][] arr, boolean[][] visits, int n) {
        return (i >= 0 && i < n && j >= 0 && j < n && arr[i][j] == 1 && !visits[i][j]);
    }

    public static void findPathHelper(int[][] arr, boolean[][] visits, int n, int i, int j, String path, ArrayList<String> ans) {
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        visits[i][j] = true;

        // Down
        if (isValid(i + 1, j, arr, visits, n)) {
            findPathHelper(arr, visits, n, i + 1, j, path + "D", ans);
        }
        // Left
        if (isValid(i, j - 1, arr, visits, n)) {
            findPathHelper(arr, visits, n, i, j - 1, path + "L", ans);
        }
        // Right
        if (isValid(i, j + 1, arr, visits, n)) {
            findPathHelper(arr, visits, n, i, j + 1, path + "R", ans);
        }
        // Up
        if (isValid(i - 1, j, arr, visits, n)) {
            findPathHelper(arr, visits, n, i - 1, j, path + "U", ans);
        }

        // Backtrack
        visits[i][j] = false;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        int n = arr.length;
        ArrayList<String> paths = findPath(arr, n);
        System.out.println(paths);
    }
}