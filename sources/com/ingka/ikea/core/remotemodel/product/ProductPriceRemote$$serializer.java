package com.ingka.ikea.core.remotemodel.product;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/remotemodel/product/ProductPriceRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductPriceRemote$$serializer implements N<ProductPriceRemote> {
    public static final ProductPriceRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductPriceRemote$$serializer productPriceRemote$$serializer = new ProductPriceRemote$$serializer();
        INSTANCE = productPriceRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.remotemodel.product.ProductPriceRemote", productPriceRemote$$serializer, 8);
        j02.p("sellingPrice", false);
        j02.p("priceLabel", false);
        j02.p("unitPrice", false);
        j02.p("regularPrice", false);
        j02.p("fees", false);
        j02.p("rawPrice", false);
        j02.p("rawRegularPrice", false);
        j02.p("unit", false);
        descriptor = j02;
    }

    private ProductPriceRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Double} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c3, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c4, code lost:
        r5 = 6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.remotemodel.product.ProductPriceRemote deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.remotemodel.product.ProductPriceRemote.f95415i
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 2
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x006c
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r11 = r0.A(r1, r11, r3, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r3, r12)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r0.A(r1, r8, r3, r12)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.A(r1, r7, r3, r12)
            java.lang.String r7 = (java.lang.String) r7
            r2 = r2[r9]
            java.lang.Object r2 = r0.A(r1, r9, r2, r12)
            java.util.List r2 = (java.util.List) r2
            jK.C r9 = jK.C17438C.f144010a
            java.lang.Object r6 = r0.A(r1, r6, r9, r12)
            java.lang.Double r6 = (java.lang.Double) r6
            java.lang.Object r5 = r0.A(r1, r5, r9, r12)
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r3 = r0.A(r1, r4, r3, r12)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 255(0xff, float:3.57E-43)
            r23 = r2
            r26 = r3
            r18 = r4
            r25 = r5
            r24 = r6
            r22 = r7
            r21 = r8
            r20 = r10
            r19 = r11
            goto L_0x010a
        L_0x006c:
            r16 = r10
            r3 = r11
            r7 = r12
            r8 = r7
            r10 = r8
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0076:
            if (r16 == 0) goto L_0x00f8
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00f3;
                case 0: goto L_0x00e4;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009c;
                case 6: goto L_0x0091;
                case 7: goto L_0x0085;
                default: goto L_0x007f;
            }
        L_0x007f:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0085:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r4, r9, r7)
            java.lang.String r7 = (java.lang.String) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x008f:
            r9 = 4
            goto L_0x0076
        L_0x0091:
            jK.C r9 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r5, r9, r8)
            java.lang.Double r8 = (java.lang.Double) r8
            r3 = r3 | 64
            goto L_0x008f
        L_0x009c:
            jK.C r9 = jK.C17438C.f144010a
            java.lang.Object r9 = r0.A(r1, r6, r9, r10)
            r10 = r9
            java.lang.Double r10 = (java.lang.Double) r10
            r3 = r3 | 32
            goto L_0x008f
        L_0x00a8:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            r4 = 7
            goto L_0x0076
        L_0x00b6:
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 3
            java.lang.Object r4 = r0.A(r1, r5, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 8
        L_0x00c3:
            r4 = 7
        L_0x00c4:
            r5 = 6
            goto L_0x0076
        L_0x00c6:
            r5 = 3
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 2
            java.lang.Object r4 = r0.A(r1, r5, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 4
            goto L_0x00c3
        L_0x00d5:
            r5 = 2
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 1
            java.lang.Object r4 = r0.A(r1, r5, r4, r13)
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 2
            goto L_0x00c3
        L_0x00e4:
            r5 = 1
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1
            goto L_0x00c3
        L_0x00f3:
            r5 = 0
            r9 = 4
            r16 = r5
            goto L_0x00c4
        L_0x00f8:
            r18 = r3
            r26 = r7
            r25 = r8
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x010a:
            r0.c(r1)
            com.ingka.ikea.core.remotemodel.product.ProductPriceRemote r0 = new com.ingka.ikea.core.remotemodel.product.ProductPriceRemote
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.ProductPriceRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.remotemodel.product.ProductPriceRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductPriceRemote productPriceRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productPriceRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductPriceRemote.g(productPriceRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ProductPriceRemote.f95415i;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(a10[4]);
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{u10, u11, u12, u13, u14, C17294a.u(c10), C17294a.u(c10), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
