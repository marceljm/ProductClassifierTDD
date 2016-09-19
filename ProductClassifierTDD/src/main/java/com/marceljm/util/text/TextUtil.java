package com.marceljm.util.text;

public class TextUtil {

	public static String removeFirstAndLastQuotationsMarks(String string) {
		return string.substring(1, string.length() - 1).substring(0, string.length() - 2);
	}

}
