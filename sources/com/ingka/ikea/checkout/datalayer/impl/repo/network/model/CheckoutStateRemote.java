package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import Nn.C10806i;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.d;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,\u0015B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010#¨\u0006-"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;", "Lpp/b;", "LNn/i;", "", "seen0", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "orderTotal", "goodsTotal", "shippingPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "getOrderTotal", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "getOrderTotal$annotations", "()V", "getGoodsTotal", "getGoodsTotal$annotations", "c", "getShippingPrice", "getShippingPrice$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckoutStateRemote implements C11768b<C10806i> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final PriceResponse f94109a;

    /* renamed from: b  reason: collision with root package name */
    private final PriceResponse f94110b;

    /* renamed from: c  reason: collision with root package name */
    private final PriceResponse f94111c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CheckoutStateRemote> serializer() {
            return CheckoutStateRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckoutStateRemote(int i10, PriceResponse priceResponse, PriceResponse priceResponse2, PriceResponse priceResponse3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, CheckoutStateRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f94109a = priceResponse;
        this.f94110b = priceResponse2;
        this.f94111c = priceResponse3;
    }

    public static final /* synthetic */ void b(CheckoutStateRemote checkoutStateRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        PriceResponse$$serializer priceResponse$$serializer = PriceResponse$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, priceResponse$$serializer, checkoutStateRemote.f94109a);
        dVar.B(serialDescriptor, 1, priceResponse$$serializer, checkoutStateRemote.f94110b);
        dVar.B(serialDescriptor, 2, priceResponse$$serializer, checkoutStateRemote.f94111c);
    }

    public C10806i a() {
        PriceResponse priceResponse = this.f94109a;
        if (priceResponse == null || this.f94110b == null) {
            throw new IllegalArgumentException("Missing required data: " + this);
        }
        Double d10 = priceResponse.d();
        Double c10 = this.f94109a.c();
        Double g10 = this.f94109a.g();
        List<PriceResponse.CheckoutTaxSummary> h10 = this.f94109a.h();
        PriceResponse.DiscountSummaryResponse b10 = this.f94109a.b();
        List<PriceResponse.OrderDiscountSummary> e10 = this.f94109a.e();
        PriceResponse.PriceExclSavings f10 = this.f94110b.f();
        PriceResponse priceResponse2 = this.f94111c;
        return d.P(d10, c10, g10, h10, b10, e10, f10, priceResponse2 != null ? priceResponse2.f() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutStateRemote)) {
            return false;
        }
        CheckoutStateRemote checkoutStateRemote = (CheckoutStateRemote) obj;
        return C17542s.e(this.f94109a, checkoutStateRemote.f94109a) && C17542s.e(this.f94110b, checkoutStateRemote.f94110b) && C17542s.e(this.f94111c, checkoutStateRemote.f94111c);
    }

    public int hashCode() {
        PriceResponse priceResponse = this.f94109a;
        int i10 = 0;
        int hashCode = (priceResponse == null ? 0 : priceResponse.hashCode()) * 31;
        PriceResponse priceResponse2 = this.f94110b;
        int hashCode2 = (hashCode + (priceResponse2 == null ? 0 : priceResponse2.hashCode())) * 31;
        PriceResponse priceResponse3 = this.f94111c;
        if (priceResponse3 != null) {
            i10 = priceResponse3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        PriceResponse priceResponse = this.f94109a;
        PriceResponse priceResponse2 = this.f94110b;
        PriceResponse priceResponse3 = this.f94111c;
        return "CheckoutStateRemote(orderTotal=" + priceResponse + ", goodsTotal=" + priceResponse2 + ", shippingPrice=" + priceResponse3 + ")";
    }
}
