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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/SceneLayoutInstanceItem.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class SceneLayoutInstanceItem$$serializer implements N<SceneLayoutInstanceItem> {
    public static final SceneLayoutInstanceItem$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        SceneLayoutInstanceItem$$serializer sceneLayoutInstanceItem$$serializer = new SceneLayoutInstanceItem$$serializer();
        INSTANCE = sceneLayoutInstanceItem$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.SceneLayoutInstanceItem", sceneLayoutInstanceItem$$serializer, 13);
        j02.p("assetItemIndex", true);
        j02.p("instanceId", true);
        j02.p("relativeTransform", true);
        j02.p("parentInstanceId", true);
        j02.p("activeSocketSet", true);
        j02.p("pluggedSocket", true);
        j02.p("parentAttachmentSlot", true);
        j02.p("parentPath", true);
        j02.p("activeCombination", true);
        j02.p("isMirrored", true);
        j02.p("legacyScreenTransform", true);
        j02.p("legacyRelativePosition", true);
        j02.p("additionalContacts", true);
        descriptor = j02;
    }

    private SceneLayoutInstanceItem$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] access$get$childSerializers$cp = SceneLayoutInstanceItem.$childSerializers;
        X x10 = X.f144073a;
        ObjectInstanceIdSerializer objectInstanceIdSerializer = ObjectInstanceIdSerializer.INSTANCE;
        KSerializer<?> u10 = C17294a.u(Transform3D$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(objectInstanceIdSerializer);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{x10, objectInstanceIdSerializer, u10, u11, C17294a.u(y02), C17294a.u(y02), C17294a.u(x10), C17294a.u(access$get$childSerializers$cp[7]), C17294a.u(x10), C17294a.u(C17457i.f144111a), C17294a.u(ModelScreenTransformSerializer.INSTANCE), C17294a.u(access$get$childSerializers$cp[11]), C17294a.u(access$get$childSerializers$cp[12])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.sugarcube.decorate_engine.Transform3D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.sugarcube.decorate_engine.ObjectInstanceId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.sugarcube.decorate_engine.ModelScreenTransform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ff, code lost:
        r4 = r21;
        r12 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01d9, code lost:
        r4 = r21;
        r12 = r2;
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.SceneLayoutInstanceItem deserialize(kotlinx.serialization.encoding.Decoder r39) {
        /*
            r38 = this;
            r0 = r39
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r38.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.SceneLayoutInstanceItem.$childSerializers
            boolean r3 = r0.q()
            r5 = 9
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r14 = 7
            r15 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x00ac
            int r3 = r0.j(r1, r12)
            com.sugarcube.decorate_engine.ObjectInstanceIdSerializer r12 = com.sugarcube.decorate_engine.ObjectInstanceIdSerializer.INSTANCE
            java.lang.Object r15 = r0.o(r1, r15, r12, r13)
            com.sugarcube.decorate_engine.ObjectInstanceId r15 = (com.sugarcube.decorate_engine.ObjectInstanceId) r15
            com.sugarcube.decorate_engine.Transform3D$$serializer r4 = com.sugarcube.decorate_engine.Transform3D$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r11, r4, r13)
            com.sugarcube.decorate_engine.Transform3D r4 = (com.sugarcube.decorate_engine.Transform3D) r4
            java.lang.Object r8 = r0.A(r1, r8, r12, r13)
            com.sugarcube.decorate_engine.ObjectInstanceId r8 = (com.sugarcube.decorate_engine.ObjectInstanceId) r8
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r10, r11, r13)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r0.A(r1, r7, r11, r13)
            java.lang.String r7 = (java.lang.String) r7
            jK.X r11 = jK.X.f144073a
            java.lang.Object r6 = r0.A(r1, r6, r11, r13)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r12 = r2[r14]
            java.lang.Object r12 = r0.A(r1, r14, r12, r13)
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r0.A(r1, r9, r11, r13)
            java.lang.Integer r9 = (java.lang.Integer) r9
            jK.i r11 = jK.C17457i.f144111a
            java.lang.Object r5 = r0.A(r1, r5, r11, r13)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            com.sugarcube.decorate_engine.ModelScreenTransformSerializer r11 = com.sugarcube.decorate_engine.ModelScreenTransformSerializer.INSTANCE
            r14 = 10
            java.lang.Object r11 = r0.A(r1, r14, r11, r13)
            com.sugarcube.decorate_engine.ModelScreenTransform r11 = (com.sugarcube.decorate_engine.ModelScreenTransform) r11
            r16 = r3
            r14 = 11
            r3 = r2[r14]
            java.lang.Object r3 = r0.A(r1, r14, r3, r13)
            java.util.List r3 = (java.util.List) r3
            r14 = 12
            r2 = r2[r14]
            java.lang.Object r2 = r0.A(r1, r14, r2, r13)
            java.util.List r2 = (java.util.List) r2
            r13 = 8191(0x1fff, float:1.1478E-41)
            r36 = r2
            r35 = r3
            r26 = r4
            r33 = r5
            r30 = r6
            r29 = r7
            r27 = r8
            r32 = r9
            r28 = r10
            r34 = r11
            r31 = r12
            r23 = r13
            r25 = r15
            r24 = r16
            goto L_0x021d
        L_0x00ac:
            r3 = 12
            r4 = r12
            r5 = r13
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r14 = r11
            r18 = r14
            r19 = r18
            r20 = r15
            r12 = r19
            r15 = r12
            r13 = r4
        L_0x00c1:
            if (r20 == 0) goto L_0x01fc
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x01f0;
                case 0: goto L_0x01e2;
                case 1: goto L_0x01c3;
                case 2: goto L_0x01ae;
                case 3: goto L_0x0199;
                case 4: goto L_0x0184;
                case 5: goto L_0x016f;
                case 6: goto L_0x015b;
                case 7: goto L_0x0148;
                case 8: goto L_0x0132;
                case 9: goto L_0x011c;
                case 10: goto L_0x0106;
                case 11: goto L_0x00e9;
                case 12: goto L_0x00d0;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x00d0:
            r21 = r4
            r3 = 12
            r4 = r2[r3]
            r22 = r12
            r12 = r19
            java.lang.Object r4 = r0.A(r1, r3, r4, r12)
            r19 = r4
            java.util.List r19 = (java.util.List) r19
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            r4 = r21
            r12 = r22
            goto L_0x00c1
        L_0x00e9:
            r21 = r4
            r22 = r12
            r12 = r19
            r4 = 11
            r3 = r2[r4]
            r12 = r18
            java.lang.Object r3 = r0.A(r1, r4, r3, r12)
            r18 = r3
            java.util.List r18 = (java.util.List) r18
            r13 = r13 | 2048(0x800, float:2.87E-42)
        L_0x00ff:
            r4 = r21
            r12 = r22
            r3 = 12
            goto L_0x00c1
        L_0x0106:
            r21 = r4
            r22 = r12
            r12 = r18
            r4 = 11
            com.sugarcube.decorate_engine.ModelScreenTransformSerializer r3 = com.sugarcube.decorate_engine.ModelScreenTransformSerializer.INSTANCE
            r4 = 10
            java.lang.Object r3 = r0.A(r1, r4, r3, r5)
            r5 = r3
            com.sugarcube.decorate_engine.ModelScreenTransform r5 = (com.sugarcube.decorate_engine.ModelScreenTransform) r5
            r13 = r13 | 1024(0x400, float:1.435E-42)
            goto L_0x00ff
        L_0x011c:
            r21 = r4
            r22 = r12
            r12 = r18
            r4 = 10
            jK.i r3 = jK.C17457i.f144111a
            r4 = 9
            java.lang.Object r3 = r0.A(r1, r4, r3, r9)
            r9 = r3
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r13 = r13 | 512(0x200, float:7.175E-43)
            goto L_0x00ff
        L_0x0132:
            r21 = r4
            r22 = r12
            r12 = r18
            r4 = 9
            jK.X r3 = jK.X.f144073a
            r4 = 8
            java.lang.Object r3 = r0.A(r1, r4, r3, r14)
            r14 = r3
            java.lang.Integer r14 = (java.lang.Integer) r14
            r13 = r13 | 256(0x100, float:3.59E-43)
            goto L_0x00ff
        L_0x0148:
            r21 = r4
            r22 = r12
            r12 = r18
            r3 = 7
            r4 = r2[r3]
            java.lang.Object r4 = r0.A(r1, r3, r4, r6)
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            r13 = r13 | 128(0x80, float:1.794E-43)
            goto L_0x00ff
        L_0x015b:
            r21 = r4
            r22 = r12
            r12 = r18
            r3 = 7
            jK.X r4 = jK.X.f144073a
            r3 = 6
            java.lang.Object r4 = r0.A(r1, r3, r4, r7)
            r7 = r4
            java.lang.Integer r7 = (java.lang.Integer) r7
            r13 = r13 | 64
            goto L_0x00ff
        L_0x016f:
            r21 = r4
            r22 = r12
            r12 = r18
            r3 = 6
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 5
            java.lang.Object r4 = r0.A(r1, r3, r4, r10)
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            r13 = r13 | 32
            goto L_0x00ff
        L_0x0184:
            r21 = r4
            r22 = r12
            r12 = r18
            r3 = 5
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 4
            java.lang.Object r4 = r0.A(r1, r3, r4, r8)
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r13 = r13 | 16
            goto L_0x00ff
        L_0x0199:
            r21 = r4
            r22 = r12
            r12 = r18
            r3 = 4
            com.sugarcube.decorate_engine.ObjectInstanceIdSerializer r4 = com.sugarcube.decorate_engine.ObjectInstanceIdSerializer.INSTANCE
            r3 = 3
            java.lang.Object r4 = r0.A(r1, r3, r4, r11)
            r11 = r4
            com.sugarcube.decorate_engine.ObjectInstanceId r11 = (com.sugarcube.decorate_engine.ObjectInstanceId) r11
            r13 = r13 | 8
            goto L_0x00ff
        L_0x01ae:
            r21 = r4
            r22 = r12
            r12 = r18
            r3 = 3
            com.sugarcube.decorate_engine.Transform3D$$serializer r4 = com.sugarcube.decorate_engine.Transform3D$$serializer.INSTANCE
            r3 = 2
            java.lang.Object r4 = r0.A(r1, r3, r4, r15)
            r15 = r4
            com.sugarcube.decorate_engine.Transform3D r15 = (com.sugarcube.decorate_engine.Transform3D) r15
            r13 = r13 | 4
            goto L_0x00ff
        L_0x01c3:
            r21 = r4
            r22 = r12
            r12 = r18
            r3 = 2
            com.sugarcube.decorate_engine.ObjectInstanceIdSerializer r4 = com.sugarcube.decorate_engine.ObjectInstanceIdSerializer.INSTANCE
            r17 = r2
            r2 = r22
            r3 = 1
            java.lang.Object r2 = r0.o(r1, r3, r4, r2)
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = (com.sugarcube.decorate_engine.ObjectInstanceId) r2
            r13 = r13 | 2
        L_0x01d9:
            r4 = r21
            r3 = 12
            r12 = r2
            r2 = r17
            goto L_0x00c1
        L_0x01e2:
            r17 = r2
            r2 = r12
            r12 = r18
            r3 = 1
            r4 = 0
            int r21 = r0.j(r1, r4)
            r13 = r13 | 1
            goto L_0x01d9
        L_0x01f0:
            r17 = r2
            r21 = r4
            r2 = r12
            r12 = r18
            r3 = 1
            r4 = 0
            r20 = r4
            goto L_0x01d9
        L_0x01fc:
            r21 = r4
            r2 = r12
            r12 = r18
            r25 = r2
            r34 = r5
            r31 = r6
            r30 = r7
            r28 = r8
            r33 = r9
            r29 = r10
            r27 = r11
            r35 = r12
            r23 = r13
            r32 = r14
            r26 = r15
            r36 = r19
            r24 = r21
        L_0x021d:
            r0.c(r1)
            com.sugarcube.decorate_engine.SceneLayoutInstanceItem r0 = new com.sugarcube.decorate_engine.SceneLayoutInstanceItem
            r37 = 0
            r22 = r0
            r22.<init>((int) r23, (int) r24, (com.sugarcube.decorate_engine.ObjectInstanceId) r25, (com.sugarcube.decorate_engine.Transform3D) r26, (com.sugarcube.decorate_engine.ObjectInstanceId) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.Integer) r30, (java.util.List) r31, (java.lang.Integer) r32, (java.lang.Boolean) r33, (com.sugarcube.decorate_engine.ModelScreenTransform) r34, (java.util.List) r35, (java.util.List) r36, (jK.T0) r37)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.SceneLayoutInstanceItem$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.SceneLayoutInstanceItem");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SceneLayoutInstanceItem sceneLayoutInstanceItem) {
        C17542s.j(encoder, "encoder");
        C17542s.j(sceneLayoutInstanceItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        SceneLayoutInstanceItem.write$Self$decorate_engine_release(sceneLayoutInstanceItem, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
