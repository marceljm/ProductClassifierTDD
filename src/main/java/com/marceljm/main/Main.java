package com.marceljm.main;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import com.marceljm.converter.FileConverter;
import com.marceljm.entity.Product;

public class Main {

	public static void main(String[] args) throws IOException {
		Calendar start = Calendar.getInstance();

		FileConverter fileConverter = new FileConverter();
		List<Product> productList = fileConverter.convertMainFileToProductList();

		System.out.println(productList.size());
		// for (Product product : productList) {
		// System.out.println(product.getMainCategory());
		// }

		Calendar end = Calendar.getInstance();

		System.out.println((end.getTimeInMillis() - start.getTimeInMillis()) / 1000);
	}

}
