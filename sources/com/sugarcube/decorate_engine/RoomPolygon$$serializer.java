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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/RoomPolygon.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/RoomPolygon;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/RoomPolygon;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/RoomPolygon;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class RoomPolygon$$serializer implements N<RoomPolygon> {
    public static final RoomPolygon$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        RoomPolygon$$serializer roomPolygon$$serializer = new RoomPolygon$$serializer();
        INSTANCE = roomPolygon$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.RoomPolygon", roomPolygon$$serializer, 6);
        j02.p("id", false);
        j02.p("category", false);
        j02.p("transform", false);
        j02.p("vertices", false);
        j02.p("indices", false);
        j02.p("children", false);
        descriptor = j02;
    }

    private RoomPolygon$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = RoomPolygon.$childSerializers;
        return new KSerializer[]{X.f144073a, RoomPolygonTypeSerializer.INSTANCE, access$get$childSerializers$cp[2], access$get$childSerializers$cp[3], C17294a.u(access$get$childSerializers$cp[4]), C17294a.u(access$get$childSerializers$cp[5])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.sugarcube.decorate_engine.RoomPolygonType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.RoomPolygon deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r26.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate_engine.RoomPolygon.$childSerializers
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x005e
            int r3 = r0.j(r1, r9)
            com.sugarcube.decorate_engine.RoomPolygonTypeSerializer r9 = com.sugarcube.decorate_engine.RoomPolygonTypeSerializer.INSTANCE
            java.lang.Object r8 = r0.o(r1, r8, r9, r10)
            com.sugarcube.decorate_engine.RoomPolygonType r8 = (com.sugarcube.decorate_engine.RoomPolygonType) r8
            r9 = r2[r7]
            java.lang.Object r7 = r0.o(r1, r7, r9, r10)
            java.util.List r7 = (java.util.List) r7
            r9 = r2[r5]
            java.lang.Object r5 = r0.o(r1, r5, r9, r10)
            java.util.List r5 = (java.util.List) r5
            r9 = r2[r6]
            java.lang.Object r6 = r0.A(r1, r6, r9, r10)
            java.util.List r6 = (java.util.List) r6
            r2 = r2[r4]
            java.lang.Object r2 = r0.A(r1, r4, r2, r10)
            java.util.List r2 = (java.util.List) r2
            r4 = 63
            r24 = r2
            r19 = r3
            r18 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r20 = r8
            goto L_0x00cd
        L_0x005e:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r10 = r3
        L_0x0067:
            if (r16 == 0) goto L_0x00bf
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00bb;
                case 0: goto L_0x00b3;
                case 1: goto L_0x00a7;
                case 2: goto L_0x009b;
                case 3: goto L_0x008f;
                case 4: goto L_0x0083;
                case 5: goto L_0x0076;
                default: goto L_0x0070;
            }
        L_0x0070:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0076:
            r9 = r2[r4]
            java.lang.Object r9 = r0.A(r1, r4, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r10 = r10 | 32
        L_0x0081:
            r9 = 0
            goto L_0x0067
        L_0x0083:
            r9 = r2[r6]
            java.lang.Object r9 = r0.A(r1, r6, r9, r14)
            r14 = r9
            java.util.List r14 = (java.util.List) r14
            r10 = r10 | 16
            goto L_0x0081
        L_0x008f:
            r9 = r2[r5]
            java.lang.Object r9 = r0.o(r1, r5, r9, r13)
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            r10 = r10 | 8
            goto L_0x0081
        L_0x009b:
            r9 = r2[r7]
            java.lang.Object r9 = r0.o(r1, r7, r9, r12)
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            r10 = r10 | 4
            goto L_0x0081
        L_0x00a7:
            com.sugarcube.decorate_engine.RoomPolygonTypeSerializer r9 = com.sugarcube.decorate_engine.RoomPolygonTypeSerializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r8, r9, r11)
            r11 = r9
            com.sugarcube.decorate_engine.RoomPolygonType r11 = (com.sugarcube.decorate_engine.RoomPolygonType) r11
            r10 = r10 | 2
            goto L_0x0081
        L_0x00b3:
            r9 = 0
            int r3 = r0.j(r1, r9)
            r10 = r10 | 1
            goto L_0x0067
        L_0x00bb:
            r9 = 0
            r16 = r9
            goto L_0x0067
        L_0x00bf:
            r19 = r3
            r18 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00cd:
            r0.c(r1)
            com.sugarcube.decorate_engine.RoomPolygon r0 = new com.sugarcube.decorate_engine.RoomPolygon
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.RoomPolygon$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate_engine.RoomPolygon");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, RoomPolygon roomPolygon) {
        C17542s.j(encoder, "encoder");
        C17542s.j(roomPolygon, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        RoomPolygon.write$Self$decorate_engine_release(roomPolygon, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
