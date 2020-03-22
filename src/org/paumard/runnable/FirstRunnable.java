package org.paumard.runnable;

public class FirstRunnable {

	public static void main(String args[]) {
		Runnable runnable = () -> {
			System.out.println("I am running in " + Thread.currentThread().getName());
		};
		
		System.out.println("New Thread has started ");
		Thread t = new Thread(runnable);
		t.setName("MyThread");
		t.start();
	}

}
