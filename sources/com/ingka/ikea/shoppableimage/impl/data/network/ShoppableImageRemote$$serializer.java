package com.ingka.ikea.shoppableimage.impl.data.network;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ShoppableImageRemote$$serializer implements N<ShoppableImageRemote> {
    public static final ShoppableImageRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f120265a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ShoppableImageRemote$$serializer shoppableImageRemote$$serializer = new ShoppableImageRemote$$serializer();
        INSTANCE = shoppableImageRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote", shoppableImageRemote$$serializer, 9);
        j02.p("imageType", false);
        j02.p("url", false);
        j02.p("altText", false);
        j02.p("id", false);
        j02.p("source", false);
        j02.p("aspectRatio", false);
        j02.p("title", false);
        j02.p("description", false);
        j02.p("products", false);
        descriptor = j02;
    }

    private ShoppableImageRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote deserialize(kotlinx.serialization.encoding.Decoder r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote.f120255k
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 4
            r9 = 2
            r10 = 8
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = r0.n(r1, r12)
            java.lang.String r11 = r0.n(r1, r11)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r7 = r0.n(r1, r7)
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer r12 = com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r12, r13)
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote r8 = (com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote) r8
            jK.C r12 = jK.C17438C.f144010a
            java.lang.Object r6 = r0.A(r1, r6, r12, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            jK.Y0 r12 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r12, r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.A(r1, r4, r12, r13)
            java.lang.String r4 = (java.lang.String) r4
            r2 = r2[r10]
            java.lang.Object r2 = r0.A(r1, r10, r2, r13)
            java.util.List r2 = (java.util.List) r2
            r10 = 511(0x1ff, float:7.16E-43)
            r31 = r2
            r23 = r3
            r30 = r4
            r29 = r5
            r28 = r6
            r26 = r7
            r27 = r8
            r25 = r9
            r22 = r10
            r24 = r11
            goto L_0x011f
        L_0x0070:
            r20 = r11
            r3 = r12
            r7 = r13
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
            r16 = r15
        L_0x007c:
            if (r20 == 0) goto L_0x010b
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x0101;
                case 0: goto L_0x00f1;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00ce;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0098;
                case 8: goto L_0x008b;
                default: goto L_0x0085;
            }
        L_0x0085:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x008b:
            r6 = r2[r10]
            java.lang.Object r6 = r0.A(r1, r10, r6, r8)
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x0096:
            r6 = 5
            goto L_0x007c
        L_0x0098:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r4, r6, r7)
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x0096
        L_0x00a4:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r5, r6, r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 64
            goto L_0x0096
        L_0x00b0:
            jK.C r6 = jK.C17438C.f144010a
            r4 = 5
            java.lang.Object r6 = r0.A(r1, r4, r6, r11)
            r11 = r6
            java.lang.Double r11 = (java.lang.Double) r11
            r3 = r3 | 32
            r6 = r4
            r4 = 7
            goto L_0x007c
        L_0x00bf:
            r4 = 5
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer r6 = com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer.INSTANCE
            r4 = 4
            java.lang.Object r6 = r0.A(r1, r4, r6, r12)
            r12 = r6
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote r12 = (com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote) r12
            r3 = r3 | 16
        L_0x00cc:
            r4 = 7
            goto L_0x0096
        L_0x00ce:
            r4 = 4
            r6 = 3
            java.lang.String r16 = r0.n(r1, r6)
            r3 = r3 | 8
            goto L_0x00cc
        L_0x00d7:
            r4 = 4
            r6 = 3
            r15 = 2
            java.lang.String r18 = r0.n(r1, r15)
            r3 = r3 | 4
            r15 = r18
            goto L_0x00cc
        L_0x00e3:
            r4 = 4
            r6 = 3
            r14 = 1
            r17 = 2
            java.lang.String r18 = r0.n(r1, r14)
            r3 = r3 | 2
            r14 = r18
            goto L_0x00cc
        L_0x00f1:
            r4 = 4
            r6 = 3
            r13 = 0
            r17 = 2
            r18 = 1
            java.lang.String r19 = r0.n(r1, r13)
            r3 = r3 | 1
            r13 = r19
            goto L_0x00cc
        L_0x0101:
            r6 = 3
            r17 = 2
            r18 = 1
            r19 = 0
            r20 = r19
            goto L_0x0096
        L_0x010b:
            r22 = r3
            r30 = r7
            r31 = r8
            r29 = r9
            r28 = r11
            r27 = r12
            r23 = r13
            r24 = r14
            r25 = r15
            r26 = r16
        L_0x011f:
            r0.c(r1)
            com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote r0 = new com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote
            r32 = 0
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ShoppableImageRemote shoppableImageRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shoppableImageRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ShoppableImageRemote.c(shoppableImageRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ShoppableImageRemote.f120255k;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, C17294a.u(ReferenceImageSourceRemote$$serializer.INSTANCE), C17294a.u(C17438C.f144010a), C17294a.u(y02), C17294a.u(y02), C17294a.u(a10[8])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
