package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import com.ingka.ikea.core.remotemodel.LinkRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6.$serializer", "LjK/N;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class HeaderRemoteV6$$serializer implements N<HeaderRemoteV6> {
    public static final HeaderRemoteV6$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HeaderRemoteV6$$serializer headerRemoteV6$$serializer = new HeaderRemoteV6$$serializer();
        INSTANCE = headerRemoteV6$$serializer;
        J0 j02 = new J0("com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6", headerRemoteV6$$serializer, 8);
        j02.p("id", false);
        j02.p("image", false);
        j02.p("title", false);
        j02.p("body", false);
        j02.p("validity", false);
        j02.p("link", false);
        j02.p("disclaimer", false);
        j02.p("prioritiser", false);
        descriptor = j02;
    }

    private HeaderRemoteV6$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.core.remotemodel.ImageRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.core.remotemodel.LinkRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ba, code lost:
        r6 = r3;
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
        r3 = 7;
        r4 = 6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6 deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = r0.n(r1, r10)
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r10 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r9, r10, r11)
            com.ingka.ikea.core.remotemodel.ImageRemote r9 = (com.ingka.ikea.core.remotemodel.ImageRemote) r9
            java.lang.String r8 = r0.n(r1, r8)
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r6, r10, r11)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.A(r1, r7, r10, r11)
            java.lang.String r7 = (java.lang.String) r7
            com.ingka.ikea.core.remotemodel.LinkRemote$$serializer r12 = com.ingka.ikea.core.remotemodel.LinkRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r12, r11)
            com.ingka.ikea.core.remotemodel.LinkRemote r5 = (com.ingka.ikea.core.remotemodel.LinkRemote) r5
            java.lang.Object r4 = r0.A(r1, r4, r10, r11)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A(r1, r3, r10, r11)
            java.lang.String r3 = (java.lang.String) r3
            r10 = 255(0xff, float:3.57E-43)
            r19 = r2
            r26 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r20 = r9
            r18 = r10
            goto L_0x00f8
        L_0x0064:
            r16 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006e:
            if (r16 == 0) goto L_0x00e6
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00e0;
                case 0: goto L_0x00d6;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a2;
                case 5: goto L_0x0096;
                case 6: goto L_0x008a;
                case 7: goto L_0x007d;
                default: goto L_0x0077;
            }
        L_0x0077:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x007d:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r3, r6, r8)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x0088:
            r6 = 3
            goto L_0x006e
        L_0x008a:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r4, r6, r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x0088
        L_0x0096:
            com.ingka.ikea.core.remotemodel.LinkRemote$$serializer r6 = com.ingka.ikea.core.remotemodel.LinkRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r5, r6, r10)
            r10 = r6
            com.ingka.ikea.core.remotemodel.LinkRemote r10 = (com.ingka.ikea.core.remotemodel.LinkRemote) r10
            r2 = r2 | 32
            goto L_0x0088
        L_0x00a2:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r7, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 16
            goto L_0x0088
        L_0x00ae:
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 3
            java.lang.Object r6 = r0.A(r1, r3, r6, r14)
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 8
        L_0x00ba:
            r6 = r3
            r3 = 7
            goto L_0x006e
        L_0x00bd:
            r3 = 3
            r6 = 2
            java.lang.String r13 = r0.n(r1, r6)
            r2 = r2 | 4
            goto L_0x00ba
        L_0x00c6:
            r6 = 2
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r3 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            r4 = 1
            java.lang.Object r3 = r0.A(r1, r4, r3, r12)
            r12 = r3
            com.ingka.ikea.core.remotemodel.ImageRemote r12 = (com.ingka.ikea.core.remotemodel.ImageRemote) r12
            r2 = r2 | 2
        L_0x00d3:
            r3 = 7
            r4 = 6
            goto L_0x0088
        L_0x00d6:
            r3 = 0
            r4 = 1
            r6 = 2
            java.lang.String r11 = r0.n(r1, r3)
            r2 = r2 | 1
            goto L_0x00d3
        L_0x00e0:
            r3 = 0
            r6 = 2
            r16 = r3
            r3 = 7
            goto L_0x0088
        L_0x00e6:
            r18 = r2
            r26 = r8
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00f8:
            r0.c(r1)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6 r0 = new com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, HeaderRemoteV6 headerRemoteV6) {
        C17542s.j(encoder, "encoder");
        C17542s.j(headerRemoteV6, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        HeaderRemoteV6.b(headerRemoteV6, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, C17294a.u(ImageRemote$$serializer.INSTANCE), y02, C17294a.u(y02), C17294a.u(y02), C17294a.u(LinkRemote$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
