package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class A2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f48142a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f48143b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f48144c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f48145d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f48146e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, String> f48147f;

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, Boolean> f48148g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, Integer> f48149h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, Long> f48150i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, Float> f48151j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private static Object f48152k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f48153l;

    /* renamed from: m  reason: collision with root package name */
    private static String[] f48154m = new String[0];

    public static long a(ContentResolver contentResolver, String str, long j10) {
        Object i10 = i(contentResolver);
        long j11 = 0;
        Long l10 = (Long) b(f48150i, str, 0L);
        if (l10 != null) {
            return l10.longValue();
        }
        String c10 = c(contentResolver, str, (String) null);
        if (c10 != null) {
            try {
                long parseLong = Long.parseLong(c10);
                l10 = Long.valueOf(parseLong);
                j11 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        g(i10, f48150i, str, l10);
        return j11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T b(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.A2> r0 = com.google.android.gms.internal.clearcut.A2.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x0010
            r4 = r2
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r4
        L_0x0012:
            r2 = move-exception
            goto L_0x0017
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            r2 = 0
            return r2
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.A2.b(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r12 = r12.query(f48142a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r13}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r12 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r12.moveToFirst() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r14 = r12.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r14 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r14.equals((java.lang.Object) null) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        f(r0, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r14 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0090, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0091, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        f(r0, r13, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0098, code lost:
        if (r12 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009a, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009e, code lost:
        if (r12 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a0, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a3, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.ContentResolver r12, java.lang.String r13, java.lang.String r14) {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.A2> r14 = com.google.android.gms.internal.clearcut.A2.class
            monitor-enter(r14)
            e(r12)     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = f48152k     // Catch:{ all -> 0x001e }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f48147f     // Catch:{ all -> 0x001e }
            boolean r1 = r1.containsKey(r13)     // Catch:{ all -> 0x001e }
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f48147f     // Catch:{ all -> 0x001e }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x001e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x001c
            r2 = r12
        L_0x001c:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            return r2
        L_0x001e:
            r12 = move-exception
            goto L_0x00a4
        L_0x0021:
            java.lang.String[] r1 = f48154m     // Catch:{ all -> 0x001e }
            int r3 = r1.length     // Catch:{ all -> 0x001e }
            r4 = 0
        L_0x0025:
            r5 = 1
            if (r4 >= r3) goto L_0x0063
            r6 = r1[r4]     // Catch:{ all -> 0x001e }
            boolean r6 = r13.startsWith(r6)     // Catch:{ all -> 0x001e }
            if (r6 == 0) goto L_0x0060
            boolean r0 = f48153l     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x003c
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f48147f     // Catch:{ all -> 0x001e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x005e
        L_0x003c:
            java.lang.String[] r0 = f48154m     // Catch:{ all -> 0x001e }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f48147f     // Catch:{ all -> 0x001e }
            java.util.Map r12 = d(r12, r0)     // Catch:{ all -> 0x001e }
            r1.putAll(r12)     // Catch:{ all -> 0x001e }
            f48153l = r5     // Catch:{ all -> 0x001e }
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f48147f     // Catch:{ all -> 0x001e }
            boolean r12 = r12.containsKey(r13)     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x005e
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f48147f     // Catch:{ all -> 0x001e }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x001e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x005c
            r2 = r12
        L_0x005c:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            return r2
        L_0x005e:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            return r2
        L_0x0060:
            int r4 = r4 + 1
            goto L_0x0025
        L_0x0063:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            android.net.Uri r7 = f48142a
            java.lang.String[] r10 = new java.lang.String[]{r13}
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r12
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)
            if (r12 == 0) goto L_0x0095
            boolean r14 = r12.moveToFirst()     // Catch:{ all -> 0x0089 }
            if (r14 != 0) goto L_0x007b
            goto L_0x0095
        L_0x007b:
            java.lang.String r14 = r12.getString(r5)     // Catch:{ all -> 0x0089 }
            if (r14 == 0) goto L_0x008b
            boolean r1 = r14.equals(r2)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x008b
            r14 = r2
            goto L_0x008b
        L_0x0089:
            r13 = move-exception
            goto L_0x009e
        L_0x008b:
            f(r0, r13, r14)     // Catch:{ all -> 0x0089 }
            if (r14 == 0) goto L_0x0091
            r2 = r14
        L_0x0091:
            r12.close()
            return r2
        L_0x0095:
            f(r0, r13, r2)     // Catch:{ all -> 0x0089 }
            if (r12 == 0) goto L_0x009d
            r12.close()
        L_0x009d:
            return r2
        L_0x009e:
            if (r12 == 0) goto L_0x00a3
            r12.close()
        L_0x00a3:
            throw r13
        L_0x00a4:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.A2.c(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> d(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f48143b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void e(ContentResolver contentResolver) {
        if (f48147f == null) {
            f48146e.set(false);
            f48147f = new HashMap<>();
            f48152k = new Object();
            f48153l = false;
            contentResolver.registerContentObserver(f48142a, true, new B2((Handler) null));
        } else if (f48146e.getAndSet(false)) {
            f48147f.clear();
            f48148g.clear();
            f48149h.clear();
            f48150i.clear();
            f48151j.clear();
            f48152k = new Object();
            f48153l = false;
        }
    }

    private static void f(Object obj, String str, String str2) {
        synchronized (A2.class) {
            try {
                if (obj == f48152k) {
                    f48147f.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static <T> void g(Object obj, HashMap<String, T> hashMap, String str, T t10) {
        synchronized (A2.class) {
            try {
                if (obj == f48152k) {
                    hashMap.put(str, t10);
                    f48147f.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean h(ContentResolver contentResolver, String str, boolean z10) {
        Object i10 = i(contentResolver);
        HashMap<String, Boolean> hashMap = f48148g;
        Boolean bool = (Boolean) b(hashMap, str, Boolean.valueOf(z10));
        if (bool != null) {
            return bool.booleanValue();
        }
        String c10 = c(contentResolver, str, (String) null);
        if (c10 != null && !c10.equals("")) {
            if (f48144c.matcher(c10).matches()) {
                bool = Boolean.TRUE;
                z10 = true;
            } else if (f48145d.matcher(c10).matches()) {
                bool = Boolean.FALSE;
                z10 = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + c10 + "\") as boolean");
            }
        }
        g(i10, hashMap, str, bool);
        return z10;
    }

    private static Object i(ContentResolver contentResolver) {
        Object obj;
        synchronized (A2.class) {
            e(contentResolver);
            obj = f48152k;
        }
        return obj;
    }
}
