//
// PROGRAMMINI IN JAVA
//
// Author:  Alessandro Brusò
// Date:    05 Nov 2017
// Version: 1.0
//

public class Main {

    /*******************************
     *
     *   PROGRAMMINI SULLE STRINGHE
     *
     *******************************/

    // reverse
    // scopo:  restituisce la stringa in input al contrario
    // input:  una stringa s
    // output: una nuova stringa dove i caratteri sono invertiti
    //         rispetto a s
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // test_reverse
    // scopo: testare il reverse di una stringa
    public static void test_reverse() {
      String s = "Ciao";
      System.out.println("original: " + s);
      System.out.println("reverse:  " + reverse(s));
    }

    // main
    public static void main(String args[]) {
      test_reverse();
    }

}
