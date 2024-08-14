package ex04;

public class Doorman {
    // jvm 이 static 을 찾아서 바로 실행시킴.(얘는 변수) main 이 시작되기 전에 떠있게됨.
    // static Doorman 은 static 에 떠있게 되고(static=클래스마다 존재) , Doorman(new Doorman 한거) 은 heap 에 있음.
    public static Doorman instance = new Doorman();

    // 메서드를 하나 만듬
    /*
    public static Doorman getInstance() {
        return doorman;
    }

     */

    private Doorman(){}
    // 동물 출입 금지
    public void getOut(Animal a){
        System.out.println(a.getName()+"getOut!");
    }


}
