package com.marceljm.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.marceljm.entity.Product;
import com.marceljm.service.ImportFileService;
import com.marceljm.util.text.TextUtil;

public class ImportFileServiceImpl implements ImportFileService {

	private List<String> stringList;

	public ImportFileServiceImpl() throws IOException {
		stringList = convertFileToStringList();
	}

	private List<String> convertFileToStringList() throws IOException {
		String line;
		List<String> list = new ArrayList<String>();

		File fileDir = new File("src/main/resources/input.csv");
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
		while ((line = in.readLine()) != null) {
			list.add(line);
		}
		in.close();

		return list;
	}

	@Override
	public List<String> getStringList() {
		return stringList;
	}

	@Override
	public List<Product> convertStringListToProductList(List<String> stringList) {
		Long a = Calendar.getInstance().getTimeInMillis();
		List<Product> productList = new ArrayList<Product>();
		for (int i = 0; i < stringList.size(); i++) {
			Product product = convertStringToProduct(stringList.get(i));
			productList.add(product);
		}
		Long b = Calendar.getInstance().getTimeInMillis();
		System.out.println((b - a) / 1000);		
		return productList;
	}

	@Override
	public Product convertStringToProduct(String string) {
		Product product = new Product();
		string = TextUtil.removeFirstAndLastQuotationsMarks(string);
		String[] splitList = string.split("\";\"");
		int lenght = splitList.length;
		product.setId(lenght >= 1 ? splitList[0] : "");
		product.setName(lenght >= 2 ? splitList[1] : "");
		product.setPrice(lenght >= 3 ? splitList[2] : "");
		product.setImageSmall(lenght >= 4 ? splitList[3] : "");
		product.setImageMedium(lenght >= 5 ? splitList[4] : "");
		product.setImageLarge(lenght >= 6 ? splitList[5] : "");
		product.setLink(lenght >= 7 ? splitList[6] : "");
		product.setPath(lenght >= 8 ? splitList[7] : "");
		product.setMainCategory(lenght >= 9 ? splitList[8] : "");
		product.setSubCategory(lenght >= 10 ? splitList[9] : "");
		product.setThirdCategory(lenght >= 11 ? splitList[10] : "");
		product.setBrand(lenght >= 12 ? splitList[11] : "");
		product.setStore(null);
		return product;
	}

}
