package oop1;

public class MusicPlayerFinal {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        // 음악 재생기 켜기
        mp.on();

        // 볼륨 증가
        mp.volumeUp();

        // 볼륨 감소
        mp.volumeDown();

        // 음악 재생기 상태
        mp.status();

        // 음악 재생기 끄기
        mp.off();
    }
}
