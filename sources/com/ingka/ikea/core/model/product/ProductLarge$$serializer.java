package com.ingka.ikea.core.model.product;

import XH.C16814e;
import com.ingka.ikea.core.model.KeyBenefits$$serializer;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.M;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/ProductLarge.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/ProductLarge;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductLarge$$serializer implements N<ProductLarge> {
    public static final ProductLarge$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductLarge$$serializer productLarge$$serializer = new ProductLarge$$serializer();
        INSTANCE = productLarge$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.ProductLarge", productLarge$$serializer, 20);
        j02.p("itemNo", false);
        j02.p("itemType", false);
        j02.p("info", false);
        j02.p("productBadge", false);
        j02.p("isOnlineSellable", false);
        j02.p("images", false);
        j02.p("avgRating", false);
        j02.p("packageInfo", false);
        j02.p("reviewCount", false);
        j02.p("measurements", false);
        j02.p("moreInfo", false);
        j02.p("warnings", false);
        j02.p("headerTexts", false);
        j02.p("footerTexts", false);
        j02.p("guaranteeInfo", false);
        j02.p("keyBenefits", false);
        j02.p("arModelUrl", false);
        j02.p("repairabilityIndex", false);
        j02.p("energyClassDisclaimer", false);
        j02.p("productDisclaimers", false);
        descriptor = j02;
    }

    private ProductLarge$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.ingka.ikea.core.model.product.PackageInfoData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.ingka.ikea.core.model.product.Measurements} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.core.model.product.MoreInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: com.ingka.ikea.core.model.KeyBenefits} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: com.ingka.ikea.core.model.product.Disclaimer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0193, code lost:
        r13 = r35;
        r5 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0197, code lost:
        r30 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0365, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0366, code lost:
        r5 = r25;
        r2 = r26;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.model.product.ProductLarge deserialize(kotlinx.serialization.encoding.Decoder r61) {
        /*
            r60 = this;
            r0 = r61
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.model.product.ProductLarge.f95120u
            boolean r3 = r0.q()
            r8 = 10
            r9 = 9
            r10 = 7
            r11 = 6
            r12 = 3
            r14 = 8
            r15 = 4
            r4 = 2
            r7 = 5
            r5 = 1
            r13 = 0
            r6 = 0
            if (r3 == 0) goto L_0x0105
            java.lang.String r3 = r0.n(r1, r13)
            java.lang.String r5 = r0.n(r1, r5)
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer r13 = com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r13, r6)
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r4 = (com.ingka.ikea.core.model.product.ProductItem.ProductInfo) r4
            com.ingka.ikea.core.model.product.Badge$$serializer r13 = com.ingka.ikea.core.model.product.Badge$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r12, r13, r6)
            com.ingka.ikea.core.model.product.Badge r12 = (com.ingka.ikea.core.model.product.Badge) r12
            boolean r13 = r0.D(r1, r15)
            r15 = r2[r7]
            java.lang.Object r7 = r0.o(r1, r7, r15, r6)
            java.util.List r7 = (java.util.List) r7
            jK.M r15 = jK.M.f144051a
            java.lang.Object r11 = r0.A(r1, r11, r15, r6)
            java.lang.Float r11 = (java.lang.Float) r11
            com.ingka.ikea.core.model.product.PackageInfoData$$serializer r15 = com.ingka.ikea.core.model.product.PackageInfoData$$serializer.INSTANCE
            java.lang.Object r10 = r0.o(r1, r10, r15, r6)
            com.ingka.ikea.core.model.product.PackageInfoData r10 = (com.ingka.ikea.core.model.product.PackageInfoData) r10
            int r14 = r0.j(r1, r14)
            com.ingka.ikea.core.model.product.Measurements$$serializer r15 = com.ingka.ikea.core.model.product.Measurements$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r9, r15, r6)
            com.ingka.ikea.core.model.product.Measurements r9 = (com.ingka.ikea.core.model.product.Measurements) r9
            com.ingka.ikea.core.model.product.MoreInfo$$serializer r15 = com.ingka.ikea.core.model.product.MoreInfo$$serializer.INSTANCE
            java.lang.Object r8 = r0.o(r1, r8, r15, r6)
            com.ingka.ikea.core.model.product.MoreInfo r8 = (com.ingka.ikea.core.model.product.MoreInfo) r8
            r23 = r3
            r15 = 11
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r6)
            java.util.List r3 = (java.util.List) r3
            r22 = r3
            r15 = 12
            r3 = r2[r15]
            java.lang.Object r3 = r0.A(r1, r15, r3, r6)
            java.util.List r3 = (java.util.List) r3
            r21 = r3
            r15 = 13
            r3 = r2[r15]
            java.lang.Object r3 = r0.A(r1, r15, r3, r6)
            java.util.List r3 = (java.util.List) r3
            com.ingka.ikea.core.model.product.GuaranteeInfo$$serializer r15 = com.ingka.ikea.core.model.product.GuaranteeInfo$$serializer.INSTANCE
            r24 = r3
            r3 = 14
            java.lang.Object r3 = r0.A(r1, r3, r15, r6)
            com.ingka.ikea.core.model.product.GuaranteeInfo r3 = (com.ingka.ikea.core.model.product.GuaranteeInfo) r3
            com.ingka.ikea.core.model.KeyBenefits$$serializer r15 = com.ingka.ikea.core.model.KeyBenefits$$serializer.INSTANCE
            r20 = r3
            r3 = 15
            java.lang.Object r3 = r0.A(r1, r3, r15, r6)
            com.ingka.ikea.core.model.KeyBenefits r3 = (com.ingka.ikea.core.model.KeyBenefits) r3
            jK.Y0 r15 = jK.Y0.f144077a
            r19 = r3
            r3 = 16
            java.lang.Object r3 = r0.A(r1, r3, r15, r6)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.core.model.product.Disclaimer$$serializer r15 = com.ingka.ikea.core.model.product.Disclaimer$$serializer.INSTANCE
            r18 = r3
            r3 = 17
            java.lang.Object r3 = r0.A(r1, r3, r15, r6)
            com.ingka.ikea.core.model.product.Disclaimer r3 = (com.ingka.ikea.core.model.product.Disclaimer) r3
            r16 = r3
            r3 = 18
            java.lang.Object r3 = r0.A(r1, r3, r15, r6)
            com.ingka.ikea.core.model.product.Disclaimer r3 = (com.ingka.ikea.core.model.product.Disclaimer) r3
            r15 = 19
            r2 = r2[r15]
            java.lang.Object r2 = r0.o(r1, r15, r2, r6)
            java.util.List r2 = (java.util.List) r2
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r58 = r2
            r57 = r3
            r41 = r4
            r40 = r5
            r38 = r6
            r44 = r7
            r49 = r8
            r48 = r9
            r46 = r10
            r45 = r11
            r42 = r12
            r43 = r13
            r47 = r14
            r56 = r16
            r55 = r18
            r54 = r19
            r53 = r20
            r51 = r21
            r50 = r22
            r39 = r23
            r52 = r24
            goto L_0x03e8
        L_0x0105:
            r3 = 19
            r34 = r5
            r4 = r6
            r5 = r4
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
            r17 = r15
            r24 = r17
            r27 = r24
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r13
            r33 = r32
            r6 = r33
            r13 = r31
        L_0x0129:
            if (r34 == 0) goto L_0x03b1
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x039c;
                case 0: goto L_0x0384;
                case 1: goto L_0x036c;
                case 2: goto L_0x0346;
                case 3: goto L_0x031d;
                case 4: goto L_0x0305;
                case 5: goto L_0x02ea;
                case 6: goto L_0x02cd;
                case 7: goto L_0x02af;
                case 8: goto L_0x0295;
                case 9: goto L_0x0276;
                case 10: goto L_0x0257;
                case 11: goto L_0x023a;
                case 12: goto L_0x021d;
                case 13: goto L_0x0200;
                case 14: goto L_0x01e3;
                case 15: goto L_0x01be;
                case 16: goto L_0x019c;
                case 17: goto L_0x0176;
                case 18: goto L_0x0152;
                case 19: goto L_0x0138;
                default: goto L_0x0132;
            }
        L_0x0132:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x0138:
            r35 = r13
            r3 = 19
            r13 = r2[r3]
            r36 = r5
            r5 = r31
            java.lang.Object r5 = r0.o(r1, r3, r13, r5)
            r31 = r5
            java.util.List r31 = (java.util.List) r31
            r5 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 | r5
            r13 = r35
            r5 = r36
            goto L_0x0129
        L_0x0152:
            r36 = r5
            r35 = r13
            r5 = r31
            r3 = 19
            com.ingka.ikea.core.model.product.Disclaimer$$serializer r13 = com.ingka.ikea.core.model.product.Disclaimer$$serializer.INSTANCE
            r3 = r30
            r30 = r5
            r5 = 18
            java.lang.Object r3 = r0.A(r1, r5, r13, r3)
            com.ingka.ikea.core.model.product.Disclaimer r3 = (com.ingka.ikea.core.model.product.Disclaimer) r3
            r13 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 | r13
            r31 = r30
            r13 = r35
            r5 = r36
            r30 = r3
            r3 = 19
            goto L_0x0129
        L_0x0176:
            r36 = r5
            r35 = r13
            r3 = r30
            r30 = r31
            r5 = 18
            com.ingka.ikea.core.model.product.Disclaimer$$serializer r13 = com.ingka.ikea.core.model.product.Disclaimer$$serializer.INSTANCE
            r16 = r3
            r5 = r29
            r3 = 17
            java.lang.Object r5 = r0.A(r1, r3, r13, r5)
            r29 = r5
            com.ingka.ikea.core.model.product.Disclaimer r29 = (com.ingka.ikea.core.model.product.Disclaimer) r29
            r5 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 | r5
        L_0x0193:
            r13 = r35
            r5 = r36
        L_0x0197:
            r3 = 19
            r30 = r16
            goto L_0x0129
        L_0x019c:
            r36 = r5
            r35 = r13
            r5 = r29
            r16 = r30
            r30 = r31
            r3 = 17
            jK.Y0 r13 = jK.Y0.f144077a
            r18 = r5
            r3 = r28
            r5 = 16
            java.lang.Object r3 = r0.A(r1, r5, r13, r3)
            r28 = r3
            java.lang.String r28 = (java.lang.String) r28
            r3 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 | r3
            r29 = r18
            goto L_0x0193
        L_0x01be:
            r36 = r5
            r35 = r13
            r3 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r5 = 16
            com.ingka.ikea.core.model.KeyBenefits$$serializer r13 = com.ingka.ikea.core.model.KeyBenefits$$serializer.INSTANCE
            r19 = r3
            r5 = r27
            r3 = 15
            java.lang.Object r5 = r0.A(r1, r3, r13, r5)
            r27 = r5
            com.ingka.ikea.core.model.KeyBenefits r27 = (com.ingka.ikea.core.model.KeyBenefits) r27
            r5 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r5
            r28 = r19
            goto L_0x0193
        L_0x01e3:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 15
            com.ingka.ikea.core.model.product.GuaranteeInfo$$serializer r13 = com.ingka.ikea.core.model.product.GuaranteeInfo$$serializer.INSTANCE
            r3 = 14
            java.lang.Object r8 = r0.A(r1, r3, r13, r8)
            com.ingka.ikea.core.model.product.GuaranteeInfo r8 = (com.ingka.ikea.core.model.product.GuaranteeInfo) r8
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0193
        L_0x0200:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 13
            r3 = r2[r13]
            java.lang.Object r3 = r0.A(r1, r13, r3, r9)
            r9 = r3
            java.util.List r9 = (java.util.List) r9
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0193
        L_0x021d:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 12
            r13 = r2[r3]
            java.lang.Object r13 = r0.A(r1, r3, r13, r14)
            r14 = r13
            java.util.List r14 = (java.util.List) r14
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            goto L_0x0193
        L_0x023a:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 11
            r3 = r2[r13]
            java.lang.Object r3 = r0.o(r1, r13, r3, r10)
            r10 = r3
            java.util.List r10 = (java.util.List) r10
            r6 = r6 | 2048(0x800, float:2.87E-42)
            goto L_0x0193
        L_0x0257:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 11
            com.ingka.ikea.core.model.product.MoreInfo$$serializer r3 = com.ingka.ikea.core.model.product.MoreInfo$$serializer.INSTANCE
            r13 = 10
            java.lang.Object r3 = r0.o(r1, r13, r3, r11)
            r11 = r3
            com.ingka.ikea.core.model.product.MoreInfo r11 = (com.ingka.ikea.core.model.product.MoreInfo) r11
            r6 = r6 | 1024(0x400, float:1.435E-42)
            goto L_0x0193
        L_0x0276:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 10
            com.ingka.ikea.core.model.product.Measurements$$serializer r3 = com.ingka.ikea.core.model.product.Measurements$$serializer.INSTANCE
            r13 = 9
            java.lang.Object r3 = r0.o(r1, r13, r3, r7)
            r7 = r3
            com.ingka.ikea.core.model.product.Measurements r7 = (com.ingka.ikea.core.model.product.Measurements) r7
            r6 = r6 | 512(0x200, float:7.175E-43)
            goto L_0x0193
        L_0x0295:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 8
            r13 = 9
            int r33 = r0.j(r1, r3)
            r6 = r6 | 256(0x100, float:3.59E-43)
            goto L_0x0193
        L_0x02af:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 9
            com.ingka.ikea.core.model.product.PackageInfoData$$serializer r3 = com.ingka.ikea.core.model.product.PackageInfoData$$serializer.INSTANCE
            r13 = 7
            java.lang.Object r3 = r0.o(r1, r13, r3, r15)
            r15 = r3
            com.ingka.ikea.core.model.product.PackageInfoData r15 = (com.ingka.ikea.core.model.product.PackageInfoData) r15
            r6 = r6 | 128(0x80, float:1.794E-43)
            goto L_0x0193
        L_0x02cd:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 7
            jK.M r3 = jK.M.f144051a
            r13 = 6
            java.lang.Object r3 = r0.A(r1, r13, r3, r12)
            r12 = r3
            java.lang.Float r12 = (java.lang.Float) r12
            r6 = r6 | 64
            goto L_0x0193
        L_0x02ea:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 5
            r13 = r2[r3]
            java.lang.Object r4 = r0.o(r1, r3, r13, r4)
            java.util.List r4 = (java.util.List) r4
            r6 = r6 | 32
            goto L_0x0193
        L_0x0305:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 5
            r13 = 4
            boolean r32 = r0.D(r1, r13)
            r6 = r6 | 16
            goto L_0x0193
        L_0x031d:
            r36 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 4
            com.ingka.ikea.core.model.product.Badge$$serializer r3 = com.ingka.ikea.core.model.product.Badge$$serializer.INSTANCE
            r26 = r2
            r2 = r36
            r13 = 3
            java.lang.Object r2 = r0.A(r1, r13, r3, r2)
            com.ingka.ikea.core.model.product.Badge r2 = (com.ingka.ikea.core.model.product.Badge) r2
            r6 = r6 | 8
            r13 = r35
            r3 = 19
            r5 = r2
            r30 = r16
            r2 = r26
            goto L_0x0129
        L_0x0346:
            r26 = r2
            r2 = r5
            r35 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r13 = 3
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer r3 = com.ingka.ikea.core.model.product.ProductItem$ProductInfo$$serializer.INSTANCE
            r25 = r2
            r2 = r35
            r13 = 2
            java.lang.Object r2 = r0.o(r1, r13, r3, r2)
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r2 = (com.ingka.ikea.core.model.product.ProductItem.ProductInfo) r2
            r6 = r6 | 4
        L_0x0365:
            r13 = r2
        L_0x0366:
            r5 = r25
            r2 = r26
            goto L_0x0197
        L_0x036c:
            r26 = r2
            r25 = r5
            r2 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 1
            r13 = 2
            java.lang.String r24 = r0.n(r1, r3)
            r6 = r6 | 2
            goto L_0x0365
        L_0x0384:
            r26 = r2
            r25 = r5
            r2 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 0
            r13 = 2
            java.lang.String r17 = r0.n(r1, r3)
            r6 = r6 | 1
            goto L_0x0365
        L_0x039c:
            r26 = r2
            r25 = r5
            r2 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r3 = 0
            r13 = 2
            r13 = r2
            r34 = r3
            goto L_0x0366
        L_0x03b1:
            r25 = r5
            r2 = r13
            r5 = r27
            r19 = r28
            r18 = r29
            r16 = r30
            r30 = r31
            r41 = r2
            r44 = r4
            r54 = r5
            r38 = r6
            r48 = r7
            r53 = r8
            r52 = r9
            r50 = r10
            r49 = r11
            r45 = r12
            r51 = r14
            r46 = r15
            r57 = r16
            r39 = r17
            r56 = r18
            r55 = r19
            r40 = r24
            r42 = r25
            r58 = r30
            r43 = r32
            r47 = r33
        L_0x03e8:
            r0.c(r1)
            com.ingka.ikea.core.model.product.ProductLarge r0 = new com.ingka.ikea.core.model.product.ProductLarge
            r37 = r0
            r59 = 0
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.model.product.ProductLarge$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.model.product.ProductLarge");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductLarge productLarge) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productLarge, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductLarge.u(productLarge, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ProductLarge.f95120u;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(Badge$$serializer.INSTANCE);
        KSerializer<?> kSerializer = a10[5];
        KSerializer<?> u11 = C17294a.u(M.f144051a);
        KSerializer<?> kSerializer2 = a10[11];
        KSerializer<?> u12 = C17294a.u(a10[12]);
        KSerializer<?> u13 = C17294a.u(a10[13]);
        KSerializer<?> u14 = C17294a.u(GuaranteeInfo$$serializer.INSTANCE);
        KSerializer<?> u15 = C17294a.u(KeyBenefits$$serializer.INSTANCE);
        KSerializer<?> u16 = C17294a.u(y02);
        Disclaimer$$serializer disclaimer$$serializer = Disclaimer$$serializer.INSTANCE;
        return new KSerializer[]{y02, y02, ProductItem$ProductInfo$$serializer.INSTANCE, u10, C17457i.f144111a, kSerializer, u11, PackageInfoData$$serializer.INSTANCE, X.f144073a, Measurements$$serializer.INSTANCE, MoreInfo$$serializer.INSTANCE, kSerializer2, u12, u13, u14, u15, u16, C17294a.u(disclaimer$$serializer), C17294a.u(disclaimer$$serializer), a10[19]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
