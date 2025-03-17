package Nn;

import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b0\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b)\u00105¨\u00066"}, d2 = {"LNn/f;", "", "", "checkoutId", "serviceAreaId", "", "LNn/o;", "homeDeliveryServices", "LNn/k;", "collectDeliveryServices", "LNn/K;", "selectedDeliveryServiceHolder", "LNn/i;", "priceHolder", "LNn/g;", "items", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "shippingBillingDynamicModel", "LNn/r;", "deliveryTimeWindowsData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LNn/K;LNn/i;Ljava/util/List;Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;LNn/r;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LNn/K;LNn/i;Ljava/util/List;Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;LNn/r;)LNn/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "j", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "e", "LNn/K;", "i", "()LNn/K;", "LNn/i;", "h", "()LNn/i;", "g", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "k", "()Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "LNn/r;", "()LNn/r;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.f  reason: case insensitive filesystem */
public final class C10803f {

    /* renamed from: a  reason: collision with root package name */
    private final String f84048a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84049b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C10812o> f84050c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C10808k> f84051d;

    /* renamed from: e  reason: collision with root package name */
    private final K f84052e;

    /* renamed from: f  reason: collision with root package name */
    private final C10806i f84053f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C10804g> f84054g;

    /* renamed from: h  reason: collision with root package name */
    private final ShippingBillingDynamicModel f84055h;

    /* renamed from: i  reason: collision with root package name */
    private final r f84056i;

    public C10803f(String str, String str2, List<? extends C10812o> list, List<? extends C10808k> list2, K k10, C10806i iVar, List<C10804g> list3, ShippingBillingDynamicModel shippingBillingDynamicModel, r rVar) {
        C17542s.j(str, "checkoutId");
        C17542s.j(str2, "serviceAreaId");
        C17542s.j(list, "homeDeliveryServices");
        C17542s.j(list2, "collectDeliveryServices");
        C17542s.j(iVar, "priceHolder");
        C17542s.j(list3, "items");
        this.f84048a = str;
        this.f84049b = str2;
        this.f84050c = list;
        this.f84051d = list2;
        this.f84052e = k10;
        this.f84053f = iVar;
        this.f84054g = list3;
        this.f84055h = shippingBillingDynamicModel;
        this.f84056i = rVar;
    }

    public static /* synthetic */ C10803f b(C10803f fVar, String str, String str2, List list, List list2, K k10, C10806i iVar, List list3, ShippingBillingDynamicModel shippingBillingDynamicModel, r rVar, int i10, Object obj) {
        C10803f fVar2 = fVar;
        int i11 = i10;
        return fVar.a((i11 & 1) != 0 ? fVar2.f84048a : str, (i11 & 2) != 0 ? fVar2.f84049b : str2, (i11 & 4) != 0 ? fVar2.f84050c : list, (i11 & 8) != 0 ? fVar2.f84051d : list2, (i11 & 16) != 0 ? fVar2.f84052e : k10, (i11 & 32) != 0 ? fVar2.f84053f : iVar, (i11 & 64) != 0 ? fVar2.f84054g : list3, (i11 & 128) != 0 ? fVar2.f84055h : shippingBillingDynamicModel, (i11 & 256) != 0 ? fVar2.f84056i : rVar);
    }

    public final C10803f a(String str, String str2, List<? extends C10812o> list, List<? extends C10808k> list2, K k10, C10806i iVar, List<C10804g> list3, ShippingBillingDynamicModel shippingBillingDynamicModel, r rVar) {
        C17542s.j(str, "checkoutId");
        C17542s.j(str2, "serviceAreaId");
        C17542s.j(list, "homeDeliveryServices");
        C17542s.j(list2, "collectDeliveryServices");
        C10806i iVar2 = iVar;
        C17542s.j(iVar2, "priceHolder");
        List<C10804g> list4 = list3;
        C17542s.j(list4, "items");
        return new C10803f(str, str2, list, list2, k10, iVar2, list4, shippingBillingDynamicModel, rVar);
    }

    public final String c() {
        return this.f84048a;
    }

    public final List<C10808k> d() {
        return this.f84051d;
    }

    public final r e() {
        return this.f84056i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10803f)) {
            return false;
        }
        C10803f fVar = (C10803f) obj;
        return C17542s.e(this.f84048a, fVar.f84048a) && C17542s.e(this.f84049b, fVar.f84049b) && C17542s.e(this.f84050c, fVar.f84050c) && C17542s.e(this.f84051d, fVar.f84051d) && C17542s.e(this.f84052e, fVar.f84052e) && C17542s.e(this.f84053f, fVar.f84053f) && C17542s.e(this.f84054g, fVar.f84054g) && C17542s.e(this.f84055h, fVar.f84055h) && C17542s.e(this.f84056i, fVar.f84056i);
    }

    public final List<C10812o> f() {
        return this.f84050c;
    }

    public final List<C10804g> g() {
        return this.f84054g;
    }

    public final C10806i h() {
        return this.f84053f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f84048a.hashCode() * 31) + this.f84049b.hashCode()) * 31) + this.f84050c.hashCode()) * 31) + this.f84051d.hashCode()) * 31;
        K k10 = this.f84052e;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (k10 == null ? 0 : k10.hashCode())) * 31) + this.f84053f.hashCode()) * 31) + this.f84054g.hashCode()) * 31;
        ShippingBillingDynamicModel shippingBillingDynamicModel = this.f84055h;
        int hashCode3 = (hashCode2 + (shippingBillingDynamicModel == null ? 0 : shippingBillingDynamicModel.hashCode())) * 31;
        r rVar = this.f84056i;
        if (rVar != null) {
            i10 = rVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public final K i() {
        return this.f84052e;
    }

    public final String j() {
        return this.f84049b;
    }

    public final ShippingBillingDynamicModel k() {
        return this.f84055h;
    }

    public String toString() {
        String str = this.f84048a;
        String str2 = this.f84049b;
        List<C10812o> list = this.f84050c;
        List<C10808k> list2 = this.f84051d;
        K k10 = this.f84052e;
        C10806i iVar = this.f84053f;
        List<C10804g> list3 = this.f84054g;
        ShippingBillingDynamicModel shippingBillingDynamicModel = this.f84055h;
        r rVar = this.f84056i;
        return "CheckoutHolder(checkoutId=" + str + ", serviceAreaId=" + str2 + ", homeDeliveryServices=" + list + ", collectDeliveryServices=" + list2 + ", selectedDeliveryServiceHolder=" + k10 + ", priceHolder=" + iVar + ", items=" + list3 + ", shippingBillingDynamicModel=" + shippingBillingDynamicModel + ", deliveryTimeWindowsData=" + rVar + ")";
    }
}
