package com.contentsquare.android.sdk;

import D8.c;
import HJ.C15854t;
import com.contentsquare.android.sdk.C7162y0;
import kotlin.jvm.internal.C17542s;

public final class Q extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f47116m;

    /* renamed from: n  reason: collision with root package name */
    public final int f47117n;

    /* renamed from: o  reason: collision with root package name */
    public final int f47118o;

    /* renamed from: p  reason: collision with root package name */
    public final int f47119p;

    public static final class a extends C7162y0.a<Q> {

        /* renamed from: k  reason: collision with root package name */
        public String f47120k = "";

        /* renamed from: l  reason: collision with root package name */
        public int f47121l;

        /* renamed from: m  reason: collision with root package name */
        public int f47122m;

        /* renamed from: n  reason: collision with root package name */
        public int f47123n;

        public a() {
            super(10);
        }

        public final C7162y0 a() {
            return new Q(this);
        }
    }

    public Q(a aVar) {
        super(aVar);
        this.f47116m = aVar.f47120k;
        this.f47117n = aVar.f47121l;
        this.f47118o = aVar.f47122m;
        this.f47119p = aVar.f47123n;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        StringBuilder sb2 = new StringBuilder("Swipe ");
        int i10 = this.f47117n;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Complex" : "Right" : "Left" : "Down" : "Up");
        sb2.append(" Fast - Target: {Last view info: ");
        String str = this.f47116m;
        C17542s.j(str, "path");
        String substring = str.substring(C15854t.z0(str, ">", 0, false, 6, (Object) null) + 1);
        C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        sb2.append('}');
        cVar.j(sb2.toString());
    }
}
