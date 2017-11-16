//
// PROGRAMMINI IN JAVA
//
// Author:  Alessandro Brusò
// Date:    16 Nov 2017
// Version: 1.0
//

public class Main {

    /*******************************
     *
     *   PROGRAMMINI SUGLI INTERI
     *
     *******************************/

    // absolute - valore assoluto
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

    // square
    // scopo:  calcolare il quadrato di un numero
    // input:  un intero n
    // output: n^2 
    public static int square(int n) {
      return n * n;
    }

    // square
    // scopo:  calcolare il cubo di un numero
    // input:  un intero n
    // output: n^3
    public static int cube(int n) {
      return n * n * n;
    }

    // factorialRecursive - versione ricorsiva del fattoriale
    // scopo:       restituisce il fattoriale dell'intero in input
    // definizione: 0! = 1, n! = n(n-1)! se n > 0
    // input:       un intero n
    // output:      n!
    public static int factorialRecursive(int n) throws IllegalArgumentException {
      if (n < 0)
        throw new IllegalArgumentException("Parametro n non valido");
      return n == 0 ? 1 : n * factorialRecursive(n-1);
    }

    // factorial - versione iterativa del fattoriale
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

    // isNegative
    // scopo:  stabilire se il numero in input è negativo
    // input:  un intero n
    // output: restiuisce true se l'intero in input è negativo, false altrimenti
    public static boolean isNegative(int n) {
      return n < 0;
    }

    // isNegativeOrZero
    // scopo:  stabilire se il numero in input è negativo o uguale a 0
    // input:  un intero n
    // output: restiuisce true se l'intero in input <=, false altrimenti
    public static boolean isNegativeOrZero(int n) {
      return n <= 0;
    }

    // isPositive
    // scopo:  stabilire se il numero in input è positivo
    // input:  un intero n
    // output: restiuisce true se l'intero in input è positivo, false altrimenti
    public static boolean isPositive(int n) {
      return n > 0;
    }

    // isPositiveOrZero
    // scopo:  stabilire se il numero in input è positivo o uguale a 0
    // input:  un intero n
    // output: restiuisce true se l'intero in input >=, false altrimenti
    public static boolean isPositiveOrZero(int n) {
      return n >= 0;
    }
    
    // isPrime - è un numero primo
    // scopo:       stabilire se un numero è primo
    // definizione: un intero > 1 è primo se è divisibile
    //              solo per 1 e per sé stesso
    // input:       un intero n
    // output:      restituisce true se l'intero in input è un numero primo,
    //              false altrimenti
    public static boolean isPrime(int n) {
        // numeri negativi, 0, 1 non sono primi
        // numeri pari non sono primi, eccetto 2
        if ((n < 2) || (n % 2 == 0))
          return n == 2;
        // cerco i divisori tra i numeri dispari
        // fino a raggiungere la metà di n
        int half = n / 2;
        for (int i = 3; i < half; i += 2)
          if (n % i == 0)
            return false;
        return true;
    }
    
    // test_isPrime
    // scopo: testare se dei numeri sono primi
    public static void test_isPrime() {
      System.out.println("NUMERI PRIMI\n");
      System.out.print("Sono primi: "); 
      for (int i = -1; i <= 20; i++)
        System.out.print((isPrime(i) ? " " + i : ""));
      System.out.println();
    }

    // SquareRoot - Radice quadrata intera
    // scopo:  calcola la radice quadrata intera di un intero in input
    // input:    un intero x sul quale calcolare la radice quadrata intera
    // output: restituisce la radice quadrata, arrotondata per difetto, dell'intero x in input
    //               restituisce -1 se l'intero x in input è negativo
    public static int squareRoot(int x) throws IllegalArgumentException {
      if (x < 0)
        throw new IllegalArgumentException("Parametro x non valido.");
      int squareRoot = 0;
      while (squareRoot * squareRoot <= x)
        squareRoot++;
      return --squareRoot;
    }

    // test_squareRoot
    // scopo: testare se dei numeri sono primi
    public static void test_squareRoot() {
      System.out.println("RADICE QUADRATA INTERA\n");
      for (int i = 0; i <= 16; i++) {
        String response = String.format("Radice quadrata (%d): %d", i, squareRoot(i));
        System.out.println(response);
      }
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

    // isPalindrome
    // scopo:  dire se la stringa in input è palindroma
    //         Una stringa palindroma è una sequenza di caratteri identica
    //         se letta da sinistra verso destra oppure da destra verso sinistra
    // input:  una stringa s
    // output: true se la stringa in input è palindroma, false altrimenti
    // nota:   vengono ignorati gli spazi e
    //         la differenza tra lettere maiuscole e minuscole
    public static boolean isPalindrome(String s) {
        String ss = s.replaceAll("\\s+","");
        String reverse = new StringBuilder(ss).reverse().toString();
        return ss.equalsIgnoreCase(reverse);
    }

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
    // output: una nuova stringa simile alla stringa in input
    //         dove tutti i caratteri sono minuscoli
    public static String toLowerCase(String s) {
        return new String(s).toLowerCase();
    }

    // toUpperCase
    // scopo:  restituisce la stringa in input in maiuscolo
    // input:  una stringa s
    // output: una nuova stringa simile alla stringa in input
    //         dove tutti i caratteri sono maiuscoli
    public static String toUpperCase(String s) {
        return new String(s).toUpperCase();
    }
    
    // test_string
    // scopo: testare le funzionalità sulle stringhe
    public static void test_string() {
      System.out.println("TEST di una stringa\n");
      String s = "ECCO GELARE NELLA VALLE NERA LE GOCCE";
      System.out.println("Original:   " + s);
      System.out.println("Palindrome: " + (isPalindrome(s) ? "si" : "no"));
      System.out.println("Reverse:    " + reverse(s));
      System.out.println("Lowercase:  " + toLowerCase(s));
      System.out.println("Uppercase:  " + toUpperCase(s));
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
      System.out.println();
      test_isPrime();
      System.out.println();
      test_squareRoot();
      System.out.println("\n");
      System.out.println("STRINGHE\n\n"); 
      test_string();
    }

}