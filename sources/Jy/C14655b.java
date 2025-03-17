package jy;

import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.regionsettings.impl.ui.ChangeMarketFragment;
import com.ingka.ikea.regionsettings.impl.ui.FteRegionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lx4/y;", "LXH/N;", "b", "(Lx4/y;)V", "a", "regionsettings-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jy.b  reason: case insensitive filesystem */
public final class C14655b {
    public static final void a(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "region/select", P.b(FteRegionFragment.class)));
    }

    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "region/settings", P.b(ChangeMarketFragment.class));
        cVar.d("ikea://navigation/region/settings");
        yVar.k(cVar);
    }
}
