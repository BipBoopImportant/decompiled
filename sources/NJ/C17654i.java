package nJ;

import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import tJ.C17986f;
import tJ.C17989i;
import tJ.C17994n;

/* renamed from: nJ.i  reason: case insensitive filesystem */
public final class C17654i extends C17646a {

    /* renamed from: b  reason: collision with root package name */
    private final C17989i<C17656k> f144859b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17654i(C17631a<? extends C17656k> aVar) {
        this((C17994n) null, aVar, 1, (DefaultConstructorMarker) null);
        C17542s.j(aVar, "getScope");
    }

    /* access modifiers changed from: private */
    public static final C17656k k(C17631a aVar) {
        C17656k kVar = (C17656k) aVar.invoke();
        return kVar instanceof C17646a ? ((C17646a) kVar).h() : kVar;
    }

    /* access modifiers changed from: protected */
    public C17656k i() {
        return (C17656k) this.f144859b.invoke();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17654i(C17994n nVar, C17631a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C17986f.f147352e : nVar, aVar);
    }

    public C17654i(C17994n nVar, C17631a<? extends C17656k> aVar) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(aVar, "getScope");
        this.f144859b = nVar.d(new C17653h(aVar));
    }
}
