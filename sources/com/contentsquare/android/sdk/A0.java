package com.contentsquare.android.sdk;

import D8.c;
import HJ.C15854t;
import com.contentsquare.android.sdk.C7162y0;
import kotlin.jvm.internal.C17542s;

public final class A0 extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f46889m;

    /* renamed from: n  reason: collision with root package name */
    public final int f46890n;

    /* renamed from: o  reason: collision with root package name */
    public final int f46891o;

    /* renamed from: p  reason: collision with root package name */
    public final int f46892p;

    public static final class a extends C7162y0.a<A0> {

        /* renamed from: k  reason: collision with root package name */
        public String f46893k = "";

        /* renamed from: l  reason: collision with root package name */
        public int f46894l;

        /* renamed from: m  reason: collision with root package name */
        public int f46895m;

        /* renamed from: n  reason: collision with root package name */
        public int f46896n;

        public a() {
            super(9);
        }

        public final C7162y0 a() {
            return new A0(this);
        }
    }

    public A0(a aVar) {
        super(aVar);
        this.f46889m = aVar.f46893k;
        this.f46890n = aVar.f46894l;
        this.f46891o = aVar.f46895m;
        this.f46892p = aVar.f46896n;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        StringBuilder sb2 = new StringBuilder("Swipe ");
        int i10 = this.f46890n;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Complex" : "Right" : "Left" : "Down" : "Up");
        sb2.append(" Slow - Target: {Last view info: ");
        String str = this.f46889m;
        C17542s.j(str, "path");
        String substring = str.substring(C15854t.z0(str, ">", 0, false, 6, (Object) null) + 1);
        C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        sb2.append('}');
        cVar.j(sb2.toString());
    }
}
