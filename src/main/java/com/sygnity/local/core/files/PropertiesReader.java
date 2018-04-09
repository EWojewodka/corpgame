package com.sygnity.local.core.files;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import com.sygnity.local.core.utils.Asserts;

public class PropertiesReader {

	private String propertiesName;

	private Properties props;

	private PropertiesReader(String propertiesName) {
		Asserts.notEmpty(propertiesName, "Cannot init properties from empty name.");
		this.propertiesName = propertiesName;
		load();
	}

	private void load() {
		props = new Properties();
		try (InputStream is = getClass().getClassLoader().getResourceAsStream(propertiesName + ".properties")) {
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getPropertiesName() {
		return propertiesName;
	}

	public Properties getProperties() {
		return props;
	}

	public String getProperty(String name) {
		return props.getProperty(name);
	}

	private static final Map<String, PropertiesReader> buffer = new ConcurrentHashMap<>();

	public static PropertiesReader getReader(String propertiesName) {
		PropertiesReader result = buffer.get(propertiesName);
		if (result != null)
			return result;
		result = new PropertiesReader(propertiesName);
		buffer.put(propertiesName, result);
		return result;
	}

}
