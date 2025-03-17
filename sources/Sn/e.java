package Sn;

import Nn.C10806i;
import Nn.K;
import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"LSn/e;", "", "LNn/K;", "selectedDeliveryServiceHolder", "LNn/i;", "updatePrice", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "shippingBillingDynamicModel", "<init>", "(LNn/K;LNn/i;Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/K;", "()LNn/K;", "b", "LNn/i;", "c", "()LNn/i;", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "()Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final K f87251a;

    /* renamed from: b  reason: collision with root package name */
    private final C10806i f87252b;

    /* renamed from: c  reason: collision with root package name */
    private final ShippingBillingDynamicModel f87253c;

    public e(K k10, C10806i iVar, ShippingBillingDynamicModel shippingBillingDynamicModel) {
        C17542s.j(k10, "selectedDeliveryServiceHolder");
        C17542s.j(iVar, "updatePrice");
        this.f87251a = k10;
        this.f87252b = iVar;
        this.f87253c = shippingBillingDynamicModel;
    }

    public final K a() {
        return this.f87251a;
    }

    public final ShippingBillingDynamicModel b() {
        return this.f87253c;
    }

    public final C10806i c() {
        return this.f87252b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f87251a, eVar.f87251a) && C17542s.e(this.f87252b, eVar.f87252b) && C17542s.e(this.f87253c, eVar.f87253c);
    }

    public int hashCode() {
        int hashCode = ((this.f87251a.hashCode() * 31) + this.f87252b.hashCode()) * 31;
        ShippingBillingDynamicModel shippingBillingDynamicModel = this.f87253c;
        return hashCode + (shippingBillingDynamicModel == null ? 0 : shippingBillingDynamicModel.hashCode());
    }

    public String toString() {
        K k10 = this.f87251a;
        C10806i iVar = this.f87252b;
        ShippingBillingDynamicModel shippingBillingDynamicModel = this.f87253c;
        return "SelectDeliveryAndServicesData(selectedDeliveryServiceHolder=" + k10 + ", updatePrice=" + iVar + ", shippingBillingDynamicModel=" + shippingBillingDynamicModel + ")";
    }
}
