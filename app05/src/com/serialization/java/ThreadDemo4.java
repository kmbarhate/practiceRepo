//Program using synchronized blocks
package com.serialization.java;

class T {
	void t() {

		System.out.println("before the synchornized block " + Thread.currentThread().getName());
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Inside the  synchronization blocks " + Thread.currentThread().getName());

			}

		}
	}

}

class ThreadApp11 extends Thread {
	T t;

	ThreadApp11(T t) {
		this.t = t;
	}

	public void run() {
		t.t();
	}

}

class ThreadApp22 extends Thread {
	T t;

	ThreadApp22(T t) {
		this.t = t;

	}

	public void run() {
		t.t();
	}
}

public class ThreadDemo4 {
	public static void main(String[] args) {
		T t = new T();
		ThreadApp11 t1 = new ThreadApp11(t);
		ThreadApp22 t2 = new ThreadApp22(t);
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		t1.start();
		t2.start();
	}

}
