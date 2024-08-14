package ex02;

public class DoormanProxy {

    private Doorman doorman;

    public DoormanProxy(Doorman doorman) {
        this.doorman = doorman;
    }

    public void getOut(Animal a){
        System.out.println("꺄아악~~!!");

        doorman.getOut(a);
    }
}
