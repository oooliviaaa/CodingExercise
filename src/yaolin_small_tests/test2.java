package yaolin_small_tests;
// test on how System.currentTimeMillis() works -- Yaolin
public class test2 implements Runnable{

	public static void main(String[] args){
		new Thread(new test2()).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			long cur = System.currentTimeMillis();
			System.out.println(cur);
			
			try{
				Thread.sleep(1L);
			}catch (InterruptedException e){
				System.out.println("can't sleep");
			}
		}
	}
}
