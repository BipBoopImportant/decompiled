package com.afterpay.android.internal;

import XH.C16814e;
import com.afterpay.android.internal.AfterpayCheckoutMessage;
import com.afterpay.android.model.ShippingAddress;
import com.afterpay.android.model.ShippingAddress$$serializer;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/afterpay/android/internal/ShippingAddressMessage;", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage;", "", "seen1", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "meta", "Lcom/afterpay/android/model/ShippingAddress;", "payload", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;Lcom/afterpay/android/model/ShippingAddress;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/afterpay/android/internal/ShippingAddressMessage;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "c", "()Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "Lcom/afterpay/android/model/ShippingAddress;", "getPayload", "()Lcom/afterpay/android/model/ShippingAddress;", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ShippingAddressMessage extends AfterpayCheckoutMessage {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta f46004b;

    /* renamed from: c  reason: collision with root package name */
    private final ShippingAddress f46005c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/internal/ShippingAddressMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/internal/ShippingAddressMessage;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShippingAddressMessage> serializer() {
            return ShippingAddressMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C16814e
    public /* synthetic */ ShippingAddressMessage(int i10, AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta afterpayCheckoutMessageMeta, ShippingAddress shippingAddress, T0 t02) {
        super(i10, t02);
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ShippingAddressMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f46004b = afterpayCheckoutMessageMeta;
        this.f46005c = shippingAddress;
    }

    public static final void d(ShippingAddressMessage shippingAddressMessage, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(shippingAddressMessage, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        AfterpayCheckoutMessage.b(shippingAddressMessage, dVar, serialDescriptor);
        dVar.i(serialDescriptor, 0, AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, shippingAddressMessage.c());
        dVar.i(serialDescriptor, 1, ShippingAddress$$serializer.INSTANCE, shippingAddressMessage.f46005c);
    }

    public AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta c() {
        return this.f46004b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddressMessage)) {
            return false;
        }
        ShippingAddressMessage shippingAddressMessage = (ShippingAddressMessage) obj;
        return C17542s.e(c(), shippingAddressMessage.c()) && C17542s.e(this.f46005c, shippingAddressMessage.f46005c);
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f46005c.hashCode();
    }

    public String toString() {
        return "ShippingAddressMessage(meta=" + c() + ", payload=" + this.f46005c + ')';
    }
}
