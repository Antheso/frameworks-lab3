package hw.robot;

import hw.robot.interfaces.Body;
import hw.robot.interfaces.Head;
import hw.robot.interfaces.Limb;
import hw.robot.interfaces.Robot;

public class MyRobotT1000 implements Robot {

    private Head head;
    private Body body;
    private Limb rightLeg;
    private Limb leftLeg;
    private Limb rightHand;
    private Limb leftHand;

    @Override
    public void setHead(Head head) {
        this.head  = head;
    }

    @Override
    public void setBody(Body body) {
        this.body  = body;
    }

    @Override
    public void setRightLeg(Limb rightLeg) {
        this.rightLeg  = rightLeg;
    }

    @Override
    public void setLeftLeg(Limb leftLeg) {
        this.leftLeg  = leftLeg;
    }

    @Override
    public void setRightHand(Limb rightHand) {
        this.rightHand  = rightHand;
    }

    @Override
    public void setLeftHand(Limb leftHand) {
        this.leftHand  = leftHand;
    }

    @Override
    public void aliveImitation() {
        this.head.think();
        this.body.charge();
        this.leftHand.move();
        this.rightHand.move();
        this.leftLeg.move();
        this.rightLeg.move();
    }

}
