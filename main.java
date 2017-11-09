//
// PROGRAMMINI IN JAVA
//
// Author:  Alessandro Brusò
// Date:    09 Nov 2017
// Version: 1.0
//

public class Main {

    /*******************************
     *
     *   PROGRAMMINI SUGLI INTERI
     *
     *******************************/

     // fattoriale
     // scopo: restituisce il fattoriale dell'intero in input
     // input: un intero n
     // output: n!
     public static int factorial(int n) throws IllegalArgumentException {
       if (n < 0)
         throw new IllegalArgumentException("Parametro n non valido");
       int f = 1;
       while (n > 1) {
         f = f * n;
         n--;
       }
       return f;
     }

    // test_factorial
    // scopo: testare il fattoriale di un numero
    public static void test_factorial() {
      System.out.println("FATTORIALE di un intero\n\n");
      for (int i = 0; i <= 10; i++)
        System.out.println("Fattoriale(" + i + ") = " + factorial(i));
    }


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
      System.out.println("REVERSE di una stringa\n\n");
      String s = "Ciao";
      System.out.println("original: " + s);
      System.out.println("reverse:  " + reverse(s));
    }

    // main
    public static void main(String args[]) { 
      test_reverse();
      System.out.println();
      test_factorial();
    }

}
