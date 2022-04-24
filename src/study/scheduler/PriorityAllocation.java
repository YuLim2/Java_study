package scheduler;

public class PriorityAllocation implements Scheduler{
    @Override
    public void gerNextCall() {
        System.out.println("등급에 따라 상담 전화를 순서대로 대기열에서 갖고 옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬이 높은 사람에게 다음 순서에게 넘김");
    }
}
