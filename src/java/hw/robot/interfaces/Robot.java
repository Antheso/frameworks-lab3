package hw.robot.interfaces;

public interface Robot {

    void setHead(Head head);
    void setBody(Body body);
    void setRightHand(Limb rightHand);
    void setLeftHand(Limb leftHand);
    void setRightLeg(Limb rightLeg);
    void setLeftLeg(Limb leftLeg);
    void aliveImitation();

}
