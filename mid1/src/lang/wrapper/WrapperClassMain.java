package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInt = new Integer(10); // 사용 지양
        Integer IntObj = Integer.valueOf(10); // -128 ~ 127 재사용, 불변

        System.out.println("newInt = " + newInt);
        System.out.println("IntObj = " + IntObj);

        Integer IntObj1 = Integer.valueOf(10);
        Integer IntObj2 = Integer.valueOf(10);
        Integer IntObj3 = Integer.valueOf(1000);
        Integer IntObj4 = Integer.valueOf(1000);
        
        System.out.println(IntObj1 == IntObj2); // IntegerCache
        System.out.println(IntObj3 == IntObj4);
    }
}
