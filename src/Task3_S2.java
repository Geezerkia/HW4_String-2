public class Task3_S2 {

    //    String-2 > prefixAgain
    //    Given a string, consider the prefix string made of the first N chars of the string.
    //    Does that prefix string appear somewhere else in the string?
    //    Assume that the string is not empty and that N is in the range 1..str.length().
    //    prefixAgain("abXYabc", 1) → true
    //    prefixAgain("abXYabc", 2) → true
    //    prefixAgain("abXYabc", 3) → false

    public static void main(String[] args) {
        System.out.println(prefixAgain("a", 1));
    }

    public static boolean prefixAgain(String str, int n) {

        if (str.length() == 1) {
            return false;
        } else if (str.substring(0, 1).equals(str.substring(1, 2))) {
            return true;
        } else {
            for (int i = n; i < str.length() - n; i++)
                if (str.substring(0, n).equals(str.substring(i, i + n))) {
                    return true;
                }
            return false;
        }
    }
}
