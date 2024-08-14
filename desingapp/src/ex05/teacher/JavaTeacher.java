package ex05.teacher;

public class JavaTeacher extends Teacher {
    public void 수업하기(){
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }
    public void 입장하기(){
        System.out.println("입장하기~");
    }
    public void 출석부르기(){
        System.out.println("출석부를게~");
    }
    public void 강의하기(){
        System.out.println("자바 공부를 시작할까");
    }
    public void 퇴장하기(){
        System.out.println("수업끝, 간다.");
    }
}
