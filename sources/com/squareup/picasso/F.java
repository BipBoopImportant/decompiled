package com.squareup.picasso;

import WK.C16772g;
import WK.C16773h;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

final class F {

    /* renamed from: a  reason: collision with root package name */
    static final StringBuilder f122500a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private static final C16773h f122501b = C16773h.n("RIFF");

    /* renamed from: c  reason: collision with root package name */
    private static final C16773h f122502c = C16773h.n("WEBP");

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class c implements ThreadFactory {
        c() {
        }

        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    @TargetApi(18)
    static long a(File file) {
        long j10;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j10 = 5242880;
        }
        return Math.max(Math.min(j10, 52428800), 5242880);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) n(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & ImageMetadata.SHADING_MODE) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7);
    }

    static void c() {
        if (!q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static <T> T d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static File e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String f(w wVar) {
        StringBuilder sb2 = f122500a;
        String g10 = g(wVar, sb2);
        sb2.setLength(0);
        return g10;
    }

    static String g(w wVar, StringBuilder sb2) {
        String str = wVar.f122640f;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(wVar.f122640f);
        } else {
            Uri uri = wVar.f122638d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb2.ensureCapacity(uri2.length() + 50);
                sb2.append(uri2);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(wVar.f122639e);
            }
        }
        sb2.append(10);
        if (wVar.f122648n != 0.0f) {
            sb2.append("rotation:");
            sb2.append(wVar.f122648n);
            if (wVar.f122651q) {
                sb2.append('@');
                sb2.append(wVar.f122649o);
                sb2.append('x');
                sb2.append(wVar.f122650p);
            }
            sb2.append(10);
        }
        if (wVar.c()) {
            sb2.append("resize:");
            sb2.append(wVar.f122642h);
            sb2.append('x');
            sb2.append(wVar.f122643i);
            sb2.append(10);
        }
        if (wVar.f122644j) {
            sb2.append("centerCrop:");
            sb2.append(wVar.f122645k);
            sb2.append(10);
        } else if (wVar.f122646l) {
            sb2.append("centerInside");
            sb2.append(10);
        }
        List<E> list = wVar.f122641g;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(wVar.f122641g.get(i10).a());
                sb2.append(10);
            }
        }
        return sb2.toString();
    }

    static void h(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    static int i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String j(C14192c cVar) {
        return k(cVar, "");
    }

    static String k(C14192c cVar, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        C14190a h10 = cVar.h();
        if (h10 != null) {
            sb2.append(h10.f122505b.d());
        }
        List<C14190a> i10 = cVar.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 > 0 || h10 != null) {
                    sb2.append(", ");
                }
                sb2.append(i10.get(i11).f122505b.d());
            }
        }
        return sb2.toString();
    }

    static int l(Resources resources, w wVar) {
        Uri uri;
        int i10 = wVar.f122639e;
        if (i10 != 0 || (uri = wVar.f122638d) == null) {
            return i10;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f122638d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + wVar.f122638d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f122638d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + wVar.f122638d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f122638d);
        }
    }

    static Resources m(Context context, w wVar) {
        Uri uri;
        if (wVar.f122639e != 0 || (uri = wVar.f122638d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f122638d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f122638d);
        }
    }

    static <T> T n(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean p(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean r(C16772g gVar) {
        return gVar.h3(0, f122501b) && gVar.h3(8, f122502c);
    }

    static void s(String str, String str2, String str3) {
        t(str, str2, str3, "");
    }

    static void t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }
}
