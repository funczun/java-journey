package generic.test;

public class ContainerTest {

    public static void main(String[] args) {

        Container<String> stringContainer = new Container<>();
        checkData(stringContainer);

        stringContainer.setItem("data1");
        displayData(stringContainer);
        checkData(stringContainer);

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        displayData(integerContainer);
    }

    static void displayData(Container container) {
        System.out.println("저장 데이터: " + container.getItem());
    }

    static void checkData(Container container) {
        System.out.println("빈 값 확인: " + container.isEmpty());
    }
}
