package com.ingka.ikea.pushnotification.analytics.implementation.data.mapper;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData.$serializer", "LjK/N;", "Lcom/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class MetaData$$serializer implements N<MetaData> {
    public static final MetaData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MetaData$$serializer metaData$$serializer = new MetaData$$serializer();
        INSTANCE = metaData$$serializer;
        J0 j02 = new J0("com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaData", metaData$$serializer, 7);
        j02.p("dispatchId", false);
        j02.p("messageRequestId", false);
        j02.p("transmissionId", false);
        j02.p("customerId", false);
        j02.p("market", false);
        j02.p("token", false);
        j02.p("additionalData", false);
        descriptor = j02;
    }

    private MetaData$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaData deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaData.f119580h
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0053
            java.lang.String r3 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r5 = r0.n(r1, r5)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r4 = r0.n(r1, r4)
            r2 = r2[r8]
            java.lang.Object r2 = r0.A(r1, r8, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r8 = 127(0x7f, float:1.78E-43)
            r26 = r2
            r20 = r3
            r25 = r4
            r23 = r5
            r24 = r6
            r22 = r7
            r19 = r8
            r21 = r9
            goto L_0x00bb
        L_0x0053:
            r17 = r9
            r3 = r10
            r10 = r11
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x005d:
            if (r17 == 0) goto L_0x00ab
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00a8;
                case 0: goto L_0x009d;
                case 1: goto L_0x0095;
                case 2: goto L_0x008e;
                case 3: goto L_0x0087;
                case 4: goto L_0x0080;
                case 5: goto L_0x0079;
                case 6: goto L_0x006c;
                default: goto L_0x0066;
            }
        L_0x0066:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x006c:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r10)
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 64
        L_0x0077:
            r9 = 1
            goto L_0x005d
        L_0x0079:
            java.lang.String r16 = r0.n(r1, r4)
            r3 = r3 | 32
            goto L_0x0077
        L_0x0080:
            java.lang.String r15 = r0.n(r1, r6)
            r3 = r3 | 16
            goto L_0x0077
        L_0x0087:
            java.lang.String r14 = r0.n(r1, r5)
            r3 = r3 | 8
            goto L_0x0077
        L_0x008e:
            java.lang.String r13 = r0.n(r1, r7)
            r3 = r3 | 4
            goto L_0x0077
        L_0x0095:
            r9 = 1
            java.lang.String r12 = r0.n(r1, r9)
            r3 = r3 | 2
            goto L_0x005d
        L_0x009d:
            r9 = 1
            r11 = 0
            java.lang.String r18 = r0.n(r1, r11)
            r3 = r3 | 1
            r11 = r18
            goto L_0x005d
        L_0x00a8:
            r17 = 0
            goto L_0x0077
        L_0x00ab:
            r19 = r3
            r26 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
            r25 = r16
        L_0x00bb:
            r0.c(r1)
            com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaData r0 = new com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaData
            r27 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaData$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaData");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, MetaData metaData) {
        C17542s.j(encoder, "encoder");
        C17542s.j(metaData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        MetaData.i(metaData, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(MetaData.f119580h[6]);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, y02, y02, u10};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
