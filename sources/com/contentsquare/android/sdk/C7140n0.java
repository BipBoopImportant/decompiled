package com.contentsquare.android.sdk;

import D8.c;
import HJ.C15854t;
import TJ.C16505B;
import XH.C16807N;
import a9.C6908p6;
import a9.D4;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.C7158w0;
import dI.C17164e;
import eI.C17187b;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.n0  reason: case insensitive filesystem */
public abstract class C7140n0<CONTEXT extends C7158w0> {

    /* renamed from: a  reason: collision with root package name */
    public final C16505B<C7134k0> f47532a;

    /* renamed from: b  reason: collision with root package name */
    public final C6908p6 f47533b;

    /* renamed from: c  reason: collision with root package name */
    public String f47534c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f47535d;

    public C7140n0(C16505B<C7134k0> b10, C6908p6 p6Var) {
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(p6Var, "glassPane");
        this.f47532a = b10;
        this.f47533b = p6Var;
    }

    public abstract c a();

    public final Object b(CONTEXT context, C17164e<? super C16807N> eVar) {
        if (g(context)) {
            this.f47532a.a(C7134k0.c.f47476a);
        }
        if (i() == null) {
            a().h("Failed to capture screen, no screenview");
            C7134k0.b.d dVar = C7134k0.b.d.f47473a;
            C17542s.j(dVar, "reason");
            this.f47532a.a(new C7134k0.a(dVar, h()));
        } else if (e() == null) {
            a().h("Failed to capture screen, decorView is null");
            C7134k0.b.e eVar2 = C7134k0.b.e.f47474a;
            C17542s.j(eVar2, "reason");
            this.f47532a.a(new C7134k0.a(eVar2, h()));
        } else {
            c(context);
            if (g(context)) {
                j();
            }
            Object f10 = f(context, eVar);
            return f10 == C17187b.f() ? f10 : C16807N.f139792a;
        }
        return C16807N.f139792a;
    }

    public abstract void c(CONTEXT context);

    public final void d(Throwable th2) {
        C7134k0.b bVar;
        C17542s.j(th2, "exception");
        if (th2 instanceof OutOfMemoryError) {
            bVar = C7134k0.b.f.f47475a;
        } else {
            C17542s.j(th2, "<this>");
            String message = th2.getMessage();
            bVar = (message == null || !C15854t.d0(message, "hardware bitmap", false, 2, (Object) null)) ? C7134k0.b.e.f47474a : C7134k0.b.a.f47470a;
        }
        c a10 = a();
        a10.i(th2, "Failed to capture screen: " + bVar);
        C17542s.j(bVar, "reason");
        this.f47532a.a(new C7134k0.a(bVar, h()));
    }

    public final ViewGroup e() {
        return ((D4) this.f47533b).f41964h.get();
    }

    public abstract Object f(CONTEXT context, C17164e<? super C16807N> eVar);

    public abstract boolean g(CONTEXT context);

    public final String h() {
        String str = ((D4) this.f47533b).f41961e;
        return str == null ? "" : str;
    }

    public final String i() {
        return ((D4) this.f47533b).f41960d;
    }

    public abstract void j();
}
