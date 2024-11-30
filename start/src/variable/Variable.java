package variable;

public class Variable {
    public static void main(String[] args) {
        // 정수
        byte b = 123; // 1byte(2^8): -128 ~ 127
        short s = 32767; // 2byte(2^16): -32,768 ~ 32,767
        int i = 2147483647; // 4byte(2^32): -2,147,483,648 ~ 2,147,483,647
        long l = 9223372036854775807L; // 8byte(2^64): -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        float f = 3.14f; // 4byte(2^32): 대략 -3.4E38 ~ 3.4E38, 7자리 정밀도
        double d = 3.14; // 8byte(2^64): 대략 -1.7E308 ~ 1.7E308, 15자리 정밀도

        // 기타
        boolean bool = true; // 1byte(2^8): ture, false
        char c = 'c'; // 1byte(2^8): 문자 하나
        String str = "str"; // 문자열

        // 결합 테스트
        System.out.println(b + s + i + l + f + d);
        System.out.println(c + str);
        System.out.println(bool);
    }
}
