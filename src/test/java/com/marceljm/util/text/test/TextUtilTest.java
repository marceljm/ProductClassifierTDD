package com.marceljm.util.text.test;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.util.text.TextUtil;

public class TextUtilTest {

	@Test
	public void shouldRemoveFirstAndLastQuotationMarks() {
		TextUtil textUtil = new TextUtil();
		Assert.assertEquals(textUtil.removeFirstAndLastQuotationsMarks("\"abcde\""), "abcde");
	}

	@Test
	public void shouldNormalizeText() {
		Assert.assertEquals("aeiou", TextUtil.normalize("Áêìõü"));
	}

}
