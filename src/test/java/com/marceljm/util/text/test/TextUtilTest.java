package com.marceljm.util.text.test;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.util.TextUtil;

public class TextUtilTest {

	@Test
	public void shouldRemoveFirstAndLastQuotationMarks() {
		Assert.assertEquals(TextUtil.removeFirstAndLastQuotationsMarks("\"abcde\""), "abcde");
	}

}
