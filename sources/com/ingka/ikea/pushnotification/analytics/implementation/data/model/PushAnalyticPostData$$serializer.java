package com.ingka.ikea.pushnotification.analytics.implementation.data.model;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData.$serializer", "LjK/N;", "Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PushAnalyticPostData$$serializer implements N<PushAnalyticPostData> {
    public static final PushAnalyticPostData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PushAnalyticPostData$$serializer pushAnalyticPostData$$serializer = new PushAnalyticPostData$$serializer();
        INSTANCE = pushAnalyticPostData$$serializer;
        J0 j02 = new J0("com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData", pushAnalyticPostData$$serializer, 12);
        j02.p("dispatchId", false);
        j02.p("eventId", false);
        j02.p("messageRequestId", false);
        j02.p("transmissionId", false);
        j02.p("customerId", false);
        j02.p("market", false);
        j02.p("token", false);
        j02.p("type", false);
        j02.p("bounceInfo", false);
        j02.p("platform", false);
        j02.p("appVersion", false);
        j02.p("additionalData", false);
        descriptor = j02;
    }

    private PushAnalyticPostData$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0103, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData deserialize(kotlinx.serialization.encoding.Decoder r43) {
        /*
            r42 = this;
            r0 = r43
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData.f119591m
            boolean r3 = r0.q()
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r14 = 1
            r15 = 0
            r13 = 0
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = r0.n(r1, r15)
            java.lang.String r14 = r0.n(r1, r14)
            java.lang.String r12 = r0.n(r1, r12)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r11 = r0.n(r1, r11)
            java.lang.String r8 = r0.n(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo$$serializer r15 = com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo$$serializer.INSTANCE
            java.lang.Object r10 = r0.A(r1, r10, r15, r13)
            com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo r10 = (com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo) r10
            java.lang.String r5 = r0.n(r1, r5)
            java.lang.String r4 = r0.n(r1, r4)
            r15 = 11
            r2 = r2[r15]
            java.lang.Object r2 = r0.A(r1, r15, r2, r13)
            java.util.List r2 = (java.util.List) r2
            r13 = 4095(0xfff, float:5.738E-42)
            r40 = r2
            r29 = r3
            r39 = r4
            r38 = r5
            r36 = r6
            r35 = r7
            r34 = r8
            r32 = r9
            r37 = r10
            r33 = r11
            r31 = r12
            r28 = r13
            r30 = r14
            goto L_0x012e
        L_0x007e:
            r3 = 11
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r14
            r14 = r25
            r13 = r15
            r15 = r14
        L_0x009a:
            if (r26 == 0) goto L_0x0114
            int r12 = r0.p(r1)
            switch(r12) {
                case -1: goto L_0x010f;
                case 0: goto L_0x0106;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00de;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00d0;
                case 8: goto L_0x00c4;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00b6;
                case 11: goto L_0x00a9;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            fK.E r0 = new fK.E
            r0.<init>((int) r12)
            throw r0
        L_0x00a9:
            r12 = r2[r3]
            java.lang.Object r12 = r0.A(r1, r3, r12, r14)
            r14 = r12
            java.util.List r14 = (java.util.List) r14
            r13 = r13 | 2048(0x800, float:2.87E-42)
        L_0x00b4:
            r12 = 2
            goto L_0x009a
        L_0x00b6:
            java.lang.String r25 = r0.n(r1, r4)
            r13 = r13 | 1024(0x400, float:1.435E-42)
            goto L_0x00b4
        L_0x00bd:
            java.lang.String r24 = r0.n(r1, r5)
            r13 = r13 | 512(0x200, float:7.175E-43)
            goto L_0x00b4
        L_0x00c4:
            com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo$$serializer r12 = com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r10, r12, r15)
            r15 = r12
            com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo r15 = (com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo) r15
            r13 = r13 | 256(0x100, float:3.59E-43)
            goto L_0x00b4
        L_0x00d0:
            java.lang.String r23 = r0.n(r1, r6)
            r13 = r13 | 128(0x80, float:1.794E-43)
            goto L_0x00b4
        L_0x00d7:
            java.lang.String r22 = r0.n(r1, r7)
            r13 = r13 | 64
            goto L_0x00b4
        L_0x00de:
            java.lang.String r21 = r0.n(r1, r8)
            r13 = r13 | 32
            goto L_0x00b4
        L_0x00e5:
            java.lang.String r20 = r0.n(r1, r11)
            r13 = r13 | 16
            goto L_0x00b4
        L_0x00ec:
            java.lang.String r19 = r0.n(r1, r9)
            r13 = r13 | 8
            goto L_0x00b4
        L_0x00f3:
            r12 = 2
            java.lang.String r18 = r0.n(r1, r12)
            r13 = r13 | 4
            goto L_0x009a
        L_0x00fb:
            r3 = 1
            r12 = 2
            java.lang.String r17 = r0.n(r1, r3)
            r13 = r13 | 2
        L_0x0103:
            r3 = 11
            goto L_0x009a
        L_0x0106:
            r3 = 0
            r12 = 2
            java.lang.String r16 = r0.n(r1, r3)
            r13 = r13 | 1
            goto L_0x0103
        L_0x010f:
            r3 = 0
            r12 = 2
            r26 = r3
            goto L_0x0103
        L_0x0114:
            r28 = r13
            r40 = r14
            r37 = r15
            r29 = r16
            r30 = r17
            r31 = r18
            r32 = r19
            r33 = r20
            r34 = r21
            r35 = r22
            r36 = r23
            r38 = r24
            r39 = r25
        L_0x012e:
            r0.c(r1)
            com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData r0 = new com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData
            r41 = 0
            r27 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PushAnalyticPostData pushAnalyticPostData) {
        C17542s.j(encoder, "encoder");
        C17542s.j(pushAnalyticPostData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PushAnalyticPostData.l(pushAnalyticPostData, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = PushAnalyticPostData.f119591m;
        KSerializer<?> u10 = C17294a.u(BounceInfo$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(a10[11]);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, y02, y02, y02, y02, u10, y02, y02, u11};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
