package com.ingka.ikea.core.remotemodel.product;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/remotemodel/product/ProductLiteRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductLiteRemote$$serializer implements N<ProductLiteRemote> {
    public static final ProductLiteRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductLiteRemote$$serializer productLiteRemote$$serializer = new ProductLiteRemote$$serializer();
        INSTANCE = productLiteRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.remotemodel.product.ProductLiteRemote", productLiteRemote$$serializer, 15);
        j02.p("itemNo", false);
        j02.p("itemType", false);
        j02.p("title", false);
        j02.p("description", false);
        j02.p("productBadge", false);
        j02.p("isOnlineSellable", false);
        j02.p("availabilityDisclaimer", false);
        j02.p("image", false);
        j02.p("contextualImage", false);
        j02.p("pricePackage", false);
        j02.p("availability", false);
        j02.p("productHighlight", false);
        j02.p("priceDescriptions", false);
        j02.p("energyClassDisclaimer", false);
        j02.p("productDisclaimers", false);
        descriptor = j02;
    }

    private ProductLiteRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: com.ingka.ikea.core.remotemodel.product.DisclaimerRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x011f, code lost:
        r14 = r26;
        r15 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0220, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0221, code lost:
        r2 = r21;
        r14 = r26;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.remotemodel.product.ProductLiteRemote deserialize(kotlinx.serialization.encoding.Decoder r46) {
        /*
            r45 = this;
            r0 = r46
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.remotemodel.product.ProductLiteRemote.f95395p
            boolean r3 = r0.q()
            r6 = 9
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r4 = 1
            r15 = 0
            r5 = 0
            if (r3 == 0) goto L_0x00c2
            java.lang.String r3 = r0.n(r1, r15)
            java.lang.String r4 = r0.n(r1, r4)
            jK.Y0 r15 = jK.Y0.f144077a
            java.lang.Object r13 = r0.A(r1, r13, r15, r5)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r10 = r0.A(r1, r10, r15, r5)
            java.lang.String r10 = (java.lang.String) r10
            com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r12, r14, r5)
            com.ingka.ikea.core.remotemodel.product.BadgeRemote r12 = (com.ingka.ikea.core.remotemodel.product.BadgeRemote) r12
            jK.i r14 = jK.C17457i.f144111a
            java.lang.Object r9 = r0.A(r1, r9, r14, r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r8 = r0.A(r1, r8, r15, r5)
            java.lang.String r8 = (java.lang.String) r8
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r14, r5)
            com.ingka.ikea.core.remotemodel.ImageRemote r7 = (com.ingka.ikea.core.remotemodel.ImageRemote) r7
            java.lang.Object r11 = r0.A(r1, r11, r14, r5)
            com.ingka.ikea.core.remotemodel.ImageRemote r11 = (com.ingka.ikea.core.remotemodel.ImageRemote) r11
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r14, r5)
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote r6 = (com.ingka.ikea.core.remotemodel.product.PricePackageRemote) r6
            r14 = 10
            r15 = r2[r14]
            java.lang.Object r14 = r0.A(r1, r14, r15, r5)
            java.util.List r14 = (java.util.List) r14
            com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer r15 = com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer.INSTANCE
            r19 = r3
            r3 = 11
            java.lang.Object r3 = r0.A(r1, r3, r15, r5)
            com.ingka.ikea.core.remotemodel.product.HighlightRemote r3 = (com.ingka.ikea.core.remotemodel.product.HighlightRemote) r3
            r17 = r3
            r15 = 12
            r3 = r2[r15]
            java.lang.Object r3 = r0.A(r1, r15, r3, r5)
            java.util.List r3 = (java.util.List) r3
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer r15 = com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer.INSTANCE
            r18 = r3
            r3 = 13
            java.lang.Object r3 = r0.A(r1, r3, r15, r5)
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r3 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r3
            r15 = 14
            r2 = r2[r15]
            java.lang.Object r2 = r0.A(r1, r15, r2, r5)
            java.util.List r2 = (java.util.List) r2
            r5 = 32767(0x7fff, float:4.5916E-41)
            r43 = r2
            r42 = r3
            r30 = r4
            r28 = r5
            r38 = r6
            r36 = r7
            r35 = r8
            r34 = r9
            r32 = r10
            r37 = r11
            r33 = r12
            r31 = r13
            r39 = r14
            r40 = r17
            r41 = r18
            r29 = r19
            goto L_0x027f
        L_0x00c2:
            r3 = 14
            r25 = r4
            r4 = r5
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r20 = r14
            r22 = r20
            r23 = r22
            r24 = r23
            r5 = r15
            r15 = r24
        L_0x00db:
            if (r25 == 0) goto L_0x0258
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x0249;
                case 0: goto L_0x0239;
                case 1: goto L_0x0227;
                case 2: goto L_0x0208;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01dc;
                case 5: goto L_0x01c6;
                case 6: goto L_0x01b0;
                case 7: goto L_0x0199;
                case 8: goto L_0x0182;
                case 9: goto L_0x016b;
                case 10: goto L_0x0156;
                case 11: goto L_0x013f;
                case 12: goto L_0x0126;
                case 13: goto L_0x0103;
                case 14: goto L_0x00ea;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x00ea:
            r26 = r14
            r3 = 14
            r14 = r2[r3]
            r27 = r15
            r15 = r24
            java.lang.Object r14 = r0.A(r1, r3, r14, r15)
            r24 = r14
            java.util.List r24 = (java.util.List) r24
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r14 = r26
            r15 = r27
            goto L_0x00db
        L_0x0103:
            r26 = r14
            r27 = r15
            r15 = r24
            r3 = 14
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer.INSTANCE
            r16 = r15
            r3 = r23
            r15 = 13
            java.lang.Object r3 = r0.A(r1, r15, r14, r3)
            r23 = r3
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r23 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r23
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r24 = r16
        L_0x011f:
            r14 = r26
            r15 = r27
        L_0x0123:
            r3 = 14
            goto L_0x00db
        L_0x0126:
            r26 = r14
            r27 = r15
            r3 = r23
            r16 = r24
            r14 = 12
            r15 = r2[r14]
            r3 = r22
            java.lang.Object r3 = r0.A(r1, r14, r15, r3)
            r22 = r3
            java.util.List r22 = (java.util.List) r22
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            goto L_0x011f
        L_0x013f:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r14 = 12
            com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer r15 = com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer.INSTANCE
            r14 = 11
            java.lang.Object r6 = r0.A(r1, r14, r15, r6)
            com.ingka.ikea.core.remotemodel.product.HighlightRemote r6 = (com.ingka.ikea.core.remotemodel.product.HighlightRemote) r6
            r5 = r5 | 2048(0x800, float:2.87E-42)
            goto L_0x011f
        L_0x0156:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 10
            r14 = r2[r15]
            java.lang.Object r11 = r0.A(r1, r15, r14, r11)
            java.util.List r11 = (java.util.List) r11
            r5 = r5 | 1024(0x400, float:1.435E-42)
            goto L_0x011f
        L_0x016b:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 10
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer.INSTANCE
            r15 = 9
            java.lang.Object r7 = r0.A(r1, r15, r14, r7)
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote r7 = (com.ingka.ikea.core.remotemodel.product.PricePackageRemote) r7
            r5 = r5 | 512(0x200, float:7.175E-43)
            goto L_0x011f
        L_0x0182:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 9
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            r15 = 8
            java.lang.Object r8 = r0.A(r1, r15, r14, r8)
            com.ingka.ikea.core.remotemodel.ImageRemote r8 = (com.ingka.ikea.core.remotemodel.ImageRemote) r8
            r5 = r5 | 256(0x100, float:3.59E-43)
            goto L_0x011f
        L_0x0199:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 8
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            r15 = 7
            java.lang.Object r9 = r0.A(r1, r15, r14, r9)
            com.ingka.ikea.core.remotemodel.ImageRemote r9 = (com.ingka.ikea.core.remotemodel.ImageRemote) r9
            r5 = r5 | 128(0x80, float:1.794E-43)
            goto L_0x011f
        L_0x01b0:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 7
            jK.Y0 r14 = jK.Y0.f144077a
            r15 = 6
            java.lang.Object r12 = r0.A(r1, r15, r14, r12)
            java.lang.String r12 = (java.lang.String) r12
            r5 = r5 | 64
            goto L_0x011f
        L_0x01c6:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 6
            jK.i r14 = jK.C17457i.f144111a
            r15 = 5
            java.lang.Object r10 = r0.A(r1, r15, r14, r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r5 = r5 | 32
            goto L_0x011f
        L_0x01dc:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 5
            com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer.INSTANCE
            r15 = 4
            java.lang.Object r13 = r0.A(r1, r15, r14, r13)
            com.ingka.ikea.core.remotemodel.product.BadgeRemote r13 = (com.ingka.ikea.core.remotemodel.product.BadgeRemote) r13
            r5 = r5 | 16
            goto L_0x011f
        L_0x01f2:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 4
            jK.Y0 r14 = jK.Y0.f144077a
            r15 = 3
            java.lang.Object r4 = r0.A(r1, r15, r14, r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = r5 | 8
            goto L_0x011f
        L_0x0208:
            r26 = r14
            r27 = r15
            r3 = r22
            r16 = r24
            r15 = 3
            jK.Y0 r14 = jK.Y0.f144077a
            r21 = r2
            r2 = r27
            r15 = 2
            java.lang.Object r2 = r0.A(r1, r15, r14, r2)
            java.lang.String r2 = (java.lang.String) r2
            r5 = r5 | 4
        L_0x0220:
            r15 = r2
        L_0x0221:
            r2 = r21
            r14 = r26
            goto L_0x0123
        L_0x0227:
            r21 = r2
            r26 = r14
            r2 = r15
            r3 = r22
            r16 = r24
            r14 = 1
            r15 = 2
            java.lang.String r20 = r0.n(r1, r14)
            r5 = r5 | 2
            goto L_0x0220
        L_0x0239:
            r21 = r2
            r2 = r15
            r3 = r22
            r16 = r24
            r14 = 0
            r15 = 2
            java.lang.String r26 = r0.n(r1, r14)
            r5 = r5 | 1
            goto L_0x0220
        L_0x0249:
            r21 = r2
            r26 = r14
            r2 = r15
            r3 = r22
            r16 = r24
            r14 = 0
            r15 = 2
            r15 = r2
            r25 = r14
            goto L_0x0221
        L_0x0258:
            r26 = r14
            r2 = r15
            r3 = r22
            r16 = r24
            r31 = r2
            r41 = r3
            r32 = r4
            r28 = r5
            r40 = r6
            r38 = r7
            r37 = r8
            r36 = r9
            r34 = r10
            r39 = r11
            r35 = r12
            r33 = r13
            r43 = r16
            r30 = r20
            r42 = r23
            r29 = r26
        L_0x027f:
            r0.c(r1)
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r0 = new com.ingka.ikea.core.remotemodel.product.ProductLiteRemote
            r27 = r0
            r44 = 0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.remotemodel.product.ProductLiteRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductLiteRemote productLiteRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productLiteRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductLiteRemote.t(productLiteRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ProductLiteRemote.f95395p;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(BadgeRemote$$serializer.INSTANCE);
        KSerializer<?> u13 = C17294a.u(C17457i.f144111a);
        KSerializer<?> u14 = C17294a.u(y02);
        ImageRemote$$serializer imageRemote$$serializer = ImageRemote$$serializer.INSTANCE;
        return new KSerializer[]{y02, y02, u10, u11, u12, u13, u14, C17294a.u(imageRemote$$serializer), C17294a.u(imageRemote$$serializer), C17294a.u(PricePackageRemote$$serializer.INSTANCE), C17294a.u(a10[10]), C17294a.u(HighlightRemote$$serializer.INSTANCE), C17294a.u(a10[12]), C17294a.u(DisclaimerRemote$$serializer.INSTANCE), C17294a.u(a10[14])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
