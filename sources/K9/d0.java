package K9;

import S9.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f37822a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f37823b;

    /* renamed from: c  reason: collision with root package name */
    private static String f37824c;

    /* renamed from: d  reason: collision with root package name */
    private static int f37825d;

    public static int a(Context context) {
        b(context);
        return f37825d;
    }

    private static void b(Context context) {
        synchronized (f37822a) {
            try {
                if (!f37823b) {
                    f37823b = true;
                    Bundle bundle = c.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f37824c = bundle.getString("com.google.app.id");
                        f37825d = bundle.getInt("com.google.android.gms.version");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
