// Q1
// Now you are given a string S, which represents a software license key which we would like to format. 
// The string S is composed of alphanumerical characters and dashes. 
// The dashes split the alphanumerical characters within the string into groups. (i.e. if there are M dashes, the string is split into M+1 groups). 
// The dashes in the given string are possibly misplaced.
// We want each group of characters to be of length K (except for possibly the first group, which could be shorter, but still must contain at least one character). 
// To satisfy this requirement, we will reinsert dashes. Additionally, all the lower case letters in the string must be converted to upper case.
// So, you are given a non-empty string S, representing a license key to format, and an integer K. And you need to return the license key formatted according to the description above.

package javaapplication3;

public class JavaApplication3{
    public static String licenseKeyFormatting(String S, int K) {
        int len = 0;
        int n = 'a' - 'A';
        char[] tempArray = S.toCharArray(); //converts String S to a new character String.
        for (int i = 0; i < tempArray.length; i++) {
            char ch = tempArray[i];
            if (ch == '-') {
                continue;
            }
            else if (ch >= 'a' && ch <= 'z') {
                tempArray[i] -= n;
            }
            tempArray[len] = tempArray[i];
            len++;
        }
        int newLength;
        if (len % K == 0){
            newLength = len + len / K - 1;
        }
        else {
            newLength = len + len / K;
        }
        char[] newArray = new char[newLength];
        int m = len;
        for (int i = newLength - 1; i >= 0; i--) {
            if (i != newLength - 1 && (newLength-i) % (K+1) == 0) {
                newArray[i] = '-';
            } 
            else {
                m--;
                newArray[i] = tempArray[m];
            }
        }
        System.out.println(newArray);
        return String.valueOf(newArray);    
    }
    public static void main(String[] args) {
        String s = "7-HUia-45--fjI-";
	System.out.println(solution4.convertString(s, 4));
    }
}

 

