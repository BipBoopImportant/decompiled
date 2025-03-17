package com.google.firebase.remoteconfig.internal;

import Ic.k;
import Ic.m;
import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class t {

    /* renamed from: f  reason: collision with root package name */
    static final Date f68829f = new Date(-1);

    /* renamed from: g  reason: collision with root package name */
    static final Date f68830g = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f68831a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f68832b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f68833c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f68834d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Object f68835e = new Object();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f68836a;

        /* renamed from: b  reason: collision with root package name */
        private Date f68837b;

        a(int i10, Date date) {
            this.f68836a = i10;
            this.f68837b = date;
        }

        /* access modifiers changed from: package-private */
        public Date a() {
            return this.f68837b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f68836a;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f68838a;

        /* renamed from: b  reason: collision with root package name */
        private Date f68839b;

        public b(int i10, Date date) {
            this.f68838a = i10;
            this.f68839b = date;
        }

        /* access modifiers changed from: package-private */
        public Date a() {
            return this.f68839b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f68838a;
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f68831a = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.f68833c) {
            aVar = new a(this.f68831a.getInt("num_failed_fetches", 0), new Date(this.f68831a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public Map<String, String> b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f68831a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long c() {
        return this.f68831a.getLong("fetch_timeout_in_seconds", 60);
    }

    public k d() {
        v a10;
        synchronized (this.f68832b) {
            long j10 = this.f68831a.getLong("last_fetch_time_in_millis", -1);
            int i10 = this.f68831a.getInt("last_fetch_status", 0);
            a10 = v.b().c(i10).d(j10).b(new m.b().d(this.f68831a.getLong("fetch_timeout_in_seconds", 60)).e(this.f68831a.getLong("minimum_fetch_interval_in_seconds", m.f68769j)).c()).a();
        }
        return a10;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f68831a.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Date f() {
        return new Date(this.f68831a.getLong("last_fetch_time_in_millis", -1));
    }

    /* access modifiers changed from: package-private */
    public long g() {
        return this.f68831a.getLong("last_template_version", 0);
    }

    public long h() {
        return this.f68831a.getLong("minimum_fetch_interval_in_seconds", m.f68769j);
    }

    public b i() {
        b bVar;
        synchronized (this.f68834d) {
            bVar = new b(this.f68831a.getInt("num_failed_realtime_streams", 0), new Date(this.f68831a.getLong("realtime_backoff_end_time_in_millis", -1)));
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        l(0, f68830g);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        o(0, f68830g);
    }

    /* access modifiers changed from: package-private */
    public void l(int i10, Date date) {
        synchronized (this.f68833c) {
            this.f68831a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void m(String str) {
        synchronized (this.f68832b) {
            this.f68831a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void n(long j10) {
        synchronized (this.f68832b) {
            this.f68831a.edit().putLong("last_template_version", j10).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void o(int i10, Date date) {
        synchronized (this.f68834d) {
            this.f68831a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f68832b) {
            this.f68831a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void q(Date date) {
        synchronized (this.f68832b) {
            this.f68831a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        synchronized (this.f68832b) {
            this.f68831a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
