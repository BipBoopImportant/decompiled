package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c  reason: case insensitive filesystem */
public final class C7173c {

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentHashMap<Uri, C7173c> f48338h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f48339i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f48340a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f48341b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentObserver f48342c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f48343d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, String> f48344e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f48345f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final List<C7179e> f48346g = new ArrayList();

    private C7173c(ContentResolver contentResolver, Uri uri) {
        this.f48340a = contentResolver;
        this.f48341b = uri;
        this.f48342c = new C7176d(this, (Handler) null);
    }

    public static C7173c a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap<Uri, C7173c> concurrentHashMap = f48338h;
        C7173c cVar = concurrentHashMap.get(uri);
        if (cVar != null) {
            return cVar;
        }
        C7173c cVar2 = new C7173c(contentResolver, uri);
        C7173c putIfAbsent = concurrentHashMap.putIfAbsent(uri, cVar2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        cVar2.f48340a.registerContentObserver(cVar2.f48341b, false, cVar2.f48342c);
        return cVar2;
    }

    private final Map<String, String> e() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.f48340a.query(this.f48341b, f48339i, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th2) {
            query.close();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public final void f() {
        synchronized (this.f48345f) {
            try {
                for (C7179e a10 : this.f48346g) {
                    a10.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> c() {
        Map<String, String> e10 = C7182f.h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? e() : this.f48344e;
        if (e10 == null) {
            synchronized (this.f48343d) {
                try {
                    Map<String, String> map = this.f48344e;
                    if (map == null) {
                        map = e();
                        this.f48344e = map;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return e10 != null ? e10 : Collections.emptyMap();
    }

    public final void d() {
        synchronized (this.f48343d) {
            this.f48344e = null;
        }
    }
}
