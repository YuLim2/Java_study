package gamelevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("초보: 와다다다ㅏ다");
    }

    @Override
    public void jump() {
        System.out.println("초보: 폴짝~!");
    }

    @Override
    public void turn() {
        System.out.println("초보: 부웅");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초보");
    }
}
