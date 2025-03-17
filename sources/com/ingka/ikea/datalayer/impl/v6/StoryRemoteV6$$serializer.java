package com.ingka.ikea.datalayer.impl.v6;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.MediaRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/datalayer/impl/v6/StoryRemoteV6.$serializer", "LjK/N;", "Lcom/ingka/ikea/datalayer/impl/v6/StoryRemoteV6;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/datalayer/impl/v6/StoryRemoteV6;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/datalayer/impl/v6/StoryRemoteV6;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StoryRemoteV6$$serializer implements N<StoryRemoteV6> {
    public static final StoryRemoteV6$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoryRemoteV6$$serializer storyRemoteV6$$serializer = new StoryRemoteV6$$serializer();
        INSTANCE = storyRemoteV6$$serializer;
        J0 j02 = new J0("com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6", storyRemoteV6$$serializer, 8);
        j02.p("id", false);
        j02.p("title", false);
        j02.p("intro", false);
        j02.p("headlineMedia", false);
        j02.p("headBeats", false);
        j02.p("scenes", false);
        j02.p("summary", false);
        j02.p("publisherDiagnostics", false);
        descriptor = j02;
    }

    private StoryRemoteV6$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: com.ingka.ikea.core.remotemodel.MediaRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c7, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c8, code lost:
        r7 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6 deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6.f95509i
            boolean r3 = r0.q()
            r4 = 6
            r5 = 3
            r6 = 2
            r7 = 7
            r8 = 5
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0070
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r11 = r0.A(r1, r11, r3, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r3, r12)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r0.A(r1, r6, r3, r12)
            java.lang.String r6 = (java.lang.String) r6
            com.ingka.ikea.core.remotemodel.MediaRemote$$serializer r13 = com.ingka.ikea.core.remotemodel.MediaRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r13, r12)
            com.ingka.ikea.core.remotemodel.MediaRemote r5 = (com.ingka.ikea.core.remotemodel.MediaRemote) r5
            r13 = r2[r9]
            java.lang.Object r9 = r0.A(r1, r9, r13, r12)
            java.util.List r9 = (java.util.List) r9
            r13 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r13, r12)
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r3 = r0.A(r1, r4, r3, r12)
            java.lang.String r3 = (java.lang.String) r3
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r12)
            java.util.List r2 = (java.util.List) r2
            r4 = 255(0xff, float:3.57E-43)
            r26 = r2
            r25 = r3
            r18 = r4
            r22 = r5
            r21 = r6
            r24 = r8
            r23 = r9
            r20 = r10
            r19 = r11
            goto L_0x010e
        L_0x0070:
            r16 = r10
            r3 = r11
            r5 = r12
            r6 = r5
            r10 = r6
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007a:
            if (r16 == 0) goto L_0x00fc
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00f7;
                case 0: goto L_0x00e8;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0095;
                case 7: goto L_0x0089;
                default: goto L_0x0083;
            }
        L_0x0083:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0089:
            r9 = r2[r7]
            java.lang.Object r5 = r0.A(r1, r7, r9, r5)
            java.util.List r5 = (java.util.List) r5
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0093:
            r9 = 4
            goto L_0x007a
        L_0x0095:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r4, r9, r6)
            java.lang.String r6 = (java.lang.String) r6
            r3 = r3 | 64
            goto L_0x0093
        L_0x00a0:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r10)
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 32
            goto L_0x0093
        L_0x00ac:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            r4 = 6
            goto L_0x007a
        L_0x00ba:
            r9 = 4
            com.ingka.ikea.core.remotemodel.MediaRemote$$serializer r4 = com.ingka.ikea.core.remotemodel.MediaRemote$$serializer.INSTANCE
            r7 = 3
            java.lang.Object r4 = r0.A(r1, r7, r4, r15)
            r15 = r4
            com.ingka.ikea.core.remotemodel.MediaRemote r15 = (com.ingka.ikea.core.remotemodel.MediaRemote) r15
            r3 = r3 | 8
        L_0x00c7:
            r4 = 6
        L_0x00c8:
            r7 = 7
            goto L_0x007a
        L_0x00ca:
            r7 = 3
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r7 = 2
            java.lang.Object r4 = r0.A(r1, r7, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 4
            goto L_0x00c7
        L_0x00d9:
            r7 = 2
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r7 = 1
            java.lang.Object r4 = r0.A(r1, r7, r4, r13)
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 2
            goto L_0x00c7
        L_0x00e8:
            r7 = 1
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r7 = 0
            java.lang.Object r4 = r0.A(r1, r7, r4, r12)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1
            goto L_0x00c7
        L_0x00f7:
            r7 = 0
            r9 = 4
            r16 = r7
            goto L_0x00c8
        L_0x00fc:
            r18 = r3
            r26 = r5
            r25 = r6
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x010e:
            r0.c(r1)
            com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6 r0 = new com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StoryRemoteV6 storyRemoteV6) {
        C17542s.j(encoder, "encoder");
        C17542s.j(storyRemoteV6, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StoryRemoteV6.c(storyRemoteV6, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = StoryRemoteV6.f95509i;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(MediaRemote$$serializer.INSTANCE), C17294a.u(a10[4]), C17294a.u(a10[5]), C17294a.u(y02), C17294a.u(a10[7])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
