package com.contentsquare.android.sdk;

import D8.c;
import com.contentsquare.android.sdk.C7162y0;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.z  reason: case insensitive filesystem */
public final class C7163z extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final int f47753m;

    /* renamed from: n  reason: collision with root package name */
    public final int f47754n;

    /* renamed from: o  reason: collision with root package name */
    public final int f47755o;

    /* renamed from: com.contentsquare.android.sdk.z$a */
    public static final class a extends C7162y0.a<C7163z> {

        /* renamed from: k  reason: collision with root package name */
        public int f47756k;

        /* renamed from: l  reason: collision with root package name */
        public int f47757l;

        /* renamed from: m  reason: collision with root package name */
        public final int f47758m = 250;

        public a() {
            super(5);
        }

        public final C7162y0 a() {
            return new C7163z(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7163z(a aVar) {
        super(aVar);
        C17542s.j(aVar, "builder");
        this.f47753m = aVar.f47756k;
        this.f47754n = aVar.f47757l;
        this.f47755o = aVar.f47758m;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        cVar.j("Resize - Screen width: " + this.f47753m + " - Screen height: " + this.f47754n + " - Duration: " + this.f47755o);
    }
}
