package lJ;

import DI.C15540K;
import DI.C15558e;
import LI.d;
import NI.j;
import PI.C16200j;
import QI.C16252D;
import TI.C16496D;
import TI.C16503g;
import YH.C16877v;
import cJ.C17066c;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;

/* renamed from: lJ.c  reason: case insensitive filesystem */
public final class C17556c {

    /* renamed from: a  reason: collision with root package name */
    private final C16200j f144405a;

    /* renamed from: b  reason: collision with root package name */
    private final j f144406b;

    public C17556c(C16200j jVar, j jVar2) {
        C17542s.j(jVar, "packageFragmentProvider");
        C17542s.j(jVar2, "javaResolverCache");
        this.f144405a = jVar;
        this.f144406b = jVar2;
    }

    public final C16200j a() {
        return this.f144405a;
    }

    public final C15558e b(C16503g gVar) {
        C16252D d10;
        C17542s.j(gVar, "javaClass");
        C17066c f10 = gVar.f();
        if (f10 != null && gVar.M() == C16496D.SOURCE) {
            return this.f144406b.e(f10);
        }
        C16503g h10 = gVar.h();
        if (h10 != null) {
            C15558e b10 = b(h10);
            C17656k U10 = b10 != null ? b10.U() : null;
            C15540K e10 = U10 != null ? U10.e(gVar.getName(), d.FROM_JAVA_LOADER) : null;
            if (e10 instanceof C15558e) {
                return (C15558e) e10;
            }
            return null;
        } else if (f10 == null || (d10 = (C16252D) C16877v.y0(this.f144405a.b(f10.d()))) == null) {
            return null;
        } else {
            return d10.N0(gVar);
        }
    }
}
