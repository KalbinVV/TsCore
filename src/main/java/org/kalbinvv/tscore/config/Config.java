package org.kalbinvv.tscore.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Config {

	private final Map<String, String> values;
	
	public Config(String path) {
		values = new HashMap<String, String>();
		BufferedReader bufferedReader = null;
		try {
			File file = new File(path);
			if(!file.exists()) throw new IOException("File not exist!");
			bufferedReader = new BufferedReader(new FileReader(file));
			bufferedReader.lines().forEach((String line) -> {
				String[] params = line.split(": ");
				values.put(params[0], params[1]);
			});
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Integer getInteger(String key) {
		return Integer.parseInt(values.get(key));
	}
	
	public String getString(String key) {
		return values.get(key);
	}
	
	
}
