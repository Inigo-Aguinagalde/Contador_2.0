package Contador_2.O;



public class Contenedor<T> {

	private T data;

	public Contenedor() {
		data=null;
	}

	public T getData(String hiloID) {
		synchronized (this) {
			while(data==null) {
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.printf("%s extrayendo container %s \n",hiloID,data);

			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			notifyAll();
		}
		return data;
	}

	public synchronized void setData(T data,String hiloID) {
		while(data==null) {
			try {
				wait();
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		System.out.printf("%s ha producido %s",hiloID,data);

		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		this.data=data;
		notifyAll();
	}

}
