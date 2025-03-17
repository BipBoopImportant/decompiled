package com.contentsquare.android.sdk;

import D8.c;
import com.contentsquare.android.sdk.C7162y0;
import kotlin.jvm.internal.C17542s;

public final class U0 extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final int f47168m;

    /* renamed from: n  reason: collision with root package name */
    public final int f47169n;

    /* renamed from: o  reason: collision with root package name */
    public final long f47170o;

    public static final class a extends C7162y0.a<U0> {

        /* renamed from: k  reason: collision with root package name */
        public int f47171k;

        /* renamed from: l  reason: collision with root package name */
        public int f47172l;

        /* renamed from: m  reason: collision with root package name */
        public long f47173m = 250;

        public a() {
            super(23);
        }

        public final C7162y0 a() {
            return new U0(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U0(a aVar) {
        super(aVar);
        C17542s.j(aVar, "builder");
        this.f47168m = aVar.f47171k;
        this.f47169n = aVar.f47172l;
        this.f47170o = aVar.f47173m;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        cVar.j("Scroll - deltaX: " + this.f47168m + " - deltaY: " + this.f47169n + " - Duration: " + this.f47170o);
    }
}
