import java.util.Scanner;

class TitleCaseConverter {
    
    public String convertToTitleCase(String sentence) {

        StringBuilder result = new StringBuilder();

        boolean isFirstLetter = true;

        for (char c: sentence.toCharArray()) {
            if (c == ' ') {
                isFirstLetter = true;
                result.append(c);
            } else {
                if (isFirstLetter) {
                    result.append(Character.toUpperCase(c));
                    isFirstLetter = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}

class Q9Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        TitleCaseConverter converter = new TitleCaseConverter();
        String ans = converter.convertToTitleCase(str);
        System.out.println("Title Case: " + ans);
    }
}
