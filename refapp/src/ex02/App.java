package ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        String path = "/userinfo";

        UserController uc = new UserController();

        Method[] methods = uc.getClass().getDeclaredMethods();

        for (Method mt : methods) {
            Annotation anno = mt.getDeclaredAnnotation(RequestMapping.class);
            RequestMapping rm = (RequestMapping) anno;

            if (rm == null) break;

            if(rm.uri().equals(path)){
                mt.invoke(uc);
            }
        }
    }
}
