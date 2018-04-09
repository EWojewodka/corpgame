package com.sygnity.local.gui.panes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sygnity.local.core.files.PropertiesReader;
import com.sygnity.local.core.utils.GraphicsUtils;

public class MenuPane extends JPanel {

	private static final long serialVersionUID = 1554699085013010903L;

	private JFrame frame;

	public MenuPane(JFrame frame) {
		this.frame = frame;
		setBackground(Color.ORANGE);
		setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		GraphicsUtils.printText(g2d, PropertiesReader.getProperty("application", "app.title"), GraphicsUtils.getWidthPosInPx(0.33), GraphicsUtils.getHeightPosInPx(0.1));
		GraphicsUtils.printText(g2d, "Start game", GraphicsUtils.getWidthPosInPx(0.325), GraphicsUtils.getHeightPosInPx(0.18));
		
	}

}
