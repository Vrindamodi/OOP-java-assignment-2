import java.util.Scanner;

class StringPermutations {

    public void findPermutations(String str) {
        printPermutations(str, "");
    }

    private void printPermutations(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            printPermutations(left + right, answer + ch);
        }
    }
}

class Q4Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringPermutations permutations = new StringPermutations();

        System.out.println("Permutations:");
        permutations.findPermutations(str);
        sc.close();
    }
}
