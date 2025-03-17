package AC;

import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.timeslot.impl.feature.presentation.ui.TimeslotPickerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "b", "(Lx4/y;)V", "timeslot-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: AC.b  reason: case insensitive filesystem */
public final class C12561b {
    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/timeslot/picker?type={type}", P.b(TimeslotPickerFragment.class));
        cVar.d("ikea://navigation/scanandgo/timeslot/picker?type={type}");
        cVar.a("type", new C12560a());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57429d);
        jVar.c(false);
        return C16807N.f139792a;
    }
}
