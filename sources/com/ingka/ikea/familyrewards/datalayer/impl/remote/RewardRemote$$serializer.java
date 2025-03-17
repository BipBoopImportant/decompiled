package com.ingka.ikea.familyrewards.datalayer.impl.remote;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class RewardRemote$$serializer implements N<RewardRemote> {
    public static final RewardRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RewardRemote$$serializer rewardRemote$$serializer = new RewardRemote$$serializer();
        INSTANCE = rewardRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote", rewardRemote$$serializer, 11);
        j02.p("rewardId", false);
        j02.p("title", false);
        j02.p("categoryType", false);
        j02.p("expiryDate", false);
        j02.p("adjustedExpirationLabel", false);
        j02.p("status", false);
        j02.p("amount", false);
        j02.p("rewardContent", false);
        j02.p("progressPercentage", false);
        j02.p("keysNeededInfo", false);
        j02.p("newBalanceInfo", false);
        descriptor = j02;
    }

    private RewardRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote deserialize(kotlinx.serialization.encoding.Decoder r32) {
        /*
            r31 = this;
            r0 = r32
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
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
            if (r2 == 0) goto L_0x0086
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r13 = r0.A(r1, r13, r2, r14)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.A(r1, r12, r2, r14)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.A(r1, r11, r2, r14)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.A(r1, r8, r2, r14)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r0.A(r1, r10, r2, r14)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r0.A(r1, r7, r2, r14)
            java.lang.String r7 = (java.lang.String) r7
            jK.X r15 = jK.X.f144073a
            java.lang.Object r6 = r0.A(r1, r6, r15, r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote$$serializer r3 = com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r5, r3, r14)
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote r3 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote) r3
            java.lang.Object r5 = r0.A(r1, r9, r15, r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r0.A(r1, r4, r2, r14)
            java.lang.String r4 = (java.lang.String) r4
            r9 = 10
            java.lang.Object r2 = r0.A(r1, r9, r2, r14)
            java.lang.String r2 = (java.lang.String) r2
            r9 = 2047(0x7ff, float:2.868E-42)
            r29 = r2
            r26 = r3
            r28 = r4
            r27 = r5
            r25 = r6
            r24 = r7
            r22 = r8
            r18 = r9
            r23 = r10
            r21 = r11
            r20 = r12
            r19 = r13
            goto L_0x0160
        L_0x0086:
            r16 = r12
            r2 = r13
            r3 = r14
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x0093:
            if (r16 == 0) goto L_0x0148
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x0143;
                case 0: goto L_0x0134;
                case 1: goto L_0x0126;
                case 2: goto L_0x0118;
                case 3: goto L_0x010a;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00ee;
                case 6: goto L_0x00e1;
                case 7: goto L_0x00d2;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00b3;
                case 10: goto L_0x00a2;
                default: goto L_0x009c;
            }
        L_0x009c:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x00a2:
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 10
            java.lang.Object r5 = r0.A(r1, r4, r9, r5)
            java.lang.String r5 = (java.lang.String) r5
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L_0x00ae:
            r4 = 9
        L_0x00b0:
            r9 = 8
            goto L_0x0093
        L_0x00b3:
            r4 = 10
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 9
            java.lang.Object r6 = r0.A(r1, r4, r9, r6)
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x00b0
        L_0x00c2:
            jK.X r9 = jK.X.f144073a
            r4 = 8
            java.lang.Object r7 = r0.A(r1, r4, r9, r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r2 = r2 | 256(0x100, float:3.59E-43)
            r9 = r4
            r4 = 9
            goto L_0x0093
        L_0x00d2:
            r4 = 8
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote$$serializer r9 = com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote$$serializer.INSTANCE
            r4 = 7
            java.lang.Object r9 = r0.A(r1, r4, r9, r10)
            r10 = r9
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote r10 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote) r10
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00ae
        L_0x00e1:
            r4 = 7
            jK.X r9 = jK.X.f144073a
            r4 = 6
            java.lang.Object r8 = r0.A(r1, r4, r9, r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r2 = r2 | 64
            goto L_0x00ae
        L_0x00ee:
            r4 = 6
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 5
            java.lang.Object r9 = r0.A(r1, r4, r9, r11)
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 32
            goto L_0x00ae
        L_0x00fc:
            r4 = 5
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 4
            java.lang.Object r9 = r0.A(r1, r4, r9, r12)
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 16
            goto L_0x00ae
        L_0x010a:
            r4 = 4
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 3
            java.lang.Object r9 = r0.A(r1, r4, r9, r13)
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 8
            goto L_0x00ae
        L_0x0118:
            r4 = 3
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 2
            java.lang.Object r9 = r0.A(r1, r4, r9, r15)
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 4
            goto L_0x00ae
        L_0x0126:
            r4 = 2
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 1
            java.lang.Object r3 = r0.A(r1, r4, r9, r3)
            java.lang.String r3 = (java.lang.String) r3
            r2 = r2 | 2
            goto L_0x00ae
        L_0x0134:
            r4 = 1
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r9 = r0.A(r1, r4, r9, r14)
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 1
            goto L_0x00ae
        L_0x0143:
            r4 = 0
            r16 = r4
            goto L_0x00ae
        L_0x0148:
            r18 = r2
            r20 = r3
            r29 = r5
            r28 = r6
            r27 = r7
            r25 = r8
            r26 = r10
            r24 = r11
            r23 = r12
            r22 = r13
            r19 = r14
            r21 = r15
        L_0x0160:
            r0.c(r1)
            com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote r0 = new com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote
            r30 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, RewardRemote rewardRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(rewardRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        RewardRemote.l(rewardRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(y02);
        KSerializer<?> u15 = C17294a.u(y02);
        X x10 = X.f144073a;
        return new KSerializer[]{u10, u11, u12, u13, u14, u15, C17294a.u(x10), C17294a.u(ContentRemote$$serializer.INSTANCE), C17294a.u(x10), C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
