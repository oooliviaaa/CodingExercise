package yaolin_small_tests;

public class cast_test_thread implements Runnable{
	
	private String command;
	
	public cast_test_thread(String command) {
		this.command = command;
	}
	
	public void run() {
		
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
	}
	
}
