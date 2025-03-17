package Xp;

import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.discover.impl.ui.DiscoverFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "b", "(Lx4/y;LnI/l;)V", "a", "(Lx4/y;)V", "discover-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final void a(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "discover/screen", P.b(DiscoverFragment.class));
        cVar.d("ikea://navigation/discover/screen");
        yVar.k(cVar);
    }

    public static final void b(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "discover/screen", "discover");
        a(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }
}
