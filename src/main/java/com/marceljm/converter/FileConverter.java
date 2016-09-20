package com.marceljm.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileConverter {

	public static List<String> inputFileToStringList() throws IOException {
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

	public static List<String> inputFilesToStringList() {
		// String line;
		// List<String> list = new ArrayList<String>();
		return null;
	}

}
