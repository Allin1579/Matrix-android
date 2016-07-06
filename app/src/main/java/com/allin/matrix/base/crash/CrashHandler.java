package com.allin.matrix.base.crash;

import android.content.Context;

import java.lang.Thread.UncaughtExceptionHandler;

public class CrashHandler implements UncaughtExceptionHandler {

	private static CrashHandler instance = new CrashHandler();

	private CrashHandler(){}

	public static CrashHandler getInstance(){
		return instance;
	}

	public void init(Context context) {
		Thread.setDefaultUncaughtExceptionHandler(this);
	}

	@Override
	public void uncaughtException(Thread thread, Throwable ex) {

	}

}