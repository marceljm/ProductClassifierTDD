package com.marceljm.converter.test;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.converter.FileConverter;
import com.marceljm.entity.Product;

public class FileConverterTest {

	@Test
	public void shouldConvertManyInputFilesToStringList() throws IOException {
		FileConverter fileConverter = new FileConverter();
		List<String> list = fileConverter.convertInputFilesToStringList();
		Assert.assertTrue(list.size() > 1000000);
	}

	@Test
	public void shouldConvertMainInputFileToProductList() throws IOException {
		FileConverter fileConverter = new FileConverter();
		List<Product> list = fileConverter.convertMainFileToCompactProductList();
		Assert.assertTrue(list.size() > 1000000);
	}

}
