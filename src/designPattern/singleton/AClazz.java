package designPattern.singleton;

public class AClazz {

    private SocketClient socketClient;
    
    public AClazz(){
        this.socketClient = SocketClient.getInstance();
    }
    
    public SocketClient getSocketClient() {
        return socketClient;
    }

    public void setSocketClient(SocketClient socketClient) {
        this.socketClient = socketClient;
    }

}