package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PriceResponse$$serializer implements N<PriceResponse> {
    public static final PriceResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PriceResponse$$serializer priceResponse$$serializer = new PriceResponse$$serializer();
        INSTANCE = priceResponse$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse", priceResponse$$serializer, 7);
        j02.p("inclTax", false);
        j02.p("exclTax", false);
        j02.p("tax", false);
        j02.p("priceExclSavings", false);
        j02.p("taxSummaryList", false);
        j02.p("discountSummary", false);
        j02.p("orderDiscountSummaryList", false);
        descriptor = j02;
    }

    private PriceResponse$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.f94261h
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 6
            r8 = 4
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0067
            jK.C r3 = jK.C17438C.f144010a
            java.lang.Object r10 = r0.A(r1, r10, r3, r11)
            java.lang.Double r10 = (java.lang.Double) r10
            java.lang.Object r9 = r0.A(r1, r9, r3, r11)
            java.lang.Double r9 = (java.lang.Double) r9
            java.lang.Object r3 = r0.A(r1, r6, r3, r11)
            java.lang.Double r3 = (java.lang.Double) r3
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings$$serializer r6 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r6, r11)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings r5 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.PriceExclSavings) r5
            r6 = r2[r8]
            java.lang.Object r6 = r0.A(r1, r8, r6, r11)
            java.util.List r6 = (java.util.List) r6
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse$$serializer r8 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r8, r11)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse r4 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.DiscountSummaryResponse) r4
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r7 = 127(0x7f, float:1.78E-43)
            r25 = r2
            r21 = r3
            r24 = r4
            r22 = r5
            r23 = r6
            r18 = r7
            r20 = r9
            r19 = r10
            goto L_0x00f0
        L_0x0067:
            r16 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0070:
            if (r16 == 0) goto L_0x00e0
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00dc;
                case 0: goto L_0x00ce;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00a4;
                case 4: goto L_0x0098;
                case 5: goto L_0x008c;
                case 6: goto L_0x007f;
                default: goto L_0x0079;
            }
        L_0x0079:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x007f:
            r6 = r2[r7]
            java.lang.Object r6 = r0.A(r1, r7, r6, r9)
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            r3 = r3 | 64
        L_0x008a:
            r6 = 2
            goto L_0x0070
        L_0x008c:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse$$serializer r6 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r4, r6, r10)
            r10 = r6
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse r10 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.DiscountSummaryResponse) r10
            r3 = r3 | 32
            goto L_0x008a
        L_0x0098:
            r6 = r2[r8]
            java.lang.Object r6 = r0.A(r1, r8, r6, r15)
            r15 = r6
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 16
            goto L_0x008a
        L_0x00a4:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings$$serializer r6 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r5, r6, r14)
            r14 = r6
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings r14 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.PriceExclSavings) r14
            r3 = r3 | 8
            goto L_0x008a
        L_0x00b0:
            jK.C r6 = jK.C17438C.f144010a
            r4 = 2
            java.lang.Object r6 = r0.A(r1, r4, r6, r13)
            r13 = r6
            java.lang.Double r13 = (java.lang.Double) r13
            r3 = r3 | 4
            r6 = r4
            r4 = 5
            goto L_0x0070
        L_0x00bf:
            r4 = 2
            jK.C r6 = jK.C17438C.f144010a
            r4 = 1
            java.lang.Object r6 = r0.A(r1, r4, r6, r12)
            r12 = r6
            java.lang.Double r12 = (java.lang.Double) r12
            r3 = r3 | 2
        L_0x00cc:
            r4 = 5
            goto L_0x008a
        L_0x00ce:
            r4 = 1
            jK.C r6 = jK.C17438C.f144010a
            r4 = 0
            java.lang.Object r6 = r0.A(r1, r4, r6, r11)
            r11 = r6
            java.lang.Double r11 = (java.lang.Double) r11
            r3 = r3 | 1
            goto L_0x00cc
        L_0x00dc:
            r4 = 0
            r16 = r4
            goto L_0x00cc
        L_0x00e0:
            r18 = r3
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00f0:
            r0.c(r1)
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse r0 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PriceResponse priceResponse) {
        C17542s.j(encoder, "encoder");
        C17542s.j(priceResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PriceResponse.i(priceResponse, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = PriceResponse.f94261h;
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{C17294a.u(c10), C17294a.u(c10), C17294a.u(c10), C17294a.u(PriceResponse$PriceExclSavings$$serializer.INSTANCE), C17294a.u(a10[4]), C17294a.u(PriceResponse$DiscountSummaryResponse$$serializer.INSTANCE), C17294a.u(a10[6])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
