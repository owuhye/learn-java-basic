package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

     void showStatus(MusicPlayerData data) {
         System.out.println("음악 플레이어 상태 확인");
         if (data.isOn) {
             System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
         } else {
             System.out.println("음악 플레이어 OFF");
         }
     }
}
