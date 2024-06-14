package interthreadcommunication;

public class Producer implements Runnable {
Q q;

	
	public Producer(Q q) {
	
	this.q = q;
	
	Thread t = new Thread(this,"Producer");
	t.start();
}


	@Override
	public void run() {
	int i=0;	
	while(true) {
		q.setNum(i++);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}


}
