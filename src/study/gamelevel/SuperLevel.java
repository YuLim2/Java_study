package gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("고수: 와다다다ㅏ다");
    }

    @Override
    public void jump() {
        System.out.println("고수: 폴짝~!");
    }

    @Override
    public void turn() {
        System.out.println("고수: 부웅");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고수");
    }
}
