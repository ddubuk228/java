public class Q2 {
    public static void main(String[] args) {
        TV myTv = new TV();
        myTv.ch = 100;
        myTv.vol = 50;
        myTv.onOff = true;
        System.out.println(myTv);

        TV yourTv = new TV();
        yourTv.ch = 200;
        yourTv.vol = 60;
        yourTv.onOff = false;
        System.out.println(yourTv);
    }
}

/*
    프로그램 실행 시 메소드 영역에 TV 클래스가 저장되고
    객체 myTV와 yourTV는 힙 영역에 저장된다
    객체 myTV와 yourTV의 참조 변수는 스택 영역에 저장 되어
    힙 영역의 객체를 가리킨다
 */








