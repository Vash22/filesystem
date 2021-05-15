package com.interview.filesystem.report;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesProvider {

	private final List<CollectionFile> collectionFiles;
	private final List<UnassignedFile> unassignedFiles;

	FilesProvider(List<RawFile> rawFiles) {
		List<CollectionFile> collectionFiles = new ArrayList<>();
		List<UnassignedFile> unassignedFiles = new ArrayList<>();
		for (RawFile rawFile : rawFiles) {
			if (rawFile.getCollection() == null) {
				unassignedFiles.add(new UnassignedFile(rawFile));
			} else {
				collectionFiles.add(new CollectionFile(rawFile));
			}
		}
		this.collectionFiles = collectionFiles;
		this.unassignedFiles = unassignedFiles;
	}

	List<CollectionFile> getCollectionFiles() {
		return Collections.unmodifiableList(collectionFiles);
	}

	List<SizeableFile> returnAllSizeableFiles() {
		return Stream.of(collectionFiles, unassignedFiles).flatMap(Collection::stream).collect(Collectors.toList());
	}
}
