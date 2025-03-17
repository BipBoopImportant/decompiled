package com.ingka.ikea.messagecenter.impl.data.endpoint;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/messagecenter/impl/data/endpoint/WhatsNewMessage.$serializer", "LjK/N;", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/WhatsNewMessage;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/messagecenter/impl/data/endpoint/WhatsNewMessage;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/messagecenter/impl/data/endpoint/WhatsNewMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class WhatsNewMessage$$serializer implements N<WhatsNewMessage> {
    public static final WhatsNewMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WhatsNewMessage$$serializer whatsNewMessage$$serializer = new WhatsNewMessage$$serializer();
        INSTANCE = whatsNewMessage$$serializer;
        J0 j02 = new J0("com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage", whatsNewMessage$$serializer, 7);
        j02.p("id", false);
        j02.p("title", false);
        j02.p("text", false);
        j02.p("context", false);
        j02.p("image", false);
        j02.p("video", false);
        j02.p("previewImage", false);
        descriptor = j02;
    }

    private WhatsNewMessage$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.messagecenter.impl.data.endpoint.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.messagecenter.impl.data.endpoint.Video} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.ingka.ikea.messagecenter.impl.data.endpoint.Image} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0059
            java.lang.String r2 = r0.n(r1, r9)
            java.lang.String r8 = r0.n(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext$$serializer r9 = com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r9, r10)
            com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext r5 = (com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext) r5
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image$$serializer r9 = com.ingka.ikea.messagecenter.impl.data.endpoint.Image$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r9, r10)
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r6 = (com.ingka.ikea.messagecenter.impl.data.endpoint.Image) r6
            com.ingka.ikea.messagecenter.impl.data.endpoint.Video$$serializer r11 = com.ingka.ikea.messagecenter.impl.data.endpoint.Video$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r11, r10)
            com.ingka.ikea.messagecenter.impl.data.endpoint.Video r4 = (com.ingka.ikea.messagecenter.impl.data.endpoint.Video) r4
            java.lang.Object r3 = r0.A(r1, r3, r9, r10)
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r3 = (com.ingka.ikea.messagecenter.impl.data.endpoint.Image) r3
            r9 = 127(0x7f, float:1.78E-43)
            r19 = r2
            r25 = r3
            r24 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r20 = r8
            r18 = r9
            goto L_0x00cf
        L_0x0059:
            r16 = r8
            r2 = r9
            r9 = r10
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0062:
            if (r16 == 0) goto L_0x00bf
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00bc;
                case 0: goto L_0x00b1;
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0096;
                case 4: goto L_0x008a;
                case 5: goto L_0x007e;
                case 6: goto L_0x0071;
                default: goto L_0x006b;
            }
        L_0x006b:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x0071:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image$$serializer r8 = com.ingka.ikea.messagecenter.impl.data.endpoint.Image$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r3, r8, r9)
            r9 = r8
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r9 = (com.ingka.ikea.messagecenter.impl.data.endpoint.Image) r9
            r2 = r2 | 64
        L_0x007c:
            r8 = 1
            goto L_0x0062
        L_0x007e:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Video$$serializer r8 = com.ingka.ikea.messagecenter.impl.data.endpoint.Video$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r4, r8, r15)
            r15 = r8
            com.ingka.ikea.messagecenter.impl.data.endpoint.Video r15 = (com.ingka.ikea.messagecenter.impl.data.endpoint.Video) r15
            r2 = r2 | 32
            goto L_0x007c
        L_0x008a:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image$$serializer r8 = com.ingka.ikea.messagecenter.impl.data.endpoint.Image$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r6, r8, r14)
            r14 = r8
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r14 = (com.ingka.ikea.messagecenter.impl.data.endpoint.Image) r14
            r2 = r2 | 16
            goto L_0x007c
        L_0x0096:
            com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext$$serializer r8 = com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext r13 = (com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext) r13
            r2 = r2 | 8
            goto L_0x007c
        L_0x00a2:
            java.lang.String r12 = r0.n(r1, r7)
            r2 = r2 | 4
            goto L_0x007c
        L_0x00a9:
            r8 = 1
            java.lang.String r11 = r0.n(r1, r8)
            r2 = r2 | 2
            goto L_0x0062
        L_0x00b1:
            r8 = 1
            r10 = 0
            java.lang.String r17 = r0.n(r1, r10)
            r2 = r2 | 1
            r10 = r17
            goto L_0x0062
        L_0x00bc:
            r16 = 0
            goto L_0x007c
        L_0x00bf:
            r18 = r2
            r25 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00cf:
            r0.c(r1)
            com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage r0 = new com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, WhatsNewMessage whatsNewMessage) {
        C17542s.j(encoder, "encoder");
        C17542s.j(whatsNewMessage, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        WhatsNewMessage.h(whatsNewMessage, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(WhatsNewContext$$serializer.INSTANCE);
        Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
        KSerializer<?> u11 = C17294a.u(image$$serializer);
        KSerializer<?> u12 = C17294a.u(Video$$serializer.INSTANCE);
        KSerializer<?> u13 = C17294a.u(image$$serializer);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, u10, u11, u12, u13};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
