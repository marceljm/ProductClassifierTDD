package com.marceljm.util.list.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.entity.Product;
import com.marceljm.util.list.ProductListUtil;

public class ProductListUtilTest {

	@Test
	public void shouldRemoveRepeatedProducts() {
		ProductListUtil productListUtil = new ProductListUtil();
		List<Product> productList = new ArrayList<Product>();

		Product product1 = new Product();
		product1.setName("name");
		product1.setPath("path");
		product1.setStore("store");
		Product product2 = new Product();
		product2.setName("name2");
		product2.setPath("path");
		product2.setStore("store");
		Product product3 = new Product();
		product3.setName("name");
		product3.setPath("path");
		product3.setStore("store");

		productList.add(product1);
		productList.add(product2);
		productList.add(product3);

		productList = productListUtil.removeRepeatedProducts(productList);
		Assert.assertEquals(productList.size(), 2);
	}

	@Test
	public void shouldRemoveProductsWithInvalidCategory() {
		ProductListUtil productListUtil = new ProductListUtil();
		List<Product> productList = new ArrayList<Product>();

		Product product1 = new Product();
		product1.setPath("artes");

		Product product2 = new Product();
		product2.setPath("moveis / decoracao");

		productList.add(product1);
		productList.add(product2);

		productList = productListUtil.removeProductsWithInvalidCategory(productList);

		Assert.assertTrue(productList.size() == 1);
	}

}
