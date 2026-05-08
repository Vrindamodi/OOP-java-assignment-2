class Solution {
    public int CheckPassword(char str[], int n) {
        if (n < 4) return 0;

        boolean hasCapital = false;
        boolean hasNumeric = false;
        boolean hasSpaceOrSlash = false;

        if(Character.isDigit(str[0])) return 0;

        for(int i=0;i<n;i++){
            if(Character.isUpperCase(str[i])) hasCapital = true;
            if(Character.isDigit(str[i])) hasNumeric = true;
            if(str[i] == ' ' || str[i] == '/') hasSpaceOrSlash = true;
        }

        return hasCapital && hasNumeric && !hasSpaceOrSlash ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "aA1_67";
        String input2 = "a987 abC012";

        System.out.println("CheckPassword for " + input1 + " : " +
                solution.CheckPassword(input1.toCharArray(), input1.length()));

        System.out.println("CheckPassword for " + input2 + " : " +
                solution.CheckPassword(input2.toCharArray(), input2.length()));
    }
}