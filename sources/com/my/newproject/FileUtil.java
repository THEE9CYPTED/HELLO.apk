package com.my.newproject;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtil {
    private static void createNewFile(String str) {
        int iLastIndexOf = str.lastIndexOf(File.separator);
        if (iLastIndexOf > 0) {
            makeDir(str.substring(0, iLastIndexOf));
        }
        File file = new File(str);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readFile(java.lang.String r6) throws java.lang.Throwable {
        /*
            createNewFile(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L54
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L54
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L54
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L54
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L52
        L17:
            int r2 = r1.read(r0)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L52
            if (r2 > 0) goto L27
            if (r1 == 0) goto L22
            r1.close()     // Catch: java.lang.Exception -> L4d
        L22:
            java.lang.String r0 = r3.toString()
            return r0
        L27:
            java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L52
            r5 = 0
            r4.<init>(r0, r5, r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L52
            r3.append(r4)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L52
            goto L17
        L31:
            r0 = move-exception
        L32:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L22
            r1.close()     // Catch: java.lang.Exception -> L3b
            goto L22
        L3b:
            r0 = move-exception
            r0.printStackTrace()
            goto L22
        L40:
            r0 = move-exception
            r1 = r2
        L42:
            if (r1 == 0) goto L47
            r1.close()     // Catch: java.lang.Exception -> L48
        L47:
            throw r0
        L48:
            r1 = move-exception
            r1.printStackTrace()
            goto L47
        L4d:
            r0 = move-exception
            r0.printStackTrace()
            goto L22
        L52:
            r0 = move-exception
            goto L42
        L54:
            r0 = move-exception
            r1 = r2
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject.FileUtil.readFile(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void writeFile(java.lang.String r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            createNewFile(r4)
            r2 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L2b
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L2b
            r3 = 0
            r1.<init>(r0, r3)     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L2b
            r1.write(r5)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            r1.flush()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.io.IOException -> L37
        L1a:
            return
        L1b:
            r0 = move-exception
            r1 = r2
        L1d:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.io.IOException -> L26
            goto L1a
        L26:
            r0 = move-exception
            r0.printStackTrace()
            goto L1a
        L2b:
            r0 = move-exception
        L2c:
            if (r2 == 0) goto L31
            r2.close()     // Catch: java.io.IOException -> L32
        L31:
            throw r0
        L32:
            r1 = move-exception
            r1.printStackTrace()
            goto L31
        L37:
            r0 = move-exception
            r0.printStackTrace()
            goto L1a
        L3c:
            r0 = move-exception
            r2 = r1
            goto L2c
        L3f:
            r0 = move-exception
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject.FileUtil.writeFile(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyFile(java.lang.String r5, java.lang.String r6) throws java.lang.Throwable {
        /*
            r2 = 0
            boolean r0 = isExistFile(r5)
            if (r0 != 0) goto L8
        L7:
            return
        L8:
            createNewFile(r6)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L70
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L70
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L74
            r0 = 0
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L74
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6e
        L1a:
            int r2 = r3.read(r0)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6e
            if (r2 > 0) goto L30
            if (r3 == 0) goto L25
            r3.close()     // Catch: java.io.IOException -> L66
        L25:
            if (r1 == 0) goto L7
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L7
        L2b:
            r0 = move-exception
            r0.printStackTrace()
            goto L7
        L30:
            r4 = 0
            r1.write(r0, r4, r2)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6e
            goto L1a
        L35:
            r0 = move-exception
        L36:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L3e
            r3.close()     // Catch: java.io.IOException -> L49
        L3e:
            if (r1 == 0) goto L7
            r1.close()     // Catch: java.io.IOException -> L44
            goto L7
        L44:
            r0 = move-exception
            r0.printStackTrace()
            goto L7
        L49:
            r0 = move-exception
            r0.printStackTrace()
            goto L3e
        L4e:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L51:
            if (r3 == 0) goto L56
            r3.close()     // Catch: java.io.IOException -> L5c
        L56:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L61
        L5b:
            throw r0
        L5c:
            r2 = move-exception
            r2.printStackTrace()
            goto L56
        L61:
            r1 = move-exception
            r1.printStackTrace()
            goto L5b
        L66:
            r0 = move-exception
            r0.printStackTrace()
            goto L25
        L6b:
            r0 = move-exception
            r1 = r2
            goto L51
        L6e:
            r0 = move-exception
            goto L51
        L70:
            r0 = move-exception
            r1 = r2
            r3 = r2
            goto L36
        L74:
            r0 = move-exception
            r1 = r2
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject.FileUtil.copyFile(java.lang.String, java.lang.String):void");
    }

    public static void copyDir(String str, String str2) throws Throwable {
        File[] fileArrListFiles = new File(str).listFiles();
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                copyFile(file2.getPath(), String.valueOf(str2) + "/" + file2.getName());
            } else if (file2.isDirectory()) {
                copyDir(file2.getPath(), String.valueOf(str2) + "/" + file2.getName());
            }
        }
    }

    public static void moveFile(String str, String str2) throws Throwable {
        copyFile(str, str2);
        deleteFile(str);
    }

    public static void deleteFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        deleteFile(file2.getAbsolutePath());
                    }
                    if (file2.isFile()) {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static boolean isExistFile(String str) {
        return new File(str).exists();
    }

    public static void makeDir(String str) {
        if (!isExistFile(str)) {
            new File(str).mkdirs();
        }
    }

    public static void listDir(String str, ArrayList<String> arrayList) {
        File[] fileArrListFiles;
        File file = new File(str);
        if (file.exists() && !file.isFile() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0 && arrayList != null) {
            arrayList.clear();
            for (File file2 : fileArrListFiles) {
                arrayList.add(file2.getAbsolutePath());
            }
        }
    }

    public static boolean isDirectory(String str) {
        if (isExistFile(str)) {
            return new File(str).isDirectory();
        }
        return false;
    }

    public static boolean isFile(String str) {
        if (isExistFile(str)) {
            return new File(str).isFile();
        }
        return false;
    }

    public static long getFileLength(String str) {
        if (isExistFile(str)) {
            return new File(str).length();
        }
        return 0L;
    }

    public static String getExternalStorageDir() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String getPackageDataDir(Context context) {
        return context.getExternalFilesDir(null).getAbsolutePath();
    }

    public static String getPublicDir(String str) {
        return Environment.getExternalStoragePublicDirectory(str).getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String convertUriToFilePath(android.content.Context r8, android.net.Uri r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject.FileUtil.convertUriToFilePath(android.content.Context, android.net.Uri):java.lang.String");
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return string;
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        if (th != null) {
                            if (th != th) {
                                try {
                                    th.addSuppressed(th);
                                } catch (Exception e) {
                                }
                            }
                            th = th;
                        }
                        throw th;
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            th = null;
        }
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static void saveBitmap(Bitmap bitmap, String str) throws Throwable {
        createNewFile(str);
        Throwable th = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                if (null != th) {
                    try {
                        th.addSuppressed(th);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                th = null;
            }
            throw th;
        }
    }

    public static Bitmap getScaledBitmap(String str, int i) {
        int i2;
        int i3;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        if (width > height) {
            i3 = (int) ((i / width) * height);
            i2 = i;
        } else {
            i2 = (int) (width * (i / height));
            i3 = i;
        }
        return Bitmap.createScaledBitmap(bitmapDecodeFile, i2, i3, true);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = 1;
        if (i4 > i2 || i3 > i) {
            int i6 = i4 / 2;
            int i7 = i3 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap decodeSampleBitmapFromPath(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static void resizeBitmapFileRetainRatio(String str, String str2, int i) throws Throwable {
        if (isExistFile(str)) {
            saveBitmap(getScaledBitmap(str, i), str2);
        }
    }

    public static void resizeBitmapFileToSquare(String str, String str2, int i) throws Throwable {
        if (isExistFile(str)) {
            saveBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeFile(str), i, i, true), str2);
        }
    }

    public static void resizeBitmapFileToCircle(String str, String str2) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle(bitmapDecodeFile.getWidth() / 2, bitmapDecodeFile.getHeight() / 2, bitmapDecodeFile.getWidth() / 2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDecodeFile, rect, rect, paint);
            saveBitmap(bitmapCreateBitmap, str2);
        }
    }

    public static void resizeBitmapFileWithRoundedBorder(String str, String str2, int i) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
            RectF rectF = new RectF(rect);
            float f = i;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDecodeFile, rect, rect, paint);
            saveBitmap(bitmapCreateBitmap, str2);
        }
    }

    public static void cropBitmapFileFromCenter(String str, String str2, int i, int i2) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            if (width >= i || height >= i2) {
                int i3 = width > i ? (width - i) / 2 : 0;
                int i4 = height > i2 ? (height - i2) / 2 : 0;
                if (i > width) {
                    i = width;
                }
                if (i2 > height) {
                    i2 = height;
                }
                saveBitmap(Bitmap.createBitmap(bitmapDecodeFile, i3, i4, i, i2), str2);
            }
        }
    }

    public static void rotateBitmapFile(String str, String str2, float f) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postRotate(f);
            saveBitmap(Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void scaleBitmapFile(String str, String str2, float f, float f2) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f2);
            saveBitmap(Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void skewBitmapFile(String str, String str2, float f, float f2) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postSkew(f, f2);
            saveBitmap(Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void setBitmapFileColorFilter(String str, String str2, int i) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(BitmapFactory.decodeFile(str), 0, 0, r0.getWidth() - 1, r0.getHeight() - 1);
            Paint paint = new Paint();
            paint.setColorFilter(new LightingColorFilter(i, 1));
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
            saveBitmap(bitmapCreateBitmap, str2);
        }
    }

    public static void setBitmapFileBrightness(String str, String str2, float f) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            ColorMatrix colorMatrix = new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 1.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 1.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), bitmapDecodeFile.getConfig());
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint);
            saveBitmap(bitmapCreateBitmap, str2);
        }
    }

    public static void setBitmapFileContrast(String str, String str2, float f) throws Throwable {
        if (isExistFile(str)) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            ColorMatrix colorMatrix = new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), bitmapDecodeFile.getConfig());
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint);
            saveBitmap(bitmapCreateBitmap, str2);
        }
    }

    public static int getJpegRotate(String str) {
        try {
            switch (new ExifInterface(str).getAttributeInt("Orientation", -1)) {
            }
            return 0;
        } catch (IOException e) {
            return 0;
        }
    }

    public static File createNewPictureFile(Context context) {
        return new File(String.valueOf(context.getExternalFilesDir(Environment.DIRECTORY_DCIM).getAbsolutePath()) + File.separator + (String.valueOf(new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())) + ".jpg"));
    }
}
