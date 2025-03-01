package generic.ex1;

public class BoxMain {

    public static void main(String[] args) {
        /*
        ObjectBox box = new ObjectBox(); // 다형성 활용
        box.set("2025"); // 타입 안전성 문제 발생
        Integer year = (Integer) box.get(); // ClassCastException
        System.out.println("year = " + year);
         */

        GenericBox<Integer> box = new GenericBox<>();
        box.set(2025);
        System.out.println("year = " + box.get());
    }
}
