package com.interview.filesystem.report;

import lombok.Getter;

@Getter
public class UnassignedFile implements SizeableFile {

	private final String name;
	private final Size size;

	UnassignedFile(String name, Size size) {
		this.name = name;
		this.size = size;
	}

	public UnassignedFile(RawFile rawFile) {
		this.name = rawFile.getName();
		this.size = rawFile.getSize();
	}
}
