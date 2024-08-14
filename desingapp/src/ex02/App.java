package ex02;

/**
 * 프록시 패턴, 문지기가 쥐를 쫓아내기 전에
 * 비명을 지른다. 이때 Proxy 를 통해 하게됨. 이는 OCP 를 지키며 기능 추가를 위해 사용됨
 *  Animal 생성 (abstract)
 *  타입 일치(다형성) = 쥐 (동물), 호랑이(동물)
 *  문지기한테 DIP 만 지켜주면 됨.
 */
public class App {
    public static void main(String[] args) {
       Mouse m = new Mouse(); // -> mouse, animal
       DoormanProxy doormanProxy = new DoormanProxy(new Doorman());
       // doormanProxy 가 Doorman 을 의존하고 있으므로 괄호에 Doorman 넣어야함
       doormanProxy.getOut(m);
    }
}
