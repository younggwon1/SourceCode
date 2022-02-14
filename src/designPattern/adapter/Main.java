package designPattern.adapter;

public class Main {

	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		
		Cleaner cleaner = new Cleaner();
		// 하기 connect 메서드는 Electronic110V만 매개변수로 받을 수 있다.
		// 하지만 Cleaner는 Electronic220V를 상속받았기때문에 error가 발생한다.
		// 따라서 Cleaner의 Electronic220V -> Electronic110V로 변환이 필요하다.
		// 이를 위해 Adapter 패턴을 사용한다.
		//connect(cleaner);
		
		// Adapter 패턴 사용
		Electronic110V adapterCleaner = new SocketAdapter(cleaner);
		connect(adapterCleaner);
		
		AirConditioner airConditioner = new AirConditioner();
		Electronic110V adapterAirConditioner = new SocketAdapter(airConditioner);
		connect(adapterAirConditioner);
	}
	
	public static void connect(Electronic110V electronic110V) {
		electronic110V.powerOn();
	}

}
