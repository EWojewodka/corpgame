package com.sygnity.local;

import com.sygnity.local.gui.frame.GameFrame;

public class PlatformRunnable implements Runnable {

	@Override
	public void run() {
		GameFrame gameFrame = new GameFrame();
	
	}

	public static void main(String[] args) {
		Runnable platformRunnable = new PlatformRunnable();
		platformRunnable.run();
	}

}
