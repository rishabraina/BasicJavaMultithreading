package org.paumard.runnable;

public class LongWrapper {
	
	private long l;
	private final Object key  = new Object();

	public LongWrapper(long l) {
		super();
		this.l = l;
	}

	public long getValue() {
		synchronized (key) {
			return l;
		}
	}
	
	public void incrementValue() {
		synchronized (key) {
			l = l + 1;
		}
	}

}
