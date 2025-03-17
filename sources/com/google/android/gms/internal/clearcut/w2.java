package com.google.android.gms.internal.clearcut;

import E9.a;
import S9.c;
import android.content.Context;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.i2;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import ta.b;

public final class w2 implements a.b {

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f48504b = Charset.forName(Constants.ENCODING);

    /* renamed from: c  reason: collision with root package name */
    private static final C7212p f48505c;

    /* renamed from: d  reason: collision with root package name */
    private static final C7212p f48506d = new C7212p(b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:sampling_").h("LogSampling__");

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, C7182f<i2>> f48507e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, C7182f<String>> f48508f = new HashMap<>();
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f48509g = null;
    @VisibleForTesting

    /* renamed from: h  reason: collision with root package name */
    private static Long f48510h = null;
    @VisibleForTesting

    /* renamed from: i  reason: collision with root package name */
    private static final C7182f<Boolean> f48511i;

    /* renamed from: a  reason: collision with root package name */
    private final Context f48512a;

    static {
        C7212p h10 = new C7212p(b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:samplingrules_").h("LogSamplingRules__");
        f48505c = h10;
        f48511i = h10.e("enable_log_sampling_rules", false);
    }

    public w2(Context context) {
        this.f48512a = context;
        if (context != null) {
            C7182f.b(context);
        }
    }

    @VisibleForTesting
    private static long b(String str, long j10) {
        if (str == null || str.isEmpty()) {
            return r2.c(ByteBuffer.allocate(8).putLong(j10).array());
        }
        byte[] bytes = str.getBytes(f48504b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j10);
        return r2.c(allocate.array());
    }

    @VisibleForTesting
    private static i2.b c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i10 = 0;
        if (indexOf >= 0) {
            i10 = indexOf + 1;
            str2 = str.substring(0, indexOf);
        } else {
            str2 = "";
        }
        int indexOf2 = str.indexOf(47, i10);
        if (indexOf2 <= 0) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i10, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return (i2.b) i2.b.t().k(str2).l(parseLong).m(parseLong2).j();
            }
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("negative values not supported: ");
            sb2.append(parseLong);
            sb2.append("/");
            sb2.append(parseLong2);
            Log.e("LogSamplerImpl", sb2.toString());
            return null;
        } catch (NumberFormatException e10) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e10);
            return null;
        }
    }

    @VisibleForTesting
    private static boolean d(long j10, long j11, long j12) {
        if (j11 < 0 || j12 <= 0) {
            return true;
        }
        return ((j10 > 0 ? 1 : (j10 == 0 ? 0 : -1)) >= 0 ? j10 % j12 : (((Long.MAX_VALUE % j12) + 1) + ((j10 & Long.MAX_VALUE) % j12)) % j12) < j11;
    }

    private static boolean e(Context context) {
        if (f48509g == null) {
            f48509g = Boolean.valueOf(c.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f48509g.booleanValue();
    }

    @VisibleForTesting
    private static long f(Context context) {
        if (f48510h == null) {
            long j10 = 0;
            if (context == null) {
                return 0;
            }
            if (e(context)) {
                j10 = A2.a(context.getContentResolver(), "android_id", 0);
            }
            f48510h = Long.valueOf(j10);
        }
        return f48510h.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r3 = f48505c.a(r1, com.google.android.gms.internal.clearcut.i2.m(), com.google.android.gms.internal.clearcut.x2.f48516a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(E9.f r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.clearcut.y2 r0 = r13.f35291a
            java.lang.String r1 = r0.f48524g
            int r0 = r0.f48520c
            com.google.android.gms.internal.clearcut.n2 r13 = r13.f35299i
            r2 = 0
            if (r13 == 0) goto L_0x000e
            int r13 = r13.f48443g
            goto L_0x000f
        L_0x000e:
            r13 = r2
        L_0x000f:
            com.google.android.gms.internal.clearcut.f<java.lang.Boolean> r3 = f48511i
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L_0x0077
            if (r1 == 0) goto L_0x0027
            boolean r13 = r1.isEmpty()
            if (r13 != 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            if (r0 < 0) goto L_0x002e
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x002f
        L_0x002e:
            r1 = r4
        L_0x002f:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r13 = r12.f48512a
            if (r13 == 0) goto L_0x0056
            boolean r13 = e(r13)
            if (r13 != 0) goto L_0x003c
            goto L_0x0056
        L_0x003c:
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.clearcut.f<java.lang.String>> r13 = f48508f
            java.lang.Object r0 = r13.get(r1)
            com.google.android.gms.internal.clearcut.f r0 = (com.google.android.gms.internal.clearcut.C7182f) r0
            if (r0 != 0) goto L_0x004f
            com.google.android.gms.internal.clearcut.p r0 = f48506d
            com.google.android.gms.internal.clearcut.f r0 = r0.b(r1, r4)
            r13.put(r1, r0)
        L_0x004f:
            java.lang.Object r13 = r0.a()
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
        L_0x0056:
            com.google.android.gms.internal.clearcut.i2$b r13 = c(r4)
            if (r13 == 0) goto L_0x00fb
            java.lang.String r0 = r13.q()
            android.content.Context r1 = r12.f48512a
            long r1 = f(r1)
            long r3 = b(r0, r1)
            long r5 = r13.r()
            long r7 = r13.s()
            boolean r13 = d(r3, r5, r7)
            return r13
        L_0x0077:
            if (r1 == 0) goto L_0x0080
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0080
            goto L_0x0088
        L_0x0080:
            if (r0 < 0) goto L_0x0087
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0088
        L_0x0087:
            r1 = r4
        L_0x0088:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r0 = r12.f48512a
            if (r0 != 0) goto L_0x0093
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00bc
        L_0x0093:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.android.gms.internal.clearcut.f<com.google.android.gms.internal.clearcut.i2>> r0 = f48507e
            java.lang.Object r3 = r0.get(r1)
            com.google.android.gms.internal.clearcut.f r3 = (com.google.android.gms.internal.clearcut.C7182f) r3
            if (r3 != 0) goto L_0x00b2
            com.google.android.gms.internal.clearcut.p r3 = f48505c
            com.google.android.gms.internal.clearcut.i2 r4 = com.google.android.gms.internal.clearcut.i2.m()
            com.google.android.gms.internal.clearcut.o r5 = com.google.android.gms.internal.clearcut.x2.f48516a
            com.google.android.gms.internal.clearcut.f r3 = r3.a(r1, r4, r5)
            java.lang.Object r0 = r0.putIfAbsent(r1, r3)
            com.google.android.gms.internal.clearcut.f r0 = (com.google.android.gms.internal.clearcut.C7182f) r0
            if (r0 == 0) goto L_0x00b2
            r3 = r0
        L_0x00b2:
            java.lang.Object r0 = r3.a()
            com.google.android.gms.internal.clearcut.i2 r0 = (com.google.android.gms.internal.clearcut.i2) r0
            java.util.List r0 = r0.l()
        L_0x00bc:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.clearcut.i2$b r1 = (com.google.android.gms.internal.clearcut.i2.b) r1
            boolean r3 = r1.p()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.l()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.l()
            if (r3 != r13) goto L_0x00c0
        L_0x00de:
            java.lang.String r3 = r1.q()
            android.content.Context r4 = r12.f48512a
            long r4 = f(r4)
            long r6 = b(r3, r4)
            long r8 = r1.r()
            long r10 = r1.s()
            boolean r1 = d(r6, r8, r10)
            if (r1 != 0) goto L_0x00c0
            return r2
        L_0x00fb:
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.w2.a(E9.f):boolean");
    }
}
