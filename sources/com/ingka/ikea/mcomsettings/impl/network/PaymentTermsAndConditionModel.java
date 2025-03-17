package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import com.ingka.ikea.mcomsettings.impl.PaymentTermsAndConditionHolder;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u0016BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u0012\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b#\u0010 \u0012\u0004\b$\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b&\u0010 \u0012\u0004\b'\u0010\"¨\u0006*"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/PaymentTermsAndConditionModel;", "", "", "seen0", "", "paymentBrand", "url", "localizedText", "localizedClickableText", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/PaymentTermsAndConditionModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/impl/PaymentTermsAndConditionHolder;", "a", "()Lcom/ingka/ikea/mcomsettings/impl/PaymentTermsAndConditionHolder;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentBrand$annotations", "()V", "b", "getUrl$annotations", "getLocalizedText$annotations", "d", "getLocalizedClickableText$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentTermsAndConditionModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f96721a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96722b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96723c;

    /* renamed from: d  reason: collision with root package name */
    private final String f96724d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/PaymentTermsAndConditionModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/PaymentTermsAndConditionModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PaymentTermsAndConditionModel> serializer() {
            return PaymentTermsAndConditionModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentTermsAndConditionModel(int i10, String str, String str2, String str3, String str4, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, PaymentTermsAndConditionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f96721a = str;
        this.f96722b = str2;
        this.f96723c = str3;
        this.f96724d = str4;
    }

    private static final Void b(PaymentTermsAndConditionModel paymentTermsAndConditionModel) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("We have a null or empty field in the payment terms and conditions: " + paymentTermsAndConditionModel, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = paymentTermsAndConditionModel.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return null;
    }

    public static final /* synthetic */ void c(PaymentTermsAndConditionModel paymentTermsAndConditionModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, paymentTermsAndConditionModel.f96721a);
        dVar.B(serialDescriptor, 1, y02, paymentTermsAndConditionModel.f96722b);
        dVar.B(serialDescriptor, 2, y02, paymentTermsAndConditionModel.f96723c);
        dVar.B(serialDescriptor, 3, y02, paymentTermsAndConditionModel.f96724d);
    }

    public final PaymentTermsAndConditionHolder a() {
        String str = this.f96721a;
        if (str == null || str.length() == 0) {
            return (PaymentTermsAndConditionHolder) b(this);
        }
        String str2 = this.f96722b;
        if (str2 == null || str2.length() == 0) {
            return (PaymentTermsAndConditionHolder) b(this);
        }
        String str3 = this.f96723c;
        if (str3 == null || str3.length() == 0) {
            return (PaymentTermsAndConditionHolder) b(this);
        }
        String str4 = this.f96724d;
        return (str4 == null || str4.length() == 0) ? (PaymentTermsAndConditionHolder) b(this) : new PaymentTermsAndConditionHolder(this.f96721a, this.f96722b, this.f96723c, this.f96724d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentTermsAndConditionModel)) {
            return false;
        }
        PaymentTermsAndConditionModel paymentTermsAndConditionModel = (PaymentTermsAndConditionModel) obj;
        return C17542s.e(this.f96721a, paymentTermsAndConditionModel.f96721a) && C17542s.e(this.f96722b, paymentTermsAndConditionModel.f96722b) && C17542s.e(this.f96723c, paymentTermsAndConditionModel.f96723c) && C17542s.e(this.f96724d, paymentTermsAndConditionModel.f96724d);
    }

    public int hashCode() {
        String str = this.f96721a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96722b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96723c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f96724d;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f96721a;
        String str2 = this.f96722b;
        String str3 = this.f96723c;
        String str4 = this.f96724d;
        return "PaymentTermsAndConditionModel(paymentBrand=" + str + ", url=" + str2 + ", localizedText=" + str3 + ", localizedClickableText=" + str4 + ")";
    }
}
