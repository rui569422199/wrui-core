package personal.wrui.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(10);
		AtomicInteger integer=new AtomicInteger(0);
		int i=0;
		while (true) {
			i++;
			
			ex.execute(()->{
				System.out.println(integer.incrementAndGet());
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			if(i%100==0) {
				System.out.println("--------------"+i+"-----------------");
			}
		}
	}
}
