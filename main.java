public class Main {

    /*******************************
     *
     *   PROGRAMMINI SULLE STRINGHE
     *
     *******************************/

    // reverse
    // scopo:  restituisce la stringa in input al contrario
    // input:  una stringa s
    // output: la stringa s con i caratteri invertiti
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String args[]) {
      String s = "Ciao";
      System.out.println("original: " + s);
      System.out.println("reverse:  " + reverse(s));
    }

}
