package com.ingka.ikea.useraccount.impl.network;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/useraccount/impl/network/RemoteProfile.$serializer", "LjK/N;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class RemoteProfile$$serializer implements N<RemoteProfile> {
    public static final RemoteProfile$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RemoteProfile$$serializer remoteProfile$$serializer = new RemoteProfile$$serializer();
        INSTANCE = remoteProfile$$serializer;
        J0 j02 = new J0("com.ingka.ikea.useraccount.impl.network.RemoteProfile", remoteProfile$$serializer, 10);
        j02.p("firstName", false);
        j02.p("lastName", false);
        j02.p("initials", false);
        j02.p("email", false);
        j02.p("mobileNumber", false);
        j02.p("birthDate", false);
        j02.p("preferredStore", false);
        j02.p("emailContact", false);
        j02.p("addresses", false);
        j02.p("loyaltyCards", false);
        descriptor = j02;
    }

    private RemoteProfile$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.useraccount.impl.network.RemoteProfile deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.useraccount.impl.network.RemoteProfile.f120620k
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 4
            r9 = 2
            r10 = 9
            r11 = 8
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0082
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r13 = r0.A(r1, r13, r3, r14)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.A(r1, r12, r3, r14)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r0.A(r1, r9, r3, r14)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.A(r1, r7, r3, r14)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.A(r1, r8, r3, r14)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.A(r1, r6, r3, r14)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r0.A(r1, r5, r3, r14)
            java.lang.String r3 = (java.lang.String) r3
            jK.i r5 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r1, r4, r5, r14)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = r2[r11]
            java.lang.Object r5 = r0.A(r1, r11, r5, r14)
            java.util.List r5 = (java.util.List) r5
            r2 = r2[r10]
            java.lang.Object r2 = r0.A(r1, r10, r2, r14)
            java.util.List r2 = (java.util.List) r2
            r10 = 1023(0x3ff, float:1.434E-42)
            r28 = r2
            r25 = r3
            r26 = r4
            r27 = r5
            r24 = r6
            r22 = r7
            r23 = r8
            r21 = r9
            r18 = r10
            r20 = r12
            r19 = r13
            goto L_0x0143
        L_0x0082:
            r16 = r12
            r3 = r13
            r4 = r14
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r12 = r9
            r13 = r12
            r15 = r13
        L_0x008e:
            if (r16 == 0) goto L_0x012d
            int r11 = r0.p(r1)
            switch(r11) {
                case -1: goto L_0x0128;
                case 0: goto L_0x011a;
                case 1: goto L_0x010c;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00e3;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00c9;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00aa;
                case 9: goto L_0x009d;
                default: goto L_0x0097;
            }
        L_0x0097:
            fK.E r0 = new fK.E
            r0.<init>((int) r11)
            throw r0
        L_0x009d:
            r11 = r2[r10]
            java.lang.Object r4 = r0.A(r1, r10, r11, r4)
            java.util.List r4 = (java.util.List) r4
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00a7:
            r11 = 8
            goto L_0x008e
        L_0x00aa:
            r11 = 8
            r10 = r2[r11]
            java.lang.Object r5 = r0.A(r1, r11, r10, r5)
            java.util.List r5 = (java.util.List) r5
            r3 = r3 | 256(0x100, float:3.59E-43)
            r10 = 9
            goto L_0x008e
        L_0x00b9:
            r11 = 8
            jK.i r10 = jK.C17457i.f144111a
            r11 = 7
            java.lang.Object r6 = r0.A(r1, r11, r10, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00c6:
            r10 = 9
            goto L_0x00a7
        L_0x00c9:
            r11 = 7
            jK.Y0 r10 = jK.Y0.f144077a
            r11 = 6
            java.lang.Object r8 = r0.A(r1, r11, r10, r8)
            java.lang.String r8 = (java.lang.String) r8
            r3 = r3 | 64
            goto L_0x00c6
        L_0x00d6:
            r11 = 6
            jK.Y0 r10 = jK.Y0.f144077a
            r11 = 5
            java.lang.Object r7 = r0.A(r1, r11, r10, r7)
            java.lang.String r7 = (java.lang.String) r7
            r3 = r3 | 32
            goto L_0x00c6
        L_0x00e3:
            r11 = 5
            jK.Y0 r10 = jK.Y0.f144077a
            r11 = 4
            java.lang.Object r9 = r0.A(r1, r11, r10, r9)
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 16
            goto L_0x00c6
        L_0x00f0:
            r11 = 4
            jK.Y0 r10 = jK.Y0.f144077a
            r11 = 3
            java.lang.Object r10 = r0.A(r1, r11, r10, r12)
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x00c6
        L_0x00fe:
            r11 = 3
            jK.Y0 r10 = jK.Y0.f144077a
            r11 = 2
            java.lang.Object r10 = r0.A(r1, r11, r10, r13)
            r13 = r10
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 4
            goto L_0x00c6
        L_0x010c:
            r11 = 2
            jK.Y0 r10 = jK.Y0.f144077a
            r11 = 1
            java.lang.Object r10 = r0.A(r1, r11, r10, r15)
            r15 = r10
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 2
            goto L_0x00c6
        L_0x011a:
            r11 = 1
            jK.Y0 r10 = jK.Y0.f144077a
            r11 = 0
            java.lang.Object r10 = r0.A(r1, r11, r10, r14)
            r14 = r10
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 1
            goto L_0x00c6
        L_0x0128:
            r11 = 0
            r16 = r11
            goto L_0x00a7
        L_0x012d:
            r18 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r24 = r7
            r25 = r8
            r23 = r9
            r22 = r12
            r21 = r13
            r19 = r14
            r20 = r15
        L_0x0143:
            r0.c(r1)
            com.ingka.ikea.useraccount.impl.network.RemoteProfile r0 = new com.ingka.ikea.useraccount.impl.network.RemoteProfile
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.useraccount.impl.network.RemoteProfile$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.useraccount.impl.network.RemoteProfile");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, RemoteProfile remoteProfile) {
        C17542s.j(encoder, "encoder");
        C17542s.j(remoteProfile, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        RemoteProfile.d(remoteProfile, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = RemoteProfile.f120620k;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(C17457i.f144111a), C17294a.u(a10[8]), C17294a.u(a10[9])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
