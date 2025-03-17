package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import XH.C16814e;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote.CreditCardOptionRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PaymentOptionsRemote$CreditCardOptionRemote$$serializer implements N<PaymentOptionsRemote.CreditCardOptionRemote> {
    public static final PaymentOptionsRemote$CreditCardOptionRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentOptionsRemote$CreditCardOptionRemote$$serializer paymentOptionsRemote$CreditCardOptionRemote$$serializer = new PaymentOptionsRemote$CreditCardOptionRemote$$serializer();
        INSTANCE = paymentOptionsRemote$CreditCardOptionRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.CreditCardOptionRemote", paymentOptionsRemote$CreditCardOptionRemote$$serializer, 11);
        j02.p("pspBrandName", false);
        j02.p("label", false);
        j02.p("warningLabel", false);
        j02.p("additionalInformation", false);
        j02.p("icons", false);
        j02.p("skipCVV", false);
        j02.p("paymentBinDetectionType", false);
        j02.p("participatingBanks", false);
        j02.p("rating", false);
        j02.p("groupKey", false);
        j02.p("configuration", false);
        descriptor = j02;
    }

    private PaymentOptionsRemote$CreditCardOptionRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.CreditCardOptionRemote deserialize(kotlinx.serialization.encoding.Decoder r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.CreditCardOptionRemote.f94195l
            boolean r3 = r0.q()
            r5 = 9
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 2
            r11 = 7
            r12 = 4
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0092
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r14 = r0.A(r1, r14, r3, r15)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r0.A(r1, r13, r3, r15)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r10 = r0.A(r1, r10, r3, r15)
            java.lang.String r10 = (java.lang.String) r10
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer r4 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r8, r4, r15)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote r4 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.AdditionalInformationRemote) r4
            r8 = r2[r12]
            java.lang.Object r8 = r0.A(r1, r12, r8, r15)
            java.util.List r8 = (java.util.List) r8
            jK.i r12 = jK.C17457i.f144111a
            java.lang.Object r7 = r0.A(r1, r7, r12, r15)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Object r3 = r0.A(r1, r6, r3, r15)
            java.lang.String r3 = (java.lang.String) r3
            r2 = r2[r11]
            java.lang.Object r2 = r0.A(r1, r11, r2, r15)
            java.util.List r2 = (java.util.List) r2
            jK.X r6 = jK.X.f144073a
            java.lang.Object r9 = r0.A(r1, r9, r6, r15)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r5 = r0.A(r1, r5, r6, r15)
            java.lang.Integer r5 = (java.lang.Integer) r5
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer r6 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE
            r11 = 10
            java.lang.Object r6 = r0.A(r1, r11, r6, r15)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote r6 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.ConfigurationRemote) r6
            r11 = 2047(0x7ff, float:2.868E-42)
            r27 = r2
            r26 = r3
            r23 = r4
            r29 = r5
            r30 = r6
            r25 = r7
            r24 = r8
            r28 = r9
            r22 = r10
            r19 = r11
            r21 = r13
            r20 = r14
            goto L_0x0192
        L_0x0092:
            r17 = r13
            r3 = r14
            r4 = r15
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x009f:
            if (r17 == 0) goto L_0x0179
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x016c;
                case 0: goto L_0x0155;
                case 1: goto L_0x0145;
                case 2: goto L_0x0134;
                case 3: goto L_0x0124;
                case 4: goto L_0x0115;
                case 5: goto L_0x0106;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00e9;
                case 8: goto L_0x00d7;
                case 9: goto L_0x00c2;
                case 10: goto L_0x00ae;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x00ae:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer r5 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE
            r18 = r15
            r15 = 10
            java.lang.Object r5 = r0.A(r1, r15, r5, r9)
            r9 = r5
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote r9 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.ConfigurationRemote) r9
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L_0x00bd:
            r15 = r18
        L_0x00bf:
            r5 = 9
            goto L_0x009f
        L_0x00c2:
            r18 = r15
            r15 = 10
            jK.X r5 = jK.X.f144073a
            r15 = 9
            java.lang.Object r5 = r0.A(r1, r15, r5, r11)
            r11 = r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r3 = r3 | 512(0x200, float:7.175E-43)
            r5 = r15
            r15 = r18
            goto L_0x009f
        L_0x00d7:
            r18 = r15
            r15 = 9
            jK.X r5 = jK.X.f144073a
            r15 = 8
            java.lang.Object r5 = r0.A(r1, r15, r5, r6)
            r6 = r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            r3 = r3 | 256(0x100, float:3.59E-43)
            goto L_0x00bd
        L_0x00e9:
            r18 = r15
            r5 = 7
            r15 = r2[r5]
            java.lang.Object r7 = r0.A(r1, r5, r15, r7)
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00bd
        L_0x00f7:
            r18 = r15
            r5 = 7
            jK.Y0 r15 = jK.Y0.f144077a
            r5 = 6
            java.lang.Object r12 = r0.A(r1, r5, r15, r12)
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 64
            goto L_0x00bd
        L_0x0106:
            r18 = r15
            r5 = 6
            jK.i r15 = jK.C17457i.f144111a
            r5 = 5
            java.lang.Object r8 = r0.A(r1, r5, r15, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r3 = r3 | 32
            goto L_0x00bd
        L_0x0115:
            r18 = r15
            r15 = 4
            r5 = r2[r15]
            java.lang.Object r5 = r0.A(r1, r15, r5, r10)
            r10 = r5
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 16
            goto L_0x00bd
        L_0x0124:
            r18 = r15
            r15 = 4
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer r5 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE
            r15 = 3
            java.lang.Object r5 = r0.A(r1, r15, r5, r13)
            r13 = r5
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote r13 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.AdditionalInformationRemote) r13
            r3 = r3 | 8
            goto L_0x00bd
        L_0x0134:
            r18 = r15
            r15 = 3
            jK.Y0 r5 = jK.Y0.f144077a
            r15 = 2
            java.lang.Object r5 = r0.A(r1, r15, r5, r14)
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 4
            goto L_0x00bd
        L_0x0145:
            r18 = r15
            r15 = 2
            jK.Y0 r5 = jK.Y0.f144077a
            r15 = 1
            java.lang.Object r4 = r0.A(r1, r15, r5, r4)
            java.lang.String r4 = (java.lang.String) r4
            r3 = r3 | 2
            goto L_0x00bd
        L_0x0155:
            r18 = r15
            r15 = 1
            jK.Y0 r5 = jK.Y0.f144077a
            r16 = r2
            r2 = r18
            r15 = 0
            java.lang.Object r2 = r0.A(r1, r15, r5, r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = r3 | 1
            r15 = r2
            r2 = r16
            goto L_0x00bf
        L_0x016c:
            r16 = r2
            r2 = r15
            r15 = 0
            r17 = r15
            r5 = 9
            r15 = r2
            r2 = r16
            goto L_0x009f
        L_0x0179:
            r2 = r15
            r20 = r2
            r19 = r3
            r21 = r4
            r28 = r6
            r27 = r7
            r25 = r8
            r30 = r9
            r24 = r10
            r29 = r11
            r26 = r12
            r23 = r13
            r22 = r14
        L_0x0192:
            r0.c(r1)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$CreditCardOptionRemote r0 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$CreditCardOptionRemote
            r31 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$CreditCardOptionRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$CreditCardOptionRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PaymentOptionsRemote.CreditCardOptionRemote creditCardOptionRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(creditCardOptionRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PaymentOptionsRemote.CreditCardOptionRemote.e(creditCardOptionRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] b10 = PaymentOptionsRemote.CreditCardOptionRemote.f94195l;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE);
        KSerializer<?> u14 = C17294a.u(b10[4]);
        KSerializer<?> u15 = C17294a.u(C17457i.f144111a);
        KSerializer<?> u16 = C17294a.u(y02);
        KSerializer<?> u17 = C17294a.u(b10[7]);
        X x10 = X.f144073a;
        return new KSerializer[]{u10, u11, u12, u13, u14, u15, u16, u17, C17294a.u(x10), C17294a.u(x10), C17294a.u(PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
