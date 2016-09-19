package com.marceljm.util.text.test;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.util.text.TextUtil;

public class TextUtilTest {

	@Test
	public void shouldRemoveFirstAndLastQuotationMarks() {
		Assert.assertEquals(TextUtil.removeFirstAndLastQuotationsMarks("\"abcde\""), "abcde");
	}

}
