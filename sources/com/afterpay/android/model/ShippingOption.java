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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 22\u00020\u0001:\u000232BW\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+¨\u00064"}, d2 = {"Lcom/afterpay/android/model/ShippingOption;", "", "", "seen1", "", "id", "name", "description", "Lcom/afterpay/android/model/Money;", "shippingAmount", "orderAmount", "taxAmount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/afterpay/android/model/Money;Lcom/afterpay/android/model/Money;Lcom/afterpay/android/model/Money;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/model/ShippingOption;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "getName", "c", "getDescription", "d", "Lcom/afterpay/android/model/Money;", "getShippingAmount", "()Lcom/afterpay/android/model/Money;", "setShippingAmount", "(Lcom/afterpay/android/model/Money;)V", "e", "getOrderAmount", "setOrderAmount", "f", "getTaxAmount", "setTaxAmount", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ShippingOption {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f46022a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46023b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46024c;

    /* renamed from: d  reason: collision with root package name */
    private Money f46025d;

    /* renamed from: e  reason: collision with root package name */
    private Money f46026e;

    /* renamed from: f  reason: collision with root package name */
    private Money f46027f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/model/ShippingOption$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/model/ShippingOption;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShippingOption> serializer() {
            return ShippingOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ ShippingOption(int i10, String str, String str2, String str3, Money money, Money money2, Money money3, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, ShippingOption$$serializer.INSTANCE.getDescriptor());
        }
        this.f46022a = str;
        this.f46023b = str2;
        this.f46024c = str3;
        this.f46025d = money;
        this.f46026e = money2;
        this.f46027f = money3;
    }

    public static final void a(ShippingOption shippingOption, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(shippingOption, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        dVar.y(serialDescriptor, 0, shippingOption.f46022a);
        dVar.y(serialDescriptor, 1, shippingOption.f46023b);
        dVar.y(serialDescriptor, 2, shippingOption.f46024c);
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        dVar.i(serialDescriptor, 3, money$$serializer, shippingOption.f46025d);
        dVar.i(serialDescriptor, 4, money$$serializer, shippingOption.f46026e);
        dVar.B(serialDescriptor, 5, money$$serializer, shippingOption.f46027f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingOption)) {
            return false;
        }
        ShippingOption shippingOption = (ShippingOption) obj;
        return C17542s.e(this.f46022a, shippingOption.f46022a) && C17542s.e(this.f46023b, shippingOption.f46023b) && C17542s.e(this.f46024c, shippingOption.f46024c) && C17542s.e(this.f46025d, shippingOption.f46025d) && C17542s.e(this.f46026e, shippingOption.f46026e) && C17542s.e(this.f46027f, shippingOption.f46027f);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f46022a.hashCode() * 31) + this.f46023b.hashCode()) * 31) + this.f46024c.hashCode()) * 31) + this.f46025d.hashCode()) * 31) + this.f46026e.hashCode()) * 31;
        Money money = this.f46027f;
        return hashCode + (money == null ? 0 : money.hashCode());
    }

    public String toString() {
        return "ShippingOption(id=" + this.f46022a + ", name=" + this.f46023b + ", description=" + this.f46024c + ", shippingAmount=" + this.f46025d + ", orderAmount=" + this.f46026e + ", taxAmount=" + this.f46027f + ')';
    }
}
