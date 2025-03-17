package com.afterpay.android.model;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-,BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%¨\u0006."}, d2 = {"Lcom/afterpay/android/model/ShippingOptionUpdate;", "", "", "seen1", "", "id", "Lcom/afterpay/android/model/Money;", "shippingAmount", "orderAmount", "taxAmount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/afterpay/android/model/Money;Lcom/afterpay/android/model/Money;Lcom/afterpay/android/model/Money;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/model/ShippingOptionUpdate;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/afterpay/android/model/Money;", "getShippingAmount", "()Lcom/afterpay/android/model/Money;", "setShippingAmount", "(Lcom/afterpay/android/model/Money;)V", "c", "getOrderAmount", "setOrderAmount", "d", "getTaxAmount", "setTaxAmount", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ShippingOptionUpdate {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f46028a;

    /* renamed from: b  reason: collision with root package name */
    private Money f46029b;

    /* renamed from: c  reason: collision with root package name */
    private Money f46030c;

    /* renamed from: d  reason: collision with root package name */
    private Money f46031d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/model/ShippingOptionUpdate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/model/ShippingOptionUpdate;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShippingOptionUpdate> serializer() {
            return ShippingOptionUpdate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ ShippingOptionUpdate(int i10, String str, Money money, Money money2, Money money3, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ShippingOptionUpdate$$serializer.INSTANCE.getDescriptor());
        }
        this.f46028a = str;
        this.f46029b = money;
        this.f46030c = money2;
        this.f46031d = money3;
    }

    public static final void a(ShippingOptionUpdate shippingOptionUpdate, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(shippingOptionUpdate, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        dVar.y(serialDescriptor, 0, shippingOptionUpdate.f46028a);
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        dVar.i(serialDescriptor, 1, money$$serializer, shippingOptionUpdate.f46029b);
        dVar.i(serialDescriptor, 2, money$$serializer, shippingOptionUpdate.f46030c);
        dVar.B(serialDescriptor, 3, money$$serializer, shippingOptionUpdate.f46031d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingOptionUpdate)) {
            return false;
        }
        ShippingOptionUpdate shippingOptionUpdate = (ShippingOptionUpdate) obj;
        return C17542s.e(this.f46028a, shippingOptionUpdate.f46028a) && C17542s.e(this.f46029b, shippingOptionUpdate.f46029b) && C17542s.e(this.f46030c, shippingOptionUpdate.f46030c) && C17542s.e(this.f46031d, shippingOptionUpdate.f46031d);
    }

    public int hashCode() {
        int hashCode = ((((this.f46028a.hashCode() * 31) + this.f46029b.hashCode()) * 31) + this.f46030c.hashCode()) * 31;
        Money money = this.f46031d;
        return hashCode + (money == null ? 0 : money.hashCode());
    }

    public String toString() {
        return "ShippingOptionUpdate(id=" + this.f46028a + ", shippingAmount=" + this.f46029b + ", orderAmount=" + this.f46030c + ", taxAmount=" + this.f46031d + ')';
    }
}
