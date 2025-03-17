package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface b {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f46191a;

        /* renamed from: b  reason: collision with root package name */
        public String f46192b;

        /* renamed from: c  reason: collision with root package name */
        public long f46193c;

        /* renamed from: d  reason: collision with root package name */
        public long f46194d;

        /* renamed from: e  reason: collision with root package name */
        public long f46195e;

        /* renamed from: f  reason: collision with root package name */
        public long f46196f;

        /* renamed from: g  reason: collision with root package name */
        public Map<String, String> f46197g = Collections.emptyMap();

        /* renamed from: h  reason: collision with root package name */
        public List<g> f46198h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        /* access modifiers changed from: package-private */
        public boolean b(long j10) {
            return this.f46195e < j10;
        }

        /* access modifiers changed from: package-private */
        public boolean c(long j10) {
            return this.f46196f < j10;
        }
    }

    void a(String str, boolean z10);

    void b();

    void c(String str, a aVar);

    a get(String str);
}
