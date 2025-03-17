package com.afterpay.android.internal;

import XH.C16814e;
import com.afterpay.android.internal.AfterpayCheckoutMessage;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 %2\u00020\u0001:\u0003&'%B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/afterpay/android/internal/CheckoutLogMessage;", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage;", "", "seen1", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "meta", "Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog;", "payload", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/afterpay/android/internal/CheckoutLogMessage;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "c", "()Lcom/afterpay/android/internal/AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta;", "Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog;", "getPayload", "()Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog;", "Companion", "$serializer", "CheckoutLog", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CheckoutLogMessage extends AfterpayCheckoutMessage {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta f45999b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckoutLog f46000c;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014¨\u0006!"}, d2 = {"Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog;", "", "", "seen1", "", "severity", "message", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSeverity", "b", "getMessage", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CheckoutLog {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f46001a;

        /* renamed from: b  reason: collision with root package name */
        private final String f46002b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/internal/CheckoutLogMessage$CheckoutLog;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CheckoutLog> serializer() {
                return CheckoutLogMessage$CheckoutLog$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C16814e
        public /* synthetic */ CheckoutLog(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, CheckoutLogMessage$CheckoutLog$$serializer.INSTANCE.getDescriptor());
            }
            this.f46001a = str;
            this.f46002b = str2;
        }

        public static final void a(CheckoutLog checkoutLog, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17542s.j(checkoutLog, "self");
            C17542s.j(dVar, "output");
            C17542s.j(serialDescriptor, "serialDesc");
            dVar.y(serialDescriptor, 0, checkoutLog.f46001a);
            dVar.y(serialDescriptor, 1, checkoutLog.f46002b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutLog)) {
                return false;
            }
            CheckoutLog checkoutLog = (CheckoutLog) obj;
            return C17542s.e(this.f46001a, checkoutLog.f46001a) && C17542s.e(this.f46002b, checkoutLog.f46002b);
        }

        public int hashCode() {
            return (this.f46001a.hashCode() * 31) + this.f46002b.hashCode();
        }

        public String toString() {
            return "CheckoutLog(severity=" + this.f46001a + ", message=" + this.f46002b + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/internal/CheckoutLogMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/internal/CheckoutLogMessage;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckoutLogMessage> serializer() {
            return CheckoutLogMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C16814e
    public /* synthetic */ CheckoutLogMessage(int i10, AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta afterpayCheckoutMessageMeta, CheckoutLog checkoutLog, T0 t02) {
        super(i10, t02);
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CheckoutLogMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f45999b = afterpayCheckoutMessageMeta;
        this.f46000c = checkoutLog;
    }

    public static final void d(CheckoutLogMessage checkoutLogMessage, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(checkoutLogMessage, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        AfterpayCheckoutMessage.b(checkoutLogMessage, dVar, serialDescriptor);
        dVar.i(serialDescriptor, 0, AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, checkoutLogMessage.c());
        dVar.i(serialDescriptor, 1, CheckoutLogMessage$CheckoutLog$$serializer.INSTANCE, checkoutLogMessage.f46000c);
    }

    public AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta c() {
        return this.f45999b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutLogMessage)) {
            return false;
        }
        CheckoutLogMessage checkoutLogMessage = (CheckoutLogMessage) obj;
        return C17542s.e(c(), checkoutLogMessage.c()) && C17542s.e(this.f46000c, checkoutLogMessage.f46000c);
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f46000c.hashCode();
    }

    public String toString() {
        return "CheckoutLogMessage(meta=" + c() + ", payload=" + this.f46000c + ')';
    }
}
