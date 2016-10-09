package com.marceljm.util.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.marceljm.entity.Product;

public class ProductListUtil {

	public List<Product> removeRepeatedProducts(List<Product> productList) {
		Set<Product> productSet = new HashSet<Product>();
		productSet.addAll(productList);
		return productSet.parallelStream().collect(Collectors.toList());
	}

}
