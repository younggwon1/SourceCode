package designPattern.proxy;

public class Main {

	public static void main(String[] args) {
		Browser browser = new Browser("www.naver.com");
		browser.show();
		// 계속적으로 show()를 호출하게 되면 다음과 같이 호출이 된다.
		// 캐시 기능이 전혀 없는 상태이다.
		// 따라서 Proxy Pattern을 사용하여 캐시 기능을 구현한다.
		
		/**
		 * browser.show();
		   browser.show();
		   browser.show();
		
		 * Browser loading html from : www.naver.com
		   Browser loading html from : www.naver.com
           Browser loading html from : www.naver.com
		   Browser loading html from : www.naver.com
		 */
		
		
		BrowserProxy browserProxy =new BrowserProxy("www.naver.com");
		browserProxy.show();
		/**
		 * browserProxy.show();
		   browserProxy.show();
		   browserProxy.show();
		   browserProxy.show();
		
		 * BrowserProxy loading html from : www.naver.com
		   BrowserProxy use cache html
           BrowserProxy use cache html
           BrowserProxy use cache html
           BrowserProxy use cache html
		 */
		
		
		
	}

}
