package com.interview.filesystem.report;

import lombok.Getter;

@Getter
public class CollectionFile implements SizeableFile {

	private final String name;

	private final Size size;
	private final String collectionId;

	CollectionFile(String name, Size size, String collectionId) {
		this.name = name;
		this.size = size;
		this.collectionId = collectionId;
	}

	CollectionFile(RawFile rawFile) {
		this.name = rawFile.getName();
		this.size = rawFile.getSize();
		this.collectionId = rawFile.getCollection();
	}
}
