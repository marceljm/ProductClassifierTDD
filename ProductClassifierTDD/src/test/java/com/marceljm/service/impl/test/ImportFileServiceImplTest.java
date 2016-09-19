package com.marceljm.service.impl.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.marceljm.entity.Product;
import com.marceljm.service.ImportFileService;
import com.marceljm.service.impl.ImportFileServiceImpl;

public class ImportFileServiceImplTest {

	private ImportFileService service;

	@Before
	public void initialize() throws IOException {
		service = new ImportFileServiceImpl();
	}

	@Test
	public void shouldReturnNotEmptyStringProdcutList() throws IOException {
		Assert.assertTrue(service.getStringList().size() > 0);
	}

	@Test
	public void shouldConvertStringToProduct() {
		Product product = service
				.convertStringToProduct("\"0\";\"1\";\"2\";\"\";\"4\";\"\";\"6\";\"\";\"\";\"\";\"\";\"\"");
		Assert.assertEquals(product.getId(), "0");
		Assert.assertEquals(product.getName(), "1");
		Assert.assertEquals(product.getPrice(), "2");
		Assert.assertEquals(product.getImageSmall(), "");
		Assert.assertEquals(product.getImageMedium(), "4");
		Assert.assertEquals(product.getImageLarge(), "");
		Assert.assertEquals(product.getLink(), "6");
		Assert.assertEquals(product.getPath(), "");
		Assert.assertEquals(product.getMainCategory(), "");
		Assert.assertEquals(product.getSubCategory(), "");
		Assert.assertEquals(product.getThirdCategory(), "");
		Assert.assertEquals(product.getBrand(), "");
		Assert.assertEquals(product.getStore(), null);
	}

	@Test
	public void shouldConvertStringListToProductList() {
		Assert.assertEquals(service.convertStringListToProductList(service.getStringList()).size(),
				service.getStringList().size());
	}

}
