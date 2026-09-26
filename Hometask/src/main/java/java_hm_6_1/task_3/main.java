package java_hm_6_1.task_3;

public class main {
    public static void main(String[] args) {
        Media music = new Music("My music", 4,"Ocean Elsi");
        Media video = new Video("My video", 10, "1980x1080");

        music.play();
        video.play();
    }
}
