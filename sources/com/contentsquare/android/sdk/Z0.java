package com.contentsquare.android.sdk;

import D8.c;
import com.contentsquare.android.sdk.C7162y0;
import java.util.List;
import java.util.Map;

public final class Z0 extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f47258m;

    /* renamed from: n  reason: collision with root package name */
    public final String f47259n;

    /* renamed from: o  reason: collision with root package name */
    public final long f47260o;

    /* renamed from: p  reason: collision with root package name */
    public final long f47261p;

    /* renamed from: q  reason: collision with root package name */
    public final int f47262q;

    /* renamed from: r  reason: collision with root package name */
    public final String f47263r;

    /* renamed from: s  reason: collision with root package name */
    public final List<String> f47264s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<String, String> f47265t;

    public static final class a extends C7162y0.a<Z0> {

        /* renamed from: k  reason: collision with root package name */
        public String f47266k;

        /* renamed from: l  reason: collision with root package name */
        public String f47267l;

        /* renamed from: m  reason: collision with root package name */
        public long f47268m;

        /* renamed from: n  reason: collision with root package name */
        public long f47269n;

        /* renamed from: o  reason: collision with root package name */
        public int f47270o;

        /* renamed from: p  reason: collision with root package name */
        public String f47271p;

        /* renamed from: q  reason: collision with root package name */
        public List<String> f47272q;

        /* renamed from: r  reason: collision with root package name */
        public Map<String, String> f47273r;

        public a() {
            super(21);
        }

        public final C7162y0 a() {
            return new Z0(this);
        }
    }

    public Z0(a aVar) {
        super(aVar);
        String str = aVar.f47266k;
        String str2 = "";
        this.f47258m = str == null ? str2 : str;
        String str3 = aVar.f47267l;
        this.f47259n = str3 != null ? str3 : str2;
        this.f47260o = aVar.f47268m;
        this.f47261p = aVar.f47269n;
        this.f47262q = aVar.f47270o;
        this.f47263r = aVar.f47271p;
        this.f47264s = aVar.f47272q;
        this.f47265t = aVar.f47273r;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        cVar.j("API Error (from " + this.f47263r + ") - " + this.f47259n + ' ' + this.f47262q + ' ' + this.f47258m);
    }
}
