package com.interview.filesystem.report;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
class OccupancyReportGenerator {

	public OccupancyReport generate(List<RawFile> rawFiles, int numOfTopCollections) {
		FilesProvider filesProvider = new FilesProvider(rawFiles);

		Occupancy occupancy = new	 Occupancy(filesProvider.returnAllSizeableFiles());
		List<String> topCollections = new CollectionFilesProcessor(filesProvider.getCollectionFiles())
				.calculateTopCollections(numOfTopCollections);

		return new OccupancyReport(occupancy, topCollections);
	}
}
