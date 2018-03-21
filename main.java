//
// PROGRAMMINI IN JAVA
//
// Author:  Alessandro Brusò
// Date:    21 March 2018
// Version: 1.0
//

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.security.*;

public class Main {

    /*******************************
     *
     *   NUMBERS
     *
     *******************************/

    // absolute - valore assoluto
    // purpose:     restituisce il valore assoluto dell'intero in input
    // definition:  |x| = -x se x < 0, |x| = x se x >= 0
    // input:       un intero n
    // output:      |n|
    // error:       lancia un'eccezione se l'input n è negativo
    public static int absolute(int n) throws IllegalArgumentException {
      return n < 0 ? -n : n;
    }

    // test_absolute
    // purpose:     testare il valore assoluto di un intero
    public static void test_absolute() {
     System.out.println("VALORE ASSOLUTO di un numero\n");
     for (int i = -5; i <= 5; i++)
       System.out.println("Absolute(" + i + ") = " + absolute(i));
    }

    // square
    // purpose:     calcolare il quadrato di un numero
    // input:       un intero n
    // output:      n^2 
    public static int square(int n) {
      return n * n;
    }

    // cube
    // purpose:     calcolare il cubo di un numero
    // input:       un intero n
    // output:      n^3
    public static int cube(int n) {
      return n * n * n;
    }

    // factorialRecursive - versione ricorsiva del fattoriale
    // purpose:     restituisce il fattoriale dell'intero in input
    // definition:  0! = 1, n! = n(n-1)! se n > 0
    // input:       un intero n
    // output:      n!
    // error:       lancia un'eccezione se l'input n è negativo
    public static int factorialRecursive(int n) throws IllegalArgumentException {
      if (n < 0)
        throw new IllegalArgumentException("Parametro n non valido");
      return n == 0 ? 1 : n * factorialRecursive(n-1);
    }

    // factorial - versione iterativa del fattoriale
    // purpose:     calcolare l'n-esimo numero del fattoriale
    // definition:  0! = 1, n! = n(n-1)! se n > 0
    // input:       un intero n
    // output:      n!
    // error:       lancia un'eccezione se l'input n è negativo
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
    // purpose:     testare il fattoriale di un numero
    public static void test_factorial() {
      System.out.println("FATTORIALE di un intero\n");
      for (int i = 0; i <= 10; i++)
        System.out.println("Factorial(" + i + ") = " + factorial(i));
    }

    // fibonacci
    // purpose:     calcolare l'n-esimo numero della serie di Fibonacci
    // input:       un intero n
    // output:      restituisce fibonacci(n)
    // error::      lancia un'eccezione se l'input n è negativo
    public static int fibonacci(int n) throws IllegalArgumentException {
      if (n < 0)
        throw new IllegalArgumentException("Parametro n non valido");
      return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2);
    }

    // isNegative
    // purpose:     stabilire se il numero in input è negativo
    // input:       un intero n
    // output:      restiutisce true se l'intero in input è negativo, false altrimenti
    public static boolean isNegative(int n) {
      return n < 0;
    }

    // isNegativeOrZero
    // purpose:     stabilire se il numero in input è negativo o uguale a 0
    // input:       un intero n
    // output:      restituisce true se l'intero in input <=, false altrimenti
    public static boolean isNegativeOrZero(int n) {
      return n <= 0;
    }

    // isPositive
    // purpose:     stabilire se il numero in input è positivo
    // input:       un intero n
    // output:      restituisce true se l'intero in input è positivo, false altrimenti
    public static boolean isPositive(int n) {
      return n > 0;
    }

    // isPositiveOrZero
    // purpose:     stabilire se il numero in input è positivo o uguale a 0
    // input:       un intero n
    // output:      restiuisce true se l'intero in input >=, false altrimenti
    public static boolean isPositiveOrZero(int n) {
      return n >= 0;
    }
    
    // isPrime - è un numero primo
    // purpose:     stabilire se un numero è primo
    // definition:  un intero > 1 è primo se è divisibile
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
    // purpose:     testare se dei numeri sono primi
    public static void test_isPrime() {
      System.out.println("NUMERI PRIMI\n");
      System.out.print("Sono primi: "); 
      for (int i = -1; i <= 20; i++)
        System.out.print((isPrime(i) ? " " + i : ""));
      System.out.println();
    }

    // SquareRoot - Radice quadrata intera
    // purpose:     calcola la radice quadrata intera di un intero in input
    // input:       un intero x sul quale calcolare la radice quadrata intera
    // output:      restituisce la radice quadrata, arrotondata per difetto, dell'intero x in input
    //              restituisce -1 se l'intero x in input è negativo
    // error:       lancia un'eccezione se l'input x è negativo
    public static int squareRoot(int x) throws IllegalArgumentException {
      if (x < 0)
        throw new IllegalArgumentException("Parametro x non valido.");
      int squareRoot = 0;
      while (squareRoot * squareRoot <= x)
        squareRoot++;
      return --squareRoot;
    }

    // test_squareRoot
    // purpose:     testare se dei numeri sono primi
    public static void test_squareRoot() {
      System.out.println("RADICE QUADRATA INTERA\n");
      for (int i = 0; i <= 16; i++) {
        String response = String.format("Radice quadrata (%d): %d", i, squareRoot(i));
        System.out.println(response);
      }
    }

    // getPrimeFactors - Fattorizzazione in numeri primi
    // purpose:     scomporre un numero in numeri primi
    // input:       un intero n
    // output:      una lista contenente la scomposizione in numeri primi di n
    // error:       lancia una eccezione se n < 2
    public static List<Integer> getPrimeFactors(int n) throws IllegalArgumentException {
      if (n < 2)
        throw new IllegalArgumentException("Input non valido.");
      
      List<Integer> list = new ArrayList<Integer>();
      int c = 2;

      while (n > 1) {
        if (n % c == 0) {
          list.add(c);
          n = n / c;
        } else c++;
      }

      return list;
    }

    // test_getPrimeFactors
    // purpose:     testare la fattorizzazione
    public static void test_getPrimeFactors() {
      int n = 1000;
      System.out.print("Scomposizione in fattori primi di " + n + ": ");
      List<Integer> list = getPrimeFactors(n);
      for (int item : list) {
         System.out.print(" " + item);
      }
      System.out.println();
    }

    // toString
    // purpose:     convertire l'intero in input in una stringa
    // input:       un intero
    // output:      la conversione dell'intero in input in una stringa
    public static String toString(int i) {
      return Integer.toString(i);
    }

    /*******************************
     *
     *   GEOMETRY
     *
     *******************************/

    // isATriangle
    // purpose:     dire se i tre lati formano un triangolo
    // input:       tre interi corrispondenti ai tre lati
    // output:      true se i tre lati formano un triangolo, false altrimenti
     public static boolean isATriangle(int a, int b, int c) {
       return (a + b > c) && (a + c > b) && (b + c > a);
     }

    // isAnEquilateralTriangle
    // purpose:     dire se i tre lati formano un triangolo equilatero
    // input:       tre interi corrispondenti ai tre lati
    // output:      true se i tre lati formano un triangolo equilatero, false altrimenti
    public static boolean isAnEquilateralTriangle(int a, int b, int c) {
      return isATriangle(a, b, c) && (a == b) && (b == c);
    }

    // isAnIsosceleTriangle
    // purpose:     dire se i tre lati formano un triangolo isoscele
    // input:       tre interi corrispondenti ai tre lati
    // output:      true se i tre lati formano un triangolo isoscele, false altrimenti
    public static boolean isAnIsosceleTriangle(int a, int b, int c) {
      return isATriangle(a, b, c) && (((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (a != b)));
    }

    // isAScaleneTriangle
    // purpose:     dire se i tre lati formano un triangolo scaleno
    // input:       tre interi corrispondenti ai tre lati
    // output:      true se i tre lati formano un triangolo scaleno, false altrimenti
    public static boolean isAScaleneTriangle(int a, int b, int c) {
      return isATriangle(a, b, c) && (a != b) && (b != c) && (c != a);
    }

    public static void test_Triangle() {
      int a = 3, b = 3, c = 3;
      if (!isATriangle(a, b, c))
        System.out.println("Questi 3 lati non formano un triangolo.");
      if (isAnEquilateralTriangle(a, b, c))
        System.out.println("I tre lati formano un triangolo equilatero.");
      if (isAnIsosceleTriangle(a, b, c))
        System.out.println("I tre lati formano un triangolo isoscele.");
      if (isAScaleneTriangle(a, b, c))
        System.out.println("I tre lati formano un triangolo scaleno.");
    }

    /*******************************
     *
     *   STRING
     *
     *******************************/

    // isAnagram
    // purpose:     dire se una stringa è l'anagramma dell'altra
    // input:       due stringhe
    // output:      true se una stringa è l'anagramma dell'altra
    static boolean isAnagram(String a, String b) {
      for (int i = 0; i < a.length(); i++) {
         char c = Character.toUpperCase(a.charAt(i));
         int countA = 0;
         int countB = 0;
         for (int j = 0; j < a.length(); j++)
            if (Character.toUpperCase(a.charAt(j)) == c)
              countA++;
         for (int j = 0; j < b.length(); j++)
            if (Character.toUpperCase(b.charAt(j)) == c)
              countB++;
         if (countA != countB)
           return false;
      }
      for (int i = 0; i < b.length(); i++) {
         char c = Character.toUpperCase(b.charAt(i));
         int countA = 0;
         int countB = 0;
         for (int j = 0; j < a.length(); j++)
            if (Character.toUpperCase(a.charAt(j)) == c)
              countA++;
         for (int j = 0; j < b.length(); j++)
            if (Character.toUpperCase(b.charAt(j)) == c)
              countB++;
         if (countA != countB)
           return false;
      }
      return true;            
    }

    // isPalindrome
    // purpose:     dire se la stringa in input è palindroma
    //              Una stringa palindroma è una sequenza di caratteri identica
    //              se letta da sinistra verso destra oppure da destra verso sinistra
    // input:       una stringa s
    // output:      true se la stringa in input è palindroma, false altrimenti
    // note:        vengono ignorati gli spazi e
    //              la differenza tra lettere maiuscole e minuscole
    public static boolean isPalindrome(String s) {
        String ss = s.replaceAll("\\s+","");
        String reverse = new StringBuilder(ss).reverse().toString();
        return ss.equalsIgnoreCase(reverse);
    }

    // reverse
    // purpose:     restituisce una nuova stringa pari alla stringa in input rovesciata
    // input:       una stringa s
    // output:      una nuova stringa dove i caratteri sono invertiti rispetto a s
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // toLowerCase
    // purpose:     restituisce una nuvoa stringa pari alla stringa in input in minuscolo
    // input:       una stringa s
    // output:      una nuova stringa simile alla stringa in input
    //              dove tutti i caratteri sono minuscoli
    public static String toLowerCase(String s) {
        return new String(s).toLowerCase();
    }

    // toUpperCase
    // purpose:     restituisce una nuvoa stringa pari alla stringa in input in maiuscolo
    // input:       una stringa s
    // output:      una nuova stringa simile alla stringa in input
    //              dove tutti i caratteri sono maiuscoli
    public static String toUpperCase(String s) {
        return new String(s).toUpperCase();
    }
    
    // test_string
    // purpose:     testare le funzionalità sulle stringhe
    public static void test_string() {
      System.out.println("TEST di una stringa\n");
      String s = "ECCO GELARE NELLA VALLE NERA LE GOCCE";
      System.out.println("Original:   " + s);
      System.out.println("Reverse:    " + reverse(s));
      System.out.println("Palindrome: " + (isPalindrome(s) ? "si" : "no"));
      System.out.println("Anagrams:   " + "cortesia" + " e " + "sciatore" + (isAnagram("cortesia", "sciatore") ? " are anagrams." : " are not anagrams."));
      System.out.println("Lowercase:  " + toLowerCase(s));
      System.out.println("Uppercase:  " + toUpperCase(s));
      test_readInt();
    }

    /*******************************
     *
     *   CRYPTOGRAPHY
     *
     *******************************/

    public static String MD5(String s) {
      try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        byte[] array = md.digest(s.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
        }
        return sb.toString();
      } catch (java.security.NoSuchAlgorithmException e) { }
      return null;
    }

    public static String SHA256(String s) {
      try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
        byte[] array = md.digest(s.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
        }
        return sb.toString();
      } catch (java.security.NoSuchAlgorithmException e) { }
      return null;
    }

    /*******************************
     *
     *   CONSOLE
     *
     *******************************/

    // readInt
    // purpose:     leggere un intero da tastiera
    // output:      l'intero letto da tastiera
    // error:       viene lanciata un'eccezione se l'input non è intero
    public static int readInt() throws Exception {
      Scanner in = new Scanner(System.in);
      if (!in.hasNextInt())
        throw new Exception("Input non valido.");
      int i = in.nextInt();
      return i;
    }

    // test_readInt
    // purpose:     testare readInt
    public static void test_readInt() {
      System.out.print("Inserisci un intero: ");
      int i;
      try {
          i = readInt();
      } catch (Exception e) {
          System.out.println("Non si tratta di un intero.");
          return;
      }
      System.out.println ("Hai inserito " + i + ".");
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
      System.out.println();
      test_getPrimeFactors();
      System.out.println();
      test_Triangle();
      System.out.println("\n");
      System.out.println("STRINGHE\n\n"); 
      test_string();
      System.out.println("MD5:     " + MD5("Ciao"));
      System.out.println("SHA-256: " + SHA256("Ciao"));
    }

}