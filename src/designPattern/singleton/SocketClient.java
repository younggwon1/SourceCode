package designPattern.singleton;

public class SocketClient {

	// 자기 자신을 객체로 가지고 있어야한다.
    private static SocketClient socketClient = null;

    // default 생성자 막기
    private SocketClient(){}

    // static을 통해서 getInstance() 메서드를 제공
    public static SocketClient getInstance(){

    	// 객체가 null인지 아닌지 확인
    	// null인 경우에는 인스턴스 생성
        if(socketClient == null){
            socketClient = new SocketClient();
            System.out.println("socket new instance");
        }

        return socketClient;
    }

    public void connect(){
        System.out.println("socket");
    }

}