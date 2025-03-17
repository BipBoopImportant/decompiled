package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import XH.C16814e;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote.PrepaidPaymentOptionRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer implements N<PaymentOptionsRemote.PrepaidPaymentOptionRemote> {
    public static final PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer paymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer = new PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer();
        INSTANCE = paymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.PrepaidPaymentOptionRemote", paymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer, 6);
        j02.p("pspBrandName", false);
        j02.p("label", false);
        j02.p("warningLabel", false);
        j02.p("additionalInformation", false);
        j02.p("rating", false);
        j02.p("icons", false);
        descriptor = j02;
    }

    private PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
        r4 = 3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.PrepaidPaymentOptionRemote deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.PrepaidPaymentOptionRemote.f94243g
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 5
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x005c
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r9, r3, r10)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.A(r1, r8, r3, r10)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r0.A(r1, r6, r3, r10)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer r6 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r6, r10)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote r4 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.AdditionalInformationRemote) r4
            jK.X r6 = jK.X.f144073a
            java.lang.Object r5 = r0.A(r1, r5, r6, r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r10)
            java.util.List r2 = (java.util.List) r2
            r6 = 63
            r24 = r2
            r21 = r3
            r22 = r4
            r23 = r5
            r18 = r6
            r20 = r8
            r19 = r9
            goto L_0x00d2
        L_0x005c:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0064:
            if (r16 == 0) goto L_0x00c4
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00bf;
                case 0: goto L_0x00b0;
                case 1: goto L_0x00a4;
                case 2: goto L_0x0098;
                case 3: goto L_0x008c;
                case 4: goto L_0x0080;
                case 5: goto L_0x0073;
                default: goto L_0x006d;
            }
        L_0x006d:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0073:
            r9 = r2[r7]
            java.lang.Object r9 = r0.A(r1, r7, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 32
        L_0x007e:
            r9 = 0
            goto L_0x0064
        L_0x0080:
            jK.X r9 = jK.X.f144073a
            java.lang.Object r9 = r0.A(r1, r5, r9, r14)
            r14 = r9
            java.lang.Integer r14 = (java.lang.Integer) r14
            r3 = r3 | 16
            goto L_0x007e
        L_0x008c:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer r9 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r4, r9, r13)
            r13 = r9
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote r13 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.AdditionalInformationRemote) r13
            r3 = r3 | 8
            goto L_0x007e
        L_0x0098:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r6, r9, r12)
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 4
            goto L_0x007e
        L_0x00a4:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r8, r9, r11)
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 2
            goto L_0x007e
        L_0x00b0:
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r9 = r0.A(r1, r4, r9, r10)
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 1
            r9 = r4
        L_0x00bd:
            r4 = 3
            goto L_0x0064
        L_0x00bf:
            r4 = 0
            r9 = r4
            r16 = r9
            goto L_0x00bd
        L_0x00c4:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00d2:
            r0.c(r1)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$PrepaidPaymentOptionRemote r0 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$PrepaidPaymentOptionRemote
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$PrepaidPaymentOptionRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PaymentOptionsRemote.PrepaidPaymentOptionRemote prepaidPaymentOptionRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(prepaidPaymentOptionRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PaymentOptionsRemote.PrepaidPaymentOptionRemote.e(prepaidPaymentOptionRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] b10 = PaymentOptionsRemote.PrepaidPaymentOptionRemote.f94243g;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE), C17294a.u(X.f144073a), C17294a.u(b10[5])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
