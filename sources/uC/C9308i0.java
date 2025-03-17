package Uc;

import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oa.C8619c;
import s0.C5834E;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@FX\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"LUc/i0;", "LUc/a0;", "Loa/c;", "map", "LUc/d;", "cameraPositionState", "", "contentDescription", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Ls0/E;", "contentPadding", "<init>", "(Loa/c;LUc/d;Ljava/lang/String;Lc2/d;Lc2/t;Ls0/E;)V", "LXH/N;", "b", "()V", "c", "a", "Loa/c;", "getMap", "()Loa/c;", "Lc2/d;", "h", "()Lc2/d;", "p", "(Lc2/d;)V", "Lc2/t;", "i", "()Lc2/t;", "q", "(Lc2/t;)V", "value", "d", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "e", "LUc/d;", "getCameraPositionState", "()LUc/d;", "n", "(LUc/d;)V", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.i0  reason: case insensitive filesystem */
public final class C9308i0 implements C9288a0 {

    /* renamed from: a  reason: collision with root package name */
    private final C8619c f64311a;

    /* renamed from: b  reason: collision with root package name */
    private d f64312b;

    /* renamed from: c  reason: collision with root package name */
    private t f64313c;

    /* renamed from: d  reason: collision with root package name */
    private String f64314d;

    /* renamed from: e  reason: collision with root package name */
    private C9296d f64315e;

    public C9308i0(C8619c cVar, C9296d dVar, String str, d dVar2, t tVar, C5834E e10) {
        C17542s.j(cVar, "map");
        C17542s.j(dVar, "cameraPositionState");
        C17542s.j(dVar2, "density");
        C17542s.j(tVar, "layoutDirection");
        C17542s.j(e10, "contentPadding");
        this.f64311a = cVar;
        this.f64312b = dVar2;
        this.f64313c = tVar;
        O0.b(this, cVar, e10);
        dVar.z(cVar);
        if (str != null) {
            cVar.j(str);
        }
        this.f64314d = str;
        this.f64315e = dVar;
    }

    /* access modifiers changed from: private */
    public static final void j(C9308i0 i0Var) {
        i0Var.f64315e.B(false);
        i0Var.f64315e.D(i0Var.f64311a.f());
    }

    /* access modifiers changed from: private */
    public static final void k(C9308i0 i0Var) {
        i0Var.f64315e.B(false);
    }

    /* access modifiers changed from: private */
    public static final void l(C9308i0 i0Var, int i10) {
        i0Var.f64315e.x(C9287a.Companion.a(i10));
        i0Var.f64315e.B(true);
    }

    /* access modifiers changed from: private */
    public static final void m(C9308i0 i0Var) {
        i0Var.f64315e.D(i0Var.f64311a.f());
    }

    public void a() {
        this.f64315e.z((C8619c) null);
    }

    public void b() {
        this.f64311a.u(new C9300e0(this));
        this.f64311a.v(new C9302f0(this));
        this.f64311a.x(new C9304g0(this));
        this.f64311a.w(new C9306h0(this));
    }

    public void c() {
        this.f64315e.z((C8619c) null);
    }

    public final d h() {
        return this.f64312b;
    }

    public final t i() {
        return this.f64313c;
    }

    public final void n(C9296d dVar) {
        C17542s.j(dVar, "value");
        if (!C17542s.e(dVar, this.f64315e)) {
            this.f64315e.z((C8619c) null);
            this.f64315e = dVar;
            dVar.z(this.f64311a);
        }
    }

    public final void o(String str) {
        this.f64314d = str;
        this.f64311a.j(str);
    }

    public final void p(d dVar) {
        C17542s.j(dVar, "<set-?>");
        this.f64312b = dVar;
    }

    public final void q(t tVar) {
        C17542s.j(tVar, "<set-?>");
        this.f64313c = tVar;
    }
}
