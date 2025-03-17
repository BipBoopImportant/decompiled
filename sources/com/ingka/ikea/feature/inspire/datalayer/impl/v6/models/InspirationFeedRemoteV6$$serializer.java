package com.ingka.ikea.feature.inspire.datalayer.impl.v6.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6.$serializer", "LjK/N;", "Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class InspirationFeedRemoteV6$$serializer implements N<InspirationFeedRemoteV6> {
    public static final InspirationFeedRemoteV6$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        InspirationFeedRemoteV6$$serializer inspirationFeedRemoteV6$$serializer = new InspirationFeedRemoteV6$$serializer();
        INSTANCE = inspirationFeedRemoteV6$$serializer;
        J0 j02 = new J0("com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6", inspirationFeedRemoteV6$$serializer, 6);
        j02.p("inspiration", false);
        j02.p("facets", false);
        j02.p("requestId", false);
        j02.p("totalCount", false);
        j02.p("title", false);
        j02.p("prioritiser", false);
        descriptor = j02;
    }

    private InspirationFeedRemoteV6$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6 deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6.f95959g
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x005c
            r3 = r2[r9]
            java.lang.Object r3 = r0.A(r1, r9, r3, r10)
            java.util.List r3 = (java.util.List) r3
            r2 = r2[r8]
            java.lang.Object r2 = r0.A(r1, r8, r2, r10)
            java.util.List r2 = (java.util.List) r2
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r7, r8, r10)
            java.lang.String r7 = (java.lang.String) r7
            jK.X r9 = jK.X.f144073a
            java.lang.Object r5 = r0.A(r1, r5, r9, r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r6 = r0.A(r1, r6, r8, r10)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.A(r1, r4, r8, r10)
            java.lang.String r4 = (java.lang.String) r4
            r8 = 63
            r20 = r2
            r19 = r3
            r24 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r18 = r8
            goto L_0x00d0
        L_0x005c:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0064:
            if (r16 == 0) goto L_0x00c2
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00be;
                case 0: goto L_0x00b0;
                case 1: goto L_0x00a4;
                case 2: goto L_0x0098;
                case 3: goto L_0x008c;
                case 4: goto L_0x0080;
                case 5: goto L_0x0073;
                default: goto L_0x006d;
            }
        L_0x006d:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0073:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r4, r9, r15)
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 32
        L_0x007e:
            r9 = 0
            goto L_0x0064
        L_0x0080:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r6, r9, r14)
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 16
            goto L_0x007e
        L_0x008c:
            jK.X r9 = jK.X.f144073a
            java.lang.Object r9 = r0.A(r1, r5, r9, r13)
            r13 = r9
            java.lang.Integer r13 = (java.lang.Integer) r13
            r3 = r3 | 8
            goto L_0x007e
        L_0x0098:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r7, r9, r12)
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 4
            goto L_0x007e
        L_0x00a4:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r11)
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 2
            goto L_0x007e
        L_0x00b0:
            r9 = 0
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r10)
            r10 = r4
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 1
            r4 = 5
            goto L_0x0064
        L_0x00be:
            r9 = 0
            r16 = r9
            goto L_0x0064
        L_0x00c2:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00d0:
            r0.c(r1)
            com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6 r0 = new com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, InspirationFeedRemoteV6 inspirationFeedRemoteV6) {
        C17542s.j(encoder, "encoder");
        C17542s.j(inspirationFeedRemoteV6, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        InspirationFeedRemoteV6.d(inspirationFeedRemoteV6, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = InspirationFeedRemoteV6.f95959g;
        KSerializer<?> u10 = C17294a.u(a10[0]);
        KSerializer<?> u11 = C17294a.u(a10[1]);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, u11, C17294a.u(y02), C17294a.u(X.f144073a), C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
