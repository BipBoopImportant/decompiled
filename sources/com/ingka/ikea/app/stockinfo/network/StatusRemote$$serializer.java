package com.ingka.ikea.app.stockinfo.network;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/stockinfo/network/StatusRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StatusRemote$$serializer implements N<StatusRemote> {
    public static final StatusRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StatusRemote$$serializer statusRemote$$serializer = new StatusRemote$$serializer();
        INSTANCE = statusRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.stockinfo.network.StatusRemote", statusRemote$$serializer, 5);
        j02.p("code", false);
        j02.p("htmlText", false);
        j02.p("label", false);
        j02.p("description", false);
        j02.p("timestamp", false);
        descriptor = j02;
    }

    private StatusRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.app.stockinfo.network.StatusRemote deserialize(kotlinx.serialization.encoding.Decoder r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.stockinfo.network.StatusRemote.f92612f
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0049
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r9)
            com.ingka.ikea.app.stockinfo.network.d r2 = (com.ingka.ikea.app.stockinfo.network.d) r2
            java.lang.String r3 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r4 = r0.n(r1, r4)
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r7, r9)
            java.lang.String r5 = (java.lang.String) r5
            r7 = 31
            r17 = r2
            r18 = r3
            r20 = r4
            r21 = r5
            r19 = r6
            r16 = r7
            goto L_0x00a5
        L_0x0049:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x004f:
            if (r14 == 0) goto L_0x0099
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x0096
            if (r15 == 0) goto L_0x008a
            if (r15 == r7) goto L_0x0083
            if (r15 == r6) goto L_0x007c
            if (r15 == r4) goto L_0x0075
            if (r15 != r5) goto L_0x006f
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 16
        L_0x006d:
            r8 = 0
            goto L_0x004f
        L_0x006f:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0075:
            java.lang.String r12 = r0.n(r1, r4)
            r3 = r3 | 8
            goto L_0x006d
        L_0x007c:
            java.lang.String r11 = r0.n(r1, r6)
            r3 = r3 | 4
            goto L_0x006d
        L_0x0083:
            java.lang.String r10 = r0.n(r1, r7)
            r3 = r3 | 2
            goto L_0x006d
        L_0x008a:
            r8 = 0
            r15 = r2[r8]
            java.lang.Object r9 = r0.o(r1, r8, r15, r9)
            com.ingka.ikea.app.stockinfo.network.d r9 = (com.ingka.ikea.app.stockinfo.network.d) r9
            r3 = r3 | 1
            goto L_0x004f
        L_0x0096:
            r8 = 0
            r14 = r8
            goto L_0x004f
        L_0x0099:
            r16 = r3
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
        L_0x00a5:
            r0.c(r1)
            com.ingka.ikea.app.stockinfo.network.StatusRemote r0 = new com.ingka.ikea.app.stockinfo.network.StatusRemote
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.stockinfo.network.StatusRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.stockinfo.network.StatusRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StatusRemote statusRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(statusRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StatusRemote.c(statusRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = StatusRemote.f92612f[0];
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{kSerializer, y02, y02, y02, C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
