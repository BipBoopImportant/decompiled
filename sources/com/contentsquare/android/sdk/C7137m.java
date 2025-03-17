package com.contentsquare.android.sdk;

import D8.c;
import TJ.C16505B;
import XH.C16807N;
import a9.C6839h1;
import a9.C6892n6;
import a9.C6908p6;
import a9.C6984z3;
import a9.D4;
import a9.W3;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.C7158w0;
import dI.C17164e;
import eI.C17187b;
import kotlin.jvm.internal.C17542s;
import nI.p;

/* renamed from: com.contentsquare.android.sdk.m  reason: case insensitive filesystem */
public final class C7137m extends C7140n0<C7158w0.c> {

    /* renamed from: e  reason: collision with root package name */
    public final C7120d0 f47496e;

    /* renamed from: f  reason: collision with root package name */
    public final C6839h1 f47497f;

    /* renamed from: g  reason: collision with root package name */
    public final p<View, W3, C6984z3> f47498g;

    /* renamed from: h  reason: collision with root package name */
    public final c f47499h = new c("RegularScreenRecorder");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7137m(C7120d0 d0Var, C16505B b10, C7132j0 j0Var, C6908p6 p6Var, C6892n6 n6Var) {
        super(b10, p6Var);
        C17542s.j(d0Var, "screenGraphProducer");
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(j0Var, "callback");
        C17542s.j(p6Var, "glassPane");
        C17542s.j(n6Var, "composeScreenGraphGenerator");
        this.f47496e = d0Var;
        this.f47497f = j0Var;
        this.f47498g = n6Var;
    }

    public final c a() {
        return this.f47499h;
    }

    public final void c(C7158w0 w0Var) {
        C17542s.j((C7158w0.c) w0Var, "context");
    }

    public final Object f(C7158w0 w0Var, C17164e eVar) {
        C7158w0.c cVar = (C7158w0.c) w0Var;
        C7120d0 d0Var = this.f47496e;
        ViewGroup e10 = e();
        C17542s.g(e10);
        String i10 = i();
        C17542s.g(i10);
        Object a10 = d0Var.a(e10, i10, h(), ((D4) this.f47533b).f41962f, this.f47497f, this.f47498g, eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public final boolean g(C7158w0 w0Var) {
        C17542s.j((C7158w0.c) w0Var, "context");
        return true;
    }

    public final void j() {
    }
}
