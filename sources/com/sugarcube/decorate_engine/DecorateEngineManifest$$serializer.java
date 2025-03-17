package com.sugarcube.decorate_engine;

import XH.C16814e;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/DecorateEngineManifest.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/DecorateEngineManifest;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class DecorateEngineManifest$$serializer implements N<DecorateEngineManifest> {
    public static final DecorateEngineManifest$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        DecorateEngineManifest$$serializer decorateEngineManifest$$serializer = new DecorateEngineManifest$$serializer();
        INSTANCE = decorateEngineManifest$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.DecorateEngineManifest", decorateEngineManifest$$serializer, 15);
        j02.p("version", true);
        j02.p("intrinsics", true);
        j02.p("pano", true);
        j02.p("depthOcclusion", true);
        j02.p("segmentation", true);
        j02.p("segmentationOld", true);
        j02.p("equirectangular", true);
        j02.p("roomPlanes", true);
        j02.p("inpaintPano", true);
        j02.p("inpaintDepthOcclusion", true);
        j02.p("inpaintSegmentation", true);
        j02.p("inpaintSegmentationOld", true);
        j02.p("lights", true);
        j02.p("stackingPolygons", true);
        j02.p("roomPolygons", true);
        descriptor = j02;
    }

    private DecorateEngineManifest$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = DecorateEngineManifest.$childSerializers;
        KSerializer<?> kSerializer = access$get$childSerializers$cp[7];
        KSerializer<?> kSerializer2 = access$get$childSerializers$cp[12];
        KSerializer<?> kSerializer3 = access$get$childSerializers$cp[13];
        KSerializer<?> kSerializer4 = access$get$childSerializers$cp[14];
        UriSerializer uriSerializer = UriSerializer.INSTANCE;
        return new KSerializer[]{X.f144073a, ManifestIntrinsics$$serializer.INSTANCE, uriSerializer, uriSerializer, uriSerializer, uriSerializer, uriSerializer, kSerializer, uriSerializer, uriSerializer, uriSerializer, uriSerializer, kSerializer2, kSerializer3, kSerializer4};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: com.sugarcube.decorate_engine.ManifestIntrinsics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0115, code lost:
        r4 = r26;
        r15 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0235, code lost:
        r2 = r20;
        r4 = r26;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.DecorateEngineManifest deserialize(kotlinx.serialization.encoding.Decoder r46) {
        /*
            r45 = this;
            r0 = r46
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r45.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.DecorateEngineManifest.$childSerializers
            boolean r3 = r0.q()
            r6 = 9
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 7
            r14 = 1
            r15 = 0
            r4 = 0
            if (r3 == 0) goto L_0x00be
            int r3 = r0.j(r1, r15)
            com.sugarcube.decorate_engine.ManifestIntrinsics$$serializer r15 = com.sugarcube.decorate_engine.ManifestIntrinsics$$serializer.INSTANCE
            java.lang.Object r14 = r0.o(r1, r14, r15, r4)
            com.sugarcube.decorate_engine.ManifestIntrinsics r14 = (com.sugarcube.decorate_engine.ManifestIntrinsics) r14
            com.sugarcube.decorate_engine.UriSerializer r15 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            java.lang.Object r12 = r0.o(r1, r12, r15, r4)
            android.net.Uri r12 = (android.net.Uri) r12
            java.lang.Object r9 = r0.o(r1, r9, r15, r4)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r11 = r0.o(r1, r11, r15, r4)
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.Object r8 = r0.o(r1, r8, r15, r4)
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r7 = r0.o(r1, r7, r15, r4)
            android.net.Uri r7 = (android.net.Uri) r7
            r5 = r2[r13]
            java.lang.Object r5 = r0.o(r1, r13, r5, r4)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r10 = r0.o(r1, r10, r15, r4)
            android.net.Uri r10 = (android.net.Uri) r10
            java.lang.Object r6 = r0.o(r1, r6, r15, r4)
            android.net.Uri r6 = (android.net.Uri) r6
            r13 = 10
            java.lang.Object r13 = r0.o(r1, r13, r15, r4)
            android.net.Uri r13 = (android.net.Uri) r13
            r19 = r3
            r3 = 11
            java.lang.Object r3 = r0.o(r1, r3, r15, r4)
            android.net.Uri r3 = (android.net.Uri) r3
            r17 = r3
            r15 = 12
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r4)
            java.util.List r3 = (java.util.List) r3
            r16 = r3
            r15 = 13
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r4)
            java.util.List r3 = (java.util.List) r3
            r15 = 14
            r2 = r2[r15]
            java.lang.Object r2 = r0.o(r1, r15, r2, r4)
            java.util.List r2 = (java.util.List) r2
            r4 = 32767(0x7fff, float:4.5916E-41)
            r43 = r2
            r42 = r3
            r28 = r4
            r36 = r5
            r38 = r6
            r35 = r7
            r34 = r8
            r32 = r9
            r37 = r10
            r33 = r11
            r31 = r12
            r39 = r13
            r30 = r14
            r41 = r16
            r40 = r17
            r29 = r19
            goto L_0x0289
        L_0x00be:
            r3 = 14
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r21 = r13
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r14
            r5 = r15
            r14 = r24
            r4 = r5
            r15 = r14
        L_0x00d7:
            if (r25 == 0) goto L_0x0262
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x024c;
                case 0: goto L_0x023b;
                case 1: goto L_0x021c;
                case 2: goto L_0x0206;
                case 3: goto L_0x01f0;
                case 4: goto L_0x01da;
                case 5: goto L_0x01c4;
                case 6: goto L_0x01ae;
                case 7: goto L_0x0199;
                case 8: goto L_0x0180;
                case 9: goto L_0x0168;
                case 10: goto L_0x0150;
                case 11: goto L_0x0133;
                case 12: goto L_0x011c;
                case 13: goto L_0x00ff;
                case 14: goto L_0x00e6;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x00e6:
            r26 = r4
            r3 = 14
            r4 = r2[r3]
            r27 = r15
            r15 = r24
            java.lang.Object r4 = r0.o(r1, r3, r4, r15)
            r24 = r4
            java.util.List r24 = (java.util.List) r24
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r4 = r26
            r15 = r27
            goto L_0x00d7
        L_0x00ff:
            r26 = r4
            r27 = r15
            r15 = r24
            r4 = 13
            r3 = r2[r4]
            r15 = r23
            java.lang.Object r3 = r0.o(r1, r4, r3, r15)
            r23 = r3
            java.util.List r23 = (java.util.List) r23
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
        L_0x0115:
            r4 = r26
            r15 = r27
        L_0x0119:
            r3 = 14
            goto L_0x00d7
        L_0x011c:
            r26 = r4
            r27 = r15
            r15 = r23
            r3 = 12
            r4 = r2[r3]
            r15 = r22
            java.lang.Object r4 = r0.o(r1, r3, r4, r15)
            r22 = r4
            java.util.List r22 = (java.util.List) r22
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            goto L_0x0115
        L_0x0133:
            r26 = r4
            r27 = r15
            r15 = r22
            r3 = 12
            com.sugarcube.decorate_engine.UriSerializer r4 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r18 = r15
            r3 = r21
            r15 = 11
            java.lang.Object r3 = r0.o(r1, r15, r4, r3)
            r21 = r3
            android.net.Uri r21 = (android.net.Uri) r21
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r22 = r18
            goto L_0x0115
        L_0x0150:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r15 = 11
            com.sugarcube.decorate_engine.UriSerializer r4 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r15 = 10
            java.lang.Object r4 = r0.o(r1, r15, r4, r6)
            r6 = r4
            android.net.Uri r6 = (android.net.Uri) r6
            r5 = r5 | 1024(0x400, float:1.435E-42)
            goto L_0x0115
        L_0x0168:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r15 = 10
            com.sugarcube.decorate_engine.UriSerializer r4 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r15 = 9
            java.lang.Object r4 = r0.o(r1, r15, r4, r10)
            r10 = r4
            android.net.Uri r10 = (android.net.Uri) r10
            r5 = r5 | 512(0x200, float:7.175E-43)
            goto L_0x0115
        L_0x0180:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r15 = 9
            com.sugarcube.decorate_engine.UriSerializer r4 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r15 = 8
            java.lang.Object r4 = r0.o(r1, r15, r4, r13)
            r13 = r4
            android.net.Uri r13 = (android.net.Uri) r13
            r5 = r5 | 256(0x100, float:3.59E-43)
            goto L_0x0115
        L_0x0199:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r4 = 7
            r15 = r2[r4]
            java.lang.Object r7 = r0.o(r1, r4, r15, r7)
            java.util.List r7 = (java.util.List) r7
            r5 = r5 | 128(0x80, float:1.794E-43)
            goto L_0x0115
        L_0x01ae:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r4 = 7
            com.sugarcube.decorate_engine.UriSerializer r15 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r4 = 6
            java.lang.Object r8 = r0.o(r1, r4, r15, r8)
            android.net.Uri r8 = (android.net.Uri) r8
            r5 = r5 | 64
            goto L_0x0115
        L_0x01c4:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r4 = 6
            com.sugarcube.decorate_engine.UriSerializer r15 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r4 = 5
            java.lang.Object r11 = r0.o(r1, r4, r15, r11)
            android.net.Uri r11 = (android.net.Uri) r11
            r5 = r5 | 32
            goto L_0x0115
        L_0x01da:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r4 = 5
            com.sugarcube.decorate_engine.UriSerializer r15 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r4 = 4
            java.lang.Object r9 = r0.o(r1, r4, r15, r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r5 = r5 | 16
            goto L_0x0115
        L_0x01f0:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r4 = 4
            com.sugarcube.decorate_engine.UriSerializer r15 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r4 = 3
            java.lang.Object r12 = r0.o(r1, r4, r15, r12)
            android.net.Uri r12 = (android.net.Uri) r12
            r5 = r5 | 8
            goto L_0x0115
        L_0x0206:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r4 = 3
            com.sugarcube.decorate_engine.UriSerializer r15 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            r4 = 2
            java.lang.Object r14 = r0.o(r1, r4, r15, r14)
            android.net.Uri r14 = (android.net.Uri) r14
            r5 = r5 | 4
            goto L_0x0115
        L_0x021c:
            r26 = r4
            r27 = r15
            r3 = r21
            r18 = r22
            r4 = 2
            com.sugarcube.decorate_engine.ManifestIntrinsics$$serializer r15 = com.sugarcube.decorate_engine.ManifestIntrinsics$$serializer.INSTANCE
            r20 = r2
            r2 = r27
            r4 = 1
            java.lang.Object r2 = r0.o(r1, r4, r15, r2)
            r15 = r2
            com.sugarcube.decorate_engine.ManifestIntrinsics r15 = (com.sugarcube.decorate_engine.ManifestIntrinsics) r15
            r5 = r5 | 2
        L_0x0235:
            r2 = r20
            r4 = r26
            goto L_0x0119
        L_0x023b:
            r20 = r2
            r2 = r15
            r3 = r21
            r18 = r22
            r4 = 1
            r15 = 0
            int r26 = r0.j(r1, r15)
            r5 = r5 | 1
            r15 = r2
            goto L_0x0235
        L_0x024c:
            r20 = r2
            r26 = r4
            r2 = r15
            r3 = r21
            r18 = r22
            r4 = 1
            r15 = 0
            r25 = r15
            r4 = r26
            r3 = 14
            r15 = r2
            r2 = r20
            goto L_0x00d7
        L_0x0262:
            r26 = r4
            r2 = r15
            r3 = r21
            r18 = r22
            r30 = r2
            r40 = r3
            r28 = r5
            r39 = r6
            r36 = r7
            r35 = r8
            r33 = r9
            r38 = r10
            r34 = r11
            r32 = r12
            r37 = r13
            r31 = r14
            r41 = r18
            r42 = r23
            r43 = r24
            r29 = r26
        L_0x0289:
            r0.c(r1)
            com.sugarcube.decorate_engine.DecorateEngineManifest r0 = new com.sugarcube.decorate_engine.DecorateEngineManifest
            r27 = r0
            r44 = 0
            r27.<init>((int) r28, (int) r29, (com.sugarcube.decorate_engine.ManifestIntrinsics) r30, (android.net.Uri) r31, (android.net.Uri) r32, (android.net.Uri) r33, (android.net.Uri) r34, (android.net.Uri) r35, (java.util.List) r36, (android.net.Uri) r37, (android.net.Uri) r38, (android.net.Uri) r39, (android.net.Uri) r40, (java.util.List) r41, (java.util.List) r42, (java.util.List) r43, (jK.T0) r44)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngineManifest$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.DecorateEngineManifest");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, DecorateEngineManifest decorateEngineManifest) {
        C17542s.j(encoder, "encoder");
        C17542s.j(decorateEngineManifest, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        DecorateEngineManifest.write$Self$decorate_engine_release(decorateEngineManifest, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
