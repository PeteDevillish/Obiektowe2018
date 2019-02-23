package egz;

import java.util.List;

public class Compare {

    public static boolean compare(String s1, String s2) {
        if((s1 != null && s2==null) || (s1 == null && s2!=null)){
            //exact one is null
            return false;
        }
        if((s1 == null && s2==null) ||  s1.equals(s2)){
            //both are null or equal
            return true;
        }
        if(Math.abs(s1.length() - s2.length()) > 1){
            //A different length of more than one is more than one difference, right ?
            return false;
        }
        //Here you have two different strings. Maybe one is a character larger than the other.
        if(s1.length() != s2.length()) {
            //They differ in length, so they must be equal in the first minLen charcaters.
            int minLen = Math.min(s1.length(), s2.length());
            return s1.substring(0,minLen).equals(s2.substring(0,minLen));
        }

        //Here you have two different strings of the same length.
        int diff = 0;
        for(int i = 0; i < s1.length() && diff < 2; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                diff++;
            }
        }
        return diff < 2;
    }

    public static String compareInList(String s1,  List<String> ListOfString) {
        for (String s :
                ListOfString) {
            if (compare(s1, s)) {

                return s;}

        }
        return null;
    }
}
