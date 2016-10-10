package com.marceljm.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.marceljm.constant.InputFileEnum;
import com.marceljm.entity.Product;
import com.marceljm.util.list.ProductListUtil;

public class FileConverter {

	public List<String> convertInputFilesToStringList() throws IOException {
		String line;
		List<String> list = new ArrayList<String>();

		for (InputFileEnum inputFile : InputFileEnum.values()) {
			File fileDir = new File("src/main/resources/" + inputFile.toString().toLowerCase() + ".csv");
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
			while ((line = in.readLine()) != null) {
				list.add(line + ";\"" + inputFile.getValue() + "\"");
			}
			in.close();
		}
		return list;
	}

	public List<Product> convertMainFileToCompactProductList() throws IOException {
		String line;
		List<Product> list = new ArrayList<Product>();
		ProductConverter productConverter = new ProductConverter();

		File fileDir = new File("src/main/resources/" + InputFileEnum.WALLMART + ".csv");
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
		while ((line = in.readLine()) != null) {
			list.add(productConverter.stringToCompactProduct(line + ";\"" + InputFileEnum.WALLMART.getValue() + "\""));
		}
		in.close();

		ProductListUtil productListUtil = new ProductListUtil();
		list = productListUtil.removeRepeatedProducts(list);
		list = productListUtil.removeProductsWithInvalidCategory(list);

		return list;
	}

}
