public class day1_3 {
    public static void main(String[] args)
    {
        final int score = 100;

        // score = 200; score는 상수가 되었기에 에러 발생

        System.out.println(score);

        //--------------------
        byte b = 127; // -128~127
        int oct = 010; //8진수, 10진수로 8
        int hex = 0x10; //16진수, 10진수로 16
        long l = 10_000_000_000L;
        float f = 3.14f;
        double d = 3.14f;

        char ch = 'A';
        int i = 'A';

        String str = ""; // 빈 문자열(empty string)
        String str1 = "ABCD";
        String str2 = "123";
        String str3 = str1 + str2;
        System.out.println(str3);
    }
}
