package com.ingka.ikea.browseandsearch.browse.datalayer.model;

import XH.C16814e;
import com.ingka.ikea.core.model.Image$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost.$serializer", "LjK/N;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class CommunicationPost$$serializer implements N<CommunicationPost> {
    public static final CommunicationPost$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommunicationPost$$serializer communicationPost$$serializer = new CommunicationPost$$serializer();
        INSTANCE = communicationPost$$serializer;
        J0 j02 = new J0("com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost", communicationPost$$serializer, 7);
        j02.p("id", false);
        j02.p("title", false);
        j02.p("image", false);
        j02.p("description", false);
        j02.p("link", false);
        j02.p("type", false);
        j02.p("url", true);
        descriptor = j02;
    }

    private CommunicationPost$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.core.model.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.core.model.Link} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost.f93375h
            boolean r3 = r0.q()
            r4 = 6
            r5 = 3
            r6 = 2
            r7 = 5
            r8 = 4
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x005b
            java.lang.String r3 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            com.ingka.ikea.core.model.Image$$serializer r10 = com.ingka.ikea.core.model.Image$$serializer.INSTANCE
            java.lang.Object r6 = r0.o(r1, r6, r10, r11)
            com.ingka.ikea.core.model.Image r6 = (com.ingka.ikea.core.model.Image) r6
            java.lang.String r5 = r0.n(r1, r5)
            r10 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r10, r11)
            com.ingka.ikea.core.model.Link r8 = (com.ingka.ikea.core.model.Link) r8
            r2 = r2[r7]
            java.lang.Object r2 = r0.o(r1, r7, r2, r11)
            com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost$b r2 = (com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost.b) r2
            java.lang.String r4 = r0.n(r1, r4)
            r7 = 127(0x7f, float:1.78E-43)
            r25 = r2
            r20 = r3
            r26 = r4
            r23 = r5
            r22 = r6
            r19 = r7
            r24 = r8
            r21 = r9
            goto L_0x00cd
        L_0x005b:
            r17 = r9
            r3 = r10
            r10 = r11
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x0065:
            if (r17 == 0) goto L_0x00bd
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00ba;
                case 0: goto L_0x00af;
                case 1: goto L_0x00a7;
                case 2: goto L_0x009b;
                case 3: goto L_0x0094;
                case 4: goto L_0x0088;
                case 5: goto L_0x007c;
                case 6: goto L_0x0074;
                default: goto L_0x006e;
            }
        L_0x006e:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0074:
            java.lang.String r16 = r0.n(r1, r4)
            r3 = r3 | 64
        L_0x007a:
            r9 = 1
            goto L_0x0065
        L_0x007c:
            r9 = r2[r7]
            java.lang.Object r9 = r0.o(r1, r7, r9, r10)
            r10 = r9
            com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost$b r10 = (com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost.b) r10
            r3 = r3 | 32
            goto L_0x007a
        L_0x0088:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r15)
            r15 = r9
            com.ingka.ikea.core.model.Link r15 = (com.ingka.ikea.core.model.Link) r15
            r3 = r3 | 16
            goto L_0x007a
        L_0x0094:
            java.lang.String r14 = r0.n(r1, r5)
            r3 = r3 | 8
            goto L_0x007a
        L_0x009b:
            com.ingka.ikea.core.model.Image$$serializer r9 = com.ingka.ikea.core.model.Image$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r6, r9, r13)
            r13 = r9
            com.ingka.ikea.core.model.Image r13 = (com.ingka.ikea.core.model.Image) r13
            r3 = r3 | 4
            goto L_0x007a
        L_0x00a7:
            r9 = 1
            java.lang.String r12 = r0.n(r1, r9)
            r3 = r3 | 2
            goto L_0x0065
        L_0x00af:
            r9 = 1
            r11 = 0
            java.lang.String r18 = r0.n(r1, r11)
            r3 = r3 | 1
            r11 = r18
            goto L_0x0065
        L_0x00ba:
            r17 = 0
            goto L_0x007a
        L_0x00bd:
            r19 = r3
            r25 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
            r26 = r16
        L_0x00cd:
            r0.c(r1)
            com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost r0 = new com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost
            r27 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, CommunicationPost communicationPost) {
        C17542s.j(encoder, "encoder");
        C17542s.j(communicationPost, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        CommunicationPost.b(communicationPost, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = CommunicationPost.f93375h;
        KSerializer<?> u10 = C17294a.u(a10[4]);
        KSerializer<?> kSerializer = a10[5];
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, Image$$serializer.INSTANCE, y02, u10, kSerializer, y02};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
