package kE;

import A4.b;
import A4.c;
import XH.C16807N;
import com.ingka.ikea.zipselector.impl.ui.ManualPostalCodeBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "c", "(Lx4/y;)V", "zipselector-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kE.c  reason: case insensitive filesystem */
public final class C14678c {
    public static final void c(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "manualPostalCodeInput?allowSamePostalCode={allowSamePostalCode}&interactionValue={interactionValue}", P.b(ManualPostalCodeBottomSheet.class));
        cVar.d("ikea://navigation/manualPostalCodeInput?allowSamePostalCode={allowSamePostalCode}&interactionValue={interactionValue}");
        cVar.a("allowSamePostalCode", new C14676a());
        cVar.a("interactionValue", new C14677b());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }
}
