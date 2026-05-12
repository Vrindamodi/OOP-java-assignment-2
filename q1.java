import java.util.Scanner;

class LongestCommonPrefixFinder {

    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if (commonPrefix.isEmpty()) return "";
            }
        }

        return commonPrefix;
    }
}

class Q1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }
        LongestCommonPrefixFinder prefixFinder = new LongestCommonPrefixFinder();
        System.out.println("Longest Common Prefix: "
                + prefixFinder.longestCommonPrefix(strs));
    }
}
