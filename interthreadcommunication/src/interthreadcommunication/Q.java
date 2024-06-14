package interthreadcommunication;

public class Q {
	int num;
    boolean valueSet = false;
	public  synchronized void getNum() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get = " + num);
		valueSet=false;
		notify();
	}

	public synchronized void setNum(int num) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("set = " + num);
		this.num = num;
		valueSet=true;
		notify();
	}
	
}
