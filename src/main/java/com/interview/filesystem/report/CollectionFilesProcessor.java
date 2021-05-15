package com.interview.filesystem.report;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionFilesProcessor {

	private final Map<String, Long> collectionsWithSize;

	CollectionFilesProcessor(List<CollectionFile> collectionFiles) {
		this.collectionsWithSize = collectionFiles.stream().collect(Collectors
				.groupingBy(CollectionFile::getCollectionId,
						Collectors.summingLong(cf -> cf.getSize().provideSizeAsLong())));
	}

	List<String> calculateTopCollections(int numOfTopCollections) {
		return collectionsWithSize.entrySet().stream().sorted((Map.Entry.<String, Long>comparingByValue().reversed()))
				.limit(numOfTopCollections).map(Map.Entry::getKey).sorted().collect(Collectors.toList());
	}
}
