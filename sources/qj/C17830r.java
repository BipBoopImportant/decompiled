package qJ;

import DI.C15538I;
import GI.C15714H;
import cJ.C17066c;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;
import sJ.C17946w;
import tJ.C17994n;

/* renamed from: qJ.r  reason: case insensitive filesystem */
public abstract class C17830r extends C15714H {

    /* renamed from: g  reason: collision with root package name */
    private final C17994n f146600g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17830r(C17066c cVar, C17994n nVar, C15538I i10) {
        super(i10, cVar);
        C17542s.j(cVar, "fqName");
        C17542s.j(nVar, "storageManager");
        C17542s.j(i10, "module");
        this.f146600g = nVar;
    }

    public abstract C17822j H0();

    public boolean K0(C17069f fVar) {
        C17542s.j(fVar, "name");
        C17656k q10 = q();
        return (q10 instanceof C17946w) && ((C17946w) q10).t().contains(fVar);
    }

    public abstract void L0(C17826n nVar);
}
