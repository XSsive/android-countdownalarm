package net.everythingandroid.timer;


public class Log {
    public final static String LOGTAG = "Countdown Alarm++";

    private static final boolean DEBUG = false;
    //static final boolean LOGV = DEBUG ? Config.LOGD : Config.LOGV;
    static final boolean LOGV = true;

    static void v(String msg) {
    	if (LOGV) {
    		android.util.Log.v(LOGTAG, msg);
    	}
    }

    static void e(String msg) {
        android.util.Log.e(LOGTAG, msg);
    }
}