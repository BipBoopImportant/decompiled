package com.sugarcube.decorate_engine;

import XH.C16814e;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/CameraParameters.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/CameraParameters;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/CameraParameters;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/CameraParameters;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class CameraParameters$$serializer implements N<CameraParameters> {
    public static final CameraParameters$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        CameraParameters$$serializer cameraParameters$$serializer = new CameraParameters$$serializer();
        INSTANCE = cameraParameters$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.CameraParameters", cameraParameters$$serializer, 7);
        j02.p("pos", true);
        j02.p("rotQuat", true);
        j02.p("aspect", true);
        j02.p("yfov", true);
        j02.p("near", true);
        j02.p("far", true);
        j02.p("cxyNormalized", true);
        descriptor = j02;
    }

    private CameraParameters$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = CameraParameters.$childSerializers;
        KSerializer<?> kSerializer = access$get$childSerializers$cp[0];
        KSerializer<?> kSerializer2 = access$get$childSerializers$cp[1];
        KSerializer<?> kSerializer3 = access$get$childSerializers$cp[6];
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{kSerializer, kSerializer2, c10, c10, c10, c10, kSerializer3};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.CameraParameters deserialize(kotlinx.serialization.encoding.Decoder r38) {
        /*
            r37 = this;
            r0 = r38
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r37.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.CameraParameters.$childSerializers
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x005d
            r3 = r2[r10]
            java.lang.Object r3 = r0.o(r1, r10, r3, r11)
            java.util.List r3 = (java.util.List) r3
            r10 = r2[r9]
            java.lang.Object r9 = r0.o(r1, r9, r10, r11)
            java.util.List r9 = (java.util.List) r9
            double r12 = r0.H(r1, r7)
            double r14 = r0.H(r1, r5)
            double r5 = r0.H(r1, r6)
            double r16 = r0.H(r1, r4)
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r4 = 127(0x7f, float:1.78E-43)
            r35 = r2
            r25 = r3
            r24 = r4
            r31 = r5
            r26 = r9
            r27 = r12
            r29 = r14
            r33 = r16
            goto L_0x00d0
        L_0x005d:
            r12 = 0
            r22 = r9
            r3 = r10
            r14 = r11
            r15 = r14
            r16 = r12
            r18 = r16
            r20 = r18
        L_0x006a:
            if (r22 == 0) goto L_0x00c0
            int r10 = r0.p(r1)
            switch(r10) {
                case -1: goto L_0x00bc;
                case 0: goto L_0x00ae;
                case 1: goto L_0x00a2;
                case 2: goto L_0x009b;
                case 3: goto L_0x0094;
                case 4: goto L_0x008d;
                case 5: goto L_0x0086;
                case 6: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            fK.E r0 = new fK.E
            r0.<init>((int) r10)
            throw r0
        L_0x0079:
            r10 = r2[r8]
            java.lang.Object r10 = r0.o(r1, r8, r10, r15)
            r15 = r10
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 64
        L_0x0084:
            r10 = 0
            goto L_0x006a
        L_0x0086:
            double r20 = r0.H(r1, r4)
            r3 = r3 | 32
            goto L_0x0084
        L_0x008d:
            double r12 = r0.H(r1, r6)
            r3 = r3 | 16
            goto L_0x0084
        L_0x0094:
            double r18 = r0.H(r1, r5)
            r3 = r3 | 8
            goto L_0x0084
        L_0x009b:
            double r16 = r0.H(r1, r7)
            r3 = r3 | 4
            goto L_0x0084
        L_0x00a2:
            r10 = r2[r9]
            java.lang.Object r10 = r0.o(r1, r9, r10, r14)
            r14 = r10
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 2
            goto L_0x0084
        L_0x00ae:
            r10 = 0
            r4 = r2[r10]
            java.lang.Object r4 = r0.o(r1, r10, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 1
            r4 = 5
            goto L_0x006a
        L_0x00bc:
            r10 = 0
            r22 = r10
            goto L_0x006a
        L_0x00c0:
            r24 = r3
            r25 = r11
            r31 = r12
            r26 = r14
            r35 = r15
            r27 = r16
            r29 = r18
            r33 = r20
        L_0x00d0:
            r0.c(r1)
            com.sugarcube.decorate_engine.CameraParameters r0 = new com.sugarcube.decorate_engine.CameraParameters
            r36 = 0
            r23 = r0
            r23.<init>((int) r24, (java.util.List) r25, (java.util.List) r26, (double) r27, (double) r29, (double) r31, (double) r33, (java.util.List) r35, (jK.T0) r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.CameraParameters$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.CameraParameters");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CameraParameters cameraParameters) {
        C17542s.j(encoder, "encoder");
        C17542s.j(cameraParameters, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        CameraParameters.write$Self$decorate_engine_release(cameraParameters, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
