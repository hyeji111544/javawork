package ex00;

class Minji {
    // new 할 때 뜸. 왜냐 static 이 아니라서 즉 heap 에 할당
    private int 목마름;

    public Minji(int 목마름) {
        this.목마름 = 목마름;
    }

    //setter : 상태 변경 set배고픔 보다 물마시기가 의도를 확인하기 좋음
    void 물마시기(){
        목마름 = 0;
    }

    //getter : 상태확인
    int 목마르니(){
        return 목마름;
    }
}

public class Mem01 {

    static void hello(){
        int num = 10;  // 실행되면 stack 에 hello 생성되고 라인 종료시 사라짐
    }


    public static void main(String[] args) {
        Minji obj = new Minji(100); // 여기서 heap 영역에 동적 할당. 메인 stack 의 obj 가 주소를 가르킴
        //Minji obj2 = new Minji(200);

        // 1. 값 변경(행위)
        obj.물마시기();

        // 2. 값 확인
        int 목마름 = obj.목마르니();
        System.out.println(목마름);
    }
}
