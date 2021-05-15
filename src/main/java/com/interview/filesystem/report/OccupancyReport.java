package com.interview.filesystem.report;

import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OccupancyReport {

	private final Occupancy occupancy;
	private final List<String> topCollectionNames;

	Occupancy getOccupancy() {
		return occupancy;
	}

	List<String> getTopCollectionNames() {
		return Collections.unmodifiableList(topCollectionNames);
	}
}
