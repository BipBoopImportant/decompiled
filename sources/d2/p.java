package D2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static long f5515a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f5516b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f5517c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f5518d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f5519e;

    static class a {
        static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f5515a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f5516b = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f5517c = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f5518d = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f5519e = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) f5516b.invoke((Object) null, new Object[]{Long.valueOf(f5515a)})).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
