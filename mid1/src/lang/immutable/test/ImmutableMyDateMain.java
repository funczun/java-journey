package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2025,1,16);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("17 -> date1");
        date1 = date1.withDay(17);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
