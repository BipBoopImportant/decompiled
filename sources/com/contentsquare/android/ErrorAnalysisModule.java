package com.contentsquare.android;

import E8.b;
import H8.a;
import I8.d;
import M8.i;
import O8.e;
import QJ.M;
import android.content.Context;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import v8.c;
import x8.C8957a;
import x8.C8958b;
import y8.C8993b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/contentsquare/android/ErrorAnalysisModule;", "Lv8/c;", "Lx8/a;", "Lx8/b$a;", "Lx8/b;", "libraryInterface", "LO8/e;", "crashHandlerController", "LI8/c;", "networkEventController", "LI8/d;", "networkEventCounter", "<init>", "(Lx8/b;LO8/e;LI8/c;LI8/d;)V", "(Lx8/b;)V", "error-analysis_release"}, k = 1, mv = {1, 8, 0})
public final class ErrorAnalysisModule implements c, C8957a, C8958b.a {

    /* renamed from: a  reason: collision with root package name */
    public final C8958b f46606a;

    /* renamed from: b  reason: collision with root package name */
    public final D8.c f46607b;

    /* renamed from: c  reason: collision with root package name */
    public final e f46608c;

    /* renamed from: d  reason: collision with root package name */
    public final I8.c f46609d;

    /* renamed from: e  reason: collision with root package name */
    public Context f46610e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46611f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ErrorAnalysisModule(C8958b bVar) {
        this(bVar, (e) null, (I8.c) null, (d) null, 12, (DefaultConstructorMarker) null);
        C17542s.j(bVar, "libraryInterface");
    }

    public final void a(b bVar) {
        C17542s.j(bVar, "key");
        try {
            if (this.f46611f) {
                if (this.f46608c.b()) {
                    Context context = this.f46610e;
                    if (context != null) {
                        this.f46608c.c(context);
                    }
                } else if (this.f46610e != null) {
                    this.f46608c.d();
                }
                if (this.f46609d.k()) {
                    this.f46609d.q();
                } else {
                    this.f46609d.r();
                }
                this.f46609d.m();
            }
        } catch (Throwable th2) {
            this.f46607b.g(th2, "Exception received while start/stop Error Analysis Module from onPreferenceChanged");
        }
    }

    public final void b(Context context) {
        C17542s.j(context, "context");
        try {
            this.f46610e = context;
            this.f46611f = true;
            a.f36485b.a().b(this);
            this.f46606a.k(this);
            if (this.f46608c.b()) {
                Context context2 = this.f46610e;
                if (context2 != null) {
                    this.f46608c.c(context2);
                }
            } else if (this.f46610e != null) {
                this.f46608c.d();
            }
            if (this.f46609d.k()) {
                this.f46609d.q();
            } else {
                this.f46609d.r();
            }
        } catch (Throwable th2) {
            this.f46607b.g(th2, "Exception received while starting Error Analysis Module");
        }
    }

    public final boolean c() {
        return this.f46608c.b();
    }

    public final boolean d() {
        return this.f46609d.k();
    }

    public final void e(C8993b bVar) {
        C17542s.j(bVar, "event");
        try {
            I8.c.o(this.f46609d, bVar, (C17168i) null, 2, (Object) null);
        } catch (Throwable th2) {
            this.f46607b.g(th2, "Exception received while sending api error");
        }
    }

    public final void f(Context context) {
        C17542s.j(context, "context");
        try {
            this.f46610e = null;
            this.f46611f = false;
            a.f36485b.a().b((C8957a) null);
            this.f46608c.d();
            this.f46609d.r();
        } catch (Throwable th2) {
            this.f46607b.g(th2, "Exception received while stopping Error Analysis Module");
        }
    }

    public ErrorAnalysisModule(C8958b bVar, e eVar, I8.c cVar, d dVar) {
        I8.c cVar2;
        C8958b bVar2 = bVar;
        C17542s.j(bVar2, "libraryInterface");
        this.f46606a = bVar2;
        this.f46607b = new D8.c("ErrorAnalysisModule");
        this.f46608c = eVar == null ? new e(new O8.d(bVar, new O8.c((C8.a) null, 1, (DefaultConstructorMarker) null), (M) null, 4, (DefaultConstructorMarker) null), bVar, (D8.c) null, 4, (DefaultConstructorMarker) null) : eVar;
        L8.e eVar2 = new L8.e();
        L8.a aVar = new L8.a();
        J8.b bVar3 = new J8.b((byte[]) null, (byte[]) null, 3, (DefaultConstructorMarker) null);
        J8.a aVar2 = new J8.a(bVar2, (byte[]) null, 2, (DefaultConstructorMarker) null);
        L8.c cVar3 = new L8.c(bVar3, aVar2, bVar2);
        if (cVar == null) {
            cVar2 = new I8.c(new K8.a(eVar2, new L8.b(), new L8.d(), aVar, cVar3, bVar), new i(bVar, aVar2, bVar3, (C17631a) null, 8, (DefaultConstructorMarker) null), new K8.b(eVar2, aVar, cVar3), dVar == null ? new d() : dVar, bVar, (D8.c) null, 32, (DefaultConstructorMarker) null);
        } else {
            cVar2 = cVar;
        }
        this.f46609d = cVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorAnalysisModule(C8958b bVar, e eVar, I8.c cVar, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? null : dVar);
    }
}
