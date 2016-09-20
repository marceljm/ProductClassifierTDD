package com.marceljm.converter.test;

import org.junit.Assert;
import org.junit.Test;

import com.marceljm.constant.InputFileEnum;

public class InputFileTest {

	@Test
	public void shouldReturnEnumValue() {
		String value = InputFileEnum.RICARDOELETRO.getValue();
		Assert.assertEquals(value, "Ricardo Eletro");
	}

}
