package V0;

import U0.C0;
import U0.C4866d;
import U0.C4872f;
import U0.C4874f1;
import U0.C4895p;
import U0.S0;
import V0.d;
import V0.g;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J)\u0010\u000f\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0003J;\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u00028\u00002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006&"}, d2 = {"LV0/c;", "LV0/h;", "<init>", "()V", "", "e", "()Z", "LXH/N;", "a", "LU0/f;", "applier", "LU0/f1;", "slots", "LU0/S0;", "rememberManager", "d", "(LU0/f;LU0/f1;LU0/S0;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "LU0/d;", "groupAnchor", "b", "(LnI/a;ILU0/d;)V", "c", "V", "T", "value", "Lkotlin/Function2;", "block", "f", "(Ljava/lang/Object;LnI/p;)V", "LV0/g;", "LV0/g;", "operations", "pendingOperations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final g f14503a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final g f14504b = new g();

    public final void a() {
        this.f14504b.m();
        this.f14503a.m();
    }

    public final void b(C17631a<? extends Object> aVar, int i10, C4866d dVar) {
        g gVar;
        g gVar2;
        g gVar3 = this.f14503a;
        d.n nVar = d.n.f14529c;
        gVar3.y(nVar);
        g a10 = g.c.a(gVar3);
        g.c.d(a10, d.t.a(0), aVar);
        g.c.c(a10, d.q.a(0), i10);
        int i11 = 1;
        g.c.d(a10, d.t.a(1), dVar);
        if (!(gVar3.f14550g == gVar3.n(nVar.b()) && gVar3.f14551h == gVar3.n(nVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = nVar.b();
            int i12 = 0;
            int i13 = 0;
            while (i13 < b10) {
                if (((i11 << i13) & gVar3.f14550g) != 0) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(nVar.e(d.q.a(i13)));
                    i12++;
                }
                i13++;
                i11 = 1;
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = nVar.d();
            int i14 = 0;
            int i15 = 0;
            while (i15 < d10) {
                if (((1 << i15) & gVar3.f14551h) != 0) {
                    if (i12 > 0) {
                        sb4.append(", ");
                    }
                    gVar2 = gVar3;
                    sb4.append(nVar.f(d.t.a(i15)));
                    i14++;
                } else {
                    gVar2 = gVar3;
                }
                i15++;
                gVar3 = gVar2;
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + sb3 + ") and " + i14 + " object arguments (" + sb5 + ").");
        }
        g gVar4 = this.f14504b;
        d.u uVar = d.u.f14534c;
        gVar4.y(uVar);
        g a11 = g.c.a(gVar4);
        g.c.c(a11, d.q.a(0), i10);
        g.c.d(a11, d.t.a(0), dVar);
        if (!(gVar4.f14550g == gVar4.n(uVar.b()) && gVar4.f14551h == gVar4.n(uVar.d()))) {
            StringBuilder sb6 = new StringBuilder();
            int b11 = uVar.b();
            int i16 = 0;
            for (int i17 = 0; i17 < b11; i17++) {
                if (((1 << i17) & gVar4.f14550g) != 0) {
                    if (i16 > 0) {
                        sb6.append(", ");
                    }
                    sb6.append(uVar.e(d.q.a(i17)));
                    i16++;
                }
            }
            String sb7 = sb6.toString();
            C17542s.i(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder();
            int d11 = uVar.d();
            int i18 = 0;
            int i19 = 0;
            while (i19 < d11) {
                if (((1 << i19) & gVar4.f14551h) != 0) {
                    if (i16 > 0) {
                        sb8.append(", ");
                    }
                    gVar = gVar4;
                    sb8.append(uVar.f(d.t.a(i19)));
                    i18++;
                } else {
                    gVar = gVar4;
                }
                i19++;
                gVar4 = gVar;
            }
            String sb9 = sb8.toString();
            C17542s.i(sb9, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i16 + " int arguments (" + sb7 + ") and " + i18 + " object arguments (" + sb9 + ").");
        }
    }

    public final void c() {
        if (!this.f14504b.u()) {
            C4895p.s("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f14504b.w(this.f14503a);
    }

    public final void d(C4872f<?> fVar, C4874f1 f1Var, S0 s02) {
        if (!this.f14504b.t()) {
            C4895p.s("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f14503a.r(fVar, f1Var, s02);
    }

    public final boolean e() {
        return this.f14503a.t();
    }

    public final <V, T> void f(V v10, p<? super T, ? super V, C16807N> pVar) {
        g gVar = this.f14503a;
        d.F f10 = d.F.f14512c;
        gVar.y(f10);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), v10);
        int a11 = d.t.a(1);
        C17542s.h(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(a10, a11, (p) W.g(pVar, 2));
        if (!(gVar.f14550g == gVar.n(f10.b()) && gVar.f14551h == gVar.n(f10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = f10.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(f10.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = f10.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(f10.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + f10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }
}
