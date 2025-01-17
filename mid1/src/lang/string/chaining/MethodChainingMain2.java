package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        int result = valueAdder.add(1).add(2).add(3).getValue(); // 메서드 체이닝
        System.out.println("result = " + result);
    }
}
