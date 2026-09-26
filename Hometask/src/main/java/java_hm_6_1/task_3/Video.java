package java_hm_6_1.task_3;

public class Video extends Media {
    String resolution;
    public Video(String title, int duraction, String resolution){
        super(title, duraction);
        this.resolution = resolution;
    }
    @Override
    public void play(){
        System.out.println("Video is playing " + title + " at a resolution of " + resolution);

    }
}
