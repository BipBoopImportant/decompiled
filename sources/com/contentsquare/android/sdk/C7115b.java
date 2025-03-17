package com.contentsquare.android.sdk;

import D8.c;
import HJ.C15854t;
import com.contentsquare.android.sdk.C7162y0;

/* renamed from: com.contentsquare.android.sdk.b  reason: case insensitive filesystem */
public final class C7115b extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f47286m;

    /* renamed from: n  reason: collision with root package name */
    public final String f47287n;

    /* renamed from: o  reason: collision with root package name */
    public final String f47288o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f47289p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f47290q;

    /* renamed from: r  reason: collision with root package name */
    public final String f47291r;

    /* renamed from: s  reason: collision with root package name */
    public final Long f47292s;

    /* renamed from: com.contentsquare.android.sdk.b$a */
    public static final class a extends C7162y0.a<C7115b> {

        /* renamed from: k  reason: collision with root package name */
        public String f47293k;

        /* renamed from: l  reason: collision with root package name */
        public String f47294l;

        /* renamed from: m  reason: collision with root package name */
        public String f47295m;

        /* renamed from: n  reason: collision with root package name */
        public Integer f47296n;

        /* renamed from: o  reason: collision with root package name */
        public Integer f47297o;

        /* renamed from: p  reason: collision with root package name */
        public String f47298p;

        /* renamed from: q  reason: collision with root package name */
        public Long f47299q;

        public a() {
            super(26);
        }

        public final C7162y0 a() {
            return new C7115b(this);
        }
    }

    public C7115b(a aVar) {
        super(aVar);
        this.f47286m = aVar.f47293k;
        this.f47287n = aVar.f47294l;
        this.f47288o = aVar.f47295m;
        this.f47289p = aVar.f47297o;
        this.f47290q = aVar.f47296n;
        this.f47291r = aVar.f47298p;
        this.f47292s = aVar.f47299q;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        StringBuilder sb2 = new StringBuilder("JS Error (from ");
        sb2.append(this.f47291r);
        sb2.append(") - ");
        String str = this.f47286m;
        sb2.append(str != null ? C15854t.K1(str, 100) : null);
        cVar.j(sb2.toString());
    }
}
