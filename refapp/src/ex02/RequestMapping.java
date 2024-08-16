package ex02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //메서드 위에만 붙일 수 있다
@Retention(RetentionPolicy.RUNTIME) // 해당 깃발은 런타임시 실행됨.
public @interface RequestMapping {
    String uri(); // String 타입의 uri 를 넣을 수 있음.
}
