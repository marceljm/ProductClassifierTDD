package com.marceljm.converter;

import java.util.ArrayList;
import java.util.List;

import com.marceljm.constant.ColumnEnum;
import com.marceljm.entity.Product;
import com.marceljm.util.text.TextUtil;

public class ProductConverter {

	public Product stringToProduct(String string) {
		Product product = new Product();

		string = new TextUtil().removeFirstAndLastQuotationsMarks(string);
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
		product.setStore(lenght >= 13 ? splitList[12] : "");
		return product;
	}

	public Product stringToCompactProduct(String string) {
		Product product = new Product();

		string = new TextUtil().removeFirstAndLastQuotationsMarks(string);
		String[] splitList = string.split("\";\"");

		int lenght = splitList.length;
		product.setName(lenght >= 2 ? TextUtil.normalize(splitList[1]) : "");
		product.setPath(lenght >= 8 ? TextUtil.normalize(splitList[7]) : "");
		product.setBrand(lenght >= 12 ? TextUtil.normalize(splitList[11]) : "");
		return product;
	}

	public List<Product> stringListToProductList(List<String> stringList) {
		List<Product> productList = new ArrayList<Product>();
		for (int i = 0; i < stringList.size(); i++) {
			Product product = stringToProduct(stringList.get(i));
			if (product.getMainCategory().equals(ColumnEnum.MAINCATEGORY))
				continue;
			productList.add(product);
		}
		return productList;
	}

}
