package com.ingka.ikea.core.remotemodel.product;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/remotemodel/product/ProductDetailsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductDetailsRemote$$serializer implements N<ProductDetailsRemote> {
    public static final ProductDetailsRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductDetailsRemote$$serializer productDetailsRemote$$serializer = new ProductDetailsRemote$$serializer();
        INSTANCE = productDetailsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.remotemodel.product.ProductDetailsRemote", productDetailsRemote$$serializer, 25);
        j02.p("itemNo", false);
        j02.p("itemType", false);
        j02.p("title", false);
        j02.p("description", false);
        j02.p("productBadge", false);
        j02.p("isOnlineSellable", false);
        j02.p("availabilityDisclaimer", false);
        j02.p("pricePackage", false);
        j02.p("images", false);
        j02.p("avgRating", false);
        j02.p("packageInfo", false);
        j02.p("measurements", false);
        j02.p("reviewCount", false);
        j02.p("moreInfo", false);
        j02.p("warnings", false);
        j02.p("lastChanceLabel", false);
        j02.p("headerTexts", false);
        j02.p("footerTexts", false);
        j02.p("guaranteeInfo", false);
        j02.p("keyBenefits", false);
        j02.p("arModel", false);
        j02.p("repairability", false);
        j02.p("productHighlight", false);
        j02.p("energyClassDisclaimer", false);
        j02.p("productDisclaimers", false);
        descriptor = j02;
    }

    private ProductDetailsRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.core.remotemodel.product.PackageInfoRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: com.ingka.ikea.core.remotemodel.product.MoreInfoRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v4, resolved type: com.ingka.ikea.core.remotemodel.product.ArModelRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v3, resolved type: com.ingka.ikea.core.remotemodel.product.DisclaimerRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: com.ingka.ikea.core.remotemodel.product.HighlightRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v4, resolved type: com.ingka.ikea.core.remotemodel.product.DisclaimerRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v5, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x01dc, code lost:
        r9 = r9 | r3;
        r10 = r43;
        r8 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0254, code lost:
        r9 = r9 | r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0255, code lost:
        r10 = r43;
        r8 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0259, code lost:
        r35 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x045c, code lost:
        r2 = r28;
        r10 = r43;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.remotemodel.product.ProductDetailsRemote deserialize(kotlinx.serialization.encoding.Decoder r75) {
        /*
            r74 = this;
            r0 = r75
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.remotemodel.product.ProductDetailsRemote.f95361z
            boolean r3 = r0.q()
            r11 = 9
            r12 = 7
            r13 = 6
            r14 = 5
            r15 = 3
            r4 = 4
            r5 = 2
            r6 = 8
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0149
            java.lang.String r3 = r0.n(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r8, r9)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r15 = r0.A(r1, r15, r8, r9)
            java.lang.String r15 = (java.lang.String) r15
            com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer r10 = com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r10, r9)
            com.ingka.ikea.core.remotemodel.product.BadgeRemote r4 = (com.ingka.ikea.core.remotemodel.product.BadgeRemote) r4
            boolean r10 = r0.D(r1, r14)
            java.lang.Object r13 = r0.A(r1, r13, r8, r9)
            java.lang.String r13 = (java.lang.String) r13
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r12, r14, r9)
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote r12 = (com.ingka.ikea.core.remotemodel.product.PricePackageRemote) r12
            r14 = r2[r6]
            java.lang.Object r6 = r0.o(r1, r6, r14, r9)
            java.util.List r6 = (java.util.List) r6
            jK.M r14 = jK.M.f144051a
            java.lang.Object r11 = r0.A(r1, r11, r14, r9)
            java.lang.Float r11 = (java.lang.Float) r11
            com.ingka.ikea.core.remotemodel.product.PackageInfoRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.PackageInfoRemote$$serializer.INSTANCE
            r26 = r3
            r3 = 10
            java.lang.Object r3 = r0.o(r1, r3, r14, r9)
            com.ingka.ikea.core.remotemodel.product.PackageInfoRemote r3 = (com.ingka.ikea.core.remotemodel.product.PackageInfoRemote) r3
            com.ingka.ikea.core.remotemodel.product.MeasurementsRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.MeasurementsRemote$$serializer.INSTANCE
            r25 = r3
            r3 = 11
            java.lang.Object r3 = r0.o(r1, r3, r14, r9)
            com.ingka.ikea.core.remotemodel.product.MeasurementsRemote r3 = (com.ingka.ikea.core.remotemodel.product.MeasurementsRemote) r3
            jK.X r14 = jK.X.f144073a
            r24 = r3
            r3 = 12
            java.lang.Object r3 = r0.A(r1, r3, r14, r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.ingka.ikea.core.remotemodel.product.MoreInfoRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.MoreInfoRemote$$serializer.INSTANCE
            r23 = r3
            r3 = 13
            java.lang.Object r3 = r0.o(r1, r3, r14, r9)
            com.ingka.ikea.core.remotemodel.product.MoreInfoRemote r3 = (com.ingka.ikea.core.remotemodel.product.MoreInfoRemote) r3
            r20 = r3
            r14 = 14
            r3 = r2[r14]
            java.lang.Object r3 = r0.o(r1, r14, r3, r9)
            java.util.List r3 = (java.util.List) r3
            r14 = 15
            java.lang.Object r8 = r0.A(r1, r14, r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            r17 = r3
            r14 = 16
            r3 = r2[r14]
            java.lang.Object r3 = r0.A(r1, r14, r3, r9)
            java.util.List r3 = (java.util.List) r3
            r19 = r3
            r14 = 17
            r3 = r2[r14]
            java.lang.Object r3 = r0.A(r1, r14, r3, r9)
            java.util.List r3 = (java.util.List) r3
            com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote$$serializer.INSTANCE
            r21 = r3
            r3 = 18
            java.lang.Object r3 = r0.A(r1, r3, r14, r9)
            com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote r3 = (com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote) r3
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer.INSTANCE
            r16 = r3
            r3 = 19
            java.lang.Object r3 = r0.A(r1, r3, r14, r9)
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote r3 = (com.ingka.ikea.core.remotemodel.KeyBenefitsRemote) r3
            r14 = 20
            r75 = r3
            com.ingka.ikea.core.remotemodel.product.ArModelRemote$$serializer r3 = com.ingka.ikea.core.remotemodel.product.ArModelRemote$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r14, r3, r9)
            com.ingka.ikea.core.remotemodel.product.ArModelRemote r3 = (com.ingka.ikea.core.remotemodel.product.ArModelRemote) r3
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer.INSTANCE
            r22 = r3
            r3 = 21
            java.lang.Object r3 = r0.A(r1, r3, r14, r9)
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r3 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r3
            r27 = r3
            r3 = 22
            r28 = r4
            com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer r4 = com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r3, r4, r9)
            com.ingka.ikea.core.remotemodel.product.HighlightRemote r3 = (com.ingka.ikea.core.remotemodel.product.HighlightRemote) r3
            r4 = 23
            java.lang.Object r4 = r0.A(r1, r4, r14, r9)
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r4 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r4
            r14 = 24
            r2 = r2[r14]
            java.lang.Object r2 = r0.A(r1, r14, r2, r9)
            java.util.List r2 = (java.util.List) r2
            r9 = 33554431(0x1ffffff, float:9.403954E-38)
            r67 = r75
            r72 = r2
            r70 = r3
            r71 = r4
            r50 = r5
            r56 = r6
            r49 = r7
            r63 = r8
            r47 = r9
            r53 = r10
            r57 = r11
            r55 = r12
            r54 = r13
            r51 = r15
            r66 = r16
            r62 = r17
            r64 = r19
            r61 = r20
            r65 = r21
            r68 = r22
            r60 = r23
            r59 = r24
            r58 = r25
            r48 = r26
            r69 = r27
            r52 = r28
            goto L_0x04fe
        L_0x0149:
            r3 = 24
            r42 = r7
            r41 = r8
            r4 = r9
            r5 = r4
            r6 = r5
            r7 = r6
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r18 = r15
            r29 = r18
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r8 = r40
            r9 = r41
        L_0x0177:
            if (r42 == 0) goto L_0x04bb
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x049b;
                case 0: goto L_0x047d;
                case 1: goto L_0x0462;
                case 2: goto L_0x043b;
                case 3: goto L_0x041d;
                case 4: goto L_0x03ff;
                case 5: goto L_0x03e5;
                case 6: goto L_0x03c6;
                case 7: goto L_0x03a7;
                case 8: goto L_0x0388;
                case 9: goto L_0x0367;
                case 10: goto L_0x0346;
                case 11: goto L_0x0326;
                case 12: goto L_0x0305;
                case 13: goto L_0x02df;
                case 14: goto L_0x02bf;
                case 15: goto L_0x029a;
                case 16: goto L_0x027d;
                case 17: goto L_0x025f;
                case 18: goto L_0x0236;
                case 19: goto L_0x0214;
                case 20: goto L_0x01fb;
                case 21: goto L_0x01e2;
                case 22: goto L_0x01c4;
                case 23: goto L_0x01a0;
                case 24: goto L_0x0186;
                default: goto L_0x0180;
            }
        L_0x0180:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x0186:
            r43 = r10
            r3 = 24
            r10 = r2[r3]
            r44 = r8
            r8 = r40
            java.lang.Object r8 = r0.A(r1, r3, r10, r8)
            r40 = r8
            java.util.List r40 = (java.util.List) r40
            r8 = 16777216(0x1000000, float:2.3509887E-38)
            r9 = r9 | r8
            r10 = r43
            r8 = r44
            goto L_0x0177
        L_0x01a0:
            r44 = r8
            r43 = r10
            r8 = r40
            r3 = 24
            r10 = 23
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer r3 = com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer.INSTANCE
            r45 = r8
            r8 = r39
            java.lang.Object r3 = r0.A(r1, r10, r3, r8)
            r39 = r3
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r39 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r39
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r9 = r9 | r3
            r10 = r43
            r8 = r44
            r40 = r45
        L_0x01c1:
            r3 = 24
            goto L_0x0177
        L_0x01c4:
            r44 = r8
            r43 = r10
            r8 = r39
            r45 = r40
            r3 = 22
            com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer r10 = com.ingka.ikea.core.remotemodel.product.HighlightRemote$$serializer.INSTANCE
            r8 = r38
            java.lang.Object r3 = r0.A(r1, r3, r10, r8)
            r38 = r3
            com.ingka.ikea.core.remotemodel.product.HighlightRemote r38 = (com.ingka.ikea.core.remotemodel.product.HighlightRemote) r38
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x01dc:
            r9 = r9 | r3
            r10 = r43
            r8 = r44
            goto L_0x01c1
        L_0x01e2:
            r44 = r8
            r43 = r10
            r8 = r38
            r45 = r40
            r3 = 21
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer r10 = com.ingka.ikea.core.remotemodel.product.DisclaimerRemote$$serializer.INSTANCE
            r8 = r37
            java.lang.Object r3 = r0.A(r1, r3, r10, r8)
            r37 = r3
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r37 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r37
            r3 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x01dc
        L_0x01fb:
            r44 = r8
            r43 = r10
            r8 = r37
            r45 = r40
            r3 = 20
            com.ingka.ikea.core.remotemodel.product.ArModelRemote$$serializer r10 = com.ingka.ikea.core.remotemodel.product.ArModelRemote$$serializer.INSTANCE
            r8 = r36
            java.lang.Object r3 = r0.A(r1, r3, r10, r8)
            r36 = r3
            com.ingka.ikea.core.remotemodel.product.ArModelRemote r36 = (com.ingka.ikea.core.remotemodel.product.ArModelRemote) r36
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01dc
        L_0x0214:
            r44 = r8
            r43 = r10
            r8 = r36
            r45 = r40
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer r3 = com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer.INSTANCE
            r10 = r35
            r35 = r8
            r8 = 19
            java.lang.Object r3 = r0.A(r1, r8, r3, r10)
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote r3 = (com.ingka.ikea.core.remotemodel.KeyBenefitsRemote) r3
            r10 = 524288(0x80000, float:7.34684E-40)
            r9 = r9 | r10
            r36 = r35
            r10 = r43
            r8 = r44
            r35 = r3
            goto L_0x01c1
        L_0x0236:
            r44 = r8
            r43 = r10
            r10 = r35
            r35 = r36
            r45 = r40
            r8 = 19
            com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote$$serializer r3 = com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote$$serializer.INSTANCE
            r16 = r10
            r8 = r34
            r10 = 18
            java.lang.Object r3 = r0.A(r1, r10, r3, r8)
            r34 = r3
            com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote r34 = (com.ingka.ikea.core.remotemodel.product.GuaranteeInfoRemote) r34
            r3 = 262144(0x40000, float:3.67342E-40)
        L_0x0254:
            r9 = r9 | r3
        L_0x0255:
            r10 = r43
            r8 = r44
        L_0x0259:
            r3 = 24
            r35 = r16
            goto L_0x0177
        L_0x025f:
            r44 = r8
            r43 = r10
            r8 = r34
            r16 = r35
            r35 = r36
            r45 = r40
            r3 = 17
            r10 = r2[r3]
            r8 = r33
            java.lang.Object r8 = r0.A(r1, r3, r10, r8)
            r33 = r8
            java.util.List r33 = (java.util.List) r33
            r8 = 131072(0x20000, float:1.83671E-40)
            r9 = r9 | r8
            goto L_0x0255
        L_0x027d:
            r44 = r8
            r43 = r10
            r8 = r33
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 16
            r3 = r2[r10]
            r8 = r32
            java.lang.Object r3 = r0.A(r1, r10, r3, r8)
            r32 = r3
            java.util.List r32 = (java.util.List) r32
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0254
        L_0x029a:
            r44 = r8
            r43 = r10
            r8 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 16
            jK.Y0 r3 = jK.Y0.f144077a
            r17 = r8
            r10 = r31
            r8 = 15
            java.lang.Object r3 = r0.A(r1, r8, r3, r10)
            r31 = r3
            java.lang.String r31 = (java.lang.String) r31
            r3 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r3
            r32 = r17
            goto L_0x0255
        L_0x02bf:
            r44 = r8
            r43 = r10
            r10 = r31
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r3 = 14
            r8 = r2[r3]
            r10 = r30
            java.lang.Object r8 = r0.o(r1, r3, r8, r10)
            r30 = r8
            java.util.List r30 = (java.util.List) r30
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0255
        L_0x02df:
            r44 = r8
            r43 = r10
            r10 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r3 = 14
            com.ingka.ikea.core.remotemodel.product.MoreInfoRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.product.MoreInfoRemote$$serializer.INSTANCE
            r22 = r10
            r3 = r29
            r10 = 13
            java.lang.Object r3 = r0.o(r1, r10, r8, r3)
            r29 = r3
            com.ingka.ikea.core.remotemodel.product.MoreInfoRemote r29 = (com.ingka.ikea.core.remotemodel.product.MoreInfoRemote) r29
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r30 = r22
            goto L_0x0255
        L_0x0305:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 13
            jK.X r8 = jK.X.f144073a
            r10 = 12
            java.lang.Object r8 = r0.A(r1, r10, r8, r11)
            r11 = r8
            java.lang.Integer r11 = (java.lang.Integer) r11
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            goto L_0x0255
        L_0x0326:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 12
            com.ingka.ikea.core.remotemodel.product.MeasurementsRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.product.MeasurementsRemote$$serializer.INSTANCE
            r10 = 11
            java.lang.Object r6 = r0.o(r1, r10, r8, r6)
            com.ingka.ikea.core.remotemodel.product.MeasurementsRemote r6 = (com.ingka.ikea.core.remotemodel.product.MeasurementsRemote) r6
            r9 = r9 | 2048(0x800, float:2.87E-42)
            goto L_0x0255
        L_0x0346:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 11
            com.ingka.ikea.core.remotemodel.product.PackageInfoRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.product.PackageInfoRemote$$serializer.INSTANCE
            r10 = 10
            java.lang.Object r8 = r0.o(r1, r10, r8, r12)
            r12 = r8
            com.ingka.ikea.core.remotemodel.product.PackageInfoRemote r12 = (com.ingka.ikea.core.remotemodel.product.PackageInfoRemote) r12
            r9 = r9 | 1024(0x400, float:1.435E-42)
            goto L_0x0255
        L_0x0367:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 10
            jK.M r8 = jK.M.f144051a
            r10 = 9
            java.lang.Object r8 = r0.A(r1, r10, r8, r13)
            r13 = r8
            java.lang.Float r13 = (java.lang.Float) r13
            r9 = r9 | 512(0x200, float:7.175E-43)
            goto L_0x0255
        L_0x0388:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r8 = 8
            r10 = r2[r8]
            java.lang.Object r10 = r0.o(r1, r8, r10, r14)
            r14 = r10
            java.util.List r14 = (java.util.List) r14
            r9 = r9 | 256(0x100, float:3.59E-43)
            goto L_0x0255
        L_0x03a7:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r8 = 8
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer r10 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote$$serializer.INSTANCE
            r8 = 7
            java.lang.Object r4 = r0.A(r1, r8, r10, r4)
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote r4 = (com.ingka.ikea.core.remotemodel.product.PricePackageRemote) r4
            r9 = r9 | 128(0x80, float:1.794E-43)
            goto L_0x0255
        L_0x03c6:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r8 = 7
            jK.Y0 r10 = jK.Y0.f144077a
            r8 = 6
            java.lang.Object r10 = r0.A(r1, r8, r10, r15)
            r15 = r10
            java.lang.String r15 = (java.lang.String) r15
            r9 = r9 | 64
            goto L_0x0255
        L_0x03e5:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r8 = 6
            r10 = 5
            boolean r41 = r0.D(r1, r10)
            r9 = r9 | 32
            goto L_0x0255
        L_0x03ff:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 5
            com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.product.BadgeRemote$$serializer.INSTANCE
            r10 = 4
            java.lang.Object r5 = r0.A(r1, r10, r8, r5)
            com.ingka.ikea.core.remotemodel.product.BadgeRemote r5 = (com.ingka.ikea.core.remotemodel.product.BadgeRemote) r5
            r9 = r9 | 16
            goto L_0x0255
        L_0x041d:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 4
            jK.Y0 r8 = jK.Y0.f144077a
            r10 = 3
            java.lang.Object r7 = r0.A(r1, r10, r8, r7)
            java.lang.String r7 = (java.lang.String) r7
            r9 = r9 | 8
            goto L_0x0255
        L_0x043b:
            r44 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r10 = 3
            jK.Y0 r8 = jK.Y0.f144077a
            r28 = r2
            r2 = r44
            r10 = 2
            java.lang.Object r2 = r0.A(r1, r10, r8, r2)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r9 = r9 | 4
        L_0x045c:
            r2 = r28
            r10 = r43
            goto L_0x0259
        L_0x0462:
            r28 = r2
            r2 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r8 = 1
            r10 = 2
            java.lang.String r18 = r0.n(r1, r8)
            r9 = r9 | 2
            r8 = r2
            goto L_0x045c
        L_0x047d:
            r28 = r2
            r2 = r8
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r8 = 0
            r10 = 2
            java.lang.String r26 = r0.n(r1, r8)
            r9 = r9 | 1
            r8 = r2
            r10 = r26
            r2 = r28
            goto L_0x0259
        L_0x049b:
            r28 = r2
            r2 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r8 = 0
            r10 = 2
            r42 = r8
            r10 = r43
            r3 = 24
            r8 = r2
            r35 = r16
            r2 = r28
            goto L_0x0177
        L_0x04bb:
            r2 = r8
            r43 = r10
            r3 = r29
            r22 = r30
            r17 = r32
            r16 = r35
            r35 = r36
            r45 = r40
            r50 = r2
            r61 = r3
            r55 = r4
            r52 = r5
            r59 = r6
            r51 = r7
            r47 = r9
            r60 = r11
            r58 = r12
            r57 = r13
            r56 = r14
            r54 = r15
            r67 = r16
            r64 = r17
            r49 = r18
            r62 = r22
            r63 = r31
            r65 = r33
            r66 = r34
            r68 = r35
            r69 = r37
            r70 = r38
            r71 = r39
            r53 = r41
            r48 = r43
            r72 = r45
        L_0x04fe:
            r0.c(r1)
            com.ingka.ikea.core.remotemodel.product.ProductDetailsRemote r0 = new com.ingka.ikea.core.remotemodel.product.ProductDetailsRemote
            r46 = r0
            r73 = 0
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.ProductDetailsRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.remotemodel.product.ProductDetailsRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductDetailsRemote productDetailsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productDetailsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductDetailsRemote.d(productDetailsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ProductDetailsRemote.f95361z;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(BadgeRemote$$serializer.INSTANCE);
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(PricePackageRemote$$serializer.INSTANCE);
        KSerializer<?> kSerializer = a10[8];
        KSerializer<?> u15 = C17294a.u(M.f144051a);
        KSerializer<?> u16 = C17294a.u(X.f144073a);
        KSerializer<?> kSerializer2 = a10[14];
        KSerializer<?> u17 = C17294a.u(y02);
        KSerializer<?> u18 = C17294a.u(a10[16]);
        KSerializer<?> u19 = C17294a.u(a10[17]);
        KSerializer<?> u20 = C17294a.u(GuaranteeInfoRemote$$serializer.INSTANCE);
        KSerializer<?> u21 = C17294a.u(KeyBenefitsRemote$$serializer.INSTANCE);
        KSerializer<?> u22 = C17294a.u(ArModelRemote$$serializer.INSTANCE);
        DisclaimerRemote$$serializer disclaimerRemote$$serializer = DisclaimerRemote$$serializer.INSTANCE;
        return new KSerializer[]{y02, y02, u10, u11, u12, C17457i.f144111a, u13, u14, kSerializer, u15, PackageInfoRemote$$serializer.INSTANCE, MeasurementsRemote$$serializer.INSTANCE, u16, MoreInfoRemote$$serializer.INSTANCE, kSerializer2, u17, u18, u19, u20, u21, u22, C17294a.u(disclaimerRemote$$serializer), C17294a.u(HighlightRemote$$serializer.INSTANCE), C17294a.u(disclaimerRemote$$serializer), C17294a.u(a10[24])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
