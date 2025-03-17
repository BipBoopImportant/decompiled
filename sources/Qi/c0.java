package QI;

import DI.C15566m;
import DI.i0;
import GI.C15732b;
import PI.C16197g;
import PI.C16201k;
import RI.C16378b;
import TI.j;
import TI.y;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.L0;
import uJ.Q0;

public final class c0 extends C15732b {

    /* renamed from: k  reason: collision with root package name */
    private final C16201k f137482k;

    /* renamed from: l  reason: collision with root package name */
    private final y f137483l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(C16201k kVar, y yVar, int i10, C15566m mVar) {
        super(kVar.e(), mVar, new C16197g(kVar, yVar, false, 4, (DefaultConstructorMarker) null), yVar.getName(), Q0.INVARIANT, false, i10, i0.f133841a, kVar.a().v());
        C17542s.j(kVar, "c");
        C17542s.j(yVar, "javaTypeParameter");
        C17542s.j(mVar, "containingDeclaration");
        this.f137482k = kVar;
        this.f137483l = yVar;
    }

    private final List<C18096U> M0() {
        Collection<j> upperBounds = this.f137483l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C18113f0 i10 = this.f137482k.d().p().i();
            C17542s.i(i10, "getAnyType(...)");
            C18113f0 J10 = this.f137482k.d().p().J();
            C17542s.i(J10, "getNullableAnyType(...)");
            return C16877v.e(C18099X.e(i10, J10));
        }
        Iterable<j> iterable = upperBounds;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (j p10 : iterable) {
            arrayList.add(this.f137482k.g().p(p10, C16378b.b(L0.COMMON, false, false, this, 3, (Object) null)));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public List<C18096U> H0(List<? extends C18096U> list) {
        C17542s.j(list, "bounds");
        return this.f137482k.a().r().r(this, list, this.f137482k);
    }

    /* access modifiers changed from: protected */
    public void K0(C18096U u10) {
        C17542s.j(u10, "type");
    }

    /* access modifiers changed from: protected */
    public List<C18096U> L0() {
        return M0();
    }
}
