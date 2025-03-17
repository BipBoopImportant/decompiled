package com.sugarcube.decorate_engine;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/SceneLayoutAssetItem.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class SceneLayoutAssetItem$$serializer implements N<SceneLayoutAssetItem> {
    public static final SceneLayoutAssetItem$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        SceneLayoutAssetItem$$serializer sceneLayoutAssetItem$$serializer = new SceneLayoutAssetItem$$serializer();
        INSTANCE = sceneLayoutAssetItem$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.SceneLayoutAssetItem", sceneLayoutAssetItem$$serializer, 16);
        j02.p("assetPath", true);
        j02.p("isPlaceholder", true);
        j02.p("featureFlags", true);
        j02.p("productId", true);
        j02.p("boxMin", true);
        j02.p("boxMax", true);
        j02.p("stackingPolygons", true);
        j02.p("combinableSlots", true);
        j02.p("socketSets", true);
        j02.p("socketMeta", true);
        j02.p("plugs", true);
        j02.p("plugRules", true);
        j02.p("anchors", true);
        j02.p("stackableSetIndices", true);
        j02.p("stackingPolygonAlternatives", true);
        j02.p("combinations", true);
        descriptor = j02;
    }

    private SceneLayoutAssetItem$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] access$get$childSerializers$cp = SceneLayoutAssetItem.$childSerializers;
        KSerializer<?> u10 = C17294a.u(access$get$childSerializers$cp[4]);
        KSerializer<?> u11 = C17294a.u(access$get$childSerializers$cp[5]);
        KSerializer<?> u12 = C17294a.u(access$get$childSerializers$cp[6]);
        KSerializer<?> u13 = C17294a.u(access$get$childSerializers$cp[7]);
        KSerializer<?> u14 = C17294a.u(access$get$childSerializers$cp[8]);
        KSerializer<?> u15 = C17294a.u(access$get$childSerializers$cp[9]);
        KSerializer<?> u16 = C17294a.u(access$get$childSerializers$cp[10]);
        KSerializer<?> u17 = C17294a.u(CombinablePlugRules$$serializer.INSTANCE);
        KSerializer<?> u18 = C17294a.u(access$get$childSerializers$cp[12]);
        KSerializer<?> u19 = C17294a.u(access$get$childSerializers$cp[13]);
        KSerializer<?> u20 = C17294a.u(access$get$childSerializers$cp[14]);
        KSerializer<?> u21 = C17294a.u(access$get$childSerializers$cp[15]);
        X x10 = X.f144073a;
        return new KSerializer[]{Y0.f144077a, C17457i.f144111a, x10, x10, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20, u21};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.sugarcube.decorate_engine.CombinablePlugRules} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x012a, code lost:
        r10 = r26;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0204, code lost:
        r2 = r27;
        r9 = r5;
        r5 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x021d, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.SceneLayoutAssetItem deserialize(kotlinx.serialization.encoding.Decoder r48) {
        /*
            r47 = this;
            r0 = r48
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r47.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.SceneLayoutAssetItem.$childSerializers
            boolean r3 = r0.q()
            r5 = 3
            r6 = 2
            r11 = 10
            r12 = 9
            r13 = 7
            r14 = 6
            r15 = 5
            r7 = 8
            r8 = 4
            r9 = 1
            r10 = 0
            r4 = 0
            if (r3 == 0) goto L_0x00d1
            java.lang.String r3 = r0.n(r1, r10)
            boolean r9 = r0.D(r1, r9)
            int r6 = r0.j(r1, r6)
            int r5 = r0.j(r1, r5)
            r10 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r10, r4)
            java.util.List r8 = (java.util.List) r8
            r10 = r2[r15]
            java.lang.Object r10 = r0.A(r1, r15, r10, r4)
            java.util.List r10 = (java.util.List) r10
            r15 = r2[r14]
            java.lang.Object r14 = r0.A(r1, r14, r15, r4)
            java.util.List r14 = (java.util.List) r14
            r15 = r2[r13]
            java.lang.Object r13 = r0.A(r1, r13, r15, r4)
            java.util.List r13 = (java.util.List) r13
            r15 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r15, r4)
            java.util.List r7 = (java.util.List) r7
            r15 = r2[r12]
            java.lang.Object r12 = r0.A(r1, r12, r15, r4)
            java.util.Map r12 = (java.util.Map) r12
            r15 = r2[r11]
            java.lang.Object r11 = r0.A(r1, r11, r15, r4)
            java.util.List r11 = (java.util.List) r11
            com.sugarcube.decorate_engine.CombinablePlugRules$$serializer r15 = com.sugarcube.decorate_engine.CombinablePlugRules$$serializer.INSTANCE
            r19 = r3
            r3 = 11
            java.lang.Object r3 = r0.A(r1, r3, r15, r4)
            com.sugarcube.decorate_engine.CombinablePlugRules r3 = (com.sugarcube.decorate_engine.CombinablePlugRules) r3
            r18 = r3
            r15 = 12
            r3 = r2[r15]
            java.lang.Object r3 = r0.A(r1, r15, r3, r4)
            java.util.List r3 = (java.util.List) r3
            r17 = r3
            r15 = 13
            r3 = r2[r15]
            java.lang.Object r3 = r0.A(r1, r15, r3, r4)
            java.util.List r3 = (java.util.List) r3
            r16 = r3
            r15 = 14
            r3 = r2[r15]
            java.lang.Object r3 = r0.A(r1, r15, r3, r4)
            java.util.List r3 = (java.util.List) r3
            r15 = 15
            r2 = r2[r15]
            java.lang.Object r2 = r0.A(r1, r15, r2, r4)
            java.util.List r2 = (java.util.List) r2
            r4 = 65535(0xffff, float:9.1834E-41)
            r45 = r2
            r44 = r3
            r29 = r4
            r33 = r5
            r32 = r6
            r38 = r7
            r34 = r8
            r31 = r9
            r35 = r10
            r40 = r11
            r39 = r12
            r37 = r13
            r36 = r14
            r43 = r16
            r42 = r17
            r41 = r18
            r30 = r19
            goto L_0x0288
        L_0x00d1:
            r3 = 15
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r11 = r8
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r19 = r15
            r21 = r19
            r25 = r9
            r22 = r10
            r23 = r22
            r24 = r23
            r9 = r21
            r4 = r24
            r10 = r9
        L_0x00ed:
            if (r25 == 0) goto L_0x0260
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x0252;
                case 0: goto L_0x0241;
                case 1: goto L_0x0230;
                case 2: goto L_0x021f;
                case 3: goto L_0x020d;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01d1;
                case 6: goto L_0x01be;
                case 7: goto L_0x01aa;
                case 8: goto L_0x0197;
                case 9: goto L_0x0183;
                case 10: goto L_0x016f;
                case 11: goto L_0x0159;
                case 12: goto L_0x0145;
                case 13: goto L_0x0131;
                case 14: goto L_0x0117;
                case 15: goto L_0x00fc;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x00fc:
            r26 = r10
            r3 = 15
            r10 = r2[r3]
            r27 = r9
            r9 = r21
            java.lang.Object r9 = r0.A(r1, r3, r10, r9)
            r21 = r9
            java.util.List r21 = (java.util.List) r21
            r9 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r9
            r10 = r26
            r9 = r27
            goto L_0x00ed
        L_0x0117:
            r27 = r9
            r26 = r10
            r9 = r21
            r10 = 14
            r3 = r2[r10]
            java.lang.Object r3 = r0.A(r1, r10, r3, r11)
            r11 = r3
            java.util.List r11 = (java.util.List) r11
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
        L_0x012a:
            r10 = r26
            r9 = r27
        L_0x012e:
            r3 = 15
            goto L_0x00ed
        L_0x0131:
            r27 = r9
            r26 = r10
            r9 = r21
            r3 = 13
            r10 = r2[r3]
            java.lang.Object r10 = r0.A(r1, r3, r10, r12)
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            goto L_0x012a
        L_0x0145:
            r27 = r9
            r26 = r10
            r9 = r21
            r10 = 12
            r3 = r2[r10]
            java.lang.Object r3 = r0.A(r1, r10, r3, r7)
            r7 = r3
            java.util.List r7 = (java.util.List) r7
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            goto L_0x012a
        L_0x0159:
            r27 = r9
            r26 = r10
            r9 = r21
            r10 = 12
            com.sugarcube.decorate_engine.CombinablePlugRules$$serializer r3 = com.sugarcube.decorate_engine.CombinablePlugRules$$serializer.INSTANCE
            r10 = 11
            java.lang.Object r3 = r0.A(r1, r10, r3, r13)
            r13 = r3
            com.sugarcube.decorate_engine.CombinablePlugRules r13 = (com.sugarcube.decorate_engine.CombinablePlugRules) r13
            r4 = r4 | 2048(0x800, float:2.87E-42)
            goto L_0x012a
        L_0x016f:
            r27 = r9
            r26 = r10
            r9 = r21
            r3 = 10
            r10 = r2[r3]
            java.lang.Object r10 = r0.A(r1, r3, r10, r14)
            r14 = r10
            java.util.List r14 = (java.util.List) r14
            r4 = r4 | 1024(0x400, float:1.435E-42)
            goto L_0x012a
        L_0x0183:
            r27 = r9
            r26 = r10
            r9 = r21
            r10 = 9
            r3 = r2[r10]
            java.lang.Object r3 = r0.A(r1, r10, r3, r15)
            r15 = r3
            java.util.Map r15 = (java.util.Map) r15
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x012a
        L_0x0197:
            r27 = r9
            r26 = r10
            r9 = r21
            r3 = 8
            r10 = r2[r3]
            java.lang.Object r8 = r0.A(r1, r3, r10, r8)
            java.util.List r8 = (java.util.List) r8
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x012a
        L_0x01aa:
            r27 = r9
            r26 = r10
            r9 = r21
            r10 = 7
            r3 = r2[r10]
            java.lang.Object r3 = r0.A(r1, r10, r3, r5)
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x012a
        L_0x01be:
            r27 = r9
            r26 = r10
            r9 = r21
            r3 = 6
            r10 = r2[r3]
            java.lang.Object r6 = r0.A(r1, r3, r10, r6)
            java.util.List r6 = (java.util.List) r6
            r4 = r4 | 64
            goto L_0x012a
        L_0x01d1:
            r27 = r9
            r26 = r10
            r9 = r21
            r10 = 5
            r3 = r2[r10]
            r20 = r5
            r5 = r27
            java.lang.Object r3 = r0.A(r1, r10, r3, r5)
            java.util.List r3 = (java.util.List) r3
            r4 = r4 | 32
            r5 = r20
            r10 = r26
            r9 = r3
            goto L_0x012e
        L_0x01ed:
            r20 = r5
            r5 = r9
            r26 = r10
            r9 = r21
            r3 = 4
            r10 = r2[r3]
            r27 = r2
            r2 = r26
            java.lang.Object r2 = r0.A(r1, r3, r10, r2)
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            r4 = r4 | 16
        L_0x0204:
            r2 = r27
            r3 = 15
            r9 = r5
            r5 = r20
            goto L_0x00ed
        L_0x020d:
            r27 = r2
            r20 = r5
            r5 = r9
            r2 = r10
            r9 = r21
            r3 = 4
            r10 = 3
            int r22 = r0.j(r1, r10)
            r4 = r4 | 8
        L_0x021d:
            r10 = r2
            goto L_0x0204
        L_0x021f:
            r27 = r2
            r20 = r5
            r5 = r9
            r2 = r10
            r9 = r21
            r3 = 2
            r10 = 3
            int r23 = r0.j(r1, r3)
            r4 = r4 | 4
            goto L_0x021d
        L_0x0230:
            r27 = r2
            r20 = r5
            r5 = r9
            r2 = r10
            r9 = r21
            r3 = 1
            r10 = 3
            boolean r24 = r0.D(r1, r3)
            r4 = r4 | 2
            goto L_0x021d
        L_0x0241:
            r27 = r2
            r20 = r5
            r5 = r9
            r2 = r10
            r9 = r21
            r3 = 0
            r10 = 3
            java.lang.String r19 = r0.n(r1, r3)
            r4 = r4 | 1
            goto L_0x021d
        L_0x0252:
            r27 = r2
            r20 = r5
            r5 = r9
            r2 = r10
            r9 = r21
            r3 = 0
            r10 = 3
            r10 = r2
            r25 = r3
            goto L_0x0204
        L_0x0260:
            r20 = r5
            r5 = r9
            r2 = r10
            r9 = r21
            r34 = r2
            r29 = r4
            r35 = r5
            r36 = r6
            r42 = r7
            r38 = r8
            r45 = r9
            r44 = r11
            r43 = r12
            r41 = r13
            r40 = r14
            r39 = r15
            r30 = r19
            r37 = r20
            r33 = r22
            r32 = r23
            r31 = r24
        L_0x0288:
            r0.c(r1)
            com.sugarcube.decorate_engine.SceneLayoutAssetItem r0 = new com.sugarcube.decorate_engine.SceneLayoutAssetItem
            r28 = r0
            r46 = 0
            r28.<init>((int) r29, (java.lang.String) r30, (boolean) r31, (int) r32, (int) r33, (java.util.List) r34, (java.util.List) r35, (java.util.List) r36, (java.util.List) r37, (java.util.List) r38, (java.util.Map) r39, (java.util.List) r40, (com.sugarcube.decorate_engine.CombinablePlugRules) r41, (java.util.List) r42, (java.util.List) r43, (java.util.List) r44, (java.util.List) r45, (jK.T0) r46)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.SceneLayoutAssetItem$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.SceneLayoutAssetItem");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SceneLayoutAssetItem sceneLayoutAssetItem) {
        C17542s.j(encoder, "encoder");
        C17542s.j(sceneLayoutAssetItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        SceneLayoutAssetItem.write$Self$decorate_engine_release(sceneLayoutAssetItem, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
