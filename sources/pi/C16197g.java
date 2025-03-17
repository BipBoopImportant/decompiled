package PI;

import AI.C15435p;
import EI.C15644c;
import EI.C15649h;
import GJ.C15768k;
import NI.C16100d;
import TI.C16497a;
import TI.C16500d;
import YH.C16877v;
import cJ.C17066c;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tJ.C17988h;

/* renamed from: PI.g  reason: case insensitive filesystem */
public final class C16197g implements C15649h {

    /* renamed from: a  reason: collision with root package name */
    private final C16201k f137180a;

    /* renamed from: b  reason: collision with root package name */
    private final C16500d f137181b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f137182c;

    /* renamed from: d  reason: collision with root package name */
    private final C17988h<C16497a, C15644c> f137183d;

    public C16197g(C16201k kVar, C16500d dVar, boolean z10) {
        C17542s.j(kVar, "c");
        C17542s.j(dVar, "annotationOwner");
        this.f137180a = kVar;
        this.f137181b = dVar;
        this.f137182c = z10;
        this.f137183d = kVar.a().u().e(new C16196f(this));
    }

    /* access modifiers changed from: private */
    public static final C15644c i(C16197g gVar, C16497a aVar) {
        C17542s.j(aVar, "annotation");
        return C16100d.f136550a.e(aVar, gVar.f137180a, gVar.f137182c);
    }

    public boolean f2(C17066c cVar) {
        return C15649h.b.b(this, cVar);
    }

    public boolean isEmpty() {
        return this.f137181b.getAnnotations().isEmpty() && !this.f137181b.E();
    }

    public Iterator<C15644c> iterator() {
        return C15768k.J(C15768k.W(C15768k.S(C16877v.h0(this.f137181b.getAnnotations()), this.f137183d), C16100d.f136550a.a(C15435p.a.f133138y, this.f137181b, this.f137180a))).iterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r3.f137183d.invoke(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EI.C15644c v(cJ.C17066c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            TI.d r0 = r3.f137181b
            TI.a r0 = r0.v(r4)
            if (r0 == 0) goto L_0x0017
            tJ.h<TI.a, EI.c> r1 = r3.f137183d
            java.lang.Object r0 = r1.invoke(r0)
            EI.c r0 = (EI.C15644c) r0
            if (r0 != 0) goto L_0x0021
        L_0x0017:
            NI.d r0 = NI.C16100d.f136550a
            TI.d r1 = r3.f137181b
            PI.k r2 = r3.f137180a
            EI.c r0 = r0.a(r4, r1, r2)
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: PI.C16197g.v(cJ.c):EI.c");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16197g(C16201k kVar, C16500d dVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, dVar, (i10 & 4) != 0 ? false : z10);
    }
}
