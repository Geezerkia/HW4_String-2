public class Task4_S2 {

//    String-2 > catDog
//    Return true if the string "cat" and "dog" appear the same number
//    of times in the given string.
//    catDog("catdog") → true
//    catDog("catcat") → false
//    catDog("1cat1cadodog") → true

    public static void main(String[] args) {
        System.out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str) {
        int counterCat = 0;
        int counterDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                counterCat++;
            } else if (str.startsWith("dog", i)) {
                counterDog++;
            }
        }
        return counterCat == counterDog;
    }
}
