package com.sygnity.local.gui.frame;

import java.util.Properties;

import javax.swing.JFrame;

import com.sygnity.local.core.files.PropertiesReader;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = -6569687609092601004L;

	private static final Properties APPLICATION_PROPERTIES = PropertiesReader.getReader("application").getProperties();

	public GameFrame() {
		init();
	}

	private void init() {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(APPLICATION_PROPERTIES.getProperty("app.title"));
		setSize(Integer.valueOf(APPLICATION_PROPERTIES.getProperty("gui.width")),
				Integer.valueOf(APPLICATION_PROPERTIES.getProperty("gui.height")));
	}

}
