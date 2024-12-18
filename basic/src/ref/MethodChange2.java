package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("before: " + dataA.value);
        changeReference(dataA);
        System.out.println("after: " + dataA.value);
    }

    public static void changeReference(Data dataX) {
        dataX.value = dataX.value + 1;
    }
}
