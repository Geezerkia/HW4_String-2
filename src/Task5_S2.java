public class Task5_S2 {

//    String-2 > countHi
//    Return the number of times that the string "hi"
//    appears anywhere in the given string.
//    countHi("abc hi ho") → 1
//    countHi("ABChi hi") → 2
//    countHi("hihi") → 2

    public static void main(String[] args) {
        System.out.println(countHi("hihi"));
    }

    public static int countHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                counter++;
            }
        }
        return counter;
    }
}
