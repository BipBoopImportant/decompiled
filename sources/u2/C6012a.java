package u2;

import D2.h;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.s;
import java.io.File;
import java.util.concurrent.Executor;
import w2.C6214h;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: u2.a  reason: case insensitive filesystem */
public class C6012a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f30059a = new Object();

    /* renamed from: u2.a$a  reason: collision with other inner class name */
    static class C0469a {
        static Drawable a(Context context, int i10) {
            return context.getDrawable(i10);
        }

        static File b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: u2.a$b */
    static class b {
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }
    }

    /* renamed from: u2.a$c */
    static class c {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* renamed from: u2.a$d */
    static class d {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            if ((i10 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C6012a.k(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: u2.a$e */
    static class e {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: u2.a$f */
    static class f {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    public static int a(Context context, String str) {
        H2.c.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : s.g(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        return c.a(context);
    }

    public static int c(Context context, int i10) {
        return b.a(context, i10);
    }

    public static ColorStateList d(Context context, int i10) {
        return C6214h.d(context.getResources(), i10, context.getTheme());
    }

    public static Drawable e(Context context, int i10) {
        return C0469a.a(context, i10);
    }

    @Deprecated
    public static File[] f(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] g(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : h.a(new Handler(context.getMainLooper()));
    }

    public static File i(Context context) {
        return C0469a.b(context);
    }

    public static <T> T j(Context context, Class<T> cls) {
        return b.b(context, cls);
    }

    static String k(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (e.c(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return m(context, broadcastReceiver, intentFilter, (String) null, (Handler) null, i10);
    }

    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 == 0 || (i10 & 4) == 0) {
            if (i11 != 0) {
                i10 |= 2;
            }
            int i12 = i10;
            int i13 = i12 & 2;
            if (i13 == 0 && (i12 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else if (i13 == 0 || (i12 & 4) == 0) {
                return Build.VERSION.SDK_INT >= 33 ? f.a(context, broadcastReceiver, intentFilter, str, handler, i12) : d.a(context, broadcastReceiver, intentFilter, str, handler, i12);
            } else {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            }
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
    }

    public static boolean n(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    public static void o(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void p(Context context, Intent intent) {
        d.b(context, intent);
    }
}
