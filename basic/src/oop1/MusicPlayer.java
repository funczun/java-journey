package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean playing = false;

    void on() {
        playing = true;
        System.out.println("ㅡ Music is playing");
        System.out.println(" ㄴ Volume: " + volume + "\n");
    }

    void off() {
        playing = false;
        System.out.println("ㅡ Music is stopped\n");
    }

    void volumeUp() {
        volume++;
        System.out.println("ㅡ Music volume up");
        System.out.println(" ㄴ Volume: " + volume + "\n");
    }

    void volumeDown() {
        volume--;
        System.out.println("ㅡ Music volume down");
        System.out.println(" ㄴ Volume: " + volume + "\n");
    }

    void status() {
        System.out.println("ㅡ Check the status");
        if (playing) {
            System.out.println(" ㄴ Status: On");
            System.out.println(" ㄴ Volume: " + volume + "\n");
        } else {
            System.out.println(" ㄴ Status: Off\n");
        }
    }
}
