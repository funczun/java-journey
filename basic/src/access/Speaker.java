package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("[FAIL] You are over 100%");
        } else {
            volume += 10;
            System.out.println("-> You are now " + volume);
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("[FAIL] You are under 0%");
        } else {
            volume -= 10;
            System.out.println("-> You are now " + volume);
        }
    }

    void showVolume() {
        System.out.println("Volume: " + volume);
    }
}
