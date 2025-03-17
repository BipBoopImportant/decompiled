package com.contentsquare.android.sdk;

import D8.c;
import QJ.C16311i0;
import QJ.F0;
import TJ.C16505B;
import a9.C6856j2;
import a9.C6908p6;
import a9.E4;
import a9.O3;
import a9.X2;
import a9.Y;
import android.os.Build;
import dI.C17168i;
import f8.C7862a;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.y  reason: case insensitive filesystem */
public final class C7161y {

    /* renamed from: a  reason: collision with root package name */
    public final Y f47717a;

    /* renamed from: b  reason: collision with root package name */
    public final X0 f47718b;

    /* renamed from: c  reason: collision with root package name */
    public final C7141n1 f47719c;

    /* renamed from: d  reason: collision with root package name */
    public final X2 f47720d;

    /* renamed from: e  reason: collision with root package name */
    public final C6856j2 f47721e;

    /* renamed from: f  reason: collision with root package name */
    public final C6908p6 f47722f;

    /* renamed from: g  reason: collision with root package name */
    public final C7150s0 f47723g;

    /* renamed from: h  reason: collision with root package name */
    public final E4 f47724h;

    /* renamed from: i  reason: collision with root package name */
    public final C16505B<C7134k0> f47725i;

    /* renamed from: j  reason: collision with root package name */
    public final O3 f47726j;

    /* renamed from: k  reason: collision with root package name */
    public final C17168i f47727k;

    /* renamed from: l  reason: collision with root package name */
    public final c f47728l = new c("OverlayViewModel");

    /* renamed from: m  reason: collision with root package name */
    public final int f47729m = Build.VERSION.SDK_INT;

    /* renamed from: n  reason: collision with root package name */
    public final C7862a f47730n = new C7862a(this);

    public C7161y(Y y10, X0 x02, C7141n1 n1Var, X2 x22, C6856j2 j2Var, C6908p6 p6Var, C7150s0 s0Var, E4 e42, C16505B b10, O3 o32) {
        C17168i plus = J0.b((F0) null, 1, (Object) null).plus(C16311i0.a());
        C17542s.j(y10, "regularSnapshotCaptureUseCase");
        C17542s.j(x02, "scrollViewCaptureUseCase");
        C17542s.j(n1Var, "recyclerViewCaptureUseCase");
        C17542s.j(x22, "composeScrollUseCase");
        C17542s.j(j2Var, "verticalComposeLazyUseCase");
        C17542s.j(p6Var, "glassPane");
        C17542s.j(s0Var, "snapshotConfigCreator");
        C17542s.j(e42, "navigator");
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(o32, "snapshotPausingController");
        C17542s.j(plus, "coroutineContext");
        this.f47717a = y10;
        this.f47718b = x02;
        this.f47719c = n1Var;
        this.f47720d = x22;
        this.f47721e = j2Var;
        this.f47722f = p6Var;
        this.f47723g = s0Var;
        this.f47724h = e42;
        this.f47725i = b10;
        this.f47726j = o32;
        this.f47727k = plus;
    }
}
