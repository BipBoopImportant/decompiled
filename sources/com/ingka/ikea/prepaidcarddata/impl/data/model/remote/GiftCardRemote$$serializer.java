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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class GiftCardRemote$$serializer implements N<GiftCardRemote> {
    public static final GiftCardRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GiftCardRemote$$serializer giftCardRemote$$serializer = new GiftCardRemote$$serializer();
        INSTANCE = giftCardRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardRemote", giftCardRemote$$serializer, 5);
        j02.p("cardNumber", false);
        j02.p("amount", false);
        j02.p("currencyCode", false);
        j02.p("expiryDate", false);
        j02.p("expiryStatus", false);
        descriptor = j02;
    }

    private GiftCardRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardRemote deserialize(kotlinx.serialization.encoding.Decoder r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r0.n(r1, r7)
            double r6 = r0.H(r1, r6)
            java.lang.String r5 = r0.n(r1, r5)
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r3 = r0.A(r1, r3, r9, r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.A(r1, r4, r9, r8)
            java.lang.String r4 = (java.lang.String) r4
            r8 = 31
            r17 = r2
            r21 = r3
            r22 = r4
            r20 = r5
            r18 = r6
            r16 = r8
            goto L_0x00a2
        L_0x0043:
            r9 = 0
            r14 = r6
            r2 = r8
            r11 = r2
            r12 = r11
            r13 = r12
            r8 = r7
        L_0x004b:
            if (r14 == 0) goto L_0x0096
            int r15 = r0.p(r1)
            r7 = -1
            if (r15 == r7) goto L_0x0093
            if (r15 == 0) goto L_0x008b
            if (r15 == r6) goto L_0x0084
            if (r15 == r5) goto L_0x007d
            if (r15 == r3) goto L_0x0071
            if (r15 != r4) goto L_0x006b
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r4, r7, r13)
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13
            r8 = r8 | 16
        L_0x0069:
            r7 = 0
            goto L_0x004b
        L_0x006b:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0071:
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r3, r7, r12)
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12
            r8 = r8 | 8
            goto L_0x0069
        L_0x007d:
            java.lang.String r11 = r0.n(r1, r5)
            r8 = r8 | 4
            goto L_0x0069
        L_0x0084:
            double r9 = r0.H(r1, r6)
            r8 = r8 | 2
            goto L_0x0069
        L_0x008b:
            r7 = 0
            java.lang.String r2 = r0.n(r1, r7)
            r8 = r8 | 1
            goto L_0x004b
        L_0x0093:
            r7 = 0
            r14 = r7
            goto L_0x004b
        L_0x0096:
            r17 = r2
            r16 = r8
            r18 = r9
            r20 = r11
            r21 = r12
            r22 = r13
        L_0x00a2:
            r0.c(r1)
            com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardRemote r0 = new com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardRemote
            r23 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, GiftCardRemote giftCardRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(giftCardRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        GiftCardRemote.write$Self$prepaidcarddata_implementation_release(giftCardRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, C17438C.f144010a, y02, C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
