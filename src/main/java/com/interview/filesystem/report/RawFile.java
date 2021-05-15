package com.interview.filesystem.report;

import lombok.Getter;

@Getter
public class RawFile {

	private final String name;
	private final Size size;
	private final String collection;

	RawFile(String name, Size size, String collection) {
		this.name = name;
		this.size = size;
		this.collection = collection;
	}
}
