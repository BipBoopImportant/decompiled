package com.ingka.ikea.prepaidcarddata.impl.data.model.remote;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class RefundCardRemote$$serializer implements N<RefundCardRemote> {
    public static final RefundCardRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RefundCardRemote$$serializer refundCardRemote$$serializer = new RefundCardRemote$$serializer();
        INSTANCE = refundCardRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardRemote", refundCardRemote$$serializer, 8);
        j02.p("original", false);
        j02.p("current", false);
        j02.p("reserved", false);
        j02.p("currency", false);
        j02.p("balance", false);
        j02.p("expiry", false);
        j02.p("cardType", false);
        j02.p("cardId", false);
        descriptor = j02;
    }

    private RefundCardRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardRemote deserialize(kotlinx.serialization.encoding.Decoder r39) {
        /*
            r38 = this;
            r0 = r39
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
            if (r2 == 0) goto L_0x0056
            double r12 = r0.H(r1, r10)
            double r9 = r0.H(r1, r9)
            double r14 = r0.H(r1, r8)
            java.lang.String r2 = r0.n(r1, r6)
            double r6 = r0.H(r1, r7)
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r8, r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = r0.n(r1, r4)
            java.lang.String r3 = r0.n(r1, r3)
            r8 = 255(0xff, float:3.57E-43)
            r31 = r2
            r36 = r3
            r35 = r4
            r34 = r5
            r32 = r6
            r24 = r8
            r27 = r9
            r25 = r12
            r29 = r14
            goto L_0x00cd
        L_0x0056:
            r12 = 0
            r22 = r9
            r2 = r10
            r10 = r11
            r16 = r10
            r17 = r16
            r14 = r12
            r18 = r14
            r20 = r18
        L_0x0065:
            if (r22 == 0) goto L_0x00bb
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00b6;
                case 0: goto L_0x00ac;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009d;
                case 3: goto L_0x0096;
                case 4: goto L_0x008f;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                case 7: goto L_0x0074;
                default: goto L_0x006e;
            }
        L_0x006e:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0074:
            java.lang.String r11 = r0.n(r1, r3)
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x007a:
            r9 = 1
            goto L_0x0065
        L_0x007c:
            java.lang.String r17 = r0.n(r1, r4)
            r2 = r2 | 64
            goto L_0x007a
        L_0x0083:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r5, r9, r10)
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 32
            goto L_0x007a
        L_0x008f:
            double r12 = r0.H(r1, r7)
            r2 = r2 | 16
            goto L_0x007a
        L_0x0096:
            java.lang.String r16 = r0.n(r1, r6)
            r2 = r2 | 8
            goto L_0x007a
        L_0x009d:
            double r20 = r0.H(r1, r8)
            r2 = r2 | 4
            goto L_0x007a
        L_0x00a4:
            r9 = 1
            double r14 = r0.H(r1, r9)
            r2 = r2 | 2
            goto L_0x0065
        L_0x00ac:
            r3 = 0
            r9 = 1
            double r18 = r0.H(r1, r3)
            r2 = r2 | 1
        L_0x00b4:
            r3 = 7
            goto L_0x0065
        L_0x00b6:
            r3 = 0
            r9 = 1
            r22 = r3
            goto L_0x00b4
        L_0x00bb:
            r24 = r2
            r34 = r10
            r36 = r11
            r32 = r12
            r27 = r14
            r31 = r16
            r35 = r17
            r25 = r18
            r29 = r20
        L_0x00cd:
            r0.c(r1)
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardRemote r0 = new com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardRemote
            r37 = 0
            r23 = r0
            r23.<init>(r24, r25, r27, r29, r31, r32, r34, r35, r36, r37)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, RefundCardRemote refundCardRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(refundCardRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        RefundCardRemote.write$Self$prepaidcarddata_implementation_release(refundCardRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{c10, c10, c10, y02, c10, u10, y02, y02};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
