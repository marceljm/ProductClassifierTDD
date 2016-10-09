package com.marceljm.util.text;

import java.text.Normalizer;

public class TextUtil {

	public String removeFirstAndLastQuotationsMarks(String string) {
		return string.substring(1, string.length() - 1).substring(0, string.length() - 2);
	}

	public static String normalize(String text) {
		text = Normalizer.normalize(text, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		return text.toLowerCase();
	}

}
