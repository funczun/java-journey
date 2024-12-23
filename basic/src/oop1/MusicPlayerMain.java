package oop1;

public class MusicPlayerMain {
    public static void main(String[] args) {
        int volume = 0;
        boolean playing = false;

        // 음악 플레이어 켜기
        playing = true;
        System.out.println("[System] Turn On the Music Player.");

        // 볼륨 증가
        volume++;
        System.out.println("Volume: " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("Volume: " + volume);

        // 음악 플레이어 상태
        System.out.println("[System] Check the status.");
        if (playing) {
            System.out.println("Status: On\nVolume: " + volume);
        } else {
            System.out.println("Status: Off");
        }

        // 음악 플레이어 끄기
        playing = false;
        System.out.println("[System] Turn Off the Music Player.");
    }
}
