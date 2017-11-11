//
// PROGRAMMINI IN JAVA
//
// Author:  Alessandro Brusò
// Date:    11 Nov 2017
// Version: 1.0
//

public class Main {

    /*******************************
     *
     *   PROGRAMMINI SUGLI INTERI
     *
     *******************************/

     // valore assoluto
     // scopo:       restituisce il valore assoluto dell'intero in input
     // definizione: |x| = -x se x < 0, |x| = x se x >= 0
     // input:       un intero n
     // output:      |n|
     public static int absolute(int n) throws IllegalArgumentException {
       return n < 0 ? -n : n;
     }

     // test_absolute
     // scopo: testare il valore assoluto di un intero
     public static void test_absolute() {
      System.out.println("VALORE ASSOLUTO di un numero\n");
      for (int i = -5; i <= 5; i++)
        System.out.println("Absolute(" + i + ") = " + absolute(i));
     }

     // fattoriale - versione ricorsiva
     // scopo:       restituisce il fattoriale dell'intero in input
     // definizione: 0! = 1, n! = n(n-1)! se n > 0
     // input:       un intero n
     // output:      n!
     public static int factorialRecursive(int n) throws IllegalArgumentException {
       if (n < 0)
         throw new IllegalArgumentException("Parametro n non valido");
       return n == 0 ? 1 : n * factorialRecursive(n-1);
     }

     // fattoriale - versione iterativa
     // scopo:       restituisce il fattoriale dell'intero in input
     // definizione: 0! = 1, n! = n(n-1)! se n > 0
     // input:       un intero n
     // output:      n!
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
      System.out.println("FATTORIALE di un intero\n");
      for (int i = 0; i <= 10; i++)
        System.out.println("Factorial(" + i + ") = " + factorial(i));
    }

    // toString
    // scopo: convertire l'intero in input in una stringa
    // input: un intero
    // output: la conversione dell'intero in input in una stringa
    public static String toString(int i) {
      return Integer.toString(i);
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

    // toLowerCase
    // scopo:  restituisce la stringa in input in minuscolo
    // input:  una stringa s
    // output: una nuova stringa dove i caratteri quelli della stringa in input,
    //         ma tutti minuscoli
    public static String toLowerCase(String s) {
        return new String(s).toLowerCase();
    }

    // toUpperCase
    // scopo:  restituisce la stringa in input in maiuscolo
    // input:  una stringa s
    // output: una nuova stringa dove i caratteri quelli di della stringa in input,
    //         ma tutti maiuscoli
    public static String toUpperCase(String s) {
        return new String(s).toUpperCase();
    }
    
    // test_string
    // scopo: testare le funzionalità sulle stringhe
    public static void test_string() {
      System.out.println("TEST di una stringa\n");
      String s = "Ciao";
      System.out.println("Original:  " + s);
      System.out.println("Reverse:   " + reverse(s));
      System.out.println("Lowercase: " + toLowerCase(s));
      System.out.println("Uppercase: " + toUpperCase(s));
    }

    /*******************************
     *
     *   MAIN
     *
     *******************************/

    // main
    public static void main(String args[]) {
      System.out.println("ProgramMINI in Java\n\n");
      System.out.println("NUMERI\n\n"); 
      test_absolute();
      System.out.println();
      test_factorial();
      System.out.println("\n");
      System.out.println("STRINGHE\n\n"); 
      test_string();
    }

}