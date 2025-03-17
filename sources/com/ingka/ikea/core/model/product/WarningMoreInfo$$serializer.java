package com.ingka.ikea.core.model.product;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/WarningMoreInfo.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/WarningMoreInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class WarningMoreInfo$$serializer implements N<WarningMoreInfo> {
    public static final WarningMoreInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WarningMoreInfo$$serializer warningMoreInfo$$serializer = new WarningMoreInfo$$serializer();
        INSTANCE = warningMoreInfo$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.WarningMoreInfo", warningMoreInfo$$serializer, 5);
        j02.p("title", false);
        j02.p("imageType", false);
        j02.p("text", false);
        j02.p("boldText", false);
        j02.p("urlText", false);
        descriptor = j02;
    }

    private WarningMoreInfo$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.ingka.ikea.core.model.product.WarningImageType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.ingka.ikea.core.model.product.WarningMoreInfoUrl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.model.product.WarningMoreInfo deserialize(kotlinx.serialization.encoding.Decoder r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.model.product.WarningMoreInfo.$childSerializers
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = r0.n(r1, r8)
            r2 = r2[r7]
            java.lang.Object r2 = r0.o(r1, r7, r2, r9)
            com.ingka.ikea.core.model.product.WarningImageType r2 = (com.ingka.ikea.core.model.product.WarningImageType) r2
            java.lang.String r6 = r0.n(r1, r6)
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r4, r7, r9)
            java.lang.String r4 = (java.lang.String) r4
            com.ingka.ikea.core.model.product.WarningMoreInfoUrl$$serializer r7 = com.ingka.ikea.core.model.product.WarningMoreInfoUrl$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r7, r9)
            com.ingka.ikea.core.model.product.WarningMoreInfoUrl r5 = (com.ingka.ikea.core.model.product.WarningMoreInfoUrl) r5
            r7 = 31
            r18 = r2
            r17 = r3
            r20 = r4
            r21 = r5
            r19 = r6
            r16 = r7
            goto L_0x00af
        L_0x004d:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0053:
            if (r14 == 0) goto L_0x00a3
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00a0
            if (r15 == 0) goto L_0x0098
            if (r15 == r7) goto L_0x008c
            if (r15 == r6) goto L_0x0085
            if (r15 == r4) goto L_0x0079
            if (r15 != r5) goto L_0x0073
            com.ingka.ikea.core.model.product.WarningMoreInfoUrl$$serializer r8 = com.ingka.ikea.core.model.product.WarningMoreInfoUrl$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            com.ingka.ikea.core.model.product.WarningMoreInfoUrl r13 = (com.ingka.ikea.core.model.product.WarningMoreInfoUrl) r13
            r3 = r3 | 16
        L_0x0071:
            r8 = 0
            goto L_0x0053
        L_0x0073:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0079:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x0071
        L_0x0085:
            java.lang.String r11 = r0.n(r1, r6)
            r3 = r3 | 4
            goto L_0x0071
        L_0x008c:
            r8 = r2[r7]
            java.lang.Object r8 = r0.o(r1, r7, r8, r10)
            r10 = r8
            com.ingka.ikea.core.model.product.WarningImageType r10 = (com.ingka.ikea.core.model.product.WarningImageType) r10
            r3 = r3 | 2
            goto L_0x0071
        L_0x0098:
            r8 = 0
            java.lang.String r9 = r0.n(r1, r8)
            r3 = r3 | 1
            goto L_0x0053
        L_0x00a0:
            r8 = 0
            r14 = r8
            goto L_0x0053
        L_0x00a3:
            r16 = r3
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
        L_0x00af:
            r0.c(r1)
            com.ingka.ikea.core.model.product.WarningMoreInfo r0 = new com.ingka.ikea.core.model.product.WarningMoreInfo
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.model.product.WarningMoreInfo$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.model.product.WarningMoreInfo");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, WarningMoreInfo warningMoreInfo) {
        C17542s.j(encoder, "encoder");
        C17542s.j(warningMoreInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        WarningMoreInfo.write$Self$model_release(warningMoreInfo, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = WarningMoreInfo.$childSerializers;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, access$get$childSerializers$cp[1], y02, C17294a.u(y02), C17294a.u(WarningMoreInfoUrl$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
