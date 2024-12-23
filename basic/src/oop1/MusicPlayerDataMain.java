package oop1;

public class MusicPlayerDataMain {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.playing = true;
        System.out.println("[System] Turn On the Music Player.");
    }

    static void off(MusicPlayerData data) {
        data.playing = false;
        System.out.println("[System] Turn Off the Music Player.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("> Volume: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("> Volume: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("[System] Check the status.");
        if (data.playing) {
            System.out.println("ㄴ Status: On\nㄴ Volume: " + data.volume);
        } else {
            System.out.println("Status: Off");
        }
    }
}
