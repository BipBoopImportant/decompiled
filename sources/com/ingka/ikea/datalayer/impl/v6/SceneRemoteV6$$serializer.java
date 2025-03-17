package com.ingka.ikea.datalayer.impl.v6;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/datalayer/impl/v6/SceneRemoteV6.$serializer", "LjK/N;", "Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class SceneRemoteV6$$serializer implements N<SceneRemoteV6> {
    public static final SceneRemoteV6$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SceneRemoteV6$$serializer sceneRemoteV6$$serializer = new SceneRemoteV6$$serializer();
        INSTANCE = sceneRemoteV6$$serializer;
        J0 j02 = new J0("com.ingka.ikea.datalayer.impl.v6.SceneRemoteV6", sceneRemoteV6$$serializer, 10);
        j02.p("id", false);
        j02.p("titlePH", false);
        j02.p("descriptionPH", false);
        j02.p("mediaPH", false);
        j02.p("titlePL", false);
        j02.p("descriptionPL", false);
        j02.p("productsPL", false);
        j02.p("productsPLId", false);
        j02.p("productCatPL", false);
        j02.p("quotes", false);
        descriptor = j02;
    }

    private SceneRemoteV6$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.ingka.ikea.core.remotemodel.ProductCatPLRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.datalayer.impl.v6.SceneRemoteV6 deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.datalayer.impl.v6.SceneRemoteV6.f95498k
            boolean r3 = r0.q()
            r4 = 7
            r5 = 5
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 9
            r10 = 6
            r11 = 3
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0084
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r13 = r0.A(r1, r13, r3, r14)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.A(r1, r12, r3, r14)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r8 = r0.A(r1, r8, r3, r14)
            java.lang.String r8 = (java.lang.String) r8
            r15 = r2[r11]
            java.lang.Object r11 = r0.A(r1, r11, r15, r14)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r7 = r0.A(r1, r7, r3, r14)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.A(r1, r5, r3, r14)
            java.lang.String r5 = (java.lang.String) r5
            r15 = r2[r10]
            java.lang.Object r10 = r0.A(r1, r10, r15, r14)
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r3 = r0.A(r1, r4, r3, r14)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer r4 = com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r6, r4, r14)
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote r4 = (com.ingka.ikea.core.remotemodel.ProductCatPLRemote) r4
            r2 = r2[r9]
            java.lang.Object r2 = r0.A(r1, r9, r2, r14)
            java.util.List r2 = (java.util.List) r2
            r6 = 1023(0x3ff, float:1.434E-42)
            r28 = r2
            r26 = r3
            r27 = r4
            r24 = r5
            r18 = r6
            r23 = r7
            r21 = r8
            r25 = r10
            r22 = r11
            r20 = r12
            r19 = r13
            goto L_0x0145
        L_0x0084:
            r16 = r12
            r3 = r13
            r4 = r14
            r5 = r4
            r7 = r5
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x0090:
            if (r16 == 0) goto L_0x012f
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x012b;
                case 0: goto L_0x011d;
                case 1: goto L_0x010f;
                case 2: goto L_0x0101;
                case 3: goto L_0x00f4;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00d9;
                case 6: goto L_0x00cd;
                case 7: goto L_0x00bd;
                case 8: goto L_0x00ac;
                case 9: goto L_0x009f;
                default: goto L_0x0099;
            }
        L_0x0099:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x009f:
            r6 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r6, r4)
            java.util.List r4 = (java.util.List) r4
            r3 = r3 | 512(0x200, float:7.175E-43)
            r6 = 8
            goto L_0x0090
        L_0x00ac:
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer r6 = com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer.INSTANCE
            r9 = 8
            java.lang.Object r6 = r0.A(r1, r9, r6, r10)
            r10 = r6
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote r10 = (com.ingka.ikea.core.remotemodel.ProductCatPLRemote) r10
            r3 = r3 | 256(0x100, float:3.59E-43)
            r6 = r9
        L_0x00ba:
            r9 = 9
            goto L_0x0090
        L_0x00bd:
            r9 = 8
            jK.Y0 r6 = jK.Y0.f144077a
            r9 = 7
            java.lang.Object r5 = r0.A(r1, r9, r6, r5)
            java.lang.String r5 = (java.lang.String) r5
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00ca:
            r6 = 8
            goto L_0x00ba
        L_0x00cd:
            r6 = 6
            r9 = r2[r6]
            java.lang.Object r7 = r0.A(r1, r6, r9, r7)
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 64
            goto L_0x00ca
        L_0x00d9:
            r6 = 6
            jK.Y0 r9 = jK.Y0.f144077a
            r6 = 5
            java.lang.Object r9 = r0.A(r1, r6, r9, r11)
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 32
            goto L_0x00ca
        L_0x00e7:
            r6 = 5
            jK.Y0 r9 = jK.Y0.f144077a
            r6 = 4
            java.lang.Object r8 = r0.A(r1, r6, r9, r8)
            java.lang.String r8 = (java.lang.String) r8
            r3 = r3 | 16
            goto L_0x00ca
        L_0x00f4:
            r9 = 3
            r6 = r2[r9]
            java.lang.Object r6 = r0.A(r1, r9, r6, r12)
            r12 = r6
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 8
            goto L_0x00ca
        L_0x0101:
            r9 = 3
            jK.Y0 r6 = jK.Y0.f144077a
            r9 = 2
            java.lang.Object r6 = r0.A(r1, r9, r6, r13)
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 4
            goto L_0x00ca
        L_0x010f:
            r9 = 2
            jK.Y0 r6 = jK.Y0.f144077a
            r9 = 1
            java.lang.Object r6 = r0.A(r1, r9, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 2
            goto L_0x00ca
        L_0x011d:
            r9 = 1
            jK.Y0 r6 = jK.Y0.f144077a
            r9 = 0
            java.lang.Object r6 = r0.A(r1, r9, r6, r14)
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 1
            goto L_0x00ca
        L_0x012b:
            r9 = 0
            r16 = r9
            goto L_0x00ca
        L_0x012f:
            r18 = r3
            r28 = r4
            r26 = r5
            r25 = r7
            r23 = r8
            r27 = r10
            r24 = r11
            r22 = r12
            r21 = r13
            r19 = r14
            r20 = r15
        L_0x0145:
            r0.c(r1)
            com.ingka.ikea.datalayer.impl.v6.SceneRemoteV6 r0 = new com.ingka.ikea.datalayer.impl.v6.SceneRemoteV6
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.datalayer.impl.v6.SceneRemoteV6$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.datalayer.impl.v6.SceneRemoteV6");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, SceneRemoteV6 sceneRemoteV6) {
        C17542s.j(encoder, "encoder");
        C17542s.j(sceneRemoteV6, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        SceneRemoteV6.c(sceneRemoteV6, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = SceneRemoteV6.f95498k;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(a10[3]), C17294a.u(y02), C17294a.u(y02), C17294a.u(a10[6]), C17294a.u(y02), C17294a.u(ProductCatPLRemote$$serializer.INSTANCE), C17294a.u(a10[9])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
