package org.maplibre.android.storage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import androidx.annotation.Keep;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.MapLibre;
import org.maplibre.android.c;
import org.maplibre.android.log.Logger;
import org.maplibre.android.util.TileServerOptions;
import org.maplibre.android.utils.g;

public class FileSource {

    /* renamed from: a  reason: collision with root package name */
    private static final Lock f146077a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private static final Lock f146078b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private static String f146079c;

    /* renamed from: d  reason: collision with root package name */
    private static String f146080d;

    /* renamed from: e  reason: collision with root package name */
    private static FileSource f146081e;
    @Keep
    private long nativePtr;

    @Keep
    public interface ResourceTransformCallback {
        String onURL(int i10, String str);
    }

    @Keep
    public interface ResourcesCachePathChangeCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    private static class a extends AsyncTask<Context, Void, Void> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Context... contextArr) {
            FileSource.e(contextArr[0]);
            FileSource.d(contextArr[0]);
            return null;
        }

        private a() {
        }
    }

    private FileSource(String str) {
        initialize(MapLibre.getApiKey(), str, MapLibre.getTileServerOptions());
    }

    private static String a(Context context) {
        String string = context.getSharedPreferences("MapboxSharedPreferences", 0).getString("fileSourceResourcesCachePath", (String) null);
        if (i(string)) {
            return string;
        }
        String b10 = b(context);
        context.getSharedPreferences("MapboxSharedPreferences", 0).edit().remove("fileSourceResourcesCachePath").apply();
        return b10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.getExternalFilesDir((java.lang.String) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.content.Context r1) {
        /*
            boolean r0 = g(r1)
            if (r0 == 0) goto L_0x0018
            boolean r0 = h()
            if (r0 == 0) goto L_0x0018
            r0 = 0
            java.io.File r0 = r1.getExternalFilesDir(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.getAbsolutePath()
            return r1
        L_0x0018:
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.storage.FileSource.b(android.content.Context):java.lang.String");
    }

    public static synchronized FileSource c(Context context) {
        FileSource fileSource;
        synchronized (FileSource.class) {
            try {
                if (f146081e == null) {
                    f146081e = new FileSource(e(context));
                }
                fileSource = f146081e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return fileSource;
    }

    public static String d(Context context) {
        Lock lock = f146078b;
        lock.lock();
        try {
            if (f146080d == null) {
                f146080d = context.getCacheDir().getAbsolutePath();
            }
            String str = f146080d;
            lock.unlock();
            return str;
        } catch (Throwable th2) {
            f146078b.unlock();
            throw th2;
        }
    }

    public static String e(Context context) {
        Lock lock = f146077a;
        lock.lock();
        try {
            if (f146079c == null) {
                f146079c = a(context);
            }
            String str = f146079c;
            lock.unlock();
            return str;
        } catch (Throwable th2) {
            f146077a.unlock();
            throw th2;
        }
    }

    public static void f(Context context) {
        g.a("Mbgl-FileSource");
        new a().execute(new Context[]{context});
    }

    private static boolean g(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getBoolean("com.mapbox.SetStorageExternal", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.e("Mbgl-FileSource", "Failed to read the package metadata: ", e10);
            c.d(e10);
            return false;
        } catch (Exception e11) {
            Logger.e("Mbgl-FileSource", "Failed to read the storage key: ", e11);
            c.d(e11);
            return false;
        }
    }

    public static boolean h() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        Logger.w("Mbgl-FileSource", "External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage).");
        return false;
    }

    private static boolean i(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return new File(str).canWrite();
    }

    @Keep
    private native void initialize(String str, String str2, TileServerOptions tileServerOptions);

    @Keep
    private native void setResourceCachePath(String str, ResourcesCachePathChangeCallback resourcesCachePathChangeCallback);

    @Keep
    public native void activate();

    @Keep
    public native void deactivate();

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    @Keep
    public native String getApiBaseUrl();

    @Keep
    public native String getApiKey();

    @Keep
    public native boolean isActivated();

    @Keep
    public native void setApiBaseUrl(String str);

    @Keep
    public native void setApiKey(String str);

    @Keep
    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);

    @Keep
    public native void setTileServerOptions(TileServerOptions tileServerOptions);
}
