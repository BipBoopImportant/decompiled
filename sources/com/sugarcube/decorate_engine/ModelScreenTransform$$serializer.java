package com.sugarcube.decorate_engine;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.M;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/ModelScreenTransform.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ModelScreenTransform$$serializer implements N<ModelScreenTransform> {
    public static final ModelScreenTransform$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ModelScreenTransform$$serializer modelScreenTransform$$serializer = new ModelScreenTransform$$serializer();
        INSTANCE = modelScreenTransform$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.ModelScreenTransform", modelScreenTransform$$serializer, 9);
        j02.p("screenX", true);
        j02.p("screenY", true);
        j02.p("yawRadians", true);
        j02.p("isAbsolutePosition", true);
        j02.p("isAbsoluteYaw", true);
        j02.p("isPanoSpace", true);
        j02.p("isModelRolled90", true);
        j02.p("isModelMirrored", true);
        j02.p("applyPhysics", true);
        descriptor = j02;
    }

    private ModelScreenTransform$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        C17457i iVar = C17457i.f144111a;
        KSerializer<?> u10 = C17294a.u(iVar);
        KSerializer<?> u11 = C17294a.u(iVar);
        M m10 = M.f144051a;
        return new KSerializer[]{m10, m10, m10, iVar, iVar, iVar, u10, u11, iVar};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bc, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.ModelScreenTransform deserialize(kotlinx.serialization.encoding.Decoder r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r32.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0062
            float r2 = r0.v(r1, r11)
            float r10 = r0.v(r1, r10)
            float r9 = r0.v(r1, r9)
            boolean r6 = r0.D(r1, r6)
            boolean r8 = r0.D(r1, r8)
            boolean r5 = r0.D(r1, r5)
            jK.i r11 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r1, r4, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r3 = r0.A(r1, r3, r11, r12)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r7 = r0.D(r1, r7)
            r11 = 511(0x1ff, float:7.16E-43)
            r22 = r2
            r29 = r3
            r28 = r4
            r27 = r5
            r25 = r6
            r30 = r7
            r26 = r8
            r24 = r9
            r23 = r10
            r21 = r11
            goto L_0x00ee
        L_0x0062:
            r2 = 0
            r16 = r2
            r17 = r16
            r19 = r10
            r13 = r11
            r14 = r13
            r15 = r14
            r9 = r12
            r10 = r9
            r12 = r15
        L_0x006f:
            if (r19 == 0) goto L_0x00da
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00d3;
                case 0: goto L_0x00c7;
                case 1: goto L_0x00be;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00ac;
                case 4: goto L_0x00a5;
                case 5: goto L_0x009e;
                case 6: goto L_0x0092;
                case 7: goto L_0x0086;
                case 8: goto L_0x007e;
                default: goto L_0x0078;
            }
        L_0x0078:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x007e:
            boolean r14 = r0.D(r1, r7)
            r11 = r11 | 256(0x100, float:3.59E-43)
        L_0x0084:
            r6 = 3
            goto L_0x006f
        L_0x0086:
            jK.i r6 = jK.C17457i.f144111a
            java.lang.Object r6 = r0.A(r1, r3, r6, r9)
            r9 = r6
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r11 = r11 | 128(0x80, float:1.794E-43)
            goto L_0x0084
        L_0x0092:
            jK.i r6 = jK.C17457i.f144111a
            java.lang.Object r6 = r0.A(r1, r4, r6, r10)
            r10 = r6
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r11 = r11 | 64
            goto L_0x0084
        L_0x009e:
            boolean r12 = r0.D(r1, r5)
            r11 = r11 | 32
            goto L_0x0084
        L_0x00a5:
            boolean r15 = r0.D(r1, r8)
            r11 = r11 | 16
            goto L_0x0084
        L_0x00ac:
            r6 = 3
            boolean r13 = r0.D(r1, r6)
            r11 = r11 | 8
            goto L_0x006f
        L_0x00b4:
            r3 = 2
            r6 = 3
            float r16 = r0.v(r1, r3)
            r11 = r11 | 4
        L_0x00bc:
            r3 = 7
            goto L_0x006f
        L_0x00be:
            r3 = 1
            r6 = 3
            float r17 = r0.v(r1, r3)
            r11 = r11 | 2
            goto L_0x00bc
        L_0x00c7:
            r2 = 0
            r3 = 1
            r6 = 3
            float r18 = r0.v(r1, r2)
            r11 = r11 | 1
            r2 = r18
            goto L_0x00bc
        L_0x00d3:
            r3 = 1
            r6 = 3
            r18 = 0
            r19 = r18
            goto L_0x00bc
        L_0x00da:
            r22 = r2
            r29 = r9
            r28 = r10
            r21 = r11
            r27 = r12
            r25 = r13
            r30 = r14
            r26 = r15
            r24 = r16
            r23 = r17
        L_0x00ee:
            r0.c(r1)
            com.sugarcube.decorate_engine.ModelScreenTransform r0 = new com.sugarcube.decorate_engine.ModelScreenTransform
            r31 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ModelScreenTransform$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.ModelScreenTransform");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ModelScreenTransform modelScreenTransform) {
        C17542s.j(encoder, "encoder");
        C17542s.j(modelScreenTransform, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ModelScreenTransform.write$Self$decorate_engine_release(modelScreenTransform, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
