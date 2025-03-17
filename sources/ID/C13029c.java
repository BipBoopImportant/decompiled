package ID;

import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.wallet.impl.WalletFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "a", "(Lx4/y;)V", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ID.c  reason: case insensitive filesystem */
public final class C13029c {
    public static final void a(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "wallet/wallet_page?redemptionCode={redemptionCode}", P.b(WalletFragment.class));
        cVar.d("ikea://navigation/wallet/wallet_page?redemptionCode={redemptionCode}");
        yVar.k(cVar);
    }
}
