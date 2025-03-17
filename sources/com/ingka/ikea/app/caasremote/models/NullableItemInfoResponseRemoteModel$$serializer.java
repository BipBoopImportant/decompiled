package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableItemInfoResponseRemoteModel$$serializer implements N<NullableItemInfoResponseRemoteModel> {
    public static final NullableItemInfoResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableItemInfoResponseRemoteModel$$serializer nullableItemInfoResponseRemoteModel$$serializer = new NullableItemInfoResponseRemoteModel$$serializer();
        INSTANCE = nullableItemInfoResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel", nullableItemInfoResponseRemoteModel$$serializer, 20);
        j02.p("businessStructure", false);
        j02.p("category", false);
        j02.p("description", false);
        j02.p("displayUnit", false);
        j02.p("energyEfficiencySymbol", false);
        j02.p("energyLabel", false);
        j02.p("formattedItemNo", false);
        j02.p("globalName", false);
        j02.p("isAssemblyRequired", false);
        j02.p("mainProductImages", false);
        j02.p("materials", false);
        j02.p("measurements", false);
        j02.p("name", false);
        j02.p("numberOfPackages", false);
        j02.p("productTags", false);
        j02.p("riskAcknowledgementNeeded", false);
        j02.p("technicalDetails", false);
        j02.p("unitCode", false);
        j02.p("waterLabel", false);
        j02.p("waterSymbol", false);
        descriptor = j02;
    }

    private NullableItemInfoResponseRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0139, code lost:
        r6 = r6 | r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x013a, code lost:
        r4 = r38;
        r12 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0160, code lost:
        r6 = r6 | r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x023b, code lost:
        r12 = r29;
        r2 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0259, code lost:
        r4 = r27;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r64) {
        /*
            r63 = this;
            r0 = r64
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r63.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel.f71312u
            boolean r3 = r0.q()
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 3
            r14 = 8
            r15 = 4
            r4 = 2
            r5 = 9
            r7 = 1
            r8 = 0
            r13 = 0
            if (r3 == 0) goto L_0x00fb
            com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.o(r1, r8, r3, r13)
            com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel) r3
            java.lang.String r7 = r0.n(r1, r7)
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r4, r8, r13)
            java.lang.String r4 = (java.lang.String) r4
            com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel$$serializer r6 = com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r12, r6, r13)
            com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel r6 = (com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel) r6
            java.lang.Object r12 = r0.A(r1, r15, r8, r13)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.A(r1, r11, r8, r13)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r10 = r0.n(r1, r10)
            java.lang.Object r9 = r0.A(r1, r9, r8, r13)
            java.lang.String r9 = (java.lang.String) r9
            boolean r14 = r0.D(r1, r14)
            r15 = r2[r5]
            java.lang.Object r5 = r0.o(r1, r5, r15, r13)
            java.util.List r5 = (java.util.List) r5
            r23 = r3
            r15 = 10
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r13)
            java.util.List r3 = (java.util.List) r3
            r22 = r3
            r15 = 11
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r13)
            java.util.List r3 = (java.util.List) r3
            r15 = 12
            java.lang.String r15 = r0.n(r1, r15)
            r21 = r3
            jK.X r3 = jK.X.f144073a
            r24 = r4
            r4 = 13
            java.lang.Object r3 = r0.A(r1, r4, r3, r13)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r19 = r3
            r4 = 14
            r3 = r2[r4]
            java.lang.Object r3 = r0.o(r1, r4, r3, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 15
            boolean r4 = r0.D(r1, r4)
            r18 = r3
            com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel$$serializer.INSTANCE
            r20 = r4
            r4 = 16
            java.lang.Object r3 = r0.A(r1, r4, r3, r13)
            com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel) r3
            r4 = 17
            r2 = r2[r4]
            java.lang.Object r2 = r0.o(r1, r4, r2, r13)
            com.ingka.ikea.app.caasremote.models.m r2 = (com.ingka.ikea.app.caasremote.models.m) r2
            r4 = 18
            java.lang.Object r4 = r0.A(r1, r4, r8, r13)
            java.lang.String r4 = (java.lang.String) r4
            r16 = r2
            r2 = 19
            java.lang.Object r2 = r0.A(r1, r2, r8, r13)
            java.lang.String r2 = (java.lang.String) r2
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r61 = r2
            r58 = r3
            r60 = r4
            r51 = r5
            r45 = r6
            r43 = r7
            r41 = r8
            r49 = r9
            r48 = r10
            r47 = r11
            r46 = r12
            r50 = r14
            r54 = r15
            r59 = r16
            r56 = r18
            r55 = r19
            r57 = r20
            r53 = r21
            r52 = r22
            r42 = r23
            r44 = r24
            goto L_0x02ef
        L_0x00fb:
            r37 = r7
            r6 = r8
            r32 = r6
            r36 = r32
            r3 = r13
            r4 = r3
            r5 = r4
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
            r24 = r15
            r28 = r24
            r31 = r28
            r33 = r31
            r34 = r33
            r35 = r34
        L_0x0119:
            if (r37 == 0) goto L_0x02bb
            r38 = r4
            int r4 = r0.p(r1)
            switch(r4) {
                case -1: goto L_0x02ab;
                case 0: goto L_0x028c;
                case 1: goto L_0x0279;
                case 2: goto L_0x025c;
                case 3: goto L_0x0241;
                case 4: goto L_0x0227;
                case 5: goto L_0x020e;
                case 6: goto L_0x0202;
                case 7: goto L_0x01f0;
                case 8: goto L_0x01e2;
                case 9: goto L_0x01d2;
                case 10: goto L_0x01c1;
                case 11: goto L_0x01b1;
                case 12: goto L_0x01a4;
                case 13: goto L_0x0192;
                case 14: goto L_0x0183;
                case 15: goto L_0x0173;
                case 16: goto L_0x0162;
                case 17: goto L_0x0151;
                case 18: goto L_0x013f;
                case 19: goto L_0x012a;
                default: goto L_0x0124;
            }
        L_0x0124:
            fK.E r0 = new fK.E
            r0.<init>((int) r4)
            throw r0
        L_0x012a:
            jK.Y0 r4 = jK.Y0.f144077a
            r39 = r12
            r12 = 19
            java.lang.Object r4 = r0.A(r1, r12, r4, r7)
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x0139:
            r6 = r6 | r4
        L_0x013a:
            r4 = r38
            r12 = r39
            goto L_0x0119
        L_0x013f:
            r39 = r12
            r12 = 19
            jK.Y0 r4 = jK.Y0.f144077a
            r12 = 18
            java.lang.Object r4 = r0.A(r1, r12, r4, r8)
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r4 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0139
        L_0x0151:
            r39 = r12
            r4 = 17
            r12 = r2[r4]
            java.lang.Object r12 = r0.o(r1, r4, r12, r13)
            r13 = r12
            com.ingka.ikea.app.caasremote.models.m r13 = (com.ingka.ikea.app.caasremote.models.m) r13
            r12 = 131072(0x20000, float:1.83671E-40)
        L_0x0160:
            r6 = r6 | r12
            goto L_0x013a
        L_0x0162:
            r39 = r12
            r4 = 17
            com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel$$serializer r12 = com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel$$serializer.INSTANCE
            r4 = 16
            java.lang.Object r3 = r0.A(r1, r4, r12, r3)
            com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullableTechnicalDetailsRemoteModel) r3
            r12 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0160
        L_0x0173:
            r39 = r12
            r4 = 16
            r12 = 15
            boolean r32 = r0.D(r1, r12)
            r17 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r17
            goto L_0x013a
        L_0x0183:
            r39 = r12
            r4 = 14
            r12 = r2[r4]
            java.lang.Object r5 = r0.o(r1, r4, r12, r5)
            java.util.List r5 = (java.util.List) r5
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            goto L_0x013a
        L_0x0192:
            r39 = r12
            r4 = 14
            jK.X r12 = jK.X.f144073a
            r4 = 13
            java.lang.Object r12 = r0.A(r1, r4, r12, r14)
            r14 = r12
            java.lang.Integer r14 = (java.lang.Integer) r14
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            goto L_0x013a
        L_0x01a4:
            r39 = r12
            r4 = 13
            r12 = 12
            java.lang.String r31 = r0.n(r1, r12)
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            goto L_0x013a
        L_0x01b1:
            r39 = r12
            r4 = 11
            r12 = r2[r4]
            java.lang.Object r9 = r0.o(r1, r4, r12, r9)
            java.util.List r9 = (java.util.List) r9
            r6 = r6 | 2048(0x800, float:2.87E-42)
            goto L_0x013a
        L_0x01c1:
            r39 = r12
            r12 = 10
            r4 = r2[r12]
            java.lang.Object r4 = r0.o(r1, r12, r4, r10)
            r10 = r4
            java.util.List r10 = (java.util.List) r10
            r6 = r6 | 1024(0x400, float:1.435E-42)
            goto L_0x013a
        L_0x01d2:
            r39 = r12
            r4 = 9
            r12 = r2[r4]
            java.lang.Object r11 = r0.o(r1, r4, r12, r11)
            java.util.List r11 = (java.util.List) r11
            r6 = r6 | 512(0x200, float:7.175E-43)
            goto L_0x013a
        L_0x01e2:
            r39 = r12
            r4 = 9
            r12 = 8
            boolean r36 = r0.D(r1, r12)
            r6 = r6 | 256(0x100, float:3.59E-43)
            goto L_0x013a
        L_0x01f0:
            r39 = r12
            r12 = 8
            jK.Y0 r4 = jK.Y0.f144077a
            r12 = 7
            java.lang.Object r4 = r0.A(r1, r12, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r6 = r6 | 128(0x80, float:1.794E-43)
            goto L_0x013a
        L_0x0202:
            r39 = r12
            r4 = 6
            r12 = 7
            java.lang.String r28 = r0.n(r1, r4)
            r6 = r6 | 64
            goto L_0x013a
        L_0x020e:
            r39 = r12
            r12 = 7
            jK.Y0 r4 = jK.Y0.f144077a
            r30 = r2
            r2 = r39
            r12 = 5
            java.lang.Object r2 = r0.A(r1, r12, r4, r2)
            java.lang.String r2 = (java.lang.String) r2
            r6 = r6 | 32
            r12 = r2
            r2 = r30
            r4 = r38
            goto L_0x0119
        L_0x0227:
            r30 = r2
            r2 = r12
            r12 = 5
            jK.Y0 r4 = jK.Y0.f144077a
            r29 = r2
            r2 = r38
            r12 = 4
            java.lang.Object r2 = r0.A(r1, r12, r4, r2)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            r6 = r6 | 16
        L_0x023b:
            r12 = r29
            r2 = r30
            goto L_0x0119
        L_0x0241:
            r30 = r2
            r29 = r12
            r2 = r38
            r12 = 4
            com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel$$serializer.INSTANCE
            r27 = r2
            r2 = r35
            r12 = 3
            java.lang.Object r2 = r0.A(r1, r12, r4, r2)
            r35 = r2
            com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel r35 = (com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel) r35
            r6 = r6 | 8
        L_0x0259:
            r4 = r27
            goto L_0x023b
        L_0x025c:
            r30 = r2
            r29 = r12
            r2 = r35
            r27 = r38
            r12 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r26 = r2
            r2 = r34
            r12 = 2
            java.lang.Object r2 = r0.A(r1, r12, r4, r2)
            r34 = r2
            java.lang.String r34 = (java.lang.String) r34
            r6 = r6 | 4
            r35 = r26
            goto L_0x0259
        L_0x0279:
            r30 = r2
            r29 = r12
            r2 = r34
            r26 = r35
            r27 = r38
            r4 = 1
            r12 = 2
            java.lang.String r24 = r0.n(r1, r4)
            r6 = r6 | 2
            goto L_0x0259
        L_0x028c:
            r30 = r2
            r29 = r12
            r2 = r34
            r26 = r35
            r27 = r38
            r12 = 2
            com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel$$serializer.INSTANCE
            r25 = r2
            r2 = r33
            r12 = 0
            java.lang.Object r2 = r0.o(r1, r12, r4, r2)
            r33 = r2
            com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel r33 = (com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel) r33
            r6 = r6 | 1
            r34 = r25
            goto L_0x0259
        L_0x02ab:
            r30 = r2
            r29 = r12
            r2 = r33
            r25 = r34
            r26 = r35
            r27 = r38
            r12 = 0
            r37 = r12
            goto L_0x0259
        L_0x02bb:
            r27 = r4
            r29 = r12
            r2 = r33
            r25 = r34
            r26 = r35
            r42 = r2
            r58 = r3
            r56 = r5
            r41 = r6
            r61 = r7
            r60 = r8
            r53 = r9
            r52 = r10
            r51 = r11
            r59 = r13
            r55 = r14
            r49 = r15
            r43 = r24
            r44 = r25
            r45 = r26
            r46 = r27
            r48 = r28
            r47 = r29
            r54 = r31
            r57 = r32
            r50 = r36
        L_0x02ef:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel
            r40 = r0
            r62 = 0
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableItemInfoResponseRemoteModel nullableItemInfoResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableItemInfoResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableItemInfoResponseRemoteModel.l(nullableItemInfoResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = NullableItemInfoResponseRemoteModel.f71312u;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(NullableDisplayUnitRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(y02);
        KSerializer<?> kSerializer = a10[9];
        KSerializer<?> kSerializer2 = a10[10];
        KSerializer<?> kSerializer3 = a10[11];
        KSerializer<?> u15 = C17294a.u(X.f144073a);
        KSerializer<?> kSerializer4 = a10[14];
        KSerializer<?> u16 = C17294a.u(NullableTechnicalDetailsRemoteModel$$serializer.INSTANCE);
        KSerializer<?> kSerializer5 = a10[17];
        KSerializer<?> u17 = C17294a.u(y02);
        KSerializer<?> u18 = C17294a.u(y02);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{BusinessStructureRemoteModel$$serializer.INSTANCE, y02, u10, u11, u12, u13, y02, u14, iVar, kSerializer, kSerializer2, kSerializer3, y02, u15, kSerializer4, iVar, u16, kSerializer5, u17, u18};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
