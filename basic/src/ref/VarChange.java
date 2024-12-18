package ref;

public class VarChange {
    public static void main(String[] args) {
        // new Data() 참조값 저장
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        // 동일한 참조값 출력
        System.out.println("dataA 참조값: " + dataA);
        System.out.println("dataB 참조값: " + dataB);

        // 동일한 값 출력
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value = 20;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        /*
        dataA, dataB 변수는 Data 클래스를 통해 만들었기 때문에 참조형이다.
        dataA.value, dataB.value 중 어느 한 값을 바꾸어도, 둘 다 같은 값이 출력된다.
        인스턴스를 복사한 것이 아니라, 변수에 있는 참조값을 복사하였기 때문이다.

        대원칙: 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 대입하는 것이다.
         */
    }
}
