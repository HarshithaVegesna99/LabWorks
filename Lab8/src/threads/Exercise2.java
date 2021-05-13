package threads;
import java.util.Date;
/**Write a thread program to display timer where timer will get refresh after every 10seconds.( Use Runnable implementation )
 * @author Vegesna.Harshitha
 *
 */
class MyThread implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println(new Date());
			try {
				Thread.sleep(10000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Exercise2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		t1.start();
	}
 
}