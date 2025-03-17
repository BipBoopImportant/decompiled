package com.afterpay.android.internal;

import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17631a;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutMessage;", "", "<init>", "()V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/afterpay/android/internal/AfterpayCheckoutMessage;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "AfterpayCheckoutMessageMeta", "Lcom/afterpay/android/internal/CheckoutErrorMessage;", "Lcom/afterpay/android/internal/CheckoutLogMessage;", "Lcom/afterpay/android/internal/EmptyPayloadMessage;", "Lcom/afterpay/android/internal/ShippingAddressMessage;", "Lcom/afterpay/android/internal/ShippingOptionMessage;", "Lcom/afterpay/android/internal/ShippingOptionUpdateMessage;", "Lcom/afterpay/android/internal/ShippingOptionsMessage;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AfterpayCheckoutMessage {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16824o<KSerializer<Object>> f45984a = C16825p.a(s.PUBLICATION, a.f45986c);

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "", "", "seen1", "", "requestId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AfterpayCheckoutMessageMeta {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f45985a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AfterpayCheckoutMessageMeta> serializer() {
                return AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C16814e
        public /* synthetic */ AfterpayCheckoutMessageMeta(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE.getDescriptor());
            }
            this.f45985a = str;
        }

        public static final void a(AfterpayCheckoutMessageMeta afterpayCheckoutMessageMeta, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17542s.j(afterpayCheckoutMessageMeta, "self");
            C17542s.j(dVar, "output");
            C17542s.j(serialDescriptor, "serialDesc");
            dVar.y(serialDescriptor, 0, afterpayCheckoutMessageMeta.f45985a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterpayCheckoutMessageMeta) && C17542s.e(this.f45985a, ((AfterpayCheckoutMessageMeta) obj).f45985a);
        }

        public int hashCode() {
            return this.f45985a.hashCode();
        }

        public String toString() {
            return "AfterpayCheckoutMessageMeta(requestId=" + this.f45985a + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutMessage$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C16824o a() {
            return AfterpayCheckoutMessage.f45984a;
        }

        public final KSerializer<AfterpayCheckoutMessage> serializer() {
            return (KSerializer) a().getValue();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    static final class a extends C17544u implements C17631a<KSerializer<Object>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f45986c = new a();

        a() {
            super(0);
        }

        public final KSerializer<Object> invoke() {
            C18055d b10 = P.b(AfterpayCheckoutMessage.class);
            C18055d[] dVarArr = {P.b(CheckoutErrorMessage.class), P.b(CheckoutLogMessage.class), P.b(EmptyPayloadMessage.class), P.b(ShippingAddressMessage.class), P.b(ShippingOptionMessage.class), P.b(ShippingOptionUpdateMessage.class), P.b(ShippingOptionsMessage.class)};
            return new C17261n("com.afterpay.android.internal.AfterpayCheckoutMessage", b10, dVarArr, new KSerializer[]{CheckoutErrorMessage$$serializer.INSTANCE, CheckoutLogMessage$$serializer.INSTANCE, EmptyPayloadMessage$$serializer.INSTANCE, ShippingAddressMessage$$serializer.INSTANCE, ShippingOptionMessage$$serializer.INSTANCE, ShippingOptionUpdateMessage$$serializer.INSTANCE, ShippingOptionsMessage$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    private AfterpayCheckoutMessage() {
    }

    public static final void b(AfterpayCheckoutMessage afterpayCheckoutMessage, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(afterpayCheckoutMessage, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
    }

    @C16814e
    public /* synthetic */ AfterpayCheckoutMessage(int i10, T0 t02) {
    }
}
