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
        double double_value = 123123123.12;
        System.out.println(double_value);
    }
}
