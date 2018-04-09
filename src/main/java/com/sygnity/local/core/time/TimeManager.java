package com.sygnity.local.core.time;

import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import javax.swing.Timer;

public enum TimeManager {
	INSTANCE;

	private static final Logger LOGGER = Logger.getLogger(TimeManager.class.getName());

	private Map<String, Timer> timerMap;

	private TimeManager() {
		this.timerMap = new ConcurrentHashMap<>();
	}

	private static TimeManager getInstance() {
		return TimeManager.INSTANCE;
	}

	public static void addTimer(String timerName, int delay, ActionListener listener) {
		Map<String, Timer> map = getInstance().timerMap;
		if (map.containsKey(timerName)) {
			LOGGER.info(String.format("Timer with name (%s) already exists", timerName));
		}
		map.put(timerName, new Timer(delay, listener));
	}

	public static void removeTimer(String timerName) {
		getInstance().timerMap.remove(timerName);
	}
}
