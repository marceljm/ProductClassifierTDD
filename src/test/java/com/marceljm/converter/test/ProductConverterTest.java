package com.marceljm.converter.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.marceljm.converter.ProductConverter;
import com.marceljm.entity.Product;

public class ProductConverterTest {

	private ProductConverter productConverter;

	@Before
	public void initialize() {
		productConverter = new ProductConverter();
	}

	@Test
	public void shouldConvertStringToProduct() {
		Product product = productConverter
				.stringToProduct("\"0\";\"1\";\"2\";\"\";\"4\";\"\";\"6\";\"\";\"\";\"\";\"\";\"\";\"13\"");
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
		Assert.assertEquals(product.getStore(), "13");
	}

	@Test
	public void shouldConvertStringListToProductList() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("\"0\";\"1\";\"2\";\"\";\"4\";\"\";\"6\";\"\";\"\";\"\";\"\";\"\";\"13\"");
		stringList.add("\"0\";\"1\";\"2\";\"\";\"4\";\"\";\"6\";\"\";\"\";\"\";\"\";\"\";\"13\"");
		Assert.assertEquals(productConverter.stringListToProductList(stringList).size(), stringList.size());
	}

}
