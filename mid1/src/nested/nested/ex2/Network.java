package nested.nested.ex2;

public class Network {

    public void sendMessage(String message) {
        NetworkMessage msg = new NetworkMessage(message);
        msg.print();
    }

    private static class NetworkMessage {

        private final String message;

        private NetworkMessage(String message) {
            this.message = message;
        }

        private void print() {
            System.out.println(message);
        }
    }
}
