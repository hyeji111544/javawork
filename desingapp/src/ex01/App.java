package ex01;

/**
 *  Animal 생성 (abstract)
 *  타입 일치(다형성) = 쥐 (동물), 호랑이(동물)
 *  문지기한테 DIP 만 지켜주면 됨.
 */
public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Tiger t1 = new Tiger();
        Doorman d1 = new Doorman();
        // m1,t1,d1 이 힙에 올라감

        d1.getOut(m1);
        d1.getOut(t1);
    }
}
