package com.interview.filesystem.report;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OccupancyReportGeneratorTest {

	@Test
	void generate() {
		// given
		RawFile file1 = new RawFile("file1.txt", new Size(100), null);
		RawFile file2 = new RawFile("file2.txt", new Size(200), "collection1");
		RawFile file3 = new RawFile("file3.txt", new Size(200), "collection1");
		RawFile file4 = new RawFile("file4.txt", new Size(300), "collection2");
		RawFile file5 = new RawFile("file5.txt", new Size(10), null);
		List<RawFile> rawFiles = List.of(file1, file2, file3, file4, file5);

		// when
		OccupancyReport occupancyReport = new OccupancyReportGenerator().generate(rawFiles, 2);

		// then
		assertThat(occupancyReport.getOccupancy().asLong()).isEqualTo(810L);
		assertThat(occupancyReport.getTopCollectionNames()).containsExactly("collection1", "collection2");
	}
}