package nested.nested.ex1;

public class NetworkMessage {

    private final String text;

    public NetworkMessage(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }
}
