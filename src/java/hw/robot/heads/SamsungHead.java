package hw.robot.heads;

import hw.robot.interfaces.Head;

public class SamsungHead implements Head {

    @Override
    public  void think() {
        System.out.println("Samsung head is thinking...");
    }

}
