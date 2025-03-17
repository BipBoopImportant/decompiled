package com.contentsquare.android.sdk;

import D8.c;
import F8.g;
import com.contentsquare.android.sdk.C7163z;
import com.contentsquare.android.sdk.F;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.h0  reason: case insensitive filesystem */
public final class C7128h0 implements F.a {

    /* renamed from: a  reason: collision with root package name */
    public final C7133k f47421a;

    /* renamed from: b  reason: collision with root package name */
    public final O0 f47422b;

    /* renamed from: c  reason: collision with root package name */
    public final g f47423c;

    /* renamed from: d  reason: collision with root package name */
    public final c f47424d = new c("ScreenOrientationChangeHandler");

    public C7128h0(C7133k kVar, O0 o02, g gVar) {
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(gVar, "deviceInfo");
        this.f47421a = kVar;
        this.f47422b = o02;
        this.f47423c = gVar;
    }

    public final void a(int i10, int i11) {
        int r10 = this.f47423c.r(i10);
        int r11 = this.f47423c.r(i11);
        c cVar = this.f47424d;
        cVar.f("Screen dimensions: " + i10 + 'x' + i11 + ", " + r10 + 'x' + r11 + "dp");
        C7163z.a aVar = (C7163z.a) C7133k.b(this.f47421a, 5);
        aVar.f47756k = r10;
        aVar.f47757l = r11;
        this.f47422b.a(aVar);
        c cVar2 = this.f47424d;
        StringBuilder sb2 = new StringBuilder("message sent to the reservoir: [ ");
        sb2.append(aVar);
        sb2.append(" ]");
        cVar2.f(sb2.toString());
    }
}
