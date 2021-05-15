package com.interview.filesystem.report;

import java.util.List;

public class Occupancy {

	private final long occupancy;

	Occupancy(List<? extends SizeableFile> sizableFiles) {
		this.occupancy = sizableFiles.stream().mapToLong(sizableFile -> sizableFile.getSize().provideSizeAsLong())
				.sum();
	}

	long asLong() {
		return this.occupancy;
	}
}
