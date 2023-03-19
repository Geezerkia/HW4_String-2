public class Task1_S2 {

    //    String-2 > doubleChar
    //    Given a string, return a string where for every char in the original, there are two chars.
    //    doubleChar("The") → "TThhee"
    //    doubleChar("AAbb") → "AAAAbbbb"
    //    doubleChar("Hi-There") → "HHii--TThheerree"

    public static void main(String[] args) {
        System.out.println(doubleChar("Ukraine"));
    }

    public static String doubleChar(String str) {

        //Below is my code that runs well on IDEA, but it does not run on https://codingbat.com
        //showing error "cannot find symbol repeat(int)".

        if (str.length() == 0) {
            return "";

        } else {
            String strDoubleFull = str.substring(0, 1).repeat(2);

            for (int i = 1; i < str.length(); i++) {
                String strDoubleChar = str.substring(i, i + 1).repeat(2);
                strDoubleFull = strDoubleFull.concat(strDoubleChar);
            }
            return strDoubleFull;
        }
    }
}

//Below is the code that also runs well on https://codingbat.com.

//        if (str.length() == 0) {
//            return "";
//
//        } else {
//            String strDoubleFull = str.substring(0, 1) + str.substring(0, 1);
//
//            for (int i = 1; i < str.length(); i++) {
//                String strDoubleChar = str.substring(i, i + 1) + str.substring(i, i + 1);
//                strDoubleFull = strDoubleFull.concat(strDoubleChar);
//            }
//            return strDoubleFull;
//        }
//    }
//}
