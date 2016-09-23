package com.marceljm.converter.test;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.converter.FileConverter;

public class FileConverterTest {

	@Test
	public void shouldConvertManyInputFilesToStringList() throws IOException {
		FileConverter fileConverter = new FileConverter();
		List<String> list = fileConverter.inputManyFilesToStringList();
		Assert.assertTrue(list.size() > 1000000);
	}

}
