package com.interview.filesystem.report;

public class Size {

	private final long size;

	public Size(long size) {
		if (size < 0) {
			throw new IllegalStateException();
		}
		this.size = size;
	}

	long provideSizeAsLong() {
		return size;
	}
}
