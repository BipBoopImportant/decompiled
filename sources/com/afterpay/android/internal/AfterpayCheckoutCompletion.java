package com.afterpay.android.internal;

import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17631a;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 !2\u00020\u0001:\u0003\"!#B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010\u0015¨\u0006$"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutCompletion;", "", "", "seen1", "Lcom/afterpay/android/internal/AfterpayCheckoutCompletion$Status;", "status", "", "orderToken", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/afterpay/android/internal/AfterpayCheckoutCompletion$Status;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/afterpay/android/internal/AfterpayCheckoutCompletion;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/afterpay/android/internal/AfterpayCheckoutCompletion$Status;", "b", "()Lcom/afterpay/android/internal/AfterpayCheckoutCompletion$Status;", "Ljava/lang/String;", "Companion", "$serializer", "Status", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayCheckoutCompletion {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Status f45981a;

    /* renamed from: b  reason: collision with root package name */
    private final String f45982b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutCompletion$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/internal/AfterpayCheckoutCompletion;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AfterpayCheckoutCompletion> serializer() {
            return AfterpayCheckoutCompletion$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutCompletion$Status;", "", "statusString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SUCCESS", "CANCELLED", "Companion", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        SUCCESS("SUCCESS"),
        CANCELLED("CANCELLED");
        
        /* access modifiers changed from: private */
        public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
        public static final Companion Companion = null;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/internal/AfterpayCheckoutCompletion$Status$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/internal/AfterpayCheckoutCompletion$Status;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C16824o a() {
                return Status.$cachedSerializer$delegate;
            }

            public final KSerializer<Status> serializer() {
                return (KSerializer) a().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        static final class a extends C17544u implements C17631a<KSerializer<Object>> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f45983c = null;

            static {
                f45983c = new a();
            }

            a() {
                super(0);
            }

            public final KSerializer<Object> invoke() {
                return J.b("com.afterpay.android.internal.AfterpayCheckoutCompletion.Status", Status.values());
            }
        }

        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, a.f45983c);
        }

        private Status(String str) {
        }
    }

    @C16814e
    public /* synthetic */ AfterpayCheckoutCompletion(int i10, Status status, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, AfterpayCheckoutCompletion$$serializer.INSTANCE.getDescriptor());
        }
        this.f45981a = status;
        this.f45982b = str;
    }

    public static final void c(AfterpayCheckoutCompletion afterpayCheckoutCompletion, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(afterpayCheckoutCompletion, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        dVar.i(serialDescriptor, 0, Status.Companion.serializer(), afterpayCheckoutCompletion.f45981a);
        dVar.y(serialDescriptor, 1, afterpayCheckoutCompletion.f45982b);
    }

    public final String a() {
        return this.f45982b;
    }

    public final Status b() {
        return this.f45981a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayCheckoutCompletion)) {
            return false;
        }
        AfterpayCheckoutCompletion afterpayCheckoutCompletion = (AfterpayCheckoutCompletion) obj;
        return this.f45981a == afterpayCheckoutCompletion.f45981a && C17542s.e(this.f45982b, afterpayCheckoutCompletion.f45982b);
    }

    public int hashCode() {
        return (this.f45981a.hashCode() * 31) + this.f45982b.hashCode();
    }

    public String toString() {
        return "AfterpayCheckoutCompletion(status=" + this.f45981a + ", orderToken=" + this.f45982b + ')';
    }
}
