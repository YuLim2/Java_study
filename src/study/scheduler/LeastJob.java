package scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void gerNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 갖고 옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서에게 넘김");
    }
}
