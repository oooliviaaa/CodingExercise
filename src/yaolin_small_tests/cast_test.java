package yaolin_small_tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class cast_test implements Runnable {

	public void run() {
		int count = 0;
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		executor.execute(new cast_test_thread(String.valueOf(count++)));
		System.out.println("hit 1 === executor isinstance of ExecutorService: " + String.valueOf(executor instanceof ExecutorService));
		
		cast_test s = new cast_test();
		int num = s.helper(executor);
		
		System.out.println("hit 2 === executor isinstance of ExecutorService: " + String.valueOf(executor instanceof ExecutorService));

	}
	
	private int helper(ExecutorService executor) {
		int num_exe = ((ThreadPoolExecutor) executor).getActiveCount();
		System.out.println("num_exe is " + String.valueOf(num_exe)); 
		return num_exe;
	}
}
