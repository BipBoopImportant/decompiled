package vJ;

import com.sugarcube.core.logger.DslKt;
import gJ.C17284o;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18116h;
import uJ.P0;
import uJ.x0;
import vJ.f;

public final class q implements p {

    /* renamed from: c  reason: collision with root package name */
    private final g f149071c;

    /* renamed from: d  reason: collision with root package name */
    private final f f149072d;

    /* renamed from: e  reason: collision with root package name */
    private final C17284o f149073e;

    public q(g gVar, f fVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C17542s.j(fVar, "kotlinTypePreparator");
        this.f149071c = gVar;
        this.f149072d = fVar;
        C17284o m10 = C17284o.m(c());
        C17542s.i(m10, "createWithTypeRefiner(...)");
        this.f149073e = m10;
    }

    public C17284o a() {
        return this.f149073e;
    }

    public boolean b(C18096U u10, C18096U u11) {
        C17542s.j(u10, "a");
        C17542s.j(u11, DslKt.INDICATOR_BACKGROUND);
        return e(C18197a.b(false, false, (C18198b) null, f(), c(), 6, (Object) null), u10.Q0(), u11.Q0());
    }

    public g c() {
        return this.f149071c;
    }

    public boolean d(C18096U u10, C18096U u11) {
        C17542s.j(u10, "subtype");
        C17542s.j(u11, "supertype");
        return g(C18197a.b(true, false, (C18198b) null, f(), c(), 6, (Object) null), u10.Q0(), u11.Q0());
    }

    public final boolean e(x0 x0Var, P0 p02, P0 p03) {
        C17542s.j(x0Var, "<this>");
        C17542s.j(p02, "a");
        C17542s.j(p03, DslKt.INDICATOR_BACKGROUND);
        return C18116h.f147889a.m(x0Var, p02, p03);
    }

    public f f() {
        return this.f149072d;
    }

    public final boolean g(x0 x0Var, P0 p02, P0 p03) {
        C17542s.j(x0Var, "<this>");
        C17542s.j(p02, "subType");
        C17542s.j(p03, "superType");
        return C18116h.v(C18116h.f147889a, x0Var, p02, p03, false, 8, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(g gVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? f.a.f149049a : fVar);
    }
}
