package com.sugarcube.decorate_engine;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/StackingPolygon.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/StackingPolygon;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/StackingPolygon;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/StackingPolygon;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class StackingPolygon$$serializer implements N<StackingPolygon> {
    public static final StackingPolygon$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        StackingPolygon$$serializer stackingPolygon$$serializer = new StackingPolygon$$serializer();
        INSTANCE = stackingPolygon$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.StackingPolygon", stackingPolygon$$serializer, 5);
        j02.p("id", true);
        j02.p("erasableId", true);
        j02.p("transform", false);
        j02.p("vertices", false);
        j02.p("indices", true);
        descriptor = j02;
    }

    private StackingPolygon$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = StackingPolygon.$childSerializers;
        X x10 = X.f144073a;
        return new KSerializer[]{C17294a.u(x10), C17294a.u(x10), access$get$childSerializers$cp[2], access$get$childSerializers$cp[3], C17294a.u(access$get$childSerializers$cp[4])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.StackingPolygon deserialize(kotlinx.serialization.encoding.Decoder r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r24.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.StackingPolygon.$childSerializers
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0055
            jK.X r3 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r8, r3, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r3 = r0.A(r1, r7, r3, r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r7 = r2[r6]
            java.lang.Object r6 = r0.o(r1, r6, r7, r9)
            java.util.List r6 = (java.util.List) r6
            r7 = r2[r4]
            java.lang.Object r4 = r0.o(r1, r4, r7, r9)
            java.util.List r4 = (java.util.List) r4
            r2 = r2[r5]
            java.lang.Object r2 = r0.A(r1, r5, r2, r9)
            java.util.List r2 = (java.util.List) r2
            r5 = 31
            r22 = r2
            r19 = r3
            r21 = r4
            r17 = r5
            r20 = r6
            r18 = r8
            goto L_0x00c3
        L_0x0055:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x005b:
            if (r14 == 0) goto L_0x00b7
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00b3
            if (r15 == 0) goto L_0x00a5
            if (r15 == r7) goto L_0x0099
            if (r15 == r6) goto L_0x008d
            if (r15 == r4) goto L_0x0081
            if (r15 != r5) goto L_0x007b
            r8 = r2[r5]
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 16
        L_0x0079:
            r8 = 0
            goto L_0x005b
        L_0x007b:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0081:
            r8 = r2[r4]
            java.lang.Object r8 = r0.o(r1, r4, r8, r12)
            r12 = r8
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 8
            goto L_0x0079
        L_0x008d:
            r8 = r2[r6]
            java.lang.Object r8 = r0.o(r1, r6, r8, r11)
            r11 = r8
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 4
            goto L_0x0079
        L_0x0099:
            jK.X r8 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.Integer r10 = (java.lang.Integer) r10
            r3 = r3 | 2
            goto L_0x0079
        L_0x00a5:
            jK.X r8 = jK.X.f144073a
            r15 = 0
            java.lang.Object r8 = r0.A(r1, r15, r8, r9)
            r9 = r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            r3 = r3 | 1
            r8 = r15
            goto L_0x005b
        L_0x00b3:
            r15 = 0
            r8 = r15
            r14 = r8
            goto L_0x005b
        L_0x00b7:
            r17 = r3
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
        L_0x00c3:
            r0.c(r1)
            com.sugarcube.decorate_engine.StackingPolygon r0 = new com.sugarcube.decorate_engine.StackingPolygon
            r23 = 0
            r16 = r0
            r16.<init>((int) r17, (java.lang.Integer) r18, (java.lang.Integer) r19, (java.util.List) r20, (java.util.List) r21, (java.util.List) r22, (jK.T0) r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.StackingPolygon$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.StackingPolygon");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, StackingPolygon stackingPolygon) {
        C17542s.j(encoder, "encoder");
        C17542s.j(stackingPolygon, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        StackingPolygon.write$Self$decorate_engine_release(stackingPolygon, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
