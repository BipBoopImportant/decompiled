package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import XH.C16814e;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote.PrepaidCardTransactionRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PaymentContextRemote$PrepaidCardTransactionRemote$$serializer implements N<PaymentContextRemote.PrepaidCardTransactionRemote> {
    public static final PaymentContextRemote$PrepaidCardTransactionRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentContextRemote$PrepaidCardTransactionRemote$$serializer paymentContextRemote$PrepaidCardTransactionRemote$$serializer = new PaymentContextRemote$PrepaidCardTransactionRemote$$serializer();
        INSTANCE = paymentContextRemote$PrepaidCardTransactionRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote", paymentContextRemote$PrepaidCardTransactionRemote$$serializer, 9);
        j02.p("pspBrandName", false);
        j02.p("label", false);
        j02.p("amount", false);
        j02.p("pspTimestamp", false);
        j02.p("iopgId", false);
        j02.p("balanceAmount", false);
        j02.p("last4Digits", false);
        j02.p("prepaidCardStatus", false);
        j02.p("prepaidCardDeclineReason", false);
        descriptor = j02;
    }

    private PaymentContextRemote$PrepaidCardTransactionRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote deserialize(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0070
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r11 = r0.A(r1, r11, r2, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r2, r12)
            java.lang.String r10 = (java.lang.String) r10
            jK.C r13 = jK.C17438C.f144010a
            java.lang.Object r9 = r0.A(r1, r9, r13, r12)
            java.lang.Double r9 = (java.lang.Double) r9
            java.lang.Object r6 = r0.A(r1, r6, r2, r12)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.A(r1, r8, r2, r12)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r0.A(r1, r5, r13, r12)
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r4 = r0.A(r1, r4, r2, r12)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A(r1, r3, r2, r12)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.A(r1, r7, r2, r12)
            java.lang.String r2 = (java.lang.String) r2
            r7 = 511(0x1ff, float:7.16E-43)
            r27 = r2
            r26 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r18 = r7
            r23 = r8
            r21 = r9
            r20 = r10
            r19 = r11
            goto L_0x011d
        L_0x0070:
            r16 = r10
            r2 = r11
            r6 = r12
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007b:
            if (r16 == 0) goto L_0x0109
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x0105;
                case 0: goto L_0x00f7;
                case 1: goto L_0x00e9;
                case 2: goto L_0x00db;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00be;
                case 5: goto L_0x00af;
                case 6: goto L_0x00a3;
                case 7: goto L_0x0097;
                case 8: goto L_0x008a;
                default: goto L_0x0084;
            }
        L_0x0084:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x008a:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r7, r5, r8)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x0095:
            r5 = 5
            goto L_0x007b
        L_0x0097:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r3, r5, r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0095
        L_0x00a3:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r4, r5, r9)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x0095
        L_0x00af:
            jK.C r5 = jK.C17438C.f144010a
            r3 = 5
            java.lang.Object r5 = r0.A(r1, r3, r5, r10)
            r10 = r5
            java.lang.Double r10 = (java.lang.Double) r10
            r2 = r2 | 32
            r5 = r3
            r3 = 7
            goto L_0x007b
        L_0x00be:
            r3 = 5
            jK.Y0 r5 = jK.Y0.f144077a
            r3 = 4
            java.lang.Object r5 = r0.A(r1, r3, r5, r11)
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 16
        L_0x00cb:
            r3 = 7
            goto L_0x0095
        L_0x00cd:
            r3 = 4
            jK.Y0 r5 = jK.Y0.f144077a
            r3 = 3
            java.lang.Object r5 = r0.A(r1, r3, r5, r15)
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 8
            goto L_0x00cb
        L_0x00db:
            r3 = 3
            jK.C r5 = jK.C17438C.f144010a
            r3 = 2
            java.lang.Object r5 = r0.A(r1, r3, r5, r14)
            r14 = r5
            java.lang.Double r14 = (java.lang.Double) r14
            r2 = r2 | 4
            goto L_0x00cb
        L_0x00e9:
            r3 = 2
            jK.Y0 r5 = jK.Y0.f144077a
            r3 = 1
            java.lang.Object r5 = r0.A(r1, r3, r5, r13)
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 2
            goto L_0x00cb
        L_0x00f7:
            r3 = 1
            jK.Y0 r5 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r5 = r0.A(r1, r3, r5, r12)
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 1
            goto L_0x00cb
        L_0x0105:
            r3 = 0
            r16 = r3
            goto L_0x00cb
        L_0x0109:
            r18 = r2
            r26 = r6
            r27 = r8
            r25 = r9
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x011d:
            r0.c(r1)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote r0 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote
            r28 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PaymentContextRemote.PrepaidCardTransactionRemote prepaidCardTransactionRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(prepaidCardTransactionRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PaymentContextRemote.PrepaidCardTransactionRemote.b(prepaidCardTransactionRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{u10, u11, C17294a.u(c10), C17294a.u(y02), C17294a.u(y02), C17294a.u(c10), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
