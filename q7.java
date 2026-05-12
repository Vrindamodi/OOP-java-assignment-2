import java.util.HashSet;
import java.util.Scanner;

class UniqueCharacterChecker {

    public boolean isUniqueString(String s) {
        HashSet<Character> existingChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (existingChars.contains(c)) return false;
            existingChars.add(c);
        }
        return true;
    }
}

class Q7Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        UniqueCharacterChecker checker = new UniqueCharacterChecker();
        System.out.println(
                checker.isUniqueString(input)
                        ? "All characters are unique."
                        : "String contains duplicate characters.");
    }
}
