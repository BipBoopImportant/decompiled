package th;

import M6.A;
import M6.C6654b;
import M6.d;
import M6.k;
import M6.w;
import Q6.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uh.C10297p;
import uh.u;
import vh.C10325f0;
import vh.C10334k;
import vh.E0;
import wh.C10378i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0017&#\u000b\r\u0014B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b$\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lth/d;", "LM6/A;", "Lth/d$b;", "", "checkoutId", "serviceAreaId", "", "Lwh/i;", "additionalValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "c", "()Ljava/lang/String;", "d", "name", "LQ6/g;", "writer", "LM6/k;", "customScalarAdapters", "LXH/N;", "a", "(LQ6/g;LM6/k;)V", "LM6/b;", "b", "()LM6/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "g", "Ljava/util/List;", "e", "()Ljava/util/List;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: th.d  reason: case insensitive filesystem */
public final class C10259d implements A<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f76837d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f76838a;

    /* renamed from: b  reason: collision with root package name */
    private final String f76839b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C10378i> f76840c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lth/d$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetSelectedDeliveryAndServices($checkoutId: String!, $serviceAreaId: String!, $additionalValues: [KeyValuePair!]!) { selectedDeliveryAndServices(checkoutId: $checkoutId, serviceAreaId: $serviceAreaId) { shippingBilling(displayFieldVersion: V4, additionalValues: $additionalValues) { __typename ...UserDetailsFields } deliveryService { __typename ...SelectedDeliveryServiceFragment } orderCaptureState { __typename ...CheckoutStateFragment } } }  fragment DynamicFieldsConfigurationFragment on DisplayField { key targetKey title text textAsCollapsed inputValue inputDisplay mandatory errorText inputType uiType accountType data { key value displayText } validation { key value displayText } visibility { conditions { key regex } conditionName } }  fragment UserDetailsFields on DisplayFieldSection { primary { __typename ...DynamicFieldsConfigurationFragment } secondary { __typename ...DynamicFieldsConfigurationFragment } contact { __typename ...DynamicFieldsConfigurationFragment } terms { __typename ...DynamicFieldsConfigurationFragment } }  fragment SolutionPriceFragment on SolutionPrice { inclTax exclTax }  fragment AddressFragment on PickUpPointAddress { addressLines city zipCode }  fragment OpeningHoursFragment on PickUpPointOpeningHours { openingHoursMonTime openingHoursTueTime openingHoursWedTime openingHoursThuTime openingHoursFriTime openingHoursSatTime openingHoursSunTime }  fragment DeliveryDateDetailsFragment on DeliveryDateDetails { dateSpan { from { dateTime presentationPattern } to { dateTime presentationPattern } } text }  fragment SelectedDeliveryServiceFragment on SelectedDeliveryService { solution fulfillmentMethodType id solutionPrice { __typename ...SolutionPriceFragment } splittedItems { deliveryId items { articleId deliveryPart numberOfDeliveries } } deliveries { deliveryItems { itemNo parentId } id rangeOfDays selectedTimeWindow { fromDateTime id price { inclTax exclTax } toDateTime timeZone capability { type } } serviceItemId type selectedPickUpPoint { address { __typename ...AddressFragment } distance latitude longitude name ocPUPId identifier openingHours { __typename ...OpeningHoursFragment } } presentation { deliveryDateDetails { __typename ...DeliveryDateDetailsFragment } selectTimeWindowDescription collapsedDeliveryInformation allowChangingTimeslot } } }  fragment PriceExclSavingsFragment on Price { priceExclSavings { inclTax exclTax tax } }  fragment TaxPriceFragment on TaxPrice { taxAmount code taxPercentage type taxableAmount }  fragment TaxSummaryFragment on TaxSummary { taxType totalTaxAmount }  fragment PriceFragment on Price { inclTax exclTax tax taxList { __typename ...TaxPriceFragment } taxSummaryList { __typename ...TaxSummaryFragment } discountSummary { all coupons discounts employee family familyPrice familyPromotions manual promotions voucher } type }  fragment OrderDiscountSummaryListFragment on Price { orderDiscountSummaryList { amount name } }  fragment CheckoutStateFragment on CheckoutState { goodsTotal { __typename ...PriceExclSavingsFragment ...PriceFragment } orderTotal { __typename ...PriceFragment ...OrderDiscountSummaryListFragment } shippingPrice { __typename ...PriceFragment ...PriceExclSavingsFragment } }";
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth/d$b;", "", "Lth/d$e;", "selectedDeliveryAndServices", "<init>", "(Lth/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth/d$e;", "()Lth/d$e;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.d$b */
    public static final class b implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final e f76841a;

        public b(e eVar) {
            C17542s.j(eVar, "selectedDeliveryAndServices");
            this.f76841a = eVar;
        }

        public final e a() {
            return this.f76841a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f76841a, ((b) obj).f76841a);
        }

        public int hashCode() {
            return this.f76841a.hashCode();
        }

        public String toString() {
            e eVar = this.f76841a;
            return "Data(selectedDeliveryAndServices=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/d$c;", "", "", "__typename", "Lvh/f0;", "selectedDeliveryServiceFragment", "<init>", "(Ljava/lang/String;Lvh/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/f0;", "()Lvh/f0;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.d$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f76842a;

        /* renamed from: b  reason: collision with root package name */
        private final C10325f0 f76843b;

        public c(String str, C10325f0 f0Var) {
            C17542s.j(str, "__typename");
            C17542s.j(f0Var, "selectedDeliveryServiceFragment");
            this.f76842a = str;
            this.f76843b = f0Var;
        }

        public final C10325f0 a() {
            return this.f76843b;
        }

        public final String b() {
            return this.f76842a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f76842a, cVar.f76842a) && C17542s.e(this.f76843b, cVar.f76843b);
        }

        public int hashCode() {
            return (this.f76842a.hashCode() * 31) + this.f76843b.hashCode();
        }

        public String toString() {
            String str = this.f76842a;
            C10325f0 f0Var = this.f76843b;
            return "DeliveryService(__typename=" + str + ", selectedDeliveryServiceFragment=" + f0Var + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/d$d;", "", "", "__typename", "Lvh/k;", "checkoutStateFragment", "<init>", "(Ljava/lang/String;Lvh/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/k;", "()Lvh/k;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.d$d  reason: collision with other inner class name */
    public static final class C1417d {

        /* renamed from: a  reason: collision with root package name */
        private final String f76844a;

        /* renamed from: b  reason: collision with root package name */
        private final C10334k f76845b;

        public C1417d(String str, C10334k kVar) {
            C17542s.j(str, "__typename");
            C17542s.j(kVar, "checkoutStateFragment");
            this.f76844a = str;
            this.f76845b = kVar;
        }

        public final C10334k a() {
            return this.f76845b;
        }

        public final String b() {
            return this.f76844a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1417d)) {
                return false;
            }
            C1417d dVar = (C1417d) obj;
            return C17542s.e(this.f76844a, dVar.f76844a) && C17542s.e(this.f76845b, dVar.f76845b);
        }

        public int hashCode() {
            return (this.f76844a.hashCode() * 31) + this.f76845b.hashCode();
        }

        public String toString() {
            String str = this.f76844a;
            C10334k kVar = this.f76845b;
            return "OrderCaptureState(__typename=" + str + ", checkoutStateFragment=" + kVar + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lth/d$e;", "", "Lth/d$f;", "shippingBilling", "Lth/d$c;", "deliveryService", "Lth/d$d;", "orderCaptureState", "<init>", "(Lth/d$f;Lth/d$c;Lth/d$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth/d$f;", "c", "()Lth/d$f;", "b", "Lth/d$c;", "()Lth/d$c;", "Lth/d$d;", "()Lth/d$d;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.d$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final f f76846a;

        /* renamed from: b  reason: collision with root package name */
        private final c f76847b;

        /* renamed from: c  reason: collision with root package name */
        private final C1417d f76848c;

        public e(f fVar, c cVar, C1417d dVar) {
            C17542s.j(fVar, "shippingBilling");
            C17542s.j(cVar, "deliveryService");
            C17542s.j(dVar, "orderCaptureState");
            this.f76846a = fVar;
            this.f76847b = cVar;
            this.f76848c = dVar;
        }

        public final c a() {
            return this.f76847b;
        }

        public final C1417d b() {
            return this.f76848c;
        }

        public final f c() {
            return this.f76846a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f76846a, eVar.f76846a) && C17542s.e(this.f76847b, eVar.f76847b) && C17542s.e(this.f76848c, eVar.f76848c);
        }

        public int hashCode() {
            return (((this.f76846a.hashCode() * 31) + this.f76847b.hashCode()) * 31) + this.f76848c.hashCode();
        }

        public String toString() {
            f fVar = this.f76846a;
            c cVar = this.f76847b;
            C1417d dVar = this.f76848c;
            return "SelectedDeliveryAndServices(shippingBilling=" + fVar + ", deliveryService=" + cVar + ", orderCaptureState=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/d$f;", "", "", "__typename", "Lvh/E0;", "userDetailsFields", "<init>", "(Ljava/lang/String;Lvh/E0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/E0;", "()Lvh/E0;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: th.d$f */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final String f76849a;

        /* renamed from: b  reason: collision with root package name */
        private final E0 f76850b;

        public f(String str, E0 e02) {
            C17542s.j(str, "__typename");
            C17542s.j(e02, "userDetailsFields");
            this.f76849a = str;
            this.f76850b = e02;
        }

        public final E0 a() {
            return this.f76850b;
        }

        public final String b() {
            return this.f76849a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f76849a, fVar.f76849a) && C17542s.e(this.f76850b, fVar.f76850b);
        }

        public int hashCode() {
            return (this.f76849a.hashCode() * 31) + this.f76850b.hashCode();
        }

        public String toString() {
            String str = this.f76849a;
            E0 e02 = this.f76850b;
            return "ShippingBilling(__typename=" + str + ", userDetailsFields=" + e02 + ")";
        }
    }

    public C10259d(String str, String str2, List<C10378i> list) {
        C17542s.j(str, "checkoutId");
        C17542s.j(str2, "serviceAreaId");
        C17542s.j(list, "additionalValues");
        this.f76838a = str;
        this.f76839b = str2;
        this.f76840c = list;
    }

    public void a(g gVar, k kVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        u.f77126a.b(gVar, kVar, this);
    }

    public C6654b<b> b() {
        return d.d(C10297p.f77116a, false, 1, (Object) null);
    }

    public String c() {
        return "7637bf595cd43416b485f3bf929808d1feb1abb42d79d90b6fa06eb61055a5e5";
    }

    public String d() {
        return f76837d.a();
    }

    public final List<C10378i> e() {
        return this.f76840c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10259d)) {
            return false;
        }
        C10259d dVar = (C10259d) obj;
        return C17542s.e(this.f76838a, dVar.f76838a) && C17542s.e(this.f76839b, dVar.f76839b) && C17542s.e(this.f76840c, dVar.f76840c);
    }

    public final String f() {
        return this.f76838a;
    }

    public final String g() {
        return this.f76839b;
    }

    public int hashCode() {
        return (((this.f76838a.hashCode() * 31) + this.f76839b.hashCode()) * 31) + this.f76840c.hashCode();
    }

    public String name() {
        return "GetSelectedDeliveryAndServices";
    }

    public String toString() {
        String str = this.f76838a;
        String str2 = this.f76839b;
        List<C10378i> list = this.f76840c;
        return "GetSelectedDeliveryAndServicesQuery(checkoutId=" + str + ", serviceAreaId=" + str2 + ", additionalValues=" + list + ")";
    }
}
