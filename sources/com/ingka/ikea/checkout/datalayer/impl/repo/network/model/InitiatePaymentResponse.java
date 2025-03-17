package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import HJ.C15854t;
import Nn.C10806i;
import Nn.F;
import Rn.f;
import Sn.b;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+\u0015B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/InitiatePaymentResponse;", "Lpp/b;", "LSn/b;", "", "seen0", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;", "paymentContext", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;", "checkoutState", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/InitiatePaymentResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LSn/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;", "getPaymentContext", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;", "getPaymentContext$annotations", "()V", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;", "getCheckoutState", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;", "getCheckoutState$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitiatePaymentResponse implements C11768b<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final PaymentContextRemote f94112a;

    /* renamed from: b  reason: collision with root package name */
    private final CheckoutStateRemote f94113b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/InitiatePaymentResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/InitiatePaymentResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InitiatePaymentResponse> serializer() {
            return InitiatePaymentResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InitiatePaymentResponse(int i10, PaymentContextRemote paymentContextRemote, CheckoutStateRemote checkoutStateRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, InitiatePaymentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f94112a = paymentContextRemote;
        this.f94113b = checkoutStateRemote;
    }

    public static final /* synthetic */ void b(InitiatePaymentResponse initiatePaymentResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, PaymentContextRemote$$serializer.INSTANCE, initiatePaymentResponse.f94112a);
        dVar.B(serialDescriptor, 1, CheckoutStateRemote$$serializer.INSTANCE, initiatePaymentResponse.f94113b);
    }

    public b a() {
        PaymentContextRemote paymentContextRemote = this.f94112a;
        f d10 = paymentContextRemote != null ? paymentContextRemote.d() : null;
        CheckoutStateRemote checkoutStateRemote = this.f94113b;
        C10806i a10 = checkoutStateRemote != null ? checkoutStateRemote.a() : null;
        if (d10 == null || a10 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid response data: " + this);
            e eVar = e.ERROR;
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
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = InitiatePaymentResponse.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            throw illegalArgumentException;
        }
        String b10 = d10.b();
        String c10 = d10.c();
        double a12 = d10.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : d10.e()) {
            if (next2 instanceof F.f) {
                arrayList2.add(next2);
            }
        }
        ArrayList<F.f> arrayList3 = new ArrayList<>();
        for (Object next3 : arrayList2) {
            if (((F.f) next3).g()) {
                arrayList3.add(next3);
            }
        }
        ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList3, 10));
        for (F.f fVar : arrayList3) {
            arrayList4.add(new C10806i.a(fVar.i(), fVar.j(), fVar.h(), fVar.a()));
        }
        return new b(new Rn.e(b10, c10, a12, arrayList4), a10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiatePaymentResponse)) {
            return false;
        }
        InitiatePaymentResponse initiatePaymentResponse = (InitiatePaymentResponse) obj;
        return C17542s.e(this.f94112a, initiatePaymentResponse.f94112a) && C17542s.e(this.f94113b, initiatePaymentResponse.f94113b);
    }

    public int hashCode() {
        PaymentContextRemote paymentContextRemote = this.f94112a;
        int i10 = 0;
        int hashCode = (paymentContextRemote == null ? 0 : paymentContextRemote.hashCode()) * 31;
        CheckoutStateRemote checkoutStateRemote = this.f94113b;
        if (checkoutStateRemote != null) {
            i10 = checkoutStateRemote.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        PaymentContextRemote paymentContextRemote = this.f94112a;
        CheckoutStateRemote checkoutStateRemote = this.f94113b;
        return "InitiatePaymentResponse(paymentContext=" + paymentContextRemote + ", checkoutState=" + checkoutStateRemote + ")";
    }
}
