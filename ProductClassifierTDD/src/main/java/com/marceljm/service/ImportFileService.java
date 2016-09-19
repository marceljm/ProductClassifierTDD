package com.marceljm.service;

import java.util.List;

import com.marceljm.entity.Product;

public interface ImportFileService {

	public List<String> getStringList();

	public List<Product> convertStringListToProductList(List<String> stringList);

	public Product convertStringToProduct(String string);

}
