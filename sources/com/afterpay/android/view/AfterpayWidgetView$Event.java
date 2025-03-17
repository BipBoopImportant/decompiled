package com.afterpay.android.view;

import XH.C16814e;
import com.afterpay.android.model.Money;
import com.afterpay.android.model.Money$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 -2\u00020\u0001:\u0003.-/BA\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b\u0005\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"com/afterpay/android/view/AfterpayWidgetView$Event", "", "", "seen1", "", "isValid", "Lcom/afterpay/android/model/Money;", "amountDueToday", "", "paymentScheduleChecksum", "Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;", "error", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZLcom/afterpay/android/model/Money;Ljava/lang/String;Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;LjK/T0;)V", "Lcom/afterpay/android/view/AfterpayWidgetView$Event;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/view/AfterpayWidgetView$Event;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "b", "Lcom/afterpay/android/model/Money;", "getAmountDueToday", "()Lcom/afterpay/android/model/Money;", "c", "Ljava/lang/String;", "getPaymentScheduleChecksum", "d", "Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;", "getError", "()Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;", "Companion", "$serializer", "Error", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class AfterpayWidgetView$Event {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f46046a;

    /* renamed from: b  reason: collision with root package name */
    private final Money f46047b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46048c;

    /* renamed from: d  reason: collision with root package name */
    private final Error f46049d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/view/AfterpayWidgetView$Event$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/view/AfterpayWidgetView$Event;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AfterpayWidgetView$Event> serializer() {
            return AfterpayWidgetView$Event$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;", "", "", "errorCode", "errorId", "message", "", "httpStatusCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorCode", "b", "getErrorId", "c", "getMessage", "d", "Ljava/lang/Integer;", "getHttpStatusCode", "()Ljava/lang/Integer;", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Error {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f46050a;

        /* renamed from: b  reason: collision with root package name */
        private final String f46051b;

        /* renamed from: c  reason: collision with root package name */
        private final String f46052c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f46053d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Error> serializer() {
                return AfterpayWidgetView$Event$Error$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Error() {
            this((String) null, (String) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
        }

        public static final void a(Error error, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17542s.j(error, "self");
            C17542s.j(dVar, "output");
            C17542s.j(serialDescriptor, "serialDesc");
            if (dVar.z(serialDescriptor, 0) || error.f46050a != null) {
                dVar.B(serialDescriptor, 0, Y0.f144077a, error.f46050a);
            }
            if (dVar.z(serialDescriptor, 1) || error.f46051b != null) {
                dVar.B(serialDescriptor, 1, Y0.f144077a, error.f46051b);
            }
            if (dVar.z(serialDescriptor, 2) || error.f46052c != null) {
                dVar.B(serialDescriptor, 2, Y0.f144077a, error.f46052c);
            }
            if (dVar.z(serialDescriptor, 3) || error.f46053d != null) {
                dVar.B(serialDescriptor, 3, X.f144073a, error.f46053d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return C17542s.e(this.f46050a, error.f46050a) && C17542s.e(this.f46051b, error.f46051b) && C17542s.e(this.f46052c, error.f46052c) && C17542s.e(this.f46053d, error.f46053d);
        }

        public int hashCode() {
            String str = this.f46050a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f46051b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f46052c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f46053d;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            return "Error(errorCode=" + this.f46050a + ", errorId=" + this.f46051b + ", message=" + this.f46052c + ", httpStatusCode=" + this.f46053d + ')';
        }

        @C16814e
        public /* synthetic */ Error(int i10, String str, String str2, String str3, Integer num, T0 t02) {
            if ((i10 & 1) == 0) {
                this.f46050a = null;
            } else {
                this.f46050a = str;
            }
            if ((i10 & 2) == 0) {
                this.f46051b = null;
            } else {
                this.f46051b = str2;
            }
            if ((i10 & 4) == 0) {
                this.f46052c = null;
            } else {
                this.f46052c = str3;
            }
            if ((i10 & 8) == 0) {
                this.f46053d = null;
            } else {
                this.f46053d = num;
            }
        }

        public Error(String str, String str2, String str3, Integer num) {
            this.f46050a = str;
            this.f46051b = str2;
            this.f46052c = str3;
            this.f46053d = num;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(String str, String str2, String str3, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num);
        }
    }

    @C16814e
    public /* synthetic */ AfterpayWidgetView$Event(int i10, boolean z10, Money money, String str, Error error, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, AfterpayWidgetView$Event$$serializer.INSTANCE.getDescriptor());
        }
        this.f46046a = z10;
        if ((i10 & 2) == 0) {
            this.f46047b = null;
        } else {
            this.f46047b = money;
        }
        if ((i10 & 4) == 0) {
            this.f46048c = null;
        } else {
            this.f46048c = str;
        }
        if ((i10 & 8) == 0) {
            this.f46049d = null;
        } else {
            this.f46049d = error;
        }
    }

    public static final void a(AfterpayWidgetView$Event afterpayWidgetView$Event, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(afterpayWidgetView$Event, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        dVar.x(serialDescriptor, 0, afterpayWidgetView$Event.f46046a);
        if (dVar.z(serialDescriptor, 1) || afterpayWidgetView$Event.f46047b != null) {
            dVar.B(serialDescriptor, 1, Money$$serializer.INSTANCE, afterpayWidgetView$Event.f46047b);
        }
        if (dVar.z(serialDescriptor, 2) || afterpayWidgetView$Event.f46048c != null) {
            dVar.B(serialDescriptor, 2, Y0.f144077a, afterpayWidgetView$Event.f46048c);
        }
        if (dVar.z(serialDescriptor, 3) || afterpayWidgetView$Event.f46049d != null) {
            dVar.B(serialDescriptor, 3, AfterpayWidgetView$Event$Error$$serializer.INSTANCE, afterpayWidgetView$Event.f46049d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayWidgetView$Event)) {
            return false;
        }
        AfterpayWidgetView$Event afterpayWidgetView$Event = (AfterpayWidgetView$Event) obj;
        return this.f46046a == afterpayWidgetView$Event.f46046a && C17542s.e(this.f46047b, afterpayWidgetView$Event.f46047b) && C17542s.e(this.f46048c, afterpayWidgetView$Event.f46048c) && C17542s.e(this.f46049d, afterpayWidgetView$Event.f46049d);
    }

    public int hashCode() {
        boolean z10 = this.f46046a;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        Money money = this.f46047b;
        int i11 = 0;
        int hashCode = (i10 + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.f46048c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Error error = this.f46049d;
        if (error != null) {
            i11 = error.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "Event(isValid=" + this.f46046a + ", amountDueToday=" + this.f46047b + ", paymentScheduleChecksum=" + this.f46048c + ", error=" + this.f46049d + ')';
    }
}
