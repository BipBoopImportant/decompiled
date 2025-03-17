package com.contentsquare.android.sdk;

import G8.t;
import a9.C6828f6;
import a9.C6969x4;
import a9.J6;
import a9.M3;
import a9.T;
import android.app.Application;
import android.view.View;
import com.contentsquare.android.sdk.I0;
import com.contentsquare.android.sdk.M0;
import kotlin.jvm.internal.C17542s;
import w8.C8933a;

/* renamed from: com.contentsquare.android.sdk.g0  reason: case insensitive filesystem */
public final class C7126g0 extends C7118c0 {

    /* renamed from: q  reason: collision with root package name */
    public final T f47413q;

    /* renamed from: r  reason: collision with root package name */
    public J6<View> f47414r;

    /* renamed from: s  reason: collision with root package name */
    public final P0 f47415s;

    /* renamed from: t  reason: collision with root package name */
    public final C7138m0 f47416t = new C7138m0();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7126g0(Application application, T t10, t tVar, M3<C8933a> m32) {
        super(application, tVar);
        C17542s.j(application, "application");
        C17542s.j(t10, "touchTargetDetector");
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(m32, "composeInterfaceProvider");
        this.f47413q = t10;
        this.f47415s = new P0(new d1(m32), new N0());
    }

    public final void a() {
        super.a();
        J6<View> j62 = this.f47414r;
        if (j62 != null) {
            J6.a<E> aVar = j62.f42086a;
            while (aVar != null) {
                J6.a<T> aVar2 = aVar.f42089b;
                aVar.f42088a.clear();
                aVar.f42090c = null;
                aVar.f42089b = null;
                aVar = aVar2;
            }
            j62.f42086a = null;
            j62.f42087b = null;
        }
    }

    public final void c(B0 b02) {
        C17542s.j(b02, "gestureResult");
        C17542s.j(b02, "gestureResult");
        J6<View> j62 = this.f47414r;
        if (j62 != null) {
            b02.f46914k = j62;
            I0 a10 = this.f47415s.a(new M0.a(j62, this.f47331e, this.f47332f));
            if (a10 != null) {
                this.f47416t.getClass();
                C17542s.j(a10, "gestureTarget");
                I0.b bVar = a10.f47010b;
                b02.f46906c = bVar instanceof Y0 ? new C6828f6(a10.f47009a, ((Y0) bVar).f47251a) : new C6969x4(a10.f47009a);
                b02.f46904a = a10.f47011c;
            }
        }
    }
}
