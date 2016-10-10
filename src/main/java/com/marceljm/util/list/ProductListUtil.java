package com.marceljm.util.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.marceljm.constant.Constant;
import com.marceljm.entity.Product;

public class ProductListUtil {

	public List<Product> removeRepeatedProducts(List<Product> productList) {
		Set<Product> productSet = new HashSet<Product>();
		productSet.addAll(productList);
		return productSet.parallelStream().collect(Collectors.toList());
	}

	public List<Product> removeProductsWithInvalidCategory(List<Product> productList) {
		List<Product> outputList = new ArrayList<Product>();
		for (int i = 0; i < productList.size(); i++) {
			boolean invalid = false;
			if (productList.get(i).getPath().isEmpty())
				continue;

			for (String mark : Constant.VALID_CATEGORY_MARK) {
				if (!productList.get(i).getPath().contains(mark)) {
					invalid = true;
					break;
				}
			}
			if (invalid)
				continue;

			for (String mark : Constant.INVALID_CATEGORY_MARK) {
				if (productList.get(i).getPath().contains(mark)) {
					invalid = true;
					break;
				}
			}
			if (!invalid)
				outputList.add(productList.get(i));
		}
		return outputList;
	}

}
