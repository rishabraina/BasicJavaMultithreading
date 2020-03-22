package org.paumard.singleton;

public class DoubleCheckLockingSingleton {

	private static volatile DoubleCheckLockingSingleton instance;
	private final static Object lock = new Object();

	private DoubleCheckLockingSingleton() {
	}

	public static DoubleCheckLockingSingleton getInstance() {
		if (instance != null) {
			return instance;
		}

		synchronized (lock) {
			if (instance == null) {
				instance = new DoubleCheckLockingSingleton();
			}
			return instance;
		}
	}

}
