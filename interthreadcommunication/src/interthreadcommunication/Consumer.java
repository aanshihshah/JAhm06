package interthreadcommunication;

public class Consumer implements Runnable {
	
Q q;
	
	
	public Consumer(Q q) {
		 
		this.q = q;
		
		Thread t = new Thread(this,"Consumer");
		t.start();
	}


	@Override
	public void run() {
		
		@SuppressWarnings("unused")
		int i=0;
		while(true) {
			
			q.getNum();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


}
