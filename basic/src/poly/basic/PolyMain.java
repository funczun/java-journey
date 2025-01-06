package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println(" ");

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();

        System.out.println(" ");

        // 부모 변수가 자식 인스턴스 참조
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모는 자식 담기 가능
        poly.parentMethod(); // 자식의 기능은 호출 불가능
    }
}
