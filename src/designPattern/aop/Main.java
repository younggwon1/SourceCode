package designPattern.aop;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

	public static void main(String[] args) {
		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();
		AopProxy aopProxy = new AopProxy("www.naver.com", 
				() -> {
					System.out.println("before");
					start.set(System.currentTimeMillis());
				}, 
				() -> {
					long now = System.currentTimeMillis();
					System.out.println("before");
					end.set(now - start.get());
				}
			);
		
		try {
			aopProxy.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(end.get());
		
	}

}
