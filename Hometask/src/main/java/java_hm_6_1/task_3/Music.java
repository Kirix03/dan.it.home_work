package java_hm_6_1.task_3;

public class Music extends Media{
    String artist;
    public Music(String title, int duraction, String artist){
        super(title, duraction);
        this.artist = artist;
    }

    @Override

    public void play(){
        System.out.println("Music is playing " + artist + ":" + title);
    }

}
