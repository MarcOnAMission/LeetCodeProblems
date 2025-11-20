package LongIntPlusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++;
            }
        }
        if(digits[0]!=10){
            return digits;
        }else{
            int[] auxArray = new int[digits.length+1];
            auxArray[0]=1;
            digits[0]=0;
            for(int i=1;i<auxArray.length;i++){
                auxArray[i]=digits[i-1];
            }
            return auxArray;
        }

    }
}
