/*
[메서드 관련 정리]
Modifier (제어자): public, static
Return Type (반환 타입): 메서드가 실행된 후 반환하는 데이터 타입으로, 값을 반환하지 않는 경우 void
Parameter (매개변수): 입력 값으로, 메서드 내부에서 사용할 수 있는 변수, 필요하지 않는 경우 생략
 */

package method;

public class Method {
    public static void main(String[] args) {
        int addTest = add(1,2);
        System.out.println("출력: " + addTest);

        System.out.println("==========");

        int num = 5;
        int mulTest = mul(num);
        System.out.println("출력: " + mulTest);
        System.out.println("원본 데이터 확인: " + num);
    }

    // add 메서드 (int)
    public static int add(int a, int b) {
        System.out.println("실행: " + a + " + " + b);
        return a + b;
    }

    // 값을 반환하지 않는 메서드 (void)
    public static void hello() {
        System.out.println("Hello World");
        return; // 생략 가능
    }

    // 원본 영향 테스트
    public static int mul(int num) {
        System.out.println("실행: " + num + " * 2");
        num *= 2;
        return num;
    }

    // 메서드 오버로딩 (메서드 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩 가능: 단, 반환 타입은 인정 X)

}
