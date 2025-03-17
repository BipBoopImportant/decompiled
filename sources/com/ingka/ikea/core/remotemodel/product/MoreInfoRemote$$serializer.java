package com.ingka.ikea.core.remotemodel.product;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/remotemodel/product/MoreInfoRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class MoreInfoRemote$$serializer implements N<MoreInfoRemote> {
    public static final MoreInfoRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MoreInfoRemote$$serializer moreInfoRemote$$serializer = new MoreInfoRemote$$serializer();
        INSTANCE = moreInfoRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.remotemodel.product.MoreInfoRemote", moreInfoRemote$$serializer, 10);
        j02.p("attachments", false);
        j02.p("attachmentsDisclaimer", false);
        j02.p("customerBenefit", false);
        j02.p("customerEnvironment", false);
        j02.p("customerMaterial", false);
        j02.p("customerCare", false);
        j02.p("goodToKnow", false);
        j02.p("safetyAndCompliance", false);
        j02.p("technicalCompliance", false);
        j02.p("designerInfo", false);
        descriptor = j02;
    }

    private MoreInfoRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.remotemodel.product.MoreInfoRemote deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.remotemodel.product.MoreInfoRemote.f95304k
            boolean r3 = r0.q()
            r4 = 9
            r5 = 8
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x008c
            r3 = r2[r13]
            java.lang.Object r3 = r0.A(r1, r13, r3, r14)
            java.util.List r3 = (java.util.List) r3
            jK.Y0 r13 = jK.Y0.f144077a
            java.lang.Object r12 = r0.A(r1, r12, r13, r14)
            java.lang.String r12 = (java.lang.String) r12
            r15 = r2[r11]
            java.lang.Object r11 = r0.A(r1, r11, r15, r14)
            java.util.List r11 = (java.util.List) r11
            r15 = r2[r9]
            java.lang.Object r9 = r0.A(r1, r9, r15, r14)
            java.util.List r9 = (java.util.List) r9
            r15 = r2[r10]
            java.lang.Object r10 = r0.A(r1, r10, r15, r14)
            java.util.List r10 = (java.util.List) r10
            r15 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r15, r14)
            java.util.List r8 = (java.util.List) r8
            r15 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r15, r14)
            java.util.List r7 = (java.util.List) r7
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r14)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote$$serializer r6 = com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r6, r14)
            com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote r5 = (com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote) r5
            java.lang.Object r4 = r0.A(r1, r4, r13, r14)
            java.lang.String r4 = (java.lang.String) r4
            r6 = 1023(0x3ff, float:1.434E-42)
            r26 = r2
            r19 = r3
            r28 = r4
            r27 = r5
            r18 = r6
            r25 = r7
            r24 = r8
            r22 = r9
            r23 = r10
            r21 = r11
            r20 = r12
            goto L_0x014c
        L_0x008c:
            r16 = r12
            r3 = r13
            r6 = r14
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x0098:
            if (r16 == 0) goto L_0x0136
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x0131;
                case 0: goto L_0x0124;
                case 1: goto L_0x0116;
                case 2: goto L_0x0109;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00ef;
                case 5: goto L_0x00e2;
                case 6: goto L_0x00d5;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00b5;
                case 9: goto L_0x00a7;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x00a7:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r4, r5, r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00b2:
            r5 = 8
            goto L_0x0098
        L_0x00b5:
            com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote$$serializer r5 = com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote$$serializer.INSTANCE
            r4 = 8
            java.lang.Object r5 = r0.A(r1, r4, r5, r7)
            r7 = r5
            com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote r7 = (com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote) r7
            r3 = r3 | 256(0x100, float:3.59E-43)
            r5 = r4
            r4 = 9
            goto L_0x0098
        L_0x00c6:
            r5 = 7
            r4 = r2[r5]
            java.lang.Object r4 = r0.A(r1, r5, r4, r8)
            r8 = r4
            java.util.List r8 = (java.util.List) r8
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00d2:
            r4 = 9
            goto L_0x00b2
        L_0x00d5:
            r4 = 6
            r5 = r2[r4]
            java.lang.Object r5 = r0.A(r1, r4, r5, r10)
            r10 = r5
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 64
            goto L_0x00d2
        L_0x00e2:
            r5 = 5
            r4 = r2[r5]
            java.lang.Object r4 = r0.A(r1, r5, r4, r9)
            r9 = r4
            java.util.List r9 = (java.util.List) r9
            r3 = r3 | 32
            goto L_0x00d2
        L_0x00ef:
            r4 = 4
            r5 = r2[r4]
            java.lang.Object r5 = r0.A(r1, r4, r5, r11)
            r11 = r5
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            goto L_0x00d2
        L_0x00fc:
            r5 = 3
            r4 = r2[r5]
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 8
            goto L_0x00d2
        L_0x0109:
            r4 = 2
            r5 = r2[r4]
            java.lang.Object r5 = r0.A(r1, r4, r5, r13)
            r13 = r5
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 4
            goto L_0x00d2
        L_0x0116:
            r4 = 2
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 1
            java.lang.Object r5 = r0.A(r1, r4, r5, r15)
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 2
            goto L_0x00d2
        L_0x0124:
            r5 = 0
            r4 = r2[r5]
            java.lang.Object r4 = r0.A(r1, r5, r4, r14)
            r14 = r4
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 1
            goto L_0x00d2
        L_0x0131:
            r5 = 0
            r16 = r5
            goto L_0x00b2
        L_0x0136:
            r18 = r3
            r28 = r6
            r27 = r7
            r26 = r8
            r24 = r9
            r25 = r10
            r23 = r11
            r22 = r12
            r21 = r13
            r19 = r14
            r20 = r15
        L_0x014c:
            r0.c(r1)
            com.ingka.ikea.core.remotemodel.product.MoreInfoRemote r0 = new com.ingka.ikea.core.remotemodel.product.MoreInfoRemote
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.MoreInfoRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.remotemodel.product.MoreInfoRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, MoreInfoRemote moreInfoRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(moreInfoRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        MoreInfoRemote.c(moreInfoRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = MoreInfoRemote.f95304k;
        KSerializer<?> u10 = C17294a.u(a10[0]);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, C17294a.u(y02), C17294a.u(a10[2]), C17294a.u(a10[3]), C17294a.u(a10[4]), C17294a.u(a10[5]), C17294a.u(a10[6]), C17294a.u(a10[7]), C17294a.u(TechnicalComplianceRemote$$serializer.INSTANCE), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
