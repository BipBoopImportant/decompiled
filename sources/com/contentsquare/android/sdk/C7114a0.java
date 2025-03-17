package com.contentsquare.android.sdk;

import E8.c;
import XH.C16807N;
import a9.C6783a1;
import a9.D3;
import a9.J3;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a;
import com.contentsquare.android.sdk.c1;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

/* renamed from: com.contentsquare.android.sdk.a0  reason: case insensitive filesystem */
public final class C7114a0 implements J3 {

    /* renamed from: a  reason: collision with root package name */
    public final C6783a1 f47277a;

    /* renamed from: b  reason: collision with root package name */
    public final c f47278b;

    /* renamed from: c  reason: collision with root package name */
    public final C17631a<C16807N> f47279c;

    /* renamed from: d  reason: collision with root package name */
    public c1 f47280d;

    /* renamed from: e  reason: collision with root package name */
    public C17642l<? super D3, C16807N> f47281e;

    public C7114a0(C6783a1 a1Var, c cVar, a.f fVar) {
        C17542s.j(a1Var, "liveActivityProvider");
        C17542s.j(cVar, "preferenceStore");
        C17542s.j(fVar, "onExplanationDismissed");
        this.f47277a = a1Var;
        this.f47278b = cVar;
        this.f47279c = fVar;
    }

    public final void a() {
        this.f47279c.invoke();
        this.f47280d = null;
        this.f47281e = null;
    }

    public final void a(c1.a aVar) {
        C17542s.j(aVar, "callback");
        this.f47281e = aVar;
    }
}
