package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        BatchProcessor bp = new BatchProcessor(new MyArrayList<>());
        bp.logic(50_000); // 3700ms

        bp = new BatchProcessor(new MyLinkedList<>());
        bp.logic(50_000); // 4ms
    }
}
