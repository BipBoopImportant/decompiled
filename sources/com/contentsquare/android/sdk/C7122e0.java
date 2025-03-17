package com.contentsquare.android.sdk;

import D8.c;
import HJ.C15854t;
import com.contentsquare.android.sdk.C7162y0;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.e0  reason: case insensitive filesystem */
public final class C7122e0 extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f47388m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f47389n;

    /* renamed from: com.contentsquare.android.sdk.e0$a */
    public static final class a extends C7162y0.a<C7122e0> {

        /* renamed from: k  reason: collision with root package name */
        public String f47390k = "";

        /* renamed from: l  reason: collision with root package name */
        public boolean f47391l;

        public a() {
            super(6);
        }

        public final C7162y0 a() {
            return new C7122e0(this);
        }
    }

    public C7122e0(a aVar) {
        super(aVar);
        this.f47388m = aVar.f47390k;
        this.f47389n = aVar.f47391l;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        StringBuilder sb2 = new StringBuilder("Tap - Target: {Last view info: ");
        String str = this.f47388m;
        C17542s.j(str, "path");
        String substring = str.substring(C15854t.z0(str, ">", 0, false, 6, (Object) null) + 1);
        C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        sb2.append("} - Unresponsive: ");
        sb2.append(this.f47389n);
        cVar.j(sb2.toString());
    }
}
