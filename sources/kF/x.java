package Kf;

import XH.C16807N;
import XH.C16814e;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LKf/x;", "", "", "LKf/y;", "items", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "componentValue", "LXH/N;", "b", "(Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "availabilityDisclaimer", "buttonString", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function0;", "callback", "addToCartWithDisclaimer", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;LnI/a;)V", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface x {
    Object a(List<y> list, C17164e<? super C16807N> eVar);

    @C16814e
    void addToCartWithDisclaimer(String str, String str2, FragmentManager fragmentManager, C17631a<C16807N> aVar);

    Object b(List<y> list, Interaction$Component interaction$Component, String str, C17164e<? super C16807N> eVar);
}
