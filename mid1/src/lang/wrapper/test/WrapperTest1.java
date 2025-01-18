package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {

        // 1번
        String str1 = "10";
        String str2 = "20";
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));

        // 2번
        String[] arr = {"1.5", "2.5", "3.0"};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Double.parseDouble(arr[i]);
        }
        System.out.println(sum);

        //3번
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        int intValue = integer1.intValue();
        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
    }
}
