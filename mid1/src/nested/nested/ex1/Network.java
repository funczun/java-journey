package nested.nested.ex1;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage msg = new NetworkMessage(text);
        msg.print();
    }
}
