package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u0000 >2\u00020\u0001:\u0006?@ABC&Bm\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010'\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010)R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010'\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010)R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u00101\u0012\u0004\b4\u0010+\u001a\u0004\b2\u00103R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010:\u0012\u0004\b<\u0010+\u001a\u0004\b,\u0010;R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00106\u0012\u0004\b=\u0010+\u001a\u0004\b5\u00108¨\u0006D"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "", "", "seen0", "", "inclTax", "exclTax", "tax", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;", "priceExclSavings", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$CheckoutTaxSummary;", "taxSummaryList", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;", "discountSummary", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$OrderDiscountSummary;", "orderDiscountSummaryList", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;Ljava/util/List;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "i", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "getInclTax$annotations", "()V", "b", "c", "getExclTax$annotations", "g", "getTax$annotations", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;", "f", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;", "getPriceExclSavings$annotations", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "getTaxSummaryList$annotations", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;", "getDiscountSummary$annotations", "getOrderDiscountSummaryList$annotations", "Companion", "PriceExclSavings", "CheckoutTaxSummary", "DiscountSummaryResponse", "OrderDiscountSummary", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PriceResponse {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f94261h = {null, null, null, null, new C17451f(PriceResponse$CheckoutTaxSummary$$serializer.INSTANCE), null, new C17451f(PriceResponse$OrderDiscountSummary$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final Double f94262a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f94263b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f94264c;

    /* renamed from: d  reason: collision with root package name */
    private final PriceExclSavings f94265d;

    /* renamed from: e  reason: collision with root package name */
    private final List<CheckoutTaxSummary> f94266e;

    /* renamed from: f  reason: collision with root package name */
    private final DiscountSummaryResponse f94267f;

    /* renamed from: g  reason: collision with root package name */
    private final List<OrderDiscountSummary> f94268g;

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001dB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010 \u001a\u0004\b!\u0010#¨\u0006'"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$CheckoutTaxSummary;", "", "", "taxType", "", "totalTaxAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$CheckoutTaxSummary;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTaxType$annotations", "()V", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getTotalTaxAmount$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutTaxSummary {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94269a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f94270b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$CheckoutTaxSummary$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$CheckoutTaxSummary;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CheckoutTaxSummary> serializer() {
                return PriceResponse$CheckoutTaxSummary$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CheckoutTaxSummary(int i10, String str, Double d10, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PriceResponse$CheckoutTaxSummary$$serializer.INSTANCE.getDescriptor());
            }
            this.f94269a = str;
            this.f94270b = d10;
        }

        public static final /* synthetic */ void c(CheckoutTaxSummary checkoutTaxSummary, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, checkoutTaxSummary.f94269a);
            dVar.B(serialDescriptor, 1, C17438C.f144010a, checkoutTaxSummary.f94270b);
        }

        public final String a() {
            return this.f94269a;
        }

        public final Double b() {
            return this.f94270b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutTaxSummary)) {
                return false;
            }
            CheckoutTaxSummary checkoutTaxSummary = (CheckoutTaxSummary) obj;
            return C17542s.e(this.f94269a, checkoutTaxSummary.f94269a) && C17542s.e(this.f94270b, checkoutTaxSummary.f94270b);
        }

        public int hashCode() {
            String str = this.f94269a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Double d10 = this.f94270b;
            if (d10 != null) {
                i10 = d10.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f94269a;
            Double d10 = this.f94270b;
            return "CheckoutTaxSummary(taxType=" + str + ", totalTaxAmount=" + d10 + ")";
        }

        public CheckoutTaxSummary(String str, Double d10) {
            this.f94269a = str;
            this.f94270b = d10;
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u001eB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b\u001e\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b&\u0010#\u001a\u0004\b$\u0010!¨\u0006)"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;", "", "", "family", "coupons", "employee", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "getFamily$annotations", "()V", "b", "getCoupons$annotations", "getEmployee$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DiscountSummaryResponse {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f94271a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f94272b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94273c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DiscountSummaryResponse> serializer() {
                return PriceResponse$DiscountSummaryResponse$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DiscountSummaryResponse(int i10, Double d10, Double d11, Double d12, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, PriceResponse$DiscountSummaryResponse$$serializer.INSTANCE.getDescriptor());
            }
            this.f94271a = d10;
            this.f94272b = d11;
            this.f94273c = d12;
        }

        public static final /* synthetic */ void d(DiscountSummaryResponse discountSummaryResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17438C c10 = C17438C.f144010a;
            dVar.B(serialDescriptor, 0, c10, discountSummaryResponse.f94271a);
            dVar.B(serialDescriptor, 1, c10, discountSummaryResponse.f94272b);
            dVar.B(serialDescriptor, 2, c10, discountSummaryResponse.f94273c);
        }

        public final Double a() {
            return this.f94272b;
        }

        public final Double b() {
            return this.f94273c;
        }

        public final Double c() {
            return this.f94271a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscountSummaryResponse)) {
                return false;
            }
            DiscountSummaryResponse discountSummaryResponse = (DiscountSummaryResponse) obj;
            return C17542s.e(this.f94271a, discountSummaryResponse.f94271a) && C17542s.e(this.f94272b, discountSummaryResponse.f94272b) && C17542s.e(this.f94273c, discountSummaryResponse.f94273c);
        }

        public int hashCode() {
            Double d10 = this.f94271a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.f94272b;
            int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.f94273c;
            if (d12 != null) {
                i10 = d12.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            Double d10 = this.f94271a;
            Double d11 = this.f94272b;
            Double d12 = this.f94273c;
            return "DiscountSummaryResponse(family=" + d10 + ", coupons=" + d11 + ", employee=" + d12 + ")";
        }

        public DiscountSummaryResponse(Double d10, Double d11, Double d12) {
            this.f94271a = d10;
            this.f94272b = d11;
            this.f94273c = d12;
        }
    }

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001dB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$OrderDiscountSummary;", "", "", "amount", "", "name", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$OrderDiscountSummary;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getAmount$annotations", "()V", "b", "Ljava/lang/String;", "getName$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderDiscountSummary {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f94274a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94275b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$OrderDiscountSummary$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$OrderDiscountSummary;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OrderDiscountSummary> serializer() {
                return PriceResponse$OrderDiscountSummary$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ OrderDiscountSummary(int i10, Double d10, String str, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PriceResponse$OrderDiscountSummary$$serializer.INSTANCE.getDescriptor());
            }
            this.f94274a = d10;
            this.f94275b = str;
        }

        public static final /* synthetic */ void c(OrderDiscountSummary orderDiscountSummary, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, C17438C.f144010a, orderDiscountSummary.f94274a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, orderDiscountSummary.f94275b);
        }

        public final Double a() {
            return this.f94274a;
        }

        public final String b() {
            return this.f94275b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderDiscountSummary)) {
                return false;
            }
            OrderDiscountSummary orderDiscountSummary = (OrderDiscountSummary) obj;
            return C17542s.e(this.f94274a, orderDiscountSummary.f94274a) && C17542s.e(this.f94275b, orderDiscountSummary.f94275b);
        }

        public int hashCode() {
            Double d10 = this.f94274a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            String str = this.f94275b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f94274a;
            String str = this.f94275b;
            return "OrderDiscountSummary(amount=" + d10 + ", name=" + str + ")";
        }

        public OrderDiscountSummary(Double d10, String str) {
            this.f94274a = d10;
            this.f94275b = str;
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u001eB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b$\u0010#\u001a\u0004\b\u001e\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010!¨\u0006)"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;", "", "", "inclTax", "exclTax", "tax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "getInclTax$annotations", "()V", "getExclTax$annotations", "c", "getTax$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PriceExclSavings {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f94276a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f94277b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94278c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PriceExclSavings> serializer() {
                return PriceResponse$PriceExclSavings$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PriceExclSavings(int i10, Double d10, Double d11, Double d12, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, PriceResponse$PriceExclSavings$$serializer.INSTANCE.getDescriptor());
            }
            this.f94276a = d10;
            this.f94277b = d11;
            this.f94278c = d12;
        }

        public static final /* synthetic */ void d(PriceExclSavings priceExclSavings, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17438C c10 = C17438C.f144010a;
            dVar.B(serialDescriptor, 0, c10, priceExclSavings.f94276a);
            dVar.B(serialDescriptor, 1, c10, priceExclSavings.f94277b);
            dVar.B(serialDescriptor, 2, c10, priceExclSavings.f94278c);
        }

        public final Double a() {
            return this.f94277b;
        }

        public final Double b() {
            return this.f94276a;
        }

        public final Double c() {
            return this.f94278c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceExclSavings)) {
                return false;
            }
            PriceExclSavings priceExclSavings = (PriceExclSavings) obj;
            return C17542s.e(this.f94276a, priceExclSavings.f94276a) && C17542s.e(this.f94277b, priceExclSavings.f94277b) && C17542s.e(this.f94278c, priceExclSavings.f94278c);
        }

        public int hashCode() {
            Double d10 = this.f94276a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.f94277b;
            int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.f94278c;
            if (d12 != null) {
                i10 = d12.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            Double d10 = this.f94276a;
            Double d11 = this.f94277b;
            Double d12 = this.f94278c;
            return "PriceExclSavings(inclTax=" + d10 + ", exclTax=" + d11 + ", tax=" + d12 + ")";
        }

        public PriceExclSavings(Double d10, Double d11, Double d12) {
            this.f94276a = d10;
            this.f94277b = d11;
            this.f94278c = d12;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PriceResponse> serializer() {
            return PriceResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PriceResponse(int i10, Double d10, Double d11, Double d12, PriceExclSavings priceExclSavings, List list, DiscountSummaryResponse discountSummaryResponse, List list2, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, PriceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f94262a = d10;
        this.f94263b = d11;
        this.f94264c = d12;
        this.f94265d = priceExclSavings;
        this.f94266e = list;
        this.f94267f = discountSummaryResponse;
        this.f94268g = list2;
    }

    public static final /* synthetic */ void i(PriceResponse priceResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f94261h;
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 0, c10, priceResponse.f94262a);
        dVar.B(serialDescriptor, 1, c10, priceResponse.f94263b);
        dVar.B(serialDescriptor, 2, c10, priceResponse.f94264c);
        dVar.B(serialDescriptor, 3, PriceResponse$PriceExclSavings$$serializer.INSTANCE, priceResponse.f94265d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], priceResponse.f94266e);
        dVar.B(serialDescriptor, 5, PriceResponse$DiscountSummaryResponse$$serializer.INSTANCE, priceResponse.f94267f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], priceResponse.f94268g);
    }

    public final DiscountSummaryResponse b() {
        return this.f94267f;
    }

    public final Double c() {
        return this.f94263b;
    }

    public final Double d() {
        return this.f94262a;
    }

    public final List<OrderDiscountSummary> e() {
        return this.f94268g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceResponse)) {
            return false;
        }
        PriceResponse priceResponse = (PriceResponse) obj;
        return C17542s.e(this.f94262a, priceResponse.f94262a) && C17542s.e(this.f94263b, priceResponse.f94263b) && C17542s.e(this.f94264c, priceResponse.f94264c) && C17542s.e(this.f94265d, priceResponse.f94265d) && C17542s.e(this.f94266e, priceResponse.f94266e) && C17542s.e(this.f94267f, priceResponse.f94267f) && C17542s.e(this.f94268g, priceResponse.f94268g);
    }

    public final PriceExclSavings f() {
        return this.f94265d;
    }

    public final Double g() {
        return this.f94264c;
    }

    public final List<CheckoutTaxSummary> h() {
        return this.f94266e;
    }

    public int hashCode() {
        Double d10 = this.f94262a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f94263b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f94264c;
        int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        PriceExclSavings priceExclSavings = this.f94265d;
        int hashCode4 = (hashCode3 + (priceExclSavings == null ? 0 : priceExclSavings.hashCode())) * 31;
        List<CheckoutTaxSummary> list = this.f94266e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DiscountSummaryResponse discountSummaryResponse = this.f94267f;
        int hashCode6 = (hashCode5 + (discountSummaryResponse == null ? 0 : discountSummaryResponse.hashCode())) * 31;
        List<OrderDiscountSummary> list2 = this.f94268g;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        Double d10 = this.f94262a;
        Double d11 = this.f94263b;
        Double d12 = this.f94264c;
        PriceExclSavings priceExclSavings = this.f94265d;
        List<CheckoutTaxSummary> list = this.f94266e;
        DiscountSummaryResponse discountSummaryResponse = this.f94267f;
        List<OrderDiscountSummary> list2 = this.f94268g;
        return "PriceResponse(inclTax=" + d10 + ", exclTax=" + d11 + ", tax=" + d12 + ", priceExclSavings=" + priceExclSavings + ", taxSummaryList=" + list + ", discountSummary=" + discountSummaryResponse + ", orderDiscountSummaryList=" + list2 + ")";
    }
}
