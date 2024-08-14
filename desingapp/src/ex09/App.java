package ex09;

/**
 * 스트링 빌더 패턴
 */
public class App {
    public static void main(String[] args) {
        Person p1 = Person.builder().id(1).name("홍길동");
        System.out.println(p1.getAge());

    }
}
