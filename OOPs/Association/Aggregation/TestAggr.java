package OOPs.Association.Aggregation;
class MusicPlayer{
    private String name;
    public MusicPlayer(String name){
        this.name=name;
    }

    public void start(){
        System.out.println("Music Player Started......");
    }

    public void stop(){
        System.out.println("Music Player Stopped.......");
    }
}
class Car {
    private  String name;
    private final MusicPlayer musicPlayer;
    public Car(String name,MusicPlayer musicPlayer){
        this.name=name;
        this.musicPlayer=musicPlayer;
    }
    public String getName(){
        return this.name;
    }

    public void StartPlayer(){
        musicPlayer.start();
    }
    public void StopPlayer(){
        musicPlayer.stop();
    }
}

public class TestAggr {
    static void main() {
        MusicPlayer musicPlayer=new MusicPlayer("Sony");

        Car brezza=new Car("Brezza",musicPlayer);
        System.out.println("Car is:"+brezza.getName());
        brezza.StartPlayer();
        brezza.StopPlayer();
    }
}
