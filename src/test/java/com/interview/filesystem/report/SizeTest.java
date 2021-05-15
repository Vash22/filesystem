package com.interview.filesystem.report;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SizeTest {

	@Test
	void shouldNotBeCreatedForNegativeSize() {
		Assertions.assertThrows(IllegalStateException.class, () -> new Size(-2));
	}
}