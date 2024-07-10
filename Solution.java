class Solution {
    public String reverseOnlyLetters(String s) {
        char[] temp = s.toCharArray();
        int i = 0;
        int j = temp.length-1;

        while(i < j){
            if(!Character.isAlphabetic(temp[i])){
                i++;
                continue;
            }
            if(!Character.isAlphabetic(temp[j])){
                j--;
                continue;
            }
            char ch = temp[i];
            temp[i] = temp[j];
            temp[j] = ch;
            i++;
            j--;
        }
        String out = new String(temp);
        return out;
    }
}
