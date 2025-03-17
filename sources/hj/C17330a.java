package hJ;

import YH.C16877v;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import uJ.C18113f0;
import uJ.E0;
import uJ.u0;
import vJ.g;
import wJ.C18226h;
import wJ.C18230l;
import yJ.C18735d;

/* renamed from: hJ.a  reason: case insensitive filesystem */
public final class C17330a extends C18113f0 implements C18735d {

    /* renamed from: b  reason: collision with root package name */
    private final E0 f143419b;

    /* renamed from: c  reason: collision with root package name */
    private final C17331b f143420c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f143421d;

    /* renamed from: e  reason: collision with root package name */
    private final u0 f143422e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17330a(E0 e02, C17331b bVar, boolean z10, u0 u0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e02, (i10 & 2) != 0 ? new C17332c(e02) : bVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? u0.f147932b.k() : u0Var);
    }

    public List<E0> L0() {
        return C16877v.n();
    }

    public u0 M0() {
        return this.f143422e;
    }

    public boolean O0() {
        return this.f143421d;
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return new C17330a(this.f143419b, N0(), O0(), u0Var);
    }

    /* renamed from: W0 */
    public C17331b N0() {
        return this.f143420c;
    }

    /* renamed from: X0 */
    public C17330a U0(boolean z10) {
        return z10 == O0() ? this : new C17330a(this.f143419b, N0(), z10, M0());
    }

    /* renamed from: Y0 */
    public C17330a S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        E0 b10 = this.f143419b.b(gVar);
        C17542s.i(b10, "refine(...)");
        return new C17330a(b10, N0(), O0(), M0());
    }

    public C17656k q() {
        return C18230l.a(C18226h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f143419b);
        sb2.append(')');
        sb2.append(O0() ? "?" : "");
        return sb2.toString();
    }

    public C17330a(E0 e02, C17331b bVar, boolean z10, u0 u0Var) {
        C17542s.j(e02, "typeProjection");
        C17542s.j(bVar, "constructor");
        C17542s.j(u0Var, "attributes");
        this.f143419b = e02;
        this.f143420c = bVar;
        this.f143421d = z10;
        this.f143422e = u0Var;
    }
}
