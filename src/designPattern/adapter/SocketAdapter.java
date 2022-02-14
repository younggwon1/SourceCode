package designPattern.adapter;

// Adapter 패턴 생성
// 해당 Adapter는 Electronic110V로 들어갈 것이기 때문에 implements Electronic110V를 해준다.
// 자기 자신이 연결시켜줘야할 Electronic220V를 가지고 있어야한다.
public class SocketAdapter implements Electronic110V {

    private Electronic220V electronic220V;

    // 디폴트 생성자에서 Electronic220V를 받을 수 있도록 설정
    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    // Electronic110V에 Electronic220V가 할당됐을 때 Electronic220V의 connect를 호출
    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}