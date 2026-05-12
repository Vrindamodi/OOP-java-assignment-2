import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class PhoneLetterCombinations {
    public String[] returnCombinations(String digits) {
        if (digits.length() == 0) return new String[0];

        String[] keypad = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        ArrayList<String> result = new ArrayList<>();
        findCombinations(digits, 0, "", keypad, result);

        return result.toArray(new String[0]);
    }

    private void findCombinations(String digits, int index, String current,
                                  String[] keypad, ArrayList<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            findCombinations(digits, index + 1, current + letters.charAt(i), keypad, result);
        }
    }
}

class Q3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String digits = sc.nextLine();
        PhoneLetterCombinations combinations = new PhoneLetterCombinations();
        System.out.println("Letter combinations: "
                + Arrays.toString(combinations.returnCombinations(digits)));
    }
}
