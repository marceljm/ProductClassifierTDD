package com.marceljm.converter.test;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.converter.FileConverter;

public class FileConverterTest {

	@Test
	public void shouldConvertOneInputFileToStringList() throws IOException {
		List<String> list = FileConverter.inputFileToStringList();
		Assert.assertTrue(list.size() > 0);
	}

	@Test
	public void shouldConvertManyInputFilesToStringList() {
		List<String> list = FileConverter.inputFilesToStringList();
		Assert.assertTrue(list.size() > 0);
	}

}
