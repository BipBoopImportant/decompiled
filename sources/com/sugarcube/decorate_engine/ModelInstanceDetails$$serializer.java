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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/ModelInstanceDetails.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/ModelInstanceDetails;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ModelInstanceDetails$$serializer implements N<ModelInstanceDetails> {
    public static final ModelInstanceDetails$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ModelInstanceDetails$$serializer modelInstanceDetails$$serializer = new ModelInstanceDetails$$serializer();
        INSTANCE = modelInstanceDetails$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.ModelInstanceDetails", modelInstanceDetails$$serializer, 9);
        j02.p("productId", false);
        j02.p("featureFlags", false);
        j02.p("parentId", false);
        j02.p("children", true);
        j02.p("selected", true);
        j02.p("activeSocketSet", true);
        j02.p("pluggedSocket", true);
        j02.p("socketCategory", true);
        j02.p("linkGroupName", true);
        descriptor = j02;
    }

    private ModelInstanceDetails$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = ModelInstanceDetails.$childSerializers[3];
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        X x10 = X.f144073a;
        return new KSerializer[]{x10, x10, ObjectInstanceIdSerializer.INSTANCE, kSerializer, C17457i.f144111a, u10, u11, u12, u13};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.sugarcube.decorate_engine.ObjectInstanceId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.ModelInstanceDetails deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r30.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.ModelInstanceDetails.$childSerializers
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 3
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0072
            int r3 = r0.j(r1, r12)
            int r11 = r0.j(r1, r11)
            com.sugarcube.decorate_engine.ObjectInstanceIdSerializer r12 = com.sugarcube.decorate_engine.ObjectInstanceIdSerializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r9, r12, r13)
            com.sugarcube.decorate_engine.ObjectInstanceId r9 = (com.sugarcube.decorate_engine.ObjectInstanceId) r9
            r2 = r2[r10]
            java.lang.Object r2 = r0.o(r1, r10, r2, r13)
            java.util.List r2 = (java.util.List) r2
            boolean r8 = r0.D(r1, r8)
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r6, r10, r13)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.A(r1, r5, r10, r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.A(r1, r4, r10, r13)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r0.A(r1, r7, r10, r13)
            java.lang.String r7 = (java.lang.String) r7
            r10 = 511(0x1ff, float:7.16E-43)
            r23 = r2
            r20 = r3
            r27 = r4
            r26 = r5
            r25 = r6
            r28 = r7
            r24 = r8
            r22 = r9
            r19 = r10
            r21 = r11
            goto L_0x0117
        L_0x0072:
            r17 = r11
            r3 = r12
            r14 = r3
            r15 = r14
            r6 = r13
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r15
        L_0x007e:
            if (r17 == 0) goto L_0x0103
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x00fd;
                case 0: goto L_0x00f1;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00da;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00a6;
                case 7: goto L_0x009a;
                case 8: goto L_0x008d;
                default: goto L_0x0087;
            }
        L_0x0087:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x008d:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r7, r5, r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r14 = r14 | 256(0x100, float:3.59E-43)
        L_0x0098:
            r5 = 6
            goto L_0x007e
        L_0x009a:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r4, r5, r8)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            r14 = r14 | 128(0x80, float:1.794E-43)
            goto L_0x0098
        L_0x00a6:
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 6
            java.lang.Object r5 = r0.A(r1, r4, r5, r10)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            r14 = r14 | 64
            r5 = r4
            r4 = 7
            goto L_0x007e
        L_0x00b5:
            r4 = 6
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 5
            java.lang.Object r5 = r0.A(r1, r4, r5, r9)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            r14 = r14 | 32
        L_0x00c2:
            r4 = 7
            goto L_0x0098
        L_0x00c4:
            r4 = 5
            r5 = 4
            boolean r13 = r0.D(r1, r5)
            r14 = r14 | 16
            goto L_0x00c2
        L_0x00cd:
            r4 = 3
            r5 = r2[r4]
            java.lang.Object r5 = r0.o(r1, r4, r5, r11)
            r11 = r5
            java.util.List r11 = (java.util.List) r11
            r14 = r14 | 8
            goto L_0x00c2
        L_0x00da:
            r4 = 3
            com.sugarcube.decorate_engine.ObjectInstanceIdSerializer r5 = com.sugarcube.decorate_engine.ObjectInstanceIdSerializer.INSTANCE
            r4 = 2
            java.lang.Object r5 = r0.o(r1, r4, r5, r12)
            r12 = r5
            com.sugarcube.decorate_engine.ObjectInstanceId r12 = (com.sugarcube.decorate_engine.ObjectInstanceId) r12
            r14 = r14 | 4
            goto L_0x00c2
        L_0x00e8:
            r4 = 2
            r5 = 1
            int r15 = r0.j(r1, r5)
            r14 = r14 | 2
            goto L_0x00c2
        L_0x00f1:
            r3 = 0
            r4 = 2
            r5 = 1
            int r16 = r0.j(r1, r3)
            r14 = r14 | 1
            r3 = r16
            goto L_0x00c2
        L_0x00fd:
            r5 = 1
            r16 = 0
            r17 = r16
            goto L_0x0098
        L_0x0103:
            r20 = r3
            r28 = r6
            r27 = r8
            r25 = r9
            r26 = r10
            r23 = r11
            r22 = r12
            r24 = r13
            r19 = r14
            r21 = r15
        L_0x0117:
            r0.c(r1)
            com.sugarcube.decorate_engine.ModelInstanceDetails r0 = new com.sugarcube.decorate_engine.ModelInstanceDetails
            r29 = 0
            r18 = r0
            r18.<init>((int) r19, (int) r20, (int) r21, (com.sugarcube.decorate_engine.ObjectInstanceId) r22, (java.util.List) r23, (boolean) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (jK.T0) r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ModelInstanceDetails$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.ModelInstanceDetails");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ModelInstanceDetails modelInstanceDetails) {
        C17542s.j(encoder, "encoder");
        C17542s.j(modelInstanceDetails, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ModelInstanceDetails.write$Self$decorate_engine_release(modelInstanceDetails, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
