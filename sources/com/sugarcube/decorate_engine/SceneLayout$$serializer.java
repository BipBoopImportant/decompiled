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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/SceneLayout.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/SceneLayout;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/SceneLayout;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/SceneLayout;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class SceneLayout$$serializer implements N<SceneLayout> {
    public static final SceneLayout$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        SceneLayout$$serializer sceneLayout$$serializer = new SceneLayout$$serializer();
        INSTANCE = sceneLayout$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.SceneLayout", sceneLayout$$serializer, 9);
        j02.p("version", true);
        j02.p("isAdditive", true);
        j02.p("thumbnails", true);
        j02.p("assetItems", true);
        j02.p("instanceItems", true);
        j02.p("erasedIds", true);
        j02.p("roomPaint", true);
        j02.p("camera", true);
        j02.p("gltfPath", true);
        descriptor = j02;
    }

    private SceneLayout$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = SceneLayout.$childSerializers;
        return new KSerializer[]{X.f144073a, C17457i.f144111a, access$get$childSerializers$cp[2], access$get$childSerializers$cp[3], access$get$childSerializers$cp[4], C17294a.u(access$get$childSerializers$cp[5]), C17294a.u(access$get$childSerializers$cp[6]), C17294a.u(CameraParameters$$serializer.INSTANCE), C17294a.u(Y0.f144077a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.sugarcube.decorate_engine.CameraParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00cb, code lost:
        r4 = 7;
        r5 = 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.SceneLayout deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r30.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.SceneLayout.$childSerializers
            boolean r3 = r0.q()
            r4 = 7
            r5 = 8
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 4
            r10 = 2
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x007c
            int r3 = r0.j(r1, r12)
            boolean r11 = r0.D(r1, r11)
            r12 = r2[r10]
            java.lang.Object r10 = r0.o(r1, r10, r12, r13)
            java.util.List r10 = (java.util.List) r10
            r12 = r2[r8]
            java.lang.Object r8 = r0.o(r1, r8, r12, r13)
            java.util.List r8 = (java.util.List) r8
            r12 = r2[r9]
            java.lang.Object r9 = r0.o(r1, r9, r12, r13)
            java.util.List r9 = (java.util.List) r9
            r12 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r12, r13)
            java.util.List r7 = (java.util.List) r7
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r13)
            java.util.Map r2 = (java.util.Map) r2
            com.sugarcube.decorate_engine.CameraParameters$$serializer r6 = com.sugarcube.decorate_engine.CameraParameters$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r6, r13)
            com.sugarcube.decorate_engine.CameraParameters r4 = (com.sugarcube.decorate_engine.CameraParameters) r4
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r6, r13)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 511(0x1ff, float:7.16E-43)
            r26 = r2
            r20 = r3
            r27 = r4
            r28 = r5
            r19 = r6
            r25 = r7
            r23 = r8
            r24 = r9
            r22 = r10
            r21 = r11
            goto L_0x012c
        L_0x007c:
            r17 = r11
            r3 = r12
            r14 = r3
            r7 = r13
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r15 = r11
            r12 = r15
            r13 = r14
        L_0x0088:
            if (r17 == 0) goto L_0x0118
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x0110;
                case 0: goto L_0x0103;
                case 1: goto L_0x00f9;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00dd;
                case 4: goto L_0x00cf;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00a4;
                case 8: goto L_0x0097;
                default: goto L_0x0091;
            }
        L_0x0091:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0097:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r5, r6, r7)
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            r13 = r13 | 256(0x100, float:3.59E-43)
        L_0x00a2:
            r6 = 6
            goto L_0x0088
        L_0x00a4:
            com.sugarcube.decorate_engine.CameraParameters$$serializer r6 = com.sugarcube.decorate_engine.CameraParameters$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r4, r6, r9)
            r9 = r6
            com.sugarcube.decorate_engine.CameraParameters r9 = (com.sugarcube.decorate_engine.CameraParameters) r9
            r13 = r13 | 128(0x80, float:1.794E-43)
            goto L_0x00a2
        L_0x00b0:
            r6 = 6
            r4 = r2[r6]
            java.lang.Object r4 = r0.A(r1, r6, r4, r8)
            r8 = r4
            java.util.Map r8 = (java.util.Map) r8
            r13 = r13 | 64
            r4 = 7
            goto L_0x0088
        L_0x00be:
            r4 = 5
            r6 = 6
            r5 = r2[r4]
            java.lang.Object r5 = r0.A(r1, r4, r5, r10)
            r10 = r5
            java.util.List r10 = (java.util.List) r10
            r13 = r13 | 32
        L_0x00cb:
            r4 = 7
            r5 = 8
            goto L_0x0088
        L_0x00cf:
            r5 = 4
            r6 = 6
            r4 = r2[r5]
            java.lang.Object r4 = r0.o(r1, r5, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r13 = r13 | 16
            goto L_0x00cb
        L_0x00dd:
            r4 = 3
            r6 = 6
            r5 = r2[r4]
            java.lang.Object r5 = r0.o(r1, r4, r5, r12)
            r12 = r5
            java.util.List r12 = (java.util.List) r12
            r13 = r13 | 8
            goto L_0x00cb
        L_0x00eb:
            r5 = 2
            r6 = 6
            r4 = r2[r5]
            java.lang.Object r4 = r0.o(r1, r5, r4, r15)
            r15 = r4
            java.util.List r15 = (java.util.List) r15
            r13 = r13 | 4
            goto L_0x00cb
        L_0x00f9:
            r4 = 1
            r5 = 2
            r6 = 6
            boolean r14 = r0.D(r1, r4)
            r13 = r13 | 2
            goto L_0x00cb
        L_0x0103:
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 6
            int r16 = r0.j(r1, r3)
            r13 = r13 | 1
            r3 = r16
            goto L_0x00cb
        L_0x0110:
            r4 = 1
            r5 = 2
            r6 = 6
            r16 = 0
            r17 = r16
            goto L_0x00cb
        L_0x0118:
            r20 = r3
            r28 = r7
            r26 = r8
            r27 = r9
            r25 = r10
            r24 = r11
            r23 = r12
            r19 = r13
            r21 = r14
            r22 = r15
        L_0x012c:
            r0.c(r1)
            com.sugarcube.decorate_engine.SceneLayout r0 = new com.sugarcube.decorate_engine.SceneLayout
            r29 = 0
            r18 = r0
            r18.<init>((int) r19, (int) r20, (boolean) r21, (java.util.List) r22, (java.util.List) r23, (java.util.List) r24, (java.util.List) r25, (java.util.Map) r26, (com.sugarcube.decorate_engine.CameraParameters) r27, (java.lang.String) r28, (jK.T0) r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.SceneLayout$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.SceneLayout");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SceneLayout sceneLayout) {
        C17542s.j(encoder, "encoder");
        C17542s.j(sceneLayout, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        SceneLayout.write$Self$decorate_engine_release(sceneLayout, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
