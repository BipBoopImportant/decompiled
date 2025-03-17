package com.contentsquare.android.sdk;

import D8.c;
import com.contentsquare.android.sdk.C7162y0;
import l8.C8537a;

/* renamed from: com.contentsquare.android.sdk.r0  reason: case insensitive filesystem */
public final class C7148r0 extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final int f47602m;

    /* renamed from: n  reason: collision with root package name */
    public final String f47603n;

    /* renamed from: o  reason: collision with root package name */
    public final C8537a[] f47604o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f47605p;

    /* renamed from: com.contentsquare.android.sdk.r0$a */
    public static final class a extends C7162y0.a<C7148r0> {

        /* renamed from: k  reason: collision with root package name */
        public int f47606k;

        /* renamed from: l  reason: collision with root package name */
        public String f47607l;

        /* renamed from: m  reason: collision with root package name */
        public C8537a[] f47608m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f47609n;

        public a() {
            super(4);
        }

        public final C7162y0 a() {
            return new C7148r0(this);
        }
    }

    public C7148r0(a aVar) {
        super(aVar);
        this.f47602m = aVar.f47606k;
        this.f47603n = aVar.f47607l;
        this.f47604o = aVar.f47608m;
        this.f47605p = aVar.f47609n;
    }

    public final void a() {
        C8537a[] aVarArr = this.f47604o;
        if (aVarArr == null || aVarArr.length == 0) {
            c cVar = C7162y0.f47731l;
            cVar.j("ScreenView - Screen name: " + this.f47603n + " - Screen number: " + this.f47735d);
            return;
        }
        c cVar2 = C7162y0.f47731l;
        cVar2.j("ScreenView - Screen name: " + this.f47603n + " - Screen number: " + this.f47735d + " - cVars " + C8537a.f54796d.a(this.f47604o));
    }
}
