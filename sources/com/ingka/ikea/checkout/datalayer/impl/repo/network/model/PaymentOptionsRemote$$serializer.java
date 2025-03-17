package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PaymentOptionsRemote$$serializer implements N<PaymentOptionsRemote> {
    public static final PaymentOptionsRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentOptionsRemote$$serializer paymentOptionsRemote$$serializer = new PaymentOptionsRemote$$serializer();
        INSTANCE = paymentOptionsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote", paymentOptionsRemote$$serializer, 10);
        j02.p("paymentContextId", false);
        j02.p("creditCardPaymentTypes", false);
        j02.p("customerFinancePaymentTypes", false);
        j02.p("openInvoicePaymentTypes", false);
        j02.p("walletPaymentTypes", false);
        j02.p("prepaidPaymentTypes", false);
        j02.p("onlineTransferPaymentTypes", false);
        j02.p("payOnDeliveryPaymentTypes", false);
        j02.p("googlePayPaymentTypes", false);
        j02.p("grouping", false);
        descriptor = j02;
    }

    private PaymentOptionsRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.f94174k
            boolean r3 = r0.q()
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x008e
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r3 = r0.A(r1, r13, r3, r14)
            java.lang.String r3 = (java.lang.String) r3
            r13 = r2[r12]
            java.lang.Object r12 = r0.A(r1, r12, r13, r14)
            java.util.List r12 = (java.util.List) r12
            r13 = r2[r11]
            java.lang.Object r11 = r0.A(r1, r11, r13, r14)
            java.util.List r11 = (java.util.List) r11
            r13 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r13, r14)
            java.util.List r8 = (java.util.List) r8
            r13 = r2[r10]
            java.lang.Object r10 = r0.A(r1, r10, r13, r14)
            java.util.List r10 = (java.util.List) r10
            r13 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r13, r14)
            java.util.List r7 = (java.util.List) r7
            r13 = r2[r6]
            java.lang.Object r6 = r0.A(r1, r6, r13, r14)
            java.util.List r6 = (java.util.List) r6
            r13 = r2[r5]
            java.lang.Object r5 = r0.A(r1, r5, r13, r14)
            java.util.List r5 = (java.util.List) r5
            r13 = r2[r9]
            java.lang.Object r9 = r0.A(r1, r9, r13, r14)
            java.util.List r9 = (java.util.List) r9
            r2 = r2[r4]
            java.lang.Object r2 = r0.A(r1, r4, r2, r14)
            java.util.List r2 = (java.util.List) r2
            r4 = 1023(0x3ff, float:1.434E-42)
            r28 = r2
            r19 = r3
            r18 = r4
            r26 = r5
            r25 = r6
            r24 = r7
            r22 = r8
            r27 = r9
            r23 = r10
            r21 = r11
            r20 = r12
            goto L_0x0149
        L_0x008e:
            r16 = r12
            r3 = r13
            r5 = r14
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x009a:
            if (r16 == 0) goto L_0x0133
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x012f;
                case 0: goto L_0x0121;
                case 1: goto L_0x0114;
                case 2: goto L_0x0107;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00d4;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00a9;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x00a9:
            r9 = r2[r4]
            java.lang.Object r5 = r0.A(r1, r4, r9, r5)
            java.util.List r5 = (java.util.List) r5
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00b3:
            r9 = 8
            goto L_0x009a
        L_0x00b6:
            r9 = 8
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r6)
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            r3 = r3 | 256(0x100, float:3.59E-43)
            r4 = 9
            goto L_0x009a
        L_0x00c6:
            r4 = 7
            r9 = r2[r4]
            java.lang.Object r7 = r0.A(r1, r4, r9, r7)
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00d1:
            r4 = 9
            goto L_0x00b3
        L_0x00d4:
            r9 = 6
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r10)
            r10 = r4
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 64
            goto L_0x00d1
        L_0x00e1:
            r4 = 5
            r9 = r2[r4]
            java.lang.Object r8 = r0.A(r1, r4, r9, r8)
            java.util.List r8 = (java.util.List) r8
            r3 = r3 | 32
            goto L_0x00d1
        L_0x00ed:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            goto L_0x00d1
        L_0x00fa:
            r4 = 3
            r9 = r2[r4]
            java.lang.Object r9 = r0.A(r1, r4, r9, r12)
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 8
            goto L_0x00d1
        L_0x0107:
            r9 = 2
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r13)
            r13 = r4
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 4
            goto L_0x00d1
        L_0x0114:
            r4 = 1
            r9 = r2[r4]
            java.lang.Object r9 = r0.A(r1, r4, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 2
            goto L_0x00d1
        L_0x0121:
            r4 = 1
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r9 = r0.A(r1, r4, r9, r14)
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 1
            goto L_0x00d1
        L_0x012f:
            r4 = 0
            r16 = r4
            goto L_0x00d1
        L_0x0133:
            r18 = r3
            r28 = r5
            r27 = r6
            r26 = r7
            r24 = r8
            r25 = r10
            r23 = r11
            r22 = r12
            r21 = r13
            r19 = r14
            r20 = r15
        L_0x0149:
            r0.c(r1)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote r0 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PaymentOptionsRemote paymentOptionsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(paymentOptionsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PaymentOptionsRemote.c(paymentOptionsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = PaymentOptionsRemote.f94174k;
        return new KSerializer[]{C17294a.u(Y0.f144077a), C17294a.u(a10[1]), C17294a.u(a10[2]), C17294a.u(a10[3]), C17294a.u(a10[4]), C17294a.u(a10[5]), C17294a.u(a10[6]), C17294a.u(a10[7]), C17294a.u(a10[8]), C17294a.u(a10[9])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
