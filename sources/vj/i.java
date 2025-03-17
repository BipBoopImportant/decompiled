package vJ;

import DI.n0;
import YH.C16877v;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nJ.C17656k;
import uJ.C18113f0;
import uJ.E0;
import uJ.P0;
import uJ.u0;
import wJ.C18226h;
import wJ.C18230l;
import yJ.C18733b;
import yJ.C18735d;

public final class i extends C18113f0 implements C18735d {

    /* renamed from: b  reason: collision with root package name */
    private final C18733b f149052b;

    /* renamed from: c  reason: collision with root package name */
    private final n f149053c;

    /* renamed from: d  reason: collision with root package name */
    private final P0 f149054d;

    /* renamed from: e  reason: collision with root package name */
    private final u0 f149055e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f149056f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f149057g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(C18733b bVar, n nVar, P0 p02, u0 u0Var, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, nVar, p02, (i10 & 8) != 0 ? u0.f147932b.k() : u0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    public List<E0> L0() {
        return C16877v.n();
    }

    public u0 M0() {
        return this.f149055e;
    }

    public boolean O0() {
        return this.f149056f;
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return new i(this.f149052b, N0(), this.f149054d, u0Var, O0(), this.f149057g);
    }

    public final C18733b W0() {
        return this.f149052b;
    }

    /* renamed from: X0 */
    public n N0() {
        return this.f149053c;
    }

    public final P0 Y0() {
        return this.f149054d;
    }

    public final boolean Z0() {
        return this.f149057g;
    }

    /* renamed from: a1 */
    public i U0(boolean z10) {
        return new i(this.f149052b, N0(), this.f149054d, M0(), z10, false, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: b1 */
    public i S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18733b bVar = this.f149052b;
        n r10 = N0().b(gVar);
        P0 p02 = this.f149054d;
        return new i(bVar, r10, p02 != null ? gVar.h(p02).Q0() : null, M0(), O0(), false, 32, (DefaultConstructorMarker) null);
    }

    public C17656k q() {
        return C18230l.a(C18226h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(C18733b bVar, n nVar, P0 p02, u0 u0Var, boolean z10, boolean z11) {
        C17542s.j(bVar, "captureStatus");
        C17542s.j(nVar, "constructor");
        C17542s.j(u0Var, "attributes");
        this.f149052b = bVar;
        this.f149053c = nVar;
        this.f149054d = p02;
        this.f149055e = u0Var;
        this.f149056f = z10;
        this.f149057g = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(C18733b bVar, P0 p02, E0 e02, n0 n0Var) {
        this(bVar, new n(e02, (C17631a) null, (n) null, n0Var, 6, (DefaultConstructorMarker) null), p02, (u0) null, false, false, 56, (DefaultConstructorMarker) null);
        C17542s.j(bVar, "captureStatus");
        C17542s.j(e02, "projection");
        C17542s.j(n0Var, "typeParameter");
    }
}
