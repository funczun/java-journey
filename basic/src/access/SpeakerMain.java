package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker sp = new Speaker(90);
        sp.showVolume();

        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // sp.volume = 200;
        sp.showVolume();
    }
}
