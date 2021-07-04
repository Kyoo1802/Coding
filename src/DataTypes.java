public class DataTypes {
  public static void main(String[] args) {
    // Numeric types
    // 8 bits
    // _ _ _ _ _ _ _ _
    // 0/1 0/1 0/1 0/1 0/1 0/1 0/1 0/1
    // 00, 01, 02, 03, 04, 05, 06,     07, 08, 09, 10

    //  0,  1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010, 1011, 1100,1101, 1110, 1111
    // 2 para 1 bit
    // 2 para 2 bits
    // 4 para 3 bits
    // 8 para 4 bits
    // 16 para 5 bits
    // 32 para 6 bits
    // 64 para 7 bits
    // 128 para 8 bits
    //  _,  _, __, __, ___,....                      , ____
    byte byte_value_1 = 125;
    System.out.println(byte_value_1);

    // 16 bits
    short short_value = 12123;
    System.out.println(short_value);

    // 32 bits
    int int_value = 12312312;
    System.out.println(int_value);

    // 64 bits
    long long_value = 12312312312312L;
    System.out.println(long_value);

    // 32 bits
    float float_value = 213.12f;
    System.out.println(float_value);

    // 64 bits
    //  ___ _ __ _ __ _ _ __ _101 _ _ _ 1 0
    //  ___ _ __ _ __ _ _ __ _101 1 _ _ 1 0
    // Base _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _
    double double_value = 123123123.12;
    System.out.println(double_value);

    // Char
    // 16 bits
    // _ _ _ _ _ _ _ _
    char c1 = 's';
    char c2 = 116; // t  decimal unicode
    char c3 = 0x0074; // t hexadecimal unicode
    System.out.println("Chars:");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    // String
    // ??
    String text = null;
    String textI = new String("Hola Mundo!");
    String text0 = ""; // 16 bits
    String text1 = "Hola Mundo!"; // 16 bits * 11
    String text2 = "12312";
    String text3 = "123.12312 Hola Mundo! 213";
    String text4 = "Rosa 78211278123 Poza Rica 30";

    // boolean
    // 1 bit, 8 bit.
    boolean isMexican = true;
    boolean isNotNumeric = false;

    int a=123;
    boolean b;
    b=false;
    String text00;
  }
}
