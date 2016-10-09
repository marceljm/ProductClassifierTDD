package com.marceljm.entity.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.marceljm.constant.InputFileEnum;
import com.marceljm.entity.Product;

public class ProductTest {

	private Product product;

	@Before
	public void initialize() {
		product = new Product();
	}

	@Test
	public void shouldVerifyIfStoreIsValidForCategoryKnowledgeBase() {
		product.setStore(InputFileEnum.WALLMART.getValue());
		Assert.assertTrue(product.isBelonginToMainStore());
	}

	@Test
	public void shouldVerifyIfPathCategoryIsValidForKnowledgeBase() {
//		product.setPath("path");
//		Assert.assertTrue(product.isValidPath());
	}

}
