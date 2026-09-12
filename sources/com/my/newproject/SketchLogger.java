package com.my.newproject;

import android.content.Context;
import android.content.Intent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class SketchLogger {
    private static volatile boolean isRunning = false;
    private static Thread loggerThread = new Thread() { // from class: com.my.newproject.SketchLogger.1
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SketchLogger.isRunning = true;
            try {
                Runtime.getRuntime().exec("logcat -c");
                Throwable th = null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat").getInputStream()));
                    try {
                        String line = bufferedReader.readLine();
                        do {
                            SketchLogger.broadcastLog(line);
                            if (!SketchLogger.isRunning) {
                                break;
                            } else {
                                line = bufferedReader.readLine();
                            }
                        } while (line != null);
                        if (SketchLogger.isRunning) {
                            SketchLogger.broadcastLog("Logger got killed. Restarting.");
                            SketchLogger.startLogging();
                        } else {
                            SketchLogger.broadcastLog("Logger stopped.");
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (0 == 0) {
                        throw th2;
                    }
                    if (null != th2) {
                        th.addSuppressed(th2);
                    }
                }
            } catch (IOException e) {
                SketchLogger.broadcastLog(e.getMessage());
            }
        }
    };

    public static synchronized void startLogging() {
        if (!isRunning) {
            loggerThread.start();
        } else {
            broadcastLog("Logger already running");
        }
    }

    public static synchronized void stopLogging() {
        if (isRunning) {
            isRunning = false;
            broadcastLog("Stopping logger by user request.");
        } else {
            broadcastLog("Logger not running");
        }
    }

    public static void broadcastLog(String str) {
        Context context = SketchApplication.getContext();
        Intent intent = new Intent();
        intent.setAction("pro.sketchware.ACTION_NEW_DEBUG_LOG");
        intent.putExtra("log", str);
        intent.putExtra("packageName", context.getPackageName());
        context.sendBroadcast(intent);
    }
}
