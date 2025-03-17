package Wn;

import Ae.r;
import XH.C16796C;
import YH.X;
import androidx.lifecycle.U;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LWn/n;", "LAe/r;", "<init>", "()V", "", "", "Lkotlin/Function1;", "Landroidx/lifecycle/U;", "a", "()Ljava/util/Map;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements r {
    /* access modifiers changed from: private */
    public static final String d(U u10) {
        C17542s.j(u10, "it");
        return "checkout_v2";
    }

    /* access modifiers changed from: private */
    public static final String e(U u10) {
        C17542s.j(u10, "it");
        return "DeliveryCostBottomSheet";
    }

    public Map<String, C17642l<U, String>> a() {
        return X.m(C16796C.a("checkout/checkout?checkoutId={checkoutId}", new l()), C16796C.a("checkout/compareDeliveryPrices?checkoutId={checkoutId}", new m()));
    }
}
