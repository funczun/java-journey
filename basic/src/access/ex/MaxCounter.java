package access.ex;

public class MaxCounter {
    // 속성 모두 숨김
    private int count = 0;
    private int max = 0;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("Max counter exceeded");
            return; // 빠져나옴
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
