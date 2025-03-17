package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import j0.C5445a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb.l;

/* renamed from: com.google.android.gms.internal.measurement.m3  reason: case insensitive filesystem */
public final class C7356m3 implements C7381p3 {

    /* renamed from: h  reason: collision with root package name */
    private static final Map<Uri, C7356m3> f49004h = new C5445a();

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f49005i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f49006a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f49007b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f49008c;

    /* renamed from: d  reason: collision with root package name */
    private final ContentObserver f49009d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f49010e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile Map<String, String> f49011f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C7365n3> f49012g = new ArrayList();

    private C7356m3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C7373o3 o3Var = new C7373o3(this, (Handler) null);
        this.f49009d = o3Var;
        l.j(contentResolver);
        l.j(uri);
        this.f49006a = contentResolver;
        this.f49007b = uri;
        this.f49008c = runnable;
        contentResolver.registerContentObserver(uri, false, o3Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C7356m3 a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.m3> r0 = com.google.android.gms.internal.measurement.C7356m3.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.m3> r1 = f49004h     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.measurement.m3 r2 = (com.google.android.gms.internal.measurement.C7356m3) r2     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0019
            com.google.android.gms.internal.measurement.m3 r3 = new com.google.android.gms.internal.measurement.m3     // Catch:{ SecurityException -> 0x0019 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0019 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
            goto L_0x0019
        L_0x0017:
            r4 = move-exception
            goto L_0x001b
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r2
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7356m3.a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.m3");
    }

    static synchronized void d() {
        synchronized (C7356m3.class) {
            try {
                for (C7356m3 next : f49004h.values()) {
                    next.f49006a.unregisterContentObserver(next.f49009d);
                }
                f49004h.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final /* synthetic */ Map f() {
        Cursor query;
        ContentProviderClient acquireUnstableContentProviderClient = this.f49006a.acquireUnstableContentProviderClient(this.f49007b);
        if (acquireUnstableContentProviderClient == null) {
            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
            return Collections.emptyMap();
        }
        try {
            query = acquireUnstableContentProviderClient.query(this.f49007b, f49005i, (String) null, (String[]) null, (String) null);
            if (query == null) {
                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                Map emptyMap = Collections.emptyMap();
                if (query != null) {
                    query.close();
                }
                acquireUnstableContentProviderClient.release();
                return emptyMap;
            }
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap2 = Collections.emptyMap();
                query.close();
                acquireUnstableContentProviderClient.release();
                return emptyMap2;
            }
            Map aVar = count <= 256 ? new C5445a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            if (!query.isAfterLast()) {
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map emptyMap3 = Collections.emptyMap();
                query.close();
                acquireUnstableContentProviderClient.release();
                return emptyMap3;
            }
            query.close();
            acquireUnstableContentProviderClient.release();
            return aVar;
        } catch (RemoteException e10) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            Map emptyMap4 = Collections.emptyMap();
            acquireUnstableContentProviderClient.release();
            return emptyMap4;
        } catch (Throwable th2) {
            acquireUnstableContentProviderClient.release();
            throw th2;
        }
        throw th;
    }

    private final Map<String, String> g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return (Map) C7404s3.a(new C7347l3(this));
        } catch (SQLiteException | IllegalStateException | SecurityException e10) {
            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
            return Collections.emptyMap();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map = this.f49011f;
        if (map == null) {
            synchronized (this.f49010e) {
                try {
                    map = this.f49011f;
                    if (map == null) {
                        map = g();
                        this.f49011f = map;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void e() {
        synchronized (this.f49010e) {
            this.f49011f = null;
            this.f49008c.run();
        }
        synchronized (this) {
            try {
                for (C7365n3 zza : this.f49012g) {
                    zza.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Object zza(String str) {
        return b().get(str);
    }
}
