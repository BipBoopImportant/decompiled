package com.ingka.ikea.core.model.product;

import XH.C16814e;
import com.ingka.ikea.core.model.Image$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/ProductItem.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/ProductItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/ProductItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductItem$$serializer implements N<ProductItem> {
    public static final ProductItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductItem$$serializer productItem$$serializer = new ProductItem$$serializer();
        INSTANCE = productItem$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.ProductItem", productItem$$serializer, 9);
        j02.p("itemNo", false);
        j02.p("itemType", false);
        j02.p("productBadge", false);
        j02.p("image", false);
        j02.p("contextualImage", false);
        j02.p("info", false);
        j02.p("productDisclaimers", true);
        j02.p("availability", true);
        j02.p("isOnlineSellable", false);
        descriptor = j02;
    }

    private ProductItem$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.core.model.product.Badge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.core.model.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.ingka.ikea.core.model.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ae, code lost:
        r6 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bd, code lost:
        r6 = 8;
        r9 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.model.product.ProductItem deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.model.product.ProductItem.f95063j
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 7
            r10 = 6
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0074
            java.lang.String r3 = r0.n(r1, r12)
            java.lang.String r11 = r0.n(r1, r11)
            com.ingka.ikea.core.model.product.Badge$$serializer r12 = com.ingka.ikea.core.model.product.Badge$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r12, r13)
            com.ingka.ikea.core.model.product.Badge r8 = (com.ingka.ikea.core.model.product.Badge) r8
            com.ingka.ikea.core.model.Image$$serializer r12 = com.ingka.ikea.core.model.Image$$serializer.INSTANCE
            java.lang.Object r5 = r0.o(r1, r5, r12, r13)
            com.ingka.ikea.core.model.Image r5 = (com.ingka.ikea.core.model.Image) r5
            java.lang.Object r7 = r0.A(r1, r7, r12, r13)
            com.ingka.ikea.core.model.Image r7 = (com.ingka.ikea.core.model.Image) r7
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer r12 = com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r12, r13)
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r4 = (com.ingka.ikea.core.model.product.ProductItem.ProductInfo) r4
            r12 = r2[r10]
            java.lang.Object r10 = r0.o(r1, r10, r12, r13)
            java.util.List r10 = (java.util.List) r10
            r2 = r2[r9]
            java.lang.Object r2 = r0.o(r1, r9, r2, r13)
            java.util.List r2 = (java.util.List) r2
            boolean r6 = r0.D(r1, r6)
            r9 = 511(0x1ff, float:7.16E-43)
            r27 = r2
            r20 = r3
            r25 = r4
            r23 = r5
            r28 = r6
            r24 = r7
            r22 = r8
            r19 = r9
            r26 = r10
            r21 = r11
            goto L_0x0120
        L_0x0074:
            r17 = r11
            r3 = r12
            r4 = r13
            r5 = r4
            r7 = r5
            r8 = r7
            r11 = r8
            r14 = r11
            r15 = r14
            r12 = r15
            r13 = r3
        L_0x0080:
            if (r17 == 0) goto L_0x010c
            int r10 = r0.p(r1)
            switch(r10) {
                case -1: goto L_0x0105;
                case 0: goto L_0x00f8;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00df;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0097;
                case 8: goto L_0x008f;
                default: goto L_0x0089;
            }
        L_0x0089:
            fK.E r0 = new fK.E
            r0.<init>((int) r10)
            throw r0
        L_0x008f:
            boolean r3 = r0.D(r1, r6)
            r13 = r13 | 256(0x100, float:3.59E-43)
        L_0x0095:
            r10 = 6
            goto L_0x0080
        L_0x0097:
            r10 = r2[r9]
            java.lang.Object r4 = r0.o(r1, r9, r10, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = r13 | 128(0x80, float:1.794E-43)
            goto L_0x0095
        L_0x00a2:
            r10 = 6
            r6 = r2[r10]
            java.lang.Object r6 = r0.o(r1, r10, r6, r7)
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r13 = r13 | 64
        L_0x00ae:
            r6 = 8
            goto L_0x0080
        L_0x00b1:
            r10 = 6
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer r6 = com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer.INSTANCE
            r9 = 5
            java.lang.Object r5 = r0.o(r1, r9, r6, r5)
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r5 = (com.ingka.ikea.core.model.product.ProductItem.ProductInfo) r5
            r13 = r13 | 32
        L_0x00bd:
            r6 = 8
            r9 = 7
            goto L_0x0080
        L_0x00c1:
            r9 = 5
            r10 = 6
            com.ingka.ikea.core.model.Image$$serializer r6 = com.ingka.ikea.core.model.Image$$serializer.INSTANCE
            r9 = 4
            java.lang.Object r6 = r0.A(r1, r9, r6, r8)
            r8 = r6
            com.ingka.ikea.core.model.Image r8 = (com.ingka.ikea.core.model.Image) r8
            r13 = r13 | 16
            goto L_0x00bd
        L_0x00d0:
            r9 = 4
            r10 = 6
            com.ingka.ikea.core.model.Image$$serializer r6 = com.ingka.ikea.core.model.Image$$serializer.INSTANCE
            r9 = 3
            java.lang.Object r6 = r0.o(r1, r9, r6, r11)
            r11 = r6
            com.ingka.ikea.core.model.Image r11 = (com.ingka.ikea.core.model.Image) r11
            r13 = r13 | 8
            goto L_0x00bd
        L_0x00df:
            r9 = 3
            r10 = 6
            com.ingka.ikea.core.model.product.Badge$$serializer r6 = com.ingka.ikea.core.model.product.Badge$$serializer.INSTANCE
            r9 = 2
            java.lang.Object r6 = r0.A(r1, r9, r6, r12)
            r12 = r6
            com.ingka.ikea.core.model.product.Badge r12 = (com.ingka.ikea.core.model.product.Badge) r12
            r13 = r13 | 4
            goto L_0x00bd
        L_0x00ee:
            r6 = 1
            r9 = 2
            r10 = 6
            java.lang.String r15 = r0.n(r1, r6)
            r13 = r13 | 2
            goto L_0x00bd
        L_0x00f8:
            r6 = 1
            r9 = 2
            r10 = 6
            r14 = 0
            java.lang.String r16 = r0.n(r1, r14)
            r13 = r13 | 1
            r14 = r16
            goto L_0x00bd
        L_0x0105:
            r6 = 1
            r10 = 6
            r16 = 0
            r17 = r16
            goto L_0x00ae
        L_0x010c:
            r28 = r3
            r27 = r4
            r25 = r5
            r26 = r7
            r24 = r8
            r23 = r11
            r22 = r12
            r19 = r13
            r20 = r14
            r21 = r15
        L_0x0120:
            r0.c(r1)
            com.ingka.ikea.core.model.product.ProductItem r0 = new com.ingka.ikea.core.model.product.ProductItem
            r29 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.model.product.ProductItem$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.model.product.ProductItem");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductItem productItem) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productItem, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductItem.k(productItem, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ProductItem.f95063j;
        KSerializer<?> u10 = C17294a.u(Badge$$serializer.INSTANCE);
        Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
        KSerializer<?> u11 = C17294a.u(image$$serializer);
        KSerializer<?> kSerializer = a10[6];
        KSerializer<?> kSerializer2 = a10[7];
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, u10, image$$serializer, u11, ProductItem$ProductInfo$$serializer.INSTANCE, kSerializer, kSerializer2, C17457i.f144111a};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
