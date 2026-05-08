class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];

        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(commonPrefix)!=0){
                commonPrefix = commonPrefix.substring(0, commonPrefix.length()-1);

                if(commonPrefix.isEmpty()) return "";
            }
        }

        return commonPrefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "race", "car"};

        System.out.println("Longest Common Prefix for flower, flow, flight : " + solution.longestCommonPrefix(strs1));
        System.out.println("Longest Common Prefix for dog, race, car : " + solution.longestCommonPrefix(strs2));
    }
}