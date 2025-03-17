package com.ingka.ikea.prepaidcarddata.impl.data.model.remote;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PrepaidCardRemote$$serializer implements N<PrepaidCardRemote> {
    public static final PrepaidCardRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PrepaidCardRemote$$serializer prepaidCardRemote$$serializer = new PrepaidCardRemote$$serializer();
        INSTANCE = prepaidCardRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote", prepaidCardRemote$$serializer, 9);
        j02.p("id", false);
        j02.p("prepaidCardNumber", false);
        j02.p("redemptionCode", false);
        j02.p("qrData", false);
        j02.p("state", false);
        j02.p("expiry", false);
        j02.p("type", false);
        j02.p("amount", false);
        j02.p("images", false);
        descriptor = j02;
    }

    private PrepaidCardRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Amount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Images} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote deserialize(kotlinx.serialization.encoding.Decoder r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r0.n(r1, r11)
            java.lang.String r10 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r8 = r0.n(r1, r8)
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r11, r12)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = r0.n(r1, r4)
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Amount$$serializer r11 = com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Amount$$serializer.INSTANCE
            java.lang.Object r3 = r0.o(r1, r3, r11, r12)
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Amount r3 = (com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote.Amount) r3
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Images$$serializer r11 = com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Images$$serializer.INSTANCE
            java.lang.Object r7 = r0.o(r1, r7, r11, r12)
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Images r7 = (com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote.Images) r7
            r11 = 511(0x1ff, float:7.16E-43)
            r23 = r2
            r30 = r3
            r29 = r4
            r28 = r5
            r26 = r6
            r31 = r7
            r27 = r8
            r25 = r9
            r24 = r10
            r22 = r11
            goto L_0x00ff
        L_0x0066:
            r20 = r10
            r2 = r11
            r9 = r12
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x0073:
            if (r20 == 0) goto L_0x00eb
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00e4;
                case 0: goto L_0x00d5;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00b5;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a2;
                case 6: goto L_0x009b;
                case 7: goto L_0x008f;
                case 8: goto L_0x0082;
                default: goto L_0x007c;
            }
        L_0x007c:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0082:
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Images$$serializer r6 = com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Images$$serializer.INSTANCE
            java.lang.Object r6 = r0.o(r1, r7, r6, r9)
            r9 = r6
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Images r9 = (com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote.Images) r9
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x008d:
            r6 = 3
            goto L_0x0073
        L_0x008f:
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Amount$$serializer r6 = com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Amount$$serializer.INSTANCE
            java.lang.Object r6 = r0.o(r1, r3, r6, r10)
            r10 = r6
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$Amount r10 = (com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote.Amount) r10
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x008d
        L_0x009b:
            java.lang.String r17 = r0.n(r1, r4)
            r2 = r2 | 64
            goto L_0x008d
        L_0x00a2:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r5, r6, r11)
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 32
            goto L_0x008d
        L_0x00ae:
            java.lang.String r16 = r0.n(r1, r8)
            r2 = r2 | 16
            goto L_0x008d
        L_0x00b5:
            r6 = 3
            java.lang.String r15 = r0.n(r1, r6)
            r2 = r2 | 8
            goto L_0x0073
        L_0x00bd:
            r6 = 3
            r14 = 2
            java.lang.String r19 = r0.n(r1, r14)
            r2 = r2 | 4
            r14 = r19
            goto L_0x0073
        L_0x00c8:
            r6 = 3
            r13 = 1
            r18 = 2
            java.lang.String r19 = r0.n(r1, r13)
            r2 = r2 | 2
            r13 = r19
            goto L_0x0073
        L_0x00d5:
            r6 = 3
            r12 = 0
            r18 = 2
            r19 = 1
            java.lang.String r21 = r0.n(r1, r12)
            r2 = r2 | 1
            r12 = r21
            goto L_0x0073
        L_0x00e4:
            r18 = 2
            r19 = 1
            r20 = 0
            goto L_0x008d
        L_0x00eb:
            r22 = r2
            r31 = r9
            r30 = r10
            r28 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            r26 = r15
            r27 = r16
            r29 = r17
        L_0x00ff:
            r0.c(r1)
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote r0 = new com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote
            r32 = 0
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PrepaidCardRemote prepaidCardRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(prepaidCardRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PrepaidCardRemote.j(prepaidCardRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, y02, C17294a.u(y02), y02, PrepaidCardRemote$Amount$$serializer.INSTANCE, PrepaidCardRemote$Images$$serializer.INSTANCE};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
