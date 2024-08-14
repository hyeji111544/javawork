package ex04;

/**
 *  싱글톤 패턴
 */
public class App {
    public static void main(String[] args) {
        Doorman d1 = Doorman.instance;
        Doorman d2 = Doorman.instance;

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}
