package ex05;

import ex05.teacher.HTMLTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;

/**
 * 템플릿 : 반복적인 작업을 간편하게 하기 위해 미리 정의된 틀이나 형식
 */
public class App {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        jt.수업하기();

        PythonTeacher pt = new PythonTeacher();
        pt.수업하기();

        HTMLTeacher htt = new HTMLTeacher();
        htt.수업하기();
    }
}
