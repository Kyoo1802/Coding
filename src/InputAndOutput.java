import java.util.Scanner;

public class InputAndOutput {
  public static void main(String[] args) {
    System.out.println("askdmlkasmdla");
    Scanner in = new Scanner(System.in);

    //    System.out.println("Escribe una linea:");
    //    String txt = in.nextLine();
    //    System.out.println("Tu texto es: " + txt);

    //    System.out.println("Ingresa un entero:");
    //    int intA = in.nextInt();
    //    System.out.println("Tu entero es: " + intA);
    //
    //        System.out.println("Ingresa un entero largo:");
    //        long longB = in.nextLong();
    //    System.out.println("Tu entero es: " + longB);

    //      System.out.println("Ingresa un double:");
    //      double doubleA = in.nextDouble();
    //      System.out.println("Tu double es: " + doubleA);
    //
    //    System.out.println("Ingresa un boolean:");
    //    boolean booleanA = in.nextBoolean();
    //    System.out.println("Tu double es: " + booleanA);

//    System.out.println("Ingresa un string:");
//    String word1 = in.next();
//    System.out.println("Tu palabra1 es: " + word1);
//    String word2 = in.next();
//    System.out.println("Tu palabra2 es: " + word2);
//    String word3 = in.nextLine();
//    System.out.println("Tus palabras restantes son: " + word3);


      System.out.println("Ingresa un string:");
      int wordI1 = in.nextInt();
      System.out.println("Tu palabra1 es: " + wordI1);
      double wordD2 = in.nextDouble();
      System.out.println("Tu palabra2 es: " + wordD2);
      String wordL3 = in.nextLine();
      System.out.println("Tus palabras restantes son: " + wordL3.trim());
  }
}
