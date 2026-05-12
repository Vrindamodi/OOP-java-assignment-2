import java.util.Scanner;

class PasswordChecker {

    public int CheckPassword(char str[], int n) {
        if (n < 4) return 0;

        boolean hasCapital = false;
        boolean hasNumeric = false;
        boolean hasSpaceOrSlash = false;

        if (Character.isDigit(str[0])) return 0;

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(str[i])) hasCapital = true;
            if (Character.isDigit(str[i])) hasNumeric = true;
            if (str[i] == ' ' || str[i] == '/') hasSpaceOrSlash = true;
        }

        return hasCapital && hasNumeric && !hasSpaceOrSlash ? 1 : 0;
    }
}

class Q2Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String input = sc.nextLine();
        PasswordChecker checker = new PasswordChecker();
        System.out.println("CheckPassword result: "
                + checker.CheckPassword(input.toCharArray(), input.length()));
    }
}
