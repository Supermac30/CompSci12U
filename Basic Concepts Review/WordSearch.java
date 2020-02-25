// https://dmoj.ca/submission/1931243
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordSearch {
    static char[][] wordSearch;
    static boolean[][] found;
    static BufferedReader br;
    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            solve();
            System.out.println();
        }
    }
    public static void solve() throws IOException{
        String lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");
        int[] inp = new int[2];
        for (int i = 0; i < strs.length; i++) {
            inp[i] = Integer.parseInt(strs[i]);
        }
        wordSearch = new char[inp[0]][inp[1]];
        found = new boolean[inp[0]][inp[1]];
        for (int i = 0; i < inp[0]; i++) {
            wordSearch[i] = br.readLine().toCharArray();
        }
        int numWords = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < numWords; i++) {
            words.add(br.readLine().replaceAll("[^a-zA-Z0-9]", ""));
        }
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < inp[0]; i++) {
            for (int j = 0; j < inp[1]; j++) {
                for (String word: words) {
                    if (!(up(i, j, word) || down(i, j, word) || left(i, j, word) || right(i, j, word) || upLeft(i, j, word) || upRight(i, j, word) || downLeft(i, j, word) || downRight(i, j, word))) {
                        temp.add(word);
                    }
                }
                words = (ArrayList<String>) temp.clone();
                temp.clear();
            }
        }

        for (int i = 0; i < inp[0]; i++) {
            for (int j = 0; j < inp[1]; j++) {
                if (!found[i][j]) {
                    System.out.print(wordSearch[i][j]);
                }
            }
        }
    }

    private static boolean downRight(int i, int j, String word) {
        if (word.length() + i <= wordSearch.length && word.length() + j <= wordSearch[0].length) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i+k][j+k]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i+k][j+k] = true;
            }
            return true;
        }
        return false;
    }

    private static boolean downLeft(int i, int j, String word) {
        if (word.length() + i <= wordSearch.length && word.length() <= j + 1) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i+k][j-k]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i+k][j-k] = true;
            }
            return true;
        }
        return false;
    }

    private static boolean upRight(int i, int j, String word) {
        if (word.length() <= i + 1 && word.length() + j <= wordSearch[0].length) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i-k][j+k]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i-k][j+k] = true;
            }
            return true;
        }
        return false;
    }

    private static boolean upLeft(int i, int j, String word) {
        if (word.length() <= i + 1 && word.length() <= j + 1) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i-k][j-k]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i-k][j-k] = true;
            }
            return true;
        }
        return false;
    }

    private static boolean right(int i, int j, String word) {
        if (word.length() + j <= wordSearch[0].length) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i][j+k]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i][j+k] = true;
            }
            return true;
        }
        return false;
    }

    private static boolean left(int i, int j, String word) {
        if (word.length() <= j + 1) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i][j-k]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i][j-k] = true;
            }
            return true;
        }
        return false;
    }

    private static boolean down(int i, int j, String word) {
        if (word.length() + i <= wordSearch.length) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i+k][j]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i+k][j] = true;
            }
            return true;
        }
        return false;
    }

    private static boolean up(int i, int j, String word) {
        if (word.length() <= i+1) {
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) != wordSearch[i-k][j]) {
                    return false;
                }
            }
            for (int k = 0; k < word.length(); k++) {
                found[i-k][j] = true;
            }
            return true;
        }
        return false;
    }
}