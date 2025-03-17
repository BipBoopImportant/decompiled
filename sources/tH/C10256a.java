package th;

import M6.C6654b;
import M6.k;
import M6.t;
import M6.w;
import M6.y;
import Q6.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uh.C10285d;
import uh.C10287f;
import vh.C10318c;
import vh.C10343u;
import wh.C10371b;
import wh.C10376g;
import wh.j;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00060\u0014\u001b\u001e.\u0012Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u0013J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010\u0013R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00058\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b2\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b6\u00105¨\u00067"}, d2 = {"Lth/a;", "LM6/t;", "Lth/a$e;", "", "zipCode", "LM6/y;", "stateCode", "deliveryCountryCode", "Lwh/b;", "cartInput", "Lwh/j;", "preferredDeliveryService", "", "Lwh/g;", "supportedCollectDeliveryServices", "supportedHomeDeliveryServices", "<init>", "(Ljava/lang/String;LM6/y;LM6/y;Lwh/b;LM6/y;Ljava/util/List;Ljava/util/List;)V", "c", "()Ljava/lang/String;", "d", "name", "LQ6/g;", "writer", "LM6/k;", "customScalarAdapters", "LXH/N;", "a", "(LQ6/g;LM6/k;)V", "LM6/b;", "b", "()LM6/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "LM6/y;", "h", "()LM6/y;", "f", "Lwh/b;", "e", "()Lwh/b;", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "j", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: th.a  reason: case insensitive filesystem */
public final class C10256a implements t<e> {

    /* renamed from: h  reason: collision with root package name */
    public static final c f76797h = new c((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f76798a;

    /* renamed from: b  reason: collision with root package name */
    private final y<String> f76799b;

    /* renamed from: c  reason: collision with root package name */
    private final y<String> f76800c;

    /* renamed from: d  reason: collision with root package name */
    private final C10371b f76801d;

    /* renamed from: e  reason: collision with root package name */
    private final y<j> f76802e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C10376g> f76803f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C10376g> f76804g;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/a$a;", "", "", "__typename", "Lvh/c;", "checkoutFragment", "<init>", "(Ljava/lang/String;Lvh/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/c;", "()Lvh/c;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.a$a  reason: collision with other inner class name */
    public static final class C1414a {

        /* renamed from: a  reason: collision with root package name */
        private final String f76805a;

        /* renamed from: b  reason: collision with root package name */
        private final C10318c f76806b;

        public C1414a(String str, C10318c cVar) {
            C17542s.j(str, "__typename");
            C17542s.j(cVar, "checkoutFragment");
            this.f76805a = str;
            this.f76806b = cVar;
        }

        public final C10318c a() {
            return this.f76806b;
        }

        public final String b() {
            return this.f76805a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1414a)) {
                return false;
            }
            C1414a aVar = (C1414a) obj;
            return C17542s.e(this.f76805a, aVar.f76805a) && C17542s.e(this.f76806b, aVar.f76806b);
        }

        public int hashCode() {
            return (this.f76805a.hashCode() * 31) + this.f76806b.hashCode();
        }

        public String toString() {
            String str = this.f76805a;
            C10318c cVar = this.f76806b;
            return "Checkout(__typename=" + str + ", checkoutFragment=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/a$b;", "", "", "__typename", "Lvh/u;", "deliveryServiceFragment", "<init>", "(Ljava/lang/String;Lvh/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/u;", "()Lvh/u;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f76807a;

        /* renamed from: b  reason: collision with root package name */
        private final C10343u f76808b;

        public b(String str, C10343u uVar) {
            C17542s.j(str, "__typename");
            C17542s.j(uVar, "deliveryServiceFragment");
            this.f76807a = str;
            this.f76808b = uVar;
        }

        public final C10343u a() {
            return this.f76808b;
        }

        public final String b() {
            return this.f76807a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f76807a, bVar.f76807a) && C17542s.e(this.f76808b, bVar.f76808b);
        }

        public int hashCode() {
            return (this.f76807a.hashCode() * 31) + this.f76808b.hashCode();
        }

        public String toString() {
            String str = this.f76807a;
            C10343u uVar = this.f76808b;
            return "CollectDeliveryService(__typename=" + str + ", deliveryServiceFragment=" + uVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lth/a$c;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.a$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation CreateCheckout($zipCode: String!, $stateCode: String, $deliveryCountryCode: String, $cartInput: CartInput!, $preferredDeliveryService: PreferredDeliveryService, $supportedCollectDeliveryServices: [DeliveryServiceName!]!, $supportedHomeDeliveryServices: [DeliveryServiceName!]!) { createCheckout(zipCode: $zipCode, stateCode: $stateCode, deliveryCountryCode: $deliveryCountryCode, cart: $cartInput, preferredDeliveryService: $preferredDeliveryService, profileType: REGULAR) { checkout { __typename ...CheckoutFragment } collectDeliveryServices(supportedDeliveryServices: $supportedCollectDeliveryServices) { __typename ...DeliveryServiceFragment } homeDeliveryServices(supportedDeliveryServices: $supportedHomeDeliveryServices) { __typename ...DeliveryServiceFragment } } }  fragment TaxPriceFragment on TaxPrice { taxAmount code taxPercentage type taxableAmount }  fragment TaxSummaryFragment on TaxSummary { taxType totalTaxAmount }  fragment PriceFragment on Price { inclTax exclTax tax taxList { __typename ...TaxPriceFragment } taxSummaryList { __typename ...TaxSummaryFragment } discountSummary { all coupons discounts employee family familyPrice familyPromotions manual promotions voucher } type }  fragment OrderDiscountSummaryListFragment on Price { orderDiscountSummaryList { amount name } }  fragment PriceExclSavingsFragment on Price { priceExclSavings { inclTax exclTax tax } }  fragment CheckoutFragment on Checkout { serviceArea { id } checkoutId orderNumber orderTotal { __typename ...PriceFragment ...OrderDiscountSummaryListFragment } totalPrice { __typename ...PriceExclSavingsFragment ...PriceFragment } shippingPrice { __typename ...PriceExclSavingsFragment ...PriceFragment } items { itemNo quantity totalPrice { exclTax inclTax } type } }  fragment SolutionPriceFragment on SolutionPrice { inclTax exclTax }  fragment AddressFragment on PickUpPointAddress { addressLines city zipCode }  fragment OpeningHoursFragment on PickUpPointOpeningHours { openingHoursMonTime openingHoursTueTime openingHoursWedTime openingHoursThuTime openingHoursFriTime openingHoursSatTime openingHoursSunTime }  fragment TimeWindowFragment on TimeWindow { id fromDateTime toDateTime price { inclTax exclTax } capabilities { type } hasPriceDeviation }  fragment PickupPointFragment on PickUpPoint { ocPUPId identifier price { __typename ...SolutionPriceFragment } selectable address { __typename ...AddressFragment } openingHours { __typename ...OpeningHoursFragment } earliestTimeWindow { __typename ...TimeWindowFragment } distance name latitude longitude }  fragment DeliveryDateDetailsFragment on DeliveryDateDetails { dateSpan { from { dateTime presentationPattern } to { dateTime presentationPattern } } text }  fragment DeliveryServiceFragment on DeliveryService { id selectable solutionPrice { __typename ...SolutionPriceFragment } solution fulfillmentMethodType fulfillmentPossibility unavailableItems { itemNo availableQuantity requiredQuantity } supportsWheelChairCapability slotBasedPricingEnabled minSolutionPrice maxSolutionPrice deliveries { id serviceItemId type availablePickUpPoints { closestPickUpPointId pickUpPoints { __typename ...PickupPointFragment } } deliveryType earliestTimeWindow { __typename ...TimeWindowFragment } deliveryItems { itemNo parentId } } presentationV2 { collapsedRating deliveryDateDetails { __typename ...DeliveryDateDetailsFragment } deliveryDescription deliveryDescriptionExpanded } }";
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lth/a$d;", "", "Lth/a$a;", "checkout", "", "Lth/a$b;", "collectDeliveryServices", "Lth/a$f;", "homeDeliveryServices", "<init>", "(Lth/a$a;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth/a$a;", "()Lth/a$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.a$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final C1414a f76809a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b> f76810b;

        /* renamed from: c  reason: collision with root package name */
        private final List<f> f76811c;

        public d(C1414a aVar, List<b> list, List<f> list2) {
            C17542s.j(aVar, "checkout");
            C17542s.j(list, "collectDeliveryServices");
            C17542s.j(list2, "homeDeliveryServices");
            this.f76809a = aVar;
            this.f76810b = list;
            this.f76811c = list2;
        }

        public final C1414a a() {
            return this.f76809a;
        }

        public final List<b> b() {
            return this.f76810b;
        }

        public final List<f> c() {
            return this.f76811c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f76809a, dVar.f76809a) && C17542s.e(this.f76810b, dVar.f76810b) && C17542s.e(this.f76811c, dVar.f76811c);
        }

        public int hashCode() {
            return (((this.f76809a.hashCode() * 31) + this.f76810b.hashCode()) * 31) + this.f76811c.hashCode();
        }

        public String toString() {
            C1414a aVar = this.f76809a;
            List<b> list = this.f76810b;
            List<f> list2 = this.f76811c;
            return "CreateCheckout(checkout=" + aVar + ", collectDeliveryServices=" + list + ", homeDeliveryServices=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth/a$e;", "", "Lth/a$d;", "createCheckout", "<init>", "(Lth/a$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth/a$d;", "()Lth/a$d;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.a$e */
    public static final class e implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final d f76812a;

        public e(d dVar) {
            C17542s.j(dVar, "createCheckout");
            this.f76812a = dVar;
        }

        public final d a() {
            return this.f76812a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f76812a, ((e) obj).f76812a);
        }

        public int hashCode() {
            return this.f76812a.hashCode();
        }

        public String toString() {
            d dVar = this.f76812a;
            return "Data(createCheckout=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/a$f;", "", "", "__typename", "Lvh/u;", "deliveryServiceFragment", "<init>", "(Ljava/lang/String;Lvh/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/u;", "()Lvh/u;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.a$f */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final String f76813a;

        /* renamed from: b  reason: collision with root package name */
        private final C10343u f76814b;

        public f(String str, C10343u uVar) {
            C17542s.j(str, "__typename");
            C17542s.j(uVar, "deliveryServiceFragment");
            this.f76813a = str;
            this.f76814b = uVar;
        }

        public final C10343u a() {
            return this.f76814b;
        }

        public final String b() {
            return this.f76813a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f76813a, fVar.f76813a) && C17542s.e(this.f76814b, fVar.f76814b);
        }

        public int hashCode() {
            return (this.f76813a.hashCode() * 31) + this.f76814b.hashCode();
        }

        public String toString() {
            String str = this.f76813a;
            C10343u uVar = this.f76814b;
            return "HomeDeliveryService(__typename=" + str + ", deliveryServiceFragment=" + uVar + ")";
        }
    }

    public C10256a(String str, y<String> yVar, y<String> yVar2, C10371b bVar, y<j> yVar3, List<? extends C10376g> list, List<? extends C10376g> list2) {
        C17542s.j(str, "zipCode");
        C17542s.j(yVar, "stateCode");
        C17542s.j(yVar2, "deliveryCountryCode");
        C17542s.j(bVar, "cartInput");
        C17542s.j(yVar3, "preferredDeliveryService");
        C17542s.j(list, "supportedCollectDeliveryServices");
        C17542s.j(list2, "supportedHomeDeliveryServices");
        this.f76798a = str;
        this.f76799b = yVar;
        this.f76800c = yVar2;
        this.f76801d = bVar;
        this.f76802e = yVar3;
        this.f76803f = list;
        this.f76804g = list2;
    }

    public void a(g gVar, k kVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C10287f.f77099a.b(gVar, kVar, this);
    }

    public C6654b<e> b() {
        return M6.d.d(C10285d.f77095a, false, 1, (Object) null);
    }

    public String c() {
        return "5bf701f094f0acd4e9984f5af90e1c07f238d42dda3631d72121d6f08fb0711f";
    }

    public String d() {
        return f76797h.a();
    }

    public final C10371b e() {
        return this.f76801d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10256a)) {
            return false;
        }
        C10256a aVar = (C10256a) obj;
        return C17542s.e(this.f76798a, aVar.f76798a) && C17542s.e(this.f76799b, aVar.f76799b) && C17542s.e(this.f76800c, aVar.f76800c) && C17542s.e(this.f76801d, aVar.f76801d) && C17542s.e(this.f76802e, aVar.f76802e) && C17542s.e(this.f76803f, aVar.f76803f) && C17542s.e(this.f76804g, aVar.f76804g);
    }

    public final y<String> f() {
        return this.f76800c;
    }

    public final y<j> g() {
        return this.f76802e;
    }

    public final y<String> h() {
        return this.f76799b;
    }

    public int hashCode() {
        return (((((((((((this.f76798a.hashCode() * 31) + this.f76799b.hashCode()) * 31) + this.f76800c.hashCode()) * 31) + this.f76801d.hashCode()) * 31) + this.f76802e.hashCode()) * 31) + this.f76803f.hashCode()) * 31) + this.f76804g.hashCode();
    }

    public final List<C10376g> i() {
        return this.f76803f;
    }

    public final List<C10376g> j() {
        return this.f76804g;
    }

    public final String k() {
        return this.f76798a;
    }

    public String name() {
        return "CreateCheckout";
    }

    public String toString() {
        String str = this.f76798a;
        y<String> yVar = this.f76799b;
        y<String> yVar2 = this.f76800c;
        C10371b bVar = this.f76801d;
        y<j> yVar3 = this.f76802e;
        List<C10376g> list = this.f76803f;
        List<C10376g> list2 = this.f76804g;
        return "CreateCheckoutMutation(zipCode=" + str + ", stateCode=" + yVar + ", deliveryCountryCode=" + yVar2 + ", cartInput=" + bVar + ", preferredDeliveryService=" + yVar3 + ", supportedCollectDeliveryServices=" + list + ", supportedHomeDeliveryServices=" + list2 + ")";
    }
}
