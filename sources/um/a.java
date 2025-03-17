package Um;

import A4.b;
import A4.c;
import androidx.navigation.fragment.FragmentNavigator;
import com.ingka.ikea.boka.impl.bottomsheet.BokaBottomSheetFragment;
import com.ingka.ikea.boka.impl.sandbox.BokaSandboxFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lx4/y;", "LXH/N;", "a", "(Lx4/y;)V", "b", "boka-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final void a(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "boka/book", P.b(BokaBottomSheetFragment.class));
        cVar.d("ikea://navigation/boka/book");
        yVar.k(cVar);
    }

    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "boka/bookflow?sandboxUrl={sandboxUrl}", P.b(BokaSandboxFragment.class));
        cVar.d("ikea://navigation/boka/bookflow?sandboxUrl={sandboxUrl}");
        yVar.k(cVar);
    }
}
