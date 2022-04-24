package scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("골라라");
        System.out.println("R");
        System.out.println("L");
        System.out.println("p");
        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }
        else if(ch == 'P' || ch == 'p'){
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("없음");
            return;
        }
        scheduler.gerNextCall();
        scheduler.sendCallToAgent();
    }
}
