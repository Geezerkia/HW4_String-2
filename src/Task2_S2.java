public class Task2_S2 {

    //    String-2 > bobThere
    //    Return true if the given string contains a "bob" string, but where the middle 'o' char
    //    can be any char.
    //    bobThere("abcbob") → true
    //    bobThere("b9b") → true
    //    bobThere("bac") → false

    public static void main(String[] args) {
        System.out.println(bobThere("b12b1b"));
    }

    public static boolean bobThere(String str) {

        if (str.length() < 3) {
            return false;
        } else {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b') {
                    if (str.charAt(i + 2) == 'b') {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
