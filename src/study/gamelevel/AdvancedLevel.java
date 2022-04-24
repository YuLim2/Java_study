package gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("중급: 와다다다ㅏ다");
    }

    @Override
    public void jump() {
        System.out.println("중급: 폴짝~!");
    }

    @Override
    public void turn() {
        System.out.println("중급: 부웅");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급");
    }
}
