package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int xCopy=0;
        int xOriginal=x;
        while(xOriginal!=0){
            int c = xOriginal%10;
            xCopy=xCopy*10+c;
            xOriginal/=10;
        }
        return xCopy==x;
    }
}
