package com.ingka.ikea.core.model.product;

import XH.C16814e;
import com.ingka.ikea.core.model.product.ProductItem;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/ProductItem.ProductInfo.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductItem$ProductInfo$$serializer implements N<ProductItem.ProductInfo> {
    public static final ProductItem$ProductInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductItem$ProductInfo$$serializer productItem$ProductInfo$$serializer = new ProductItem$ProductInfo$$serializer();
        INSTANCE = productItem$ProductInfo$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.ProductItem.ProductInfo", productItem$ProductInfo$$serializer, 8);
        j02.p("highlight", true);
        j02.p("offerValidTo", true);
        j02.p("title", false);
        j02.p("description", false);
        j02.p("price", false);
        j02.p("energyClassDisclaimer", false);
        j02.p("priceAddons", true);
        j02.p("availabilityDisclaimer", false);
        descriptor = j02;
    }

    private ProductItem$ProductInfo$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.ingka.ikea.core.model.product.ProductItem$Price} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b4, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00da, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00db, code lost:
        r5 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.model.product.ProductItem.ProductInfo deserialize(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.model.product.ProductItem.ProductInfo.f95109i
            boolean r3 = r0.q()
            r4 = 7
            r5 = 5
            r6 = 3
            r7 = 2
            r8 = 6
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x006c
            com.ingka.ikea.core.model.product.ProductItem$ProductItemHighlight$$serializer r3 = com.ingka.ikea.core.model.product.ProductItem$ProductItemHighlight$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r11, r3, r12)
            com.ingka.ikea.core.model.product.ProductItem$ProductItemHighlight r3 = (com.ingka.ikea.core.model.product.ProductItem.ProductItemHighlight) r3
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r10, r11, r12)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            r13 = r2[r9]
            java.lang.Object r9 = r0.o(r1, r9, r13, r12)
            com.ingka.ikea.core.model.product.ProductItem$Price r9 = (com.ingka.ikea.core.model.product.ProductItem.Price) r9
            com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer$$serializer r13 = com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r13, r12)
            com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer r5 = (com.ingka.ikea.core.model.product.ProductItem.EnergyClassDisclaimer) r5
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r12)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.A(r1, r4, r11, r12)
            java.lang.String r4 = (java.lang.String) r4
            r8 = 255(0xff, float:3.57E-43)
            r26 = r2
            r20 = r3
            r27 = r4
            r25 = r5
            r23 = r6
            r22 = r7
            r19 = r8
            r24 = r9
            r21 = r10
            goto L_0x0107
        L_0x006c:
            r17 = r10
            r3 = r11
            r6 = r12
            r7 = r6
            r10 = r7
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0076:
            if (r17 == 0) goto L_0x00f5
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00ee;
                case 0: goto L_0x00dd;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00bf;
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
            java.lang.Object r6 = r0.A(r1, r4, r9, r6)
            java.lang.String r6 = (java.lang.String) r6
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x008f:
            r9 = 4
            goto L_0x0076
        L_0x0091:
            r9 = r2[r8]
            java.lang.Object r7 = r0.o(r1, r8, r9, r7)
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 64
            goto L_0x008f
        L_0x009c:
            com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer$$serializer r9 = com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r5, r9, r10)
            r10 = r9
            com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer r10 = (com.ingka.ikea.core.model.product.ProductItem.EnergyClassDisclaimer) r10
            r3 = r3 | 32
            goto L_0x008f
        L_0x00a8:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r4 = r0.o(r1, r9, r4, r11)
            r11 = r4
            com.ingka.ikea.core.model.product.ProductItem$Price r11 = (com.ingka.ikea.core.model.product.ProductItem.Price) r11
            r3 = r3 | 16
        L_0x00b4:
            r4 = 7
            goto L_0x0076
        L_0x00b6:
            r4 = 3
            r9 = 4
            java.lang.String r15 = r0.n(r1, r4)
            r3 = r3 | 8
            goto L_0x00b4
        L_0x00bf:
            r4 = 3
            r9 = 4
            r14 = 2
            java.lang.String r16 = r0.n(r1, r14)
            r3 = r3 | 4
            r14 = r16
            goto L_0x00b4
        L_0x00cb:
            r9 = 4
            r16 = 2
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 1
            java.lang.Object r4 = r0.A(r1, r5, r4, r13)
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 2
        L_0x00da:
            r4 = 7
        L_0x00db:
            r5 = 5
            goto L_0x0076
        L_0x00dd:
            r5 = 1
            r9 = 4
            r16 = 2
            com.ingka.ikea.core.model.product.ProductItem$ProductItemHighlight$$serializer r4 = com.ingka.ikea.core.model.product.ProductItem$ProductItemHighlight$$serializer.INSTANCE
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            com.ingka.ikea.core.model.product.ProductItem$ProductItemHighlight r12 = (com.ingka.ikea.core.model.product.ProductItem.ProductItemHighlight) r12
            r3 = r3 | 1
            goto L_0x00da
        L_0x00ee:
            r5 = 0
            r9 = 4
            r16 = 2
            r17 = r5
            goto L_0x00db
        L_0x00f5:
            r19 = r3
            r27 = r6
            r26 = r7
            r25 = r10
            r24 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x0107:
            r0.c(r1)
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r0 = new com.ingka.ikea.core.model.product.ProductItem$ProductInfo
            r28 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.model.product.ProductItem$ProductInfo");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductItem.ProductInfo productInfo) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductItem.ProductInfo.j(productInfo, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ProductItem.ProductInfo.f95109i;
        KSerializer<?> u10 = C17294a.u(ProductItem$ProductItemHighlight$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, C17294a.u(y02), y02, y02, a10[4], C17294a.u(ProductItem$EnergyClassDisclaimer$$serializer.INSTANCE), a10[6], C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
