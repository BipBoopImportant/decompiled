package com.ingka.ikea.useraccount.impl.network;

import XH.C16814e;
import com.google.android.libraries.places.api.model.PlaceTypes;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/useraccount/impl/network/RemoteAddress.$serializer", "LjK/N;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class RemoteAddress$$serializer implements N<RemoteAddress> {
    public static final RemoteAddress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RemoteAddress$$serializer remoteAddress$$serializer = new RemoteAddress$$serializer();
        INSTANCE = remoteAddress$$serializer;
        J0 j02 = new J0("com.ingka.ikea.useraccount.impl.network.RemoteAddress", remoteAddress$$serializer, 10);
        j02.p("id", false);
        j02.p("type", false);
        j02.p(PlaceTypes.ADDRESS, false);
        j02.p("address2", false);
        j02.p("address3", false);
        j02.p("postalCode", false);
        j02.p("city", false);
        j02.p("countryCode", false);
        j02.p("addressFirstName", false);
        j02.p("addressLastName", false);
        descriptor = j02;
    }

    private RemoteAddress$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.useraccount.impl.network.RemoteAddress$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.useraccount.impl.network.RemoteAddress deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.useraccount.impl.network.RemoteAddress.f120607k
            boolean r3 = r0.q()
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x007e
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r13 = r0.A(r1, r13, r3, r14)
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2[r12]
            java.lang.Object r2 = r0.A(r1, r12, r2, r14)
            com.ingka.ikea.useraccount.impl.network.RemoteAddress$b r2 = (com.ingka.ikea.useraccount.impl.network.RemoteAddress.b) r2
            java.lang.Object r11 = r0.A(r1, r11, r3, r14)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.A(r1, r8, r3, r14)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r0.A(r1, r10, r3, r14)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r0.A(r1, r7, r3, r14)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.A(r1, r6, r3, r14)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.A(r1, r5, r3, r14)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r0.A(r1, r9, r3, r14)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r0.A(r1, r4, r3, r14)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1023(0x3ff, float:1.434E-42)
            r20 = r2
            r28 = r3
            r18 = r4
            r26 = r5
            r25 = r6
            r24 = r7
            r22 = r8
            r27 = r9
            r23 = r10
            r21 = r11
            r19 = r13
            goto L_0x0141
        L_0x007e:
            r16 = r12
            r3 = r13
            r5 = r14
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x008a:
            if (r16 == 0) goto L_0x012b
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x0126;
                case 0: goto L_0x0118;
                case 1: goto L_0x010b;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00ef;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00d4;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00a6;
                case 9: goto L_0x0099;
                default: goto L_0x0093;
            }
        L_0x0093:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0099:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r4, r9, r5)
            java.lang.String r5 = (java.lang.String) r5
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00a3:
            r9 = 8
            goto L_0x008a
        L_0x00a6:
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 8
            java.lang.Object r6 = r0.A(r1, r4, r9, r6)
            java.lang.String r6 = (java.lang.String) r6
            r3 = r3 | 256(0x100, float:3.59E-43)
            r9 = r4
            r4 = 9
            goto L_0x008a
        L_0x00b6:
            r4 = 8
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 7
            java.lang.Object r7 = r0.A(r1, r4, r9, r7)
            java.lang.String r7 = (java.lang.String) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00c3:
            r4 = 9
            goto L_0x00a3
        L_0x00c6:
            r4 = 7
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 6
            java.lang.Object r9 = r0.A(r1, r4, r9, r10)
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 64
            goto L_0x00c3
        L_0x00d4:
            r4 = 6
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 5
            java.lang.Object r8 = r0.A(r1, r4, r9, r8)
            java.lang.String r8 = (java.lang.String) r8
            r3 = r3 | 32
            goto L_0x00c3
        L_0x00e1:
            r4 = 5
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 4
            java.lang.Object r9 = r0.A(r1, r4, r9, r11)
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 16
            goto L_0x00c3
        L_0x00ef:
            r4 = 4
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 3
            java.lang.Object r9 = r0.A(r1, r4, r9, r12)
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x00c3
        L_0x00fd:
            r4 = 3
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 2
            java.lang.Object r9 = r0.A(r1, r4, r9, r13)
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 4
            goto L_0x00c3
        L_0x010b:
            r9 = 1
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r15)
            r15 = r4
            com.ingka.ikea.useraccount.impl.network.RemoteAddress$b r15 = (com.ingka.ikea.useraccount.impl.network.RemoteAddress.b) r15
            r3 = r3 | 2
            goto L_0x00c3
        L_0x0118:
            r9 = 1
            jK.Y0 r4 = jK.Y0.f144077a
            r9 = 0
            java.lang.Object r4 = r0.A(r1, r9, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 1
            goto L_0x00c3
        L_0x0126:
            r9 = 0
            r16 = r9
            goto L_0x00a3
        L_0x012b:
            r18 = r3
            r28 = r5
            r27 = r6
            r26 = r7
            r24 = r8
            r25 = r10
            r23 = r11
            r22 = r12
            r21 = r13
            r19 = r14
            r20 = r15
        L_0x0141:
            r0.c(r1)
            com.ingka.ikea.useraccount.impl.network.RemoteAddress r0 = new com.ingka.ikea.useraccount.impl.network.RemoteAddress
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.useraccount.impl.network.RemoteAddress$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.useraccount.impl.network.RemoteAddress");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, RemoteAddress remoteAddress) {
        C17542s.j(encoder, "encoder");
        C17542s.j(remoteAddress, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        RemoteAddress.d(remoteAddress, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = RemoteAddress.f120607k;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(a10[1]), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
