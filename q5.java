import java.util.HashMap;
import java.util.Scanner;

class AnagramChecker {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sCount.equals(tCount);
    }
}

class Q5Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String t = sc.nextLine();
        AnagramChecker checker = new AnagramChecker();
        System.out.println("Anagram Check: " + checker.isAnagram(s, t));
    }
}
