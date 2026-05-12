import java.util.Scanner;

class LongestWordFinder {

    public String longestWord(String sentence) {
        String longestWord = "";
        int currentWordLength = 0;
        String currentWord = "";

        for (char c : sentence.toCharArray()) {
            if (c == ' ') {
                if (currentWordLength > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
                currentWordLength = 0;
            } else {
                currentWord += c;
                currentWordLength++;
            }
        }

        if (currentWordLength > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }
}

class Q8Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        LongestWordFinder finder = new LongestWordFinder();
        System.out.println("Longest Word: " + finder.longestWord(str));
    }
}
