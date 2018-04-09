package com.sygnity.local;

import com.sygnity.local.gui.frame.GameFrame;

public class PlatformRunnable implements Runnable {

	private GameFrame frame;

	@Override
	public void run() {
		this.frame = new GameFrame();
	}

	public static void main(String[] args) {
		Runnable platformRunnable = new PlatformRunnable();
		platformRunnable.run();
	}

}
