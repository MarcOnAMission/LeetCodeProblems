package LengthOfLastWord;

public class SOlution {
    public int lengthOfLastWord(String s) {
        String n = s.trim();
        int lastWordStart=0;
        for(int i=0;i<n.length()-1;i++){
            if(Character.isLetter(n.charAt(i))&&n.charAt(i-1)==' '){
                lastWordStart=i;
            }
        }
        int count=0;
        for(int i=lastWordStart;i<n.length();i++){
            count++;
        }
        return count;
    }
}
