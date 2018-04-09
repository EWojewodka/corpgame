package com.sygnity.local.core.utils;

import java.awt.Font;
import java.awt.Graphics2D;

import com.sygnity.local.core.files.PropertiesReader;

public class GraphicsUtils {

	public static void printText(Graphics2D g, String text, int x, int y) {
		g.setFont(getDefaultFont());
		g.drawString(text, x, y);
	}

	public static Font getDefaultFont() {
		return new Font("Ebrima", Font.BOLD, 12);
	}

	public static int getWidthPosInPx(double percentage) {
		int width = Integer.valueOf(PropertiesReader.getProperty("application", "gui.width"));
		return (int) (width * percentage);
	}

	public static int getHeightPosInPx(double percentage) {
		int height = Integer.valueOf(PropertiesReader.getProperty("application", "gui.height"));
		return (int) (height * percentage);
	}

}
