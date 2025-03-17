package com.sugarcube.decorate_engine;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/ManifestLight.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/ManifestLight;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/ManifestLight;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/ManifestLight;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ManifestLight$$serializer implements N<ManifestLight> {
    public static final ManifestLight$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ManifestLight$$serializer manifestLight$$serializer = new ManifestLight$$serializer();
        INSTANCE = manifestLight$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.ManifestLight", manifestLight$$serializer, 7);
        j02.p("id", true);
        j02.p("color", true);
        j02.p("intensity", true);
        j02.p("size", true);
        j02.p("position", true);
        j02.p("volume", true);
        j02.p("direction", true);
        descriptor = j02;
    }

    private ManifestLight$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = ManifestLight.$childSerializers;
        KSerializer<?> kSerializer = access$get$childSerializers$cp[1];
        KSerializer<?> kSerializer2 = access$get$childSerializers$cp[4];
        KSerializer<?> kSerializer3 = access$get$childSerializers$cp[5];
        KSerializer<?> u10 = C17294a.u(access$get$childSerializers$cp[6]);
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{X.f144073a, kSerializer, c10, c10, kSerializer2, kSerializer3, u10};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.ManifestLight deserialize(kotlinx.serialization.encoding.Decoder r32) {
        /*
            r31 = this;
            r0 = r32
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r31.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.ManifestLight.$childSerializers
            boolean r3 = r0.q()
            r4 = 3
            r5 = 2
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0061
            int r3 = r0.j(r1, r10)
            r10 = r2[r9]
            java.lang.Object r9 = r0.o(r1, r9, r10, r11)
            java.util.List r9 = (java.util.List) r9
            double r12 = r0.H(r1, r5)
            double r4 = r0.H(r1, r4)
            r10 = r2[r8]
            java.lang.Object r8 = r0.o(r1, r8, r10, r11)
            java.util.List r8 = (java.util.List) r8
            r10 = r2[r7]
            java.lang.Object r7 = r0.o(r1, r7, r10, r11)
            java.util.List r7 = (java.util.List) r7
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r6 = 127(0x7f, float:1.78E-43)
            r29 = r2
            r21 = r3
            r25 = r4
            r20 = r6
            r28 = r7
            r27 = r8
            r22 = r9
            r23 = r12
            goto L_0x00dc
        L_0x0061:
            r12 = 0
            r18 = r9
            r3 = r10
            r9 = r11
            r14 = r9
            r15 = r14
            r16 = r12
            r10 = r15
            r11 = r3
        L_0x006d:
            if (r18 == 0) goto L_0x00cc
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x00c7;
                case 0: goto L_0x00be;
                case 1: goto L_0x00b0;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a1;
                case 4: goto L_0x0095;
                case 5: goto L_0x0089;
                case 6: goto L_0x007c;
                default: goto L_0x0076;
            }
        L_0x0076:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x007c:
            r5 = r2[r6]
            java.lang.Object r5 = r0.A(r1, r6, r5, r9)
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            r11 = r11 | 64
        L_0x0087:
            r5 = 2
            goto L_0x006d
        L_0x0089:
            r5 = r2[r7]
            java.lang.Object r5 = r0.o(r1, r7, r5, r10)
            r10 = r5
            java.util.List r10 = (java.util.List) r10
            r11 = r11 | 32
            goto L_0x0087
        L_0x0095:
            r5 = r2[r8]
            java.lang.Object r5 = r0.o(r1, r8, r5, r15)
            r15 = r5
            java.util.List r15 = (java.util.List) r15
            r11 = r11 | 16
            goto L_0x0087
        L_0x00a1:
            double r12 = r0.H(r1, r4)
            r11 = r11 | 8
            goto L_0x0087
        L_0x00a8:
            r5 = 2
            double r16 = r0.H(r1, r5)
            r11 = r11 | 4
            goto L_0x006d
        L_0x00b0:
            r4 = 1
            r5 = r2[r4]
            java.lang.Object r5 = r0.o(r1, r4, r5, r14)
            r14 = r5
            java.util.List r14 = (java.util.List) r14
            r11 = r11 | 2
        L_0x00bc:
            r4 = 3
            goto L_0x0087
        L_0x00be:
            r4 = 1
            r5 = 0
            int r3 = r0.j(r1, r5)
            r11 = r11 | 1
            goto L_0x00bc
        L_0x00c7:
            r4 = 1
            r5 = 0
            r18 = r5
            goto L_0x00bc
        L_0x00cc:
            r21 = r3
            r29 = r9
            r28 = r10
            r20 = r11
            r25 = r12
            r22 = r14
            r27 = r15
            r23 = r16
        L_0x00dc:
            r0.c(r1)
            com.sugarcube.decorate_engine.ManifestLight r0 = new com.sugarcube.decorate_engine.ManifestLight
            r30 = 0
            r19 = r0
            r19.<init>((int) r20, (int) r21, (java.util.List) r22, (double) r23, (double) r25, (java.util.List) r27, (java.util.List) r28, (java.util.List) r29, (jK.T0) r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ManifestLight$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.ManifestLight");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ManifestLight manifestLight) {
        C17542s.j(encoder, "encoder");
        C17542s.j(manifestLight, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ManifestLight.write$Self$decorate_engine_release(manifestLight, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
