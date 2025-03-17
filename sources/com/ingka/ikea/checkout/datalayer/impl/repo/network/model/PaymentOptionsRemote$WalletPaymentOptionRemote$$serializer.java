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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote.WalletPaymentOptionRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer implements N<PaymentOptionsRemote.WalletPaymentOptionRemote> {
    public static final PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer paymentOptionsRemote$WalletPaymentOptionRemote$$serializer = new PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer();
        INSTANCE = paymentOptionsRemote$WalletPaymentOptionRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.WalletPaymentOptionRemote", paymentOptionsRemote$WalletPaymentOptionRemote$$serializer, 9);
        j02.p("pspBrandName", false);
        j02.p("label", false);
        j02.p("warningLabel", false);
        j02.p("additionalInformation", false);
        j02.p("icons", false);
        j02.p("skipCVV", false);
        j02.p("paymentBinDetectionType", false);
        j02.p("rating", false);
        j02.p("configuration", false);
        descriptor = j02;
    }

    private PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.WalletPaymentOptionRemote deserialize(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.WalletPaymentOptionRemote.f94250j
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 2
            r10 = 4
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x007c
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r12 = r0.A(r1, r12, r3, r13)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.A(r1, r11, r3, r13)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r9 = r0.A(r1, r9, r3, r13)
            java.lang.String r9 = (java.lang.String) r9
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer r14 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r14, r13)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote r7 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.AdditionalInformationRemote) r7
            r2 = r2[r10]
            java.lang.Object r2 = r0.A(r1, r10, r2, r13)
            java.util.List r2 = (java.util.List) r2
            jK.i r10 = jK.C17457i.f144111a
            java.lang.Object r6 = r0.A(r1, r6, r10, r13)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Object r3 = r0.A(r1, r5, r3, r13)
            java.lang.String r3 = (java.lang.String) r3
            jK.X r5 = jK.X.f144073a
            java.lang.Object r4 = r0.A(r1, r4, r5, r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer r5 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r8, r5, r13)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote r5 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.ConfigurationRemote) r5
            r8 = 511(0x1ff, float:7.16E-43)
            r23 = r2
            r25 = r3
            r26 = r4
            r27 = r5
            r24 = r6
            r22 = r7
            r18 = r8
            r21 = r9
            r20 = r11
            r19 = r12
            goto L_0x012a
        L_0x007c:
            r16 = r11
            r3 = r12
            r6 = r13
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
        L_0x0087:
            if (r16 == 0) goto L_0x0116
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x0112;
                case 0: goto L_0x0104;
                case 1: goto L_0x00f6;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00da;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00be;
                case 6: goto L_0x00af;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0096;
                default: goto L_0x0090;
            }
        L_0x0090:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x0096:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer r5 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r8, r5, r6)
            r6 = r5
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote r6 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.ConfigurationRemote) r6
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x00a1:
            r5 = 6
            goto L_0x0087
        L_0x00a3:
            jK.X r5 = jK.X.f144073a
            java.lang.Object r5 = r0.A(r1, r4, r5, r10)
            r10 = r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00a1
        L_0x00af:
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 6
            java.lang.Object r5 = r0.A(r1, r4, r5, r7)
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            r3 = r3 | 64
            r5 = r4
            r4 = 7
            goto L_0x0087
        L_0x00be:
            r4 = 6
            jK.i r5 = jK.C17457i.f144111a
            r4 = 5
            java.lang.Object r5 = r0.A(r1, r4, r5, r9)
            r9 = r5
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r3 = r3 | 32
        L_0x00cb:
            r4 = 7
            goto L_0x00a1
        L_0x00cd:
            r5 = 4
            r4 = r2[r5]
            java.lang.Object r4 = r0.A(r1, r5, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            goto L_0x00cb
        L_0x00da:
            r5 = 4
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer r4 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE
            r5 = 3
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote r12 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.AdditionalInformationRemote) r12
            r3 = r3 | 8
            goto L_0x00cb
        L_0x00e8:
            r5 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 2
            java.lang.Object r4 = r0.A(r1, r5, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 4
            goto L_0x00cb
        L_0x00f6:
            r5 = 2
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 1
            java.lang.Object r4 = r0.A(r1, r5, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 2
            goto L_0x00cb
        L_0x0104:
            r5 = 1
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r13)
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 1
            goto L_0x00cb
        L_0x0112:
            r5 = 0
            r16 = r5
            goto L_0x00a1
        L_0x0116:
            r18 = r3
            r27 = r6
            r25 = r7
            r24 = r9
            r26 = r10
            r23 = r11
            r22 = r12
            r19 = r13
            r20 = r14
            r21 = r15
        L_0x012a:
            r0.c(r1)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$WalletPaymentOptionRemote r0 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$WalletPaymentOptionRemote
            r28 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$WalletPaymentOptionRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PaymentOptionsRemote.WalletPaymentOptionRemote walletPaymentOptionRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(walletPaymentOptionRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PaymentOptionsRemote.WalletPaymentOptionRemote.e(walletPaymentOptionRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] b10 = PaymentOptionsRemote.WalletPaymentOptionRemote.f94250j;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE), C17294a.u(b10[4]), C17294a.u(C17457i.f144111a), C17294a.u(y02), C17294a.u(X.f144073a), C17294a.u(PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
