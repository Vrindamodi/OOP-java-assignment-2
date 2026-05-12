import java.util.Arrays;
import java.util.Scanner;

class TextFilter {

    public String filterText(String text, String[] badWords) {
        String[] longestFirst = Arrays.copyOf(badWords, badWords.length);
        Arrays.sort(longestFirst, (a, b) -> Integer.compare(b.length(), a.length()));

        StringBuilder out = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            boolean replaced = false;
            for (String bad : longestFirst) {
                int len = bad.length();
                if (len == 0) continue;
                if (i + len <= text.length()
                        && regionMatchesIgnoreCase(text, i, bad)
                        && isWholeWord(text, i, len)) {
                    out.append("***");
                    i += len;
                    replaced = true;
                    break;
                }
            }
            if (!replaced) {
                out.append(text.charAt(i));
                i++;
            }
        }
        return out.toString();
    }

    private boolean regionMatchesIgnoreCase(String text, int start, String word) {
        for (int j = 0; j < word.length(); j++) {
            if (Character.toLowerCase(text.charAt(start + j))
                    != Character.toLowerCase(word.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    private boolean isWholeWord(String text, int start, int len) {
        if (start > 0 && isWordChar(text.charAt(start - 1))) return false;
        int after = start + len;
        if (after < text.length() && isWordChar(text.charAt(after))) return false;
        return true;
    }

    private boolean isWordChar(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }
}

class Q6Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        System.out.print("Enter bad words (comma-separated): ");
        String[] badWords = sc.nextLine().split(",");
        TextFilter filter = new TextFilter();
        System.out.println("Filtered text: " + filter.filterText(input, badWords));
    }
}
