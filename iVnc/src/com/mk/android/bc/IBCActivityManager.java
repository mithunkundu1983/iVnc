/**
 * Copyright (C) 2009 Michael A. MacDonald
 */
package com.mk.android.bc;

import android.app.ActivityManager;

/**
 * @author Michael A. MacDonald
 */
public interface IBCActivityManager {
	public int getMemoryClass(ActivityManager am);
}
