package lo;

import KJ.C15985a;
import KJ.C15987c;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import go.C11334s;
import java.util.List;
import ko.C11518a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Llo/k;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lko/a;", "getDeliveryItemsUseCase", "<init>", "(Landroidx/lifecycle/U;Lko/a;)V", "LKJ/c;", "Lgo/s;", "C", "()LKJ/c;", "m", "Lko/a;", "", "n", "Ljava/lang/String;", "checkoutId", "o", "deliveryId", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C11518a f99409m;

    /* renamed from: n  reason: collision with root package name */
    private final String f99410n;

    /* renamed from: o  reason: collision with root package name */
    private final String f99411o;

    public k(U u10, C11518a aVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "getDeliveryItemsUseCase");
        this.f99409m = aVar;
        Object f10 = u10.f("checkout_id_key");
        if (f10 != null) {
            this.f99410n = (String) f10;
            Object f11 = u10.f("delivery_id_key");
            if (f11 != null) {
                this.f99411o = (String) f11;
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C15987c<C11334s> C() {
        List<C11334s> a10 = this.f99409m.a(this.f99410n, this.f99411o);
        if (a10 != null) {
            return C15985a.h(a10);
        }
        return null;
    }
}
