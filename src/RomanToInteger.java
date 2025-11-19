import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> valuesMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int date = 0;
        int previous = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            int value = valuesMap.get(s.charAt(i));
            if(previous==0){
                date+=value;
            }else{
                if(value<previous){
                    date-=value;
                }
                else{
                    date+=value;
                }
            }
            previous=value;
            i--;
        }
        return date;
    }
}