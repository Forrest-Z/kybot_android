package com.kydea.tdroid.utils;

import android.util.Log;

public class Debug {

	public static void info(String date,String info){
		Log.d("Debug",date+":"+info);
	}
}
