package th;

import M6.A;
import M6.C6654b;
import M6.d;
import M6.k;
import M6.w;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uh.C10289h;
import uh.C10290i;
import vh.C10318c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\u0010\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lth/b;", "LM6/A;", "Lth/b$c;", "", "checkoutId", "<init>", "(Ljava/lang/String;)V", "c", "()Ljava/lang/String;", "d", "name", "LQ6/g;", "writer", "LM6/k;", "customScalarAdapters", "LXH/N;", "a", "(LQ6/g;LM6/k;)V", "LM6/b;", "b", "()LM6/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: th.b  reason: case insensitive filesystem */
public final class C10257b implements A<c> {

    /* renamed from: b  reason: collision with root package name */
    public static final C1415b f76815b = new C1415b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f76816a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/b$a;", "", "", "__typename", "Lvh/c;", "checkoutFragment", "<init>", "(Ljava/lang/String;Lvh/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/c;", "()Lvh/c;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f76817a;

        /* renamed from: b  reason: collision with root package name */
        private final C10318c f76818b;

        public a(String str, C10318c cVar) {
            C17542s.j(str, "__typename");
            C17542s.j(cVar, "checkoutFragment");
            this.f76817a = str;
            this.f76818b = cVar;
        }

        public final C10318c a() {
            return this.f76818b;
        }

        public final String b() {
            return this.f76817a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f76817a, aVar.f76817a) && C17542s.e(this.f76818b, aVar.f76818b);
        }

        public int hashCode() {
            return (this.f76817a.hashCode() * 31) + this.f76818b.hashCode();
        }

        public String toString() {
            String str = this.f76817a;
            C10318c cVar = this.f76818b;
            return "Checkout(__typename=" + str + ", checkoutFragment=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lth/b$b;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.b$b  reason: collision with other inner class name */
    public static final class C1415b {
        public /* synthetic */ C1415b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetCheckout($checkoutId: String!) { checkout(checkoutId: $checkoutId) { __typename ...CheckoutFragment } }  fragment TaxPriceFragment on TaxPrice { taxAmount code taxPercentage type taxableAmount }  fragment TaxSummaryFragment on TaxSummary { taxType totalTaxAmount }  fragment PriceFragment on Price { inclTax exclTax tax taxList { __typename ...TaxPriceFragment } taxSummaryList { __typename ...TaxSummaryFragment } discountSummary { all coupons discounts employee family familyPrice familyPromotions manual promotions voucher } type }  fragment OrderDiscountSummaryListFragment on Price { orderDiscountSummaryList { amount name } }  fragment PriceExclSavingsFragment on Price { priceExclSavings { inclTax exclTax tax } }  fragment CheckoutFragment on Checkout { serviceArea { id } checkoutId orderNumber orderTotal { __typename ...PriceFragment ...OrderDiscountSummaryListFragment } totalPrice { __typename ...PriceExclSavingsFragment ...PriceFragment } shippingPrice { __typename ...PriceExclSavingsFragment ...PriceFragment } items { itemNo quantity totalPrice { exclTax inclTax } type } }";
        }

        private C1415b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth/b$c;", "", "Lth/b$a;", "checkout", "<init>", "(Lth/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth/b$a;", "()Lth/b$a;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.b$c */
    public static final class c implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final a f76819a;

        public c(a aVar) {
            C17542s.j(aVar, "checkout");
            this.f76819a = aVar;
        }

        public final a a() {
            return this.f76819a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f76819a, ((c) obj).f76819a);
        }

        public int hashCode() {
            return this.f76819a.hashCode();
        }

        public String toString() {
            a aVar = this.f76819a;
            return "Data(checkout=" + aVar + ")";
        }
    }

    public C10257b(String str) {
        C17542s.j(str, "checkoutId");
        this.f76816a = str;
    }

    public void a(g gVar, k kVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C10290i.f77104a.b(gVar, kVar, this);
    }

    public C6654b<c> b() {
        return d.d(C10289h.f77102a, false, 1, (Object) null);
    }

    public String c() {
        return "81286534dbe3d8bd72071b8e5284a6768d2f0bed0015de38e6b65d7fbd6e94ba";
    }

    public String d() {
        return f76815b.a();
    }

    public final String e() {
        return this.f76816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10257b) && C17542s.e(this.f76816a, ((C10257b) obj).f76816a);
    }

    public int hashCode() {
        return this.f76816a.hashCode();
    }

    public String name() {
        return "GetCheckout";
    }

    public String toString() {
        String str = this.f76816a;
        return "GetCheckoutQuery(checkoutId=" + str + ")";
    }
}
