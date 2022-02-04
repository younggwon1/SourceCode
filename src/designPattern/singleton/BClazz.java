package designPattern.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz(){
        this.socketClient = SocketClient.getInstance();
    }
    
    public SocketClient getSocketClient() {
        return socketClient;
    }

    public void setSocketClient(SocketClient socketClient) {
        this.socketClient = socketClient;
    }

}