package OB;

import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.store.storepicker.impl.ui.StorePickerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "b", "(Lx4/y;)V", "storepicker-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: OB.b  reason: case insensitive filesystem */
public final class C13297b {
    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "storePicker/select?storage={storage}&itemNo={itemNo}&requestKey={requestKey}&scanAndGo={scanAndGo}", P.b(StorePickerFragment.class));
        cVar.d("ikea://navigation/storePicker/select?storage={storage}&itemNo={itemNo}&requestKey={requestKey}&scanAndGo={scanAndGo}");
        cVar.a("scanAndGo", new C13296a());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        return C16807N.f139792a;
    }
}
