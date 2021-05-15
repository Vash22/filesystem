package com.interview.filesystem.report;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OccupancyTest {

	@Test
	void shouldReturnProperSum() {
		// given
		CollectionFile collectionFile = new CollectionFile("name1", new Size(20), "collection1");
		UnassignedFile unassignedFile = new UnassignedFile("abc", new Size(2));
		List<SizeableFile> sizeableFiles = List.of(collectionFile, unassignedFile);

		// when
		long occupancyAsLong = new Occupancy(sizeableFiles).asLong();

		// then
		assertThat(occupancyAsLong).isEqualTo(22);
	}
}