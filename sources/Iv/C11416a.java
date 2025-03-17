package iv;

import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.liveshopping.impl.presentation.LiveShoppingFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx4/y;", "", "enabled", "LXH/N;", "b", "(Lx4/y;Z)V", "a", "(Lx4/y;)V", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: iv.a  reason: case insensitive filesystem */
public final class C11416a {
    private static final void a(y yVar) {
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "liveShopping/liveShopping", P.b(LiveShoppingFragment.class));
        cVar.d("ikea://navigation/liveShopping/liveShopping");
        yVar.k(cVar);
    }

    public static final void b(y yVar, boolean z10) {
        C17542s.j(yVar, "<this>");
        if (z10) {
            a(yVar);
        }
    }
}
