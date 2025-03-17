package Sn;

import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LSn/f;", "", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "shippingBillingDynamicModel", "<init>", "(Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "()Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final ShippingBillingDynamicModel f87254a;

    public f(ShippingBillingDynamicModel shippingBillingDynamicModel) {
        C17542s.j(shippingBillingDynamicModel, "shippingBillingDynamicModel");
        this.f87254a = shippingBillingDynamicModel;
    }

    public final ShippingBillingDynamicModel a() {
        return this.f87254a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && C17542s.e(this.f87254a, ((f) obj).f87254a);
    }

    public int hashCode() {
        return this.f87254a.hashCode();
    }

    public String toString() {
        ShippingBillingDynamicModel shippingBillingDynamicModel = this.f87254a;
        return "SelectedDeliveryData(shippingBillingDynamicModel=" + shippingBillingDynamicModel + ")";
    }
}
