package com.sygnity.local.core.utils;

public class Asserts {

	public static void notNull(Object obj, String message) {
		if (obj == null)
			throwIllegalException(message);
	}

	public static void notEmpty(String obj, String message) {
		notNull(obj, message);
		if (message.trim().length() == 0)
			throwIllegalException(message);
	}

	private static void throwIllegalException(String message) {
		throw new IllegalArgumentException(message);
	}

}
