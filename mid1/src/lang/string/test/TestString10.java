package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple, banana, cherry";

        String[] splits = fruits.split(", ");
        String joinedString = String.join("->", splits);

        for (String split : splits) {
            System.out.println(split);
        }
        System.out.println(joinedString);
    }
}
