package Interface;

public class MusicianStudent implements Musician,Student{

    @Override
    public void speak() {
        System.out.println("I'm talking");
    }

    @Override
    public void playMusic() {
        System.out.println("I'm playing the guitar");
    }

    @Override
    public void study() {
        System.out.println("I'm studying");
    }
}
