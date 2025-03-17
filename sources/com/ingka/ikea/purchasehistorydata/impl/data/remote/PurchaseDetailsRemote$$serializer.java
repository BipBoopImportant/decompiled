package com.ingka.ikea.purchasehistorydata.impl.data.remote;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PurchaseDetailsRemote$$serializer implements N<PurchaseDetailsRemote> {
    public static final PurchaseDetailsRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f119543a = 8;
    private static final SerialDescriptor descriptor;

    static {
        PurchaseDetailsRemote$$serializer purchaseDetailsRemote$$serializer = new PurchaseDetailsRemote$$serializer();
        INSTANCE = purchaseDetailsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote", purchaseDetailsRemote$$serializer, 11);
        j02.p("id", false);
        j02.p("status", false);
        j02.p("type", false);
        j02.p("actions", false);
        j02.p("storeName", false);
        j02.p("costs", false);
        j02.p("dateAndTime", false);
        j02.p("deliveryMethods", false);
        j02.p("articles", false);
        j02.p("payments", false);
        j02.p("invoices", false);
        descriptor = j02;
    }

    private PurchaseDetailsRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote deserialize(kotlinx.serialization.encoding.Decoder r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote.$childSerializers
            boolean r3 = r0.q()
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r11 = 9
            r12 = 7
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0094
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r14 = r0.A(r1, r14, r3, r15)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r0.A(r1, r13, r3, r15)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r9 = r0.A(r1, r9, r3, r15)
            java.lang.String r9 = (java.lang.String) r9
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer r10 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r10, r15)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote r6 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote.OrderActionsRemote) r6
            java.lang.Object r3 = r0.A(r1, r8, r3, r15)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote$$serializer r8 = com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r8, r15)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote r5 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote) r5
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote$$serializer r8 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r8, r15)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote r4 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote) r4
            r8 = r2[r12]
            java.lang.Object r8 = r0.A(r1, r12, r8, r15)
            java.util.List r8 = (java.util.List) r8
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer r10 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r10, r15)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles r7 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.Articles) r7
            r10 = r2[r11]
            java.lang.Object r10 = r0.A(r1, r11, r10, r15)
            java.util.List r10 = (java.util.List) r10
            r11 = 10
            r2 = r2[r11]
            java.lang.Object r2 = r0.A(r1, r11, r2, r15)
            java.util.List r2 = (java.util.List) r2
            r11 = 2047(0x7ff, float:2.868E-42)
            r30 = r2
            r24 = r3
            r26 = r4
            r25 = r5
            r23 = r6
            r28 = r7
            r27 = r8
            r22 = r9
            r29 = r10
            r19 = r11
            r21 = r13
            r20 = r14
            goto L_0x018d
        L_0x0094:
            r3 = 10
            r16 = r13
            r10 = r14
            r4 = r15
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x00a3:
            if (r16 == 0) goto L_0x0174
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x0168;
                case 0: goto L_0x0151;
                case 1: goto L_0x0142;
                case 2: goto L_0x0133;
                case 3: goto L_0x0124;
                case 4: goto L_0x0115;
                case 5: goto L_0x0106;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00e9;
                case 8: goto L_0x00d7;
                case 9: goto L_0x00c3;
                case 10: goto L_0x00b2;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x00b2:
            r17 = r15
            r3 = 10
            r15 = r2[r3]
            java.lang.Object r11 = r0.A(r1, r3, r15, r11)
            java.util.List r11 = (java.util.List) r11
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r15 = r17
            goto L_0x00a3
        L_0x00c3:
            r17 = r15
            r15 = 9
            r3 = r2[r15]
            java.lang.Object r3 = r0.A(r1, r15, r3, r7)
            r7 = r3
            java.util.List r7 = (java.util.List) r7
            r10 = r10 | 512(0x200, float:7.175E-43)
        L_0x00d2:
            r15 = r17
        L_0x00d4:
            r3 = 10
            goto L_0x00a3
        L_0x00d7:
            r17 = r15
            r15 = 9
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer r3 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer.INSTANCE
            r15 = 8
            java.lang.Object r3 = r0.A(r1, r15, r3, r12)
            r12 = r3
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles r12 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.Articles) r12
            r10 = r10 | 256(0x100, float:3.59E-43)
            goto L_0x00d2
        L_0x00e9:
            r17 = r15
            r3 = 7
            r15 = r2[r3]
            java.lang.Object r4 = r0.A(r1, r3, r15, r4)
            java.util.List r4 = (java.util.List) r4
            r10 = r10 | 128(0x80, float:1.794E-43)
            goto L_0x00d2
        L_0x00f7:
            r17 = r15
            r3 = 7
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote$$serializer r15 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote$$serializer.INSTANCE
            r3 = 6
            java.lang.Object r5 = r0.A(r1, r3, r15, r5)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote r5 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote) r5
            r10 = r10 | 64
            goto L_0x00d2
        L_0x0106:
            r17 = r15
            r3 = 6
            com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote$$serializer r15 = com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote$$serializer.INSTANCE
            r3 = 5
            java.lang.Object r8 = r0.A(r1, r3, r15, r8)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote r8 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.CostsRemote) r8
            r10 = r10 | 32
            goto L_0x00d2
        L_0x0115:
            r17 = r15
            r3 = 5
            jK.Y0 r15 = jK.Y0.f144077a
            r3 = 4
            java.lang.Object r6 = r0.A(r1, r3, r15, r6)
            java.lang.String r6 = (java.lang.String) r6
            r10 = r10 | 16
            goto L_0x00d2
        L_0x0124:
            r17 = r15
            r3 = 4
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer r15 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE
            r3 = 3
            java.lang.Object r9 = r0.A(r1, r3, r15, r9)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote r9 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote.OrderActionsRemote) r9
            r10 = r10 | 8
            goto L_0x00d2
        L_0x0133:
            r17 = r15
            r3 = 3
            jK.Y0 r15 = jK.Y0.f144077a
            r3 = 2
            java.lang.Object r13 = r0.A(r1, r3, r15, r13)
            java.lang.String r13 = (java.lang.String) r13
            r10 = r10 | 4
            goto L_0x00d2
        L_0x0142:
            r17 = r15
            r3 = 2
            jK.Y0 r15 = jK.Y0.f144077a
            r3 = 1
            java.lang.Object r14 = r0.A(r1, r3, r15, r14)
            java.lang.String r14 = (java.lang.String) r14
            r10 = r10 | 2
            goto L_0x00d2
        L_0x0151:
            r17 = r15
            r3 = 1
            jK.Y0 r15 = jK.Y0.f144077a
            r33 = r2
            r2 = r17
            r3 = 0
            java.lang.Object r2 = r0.A(r1, r3, r15, r2)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            r10 = r10 | 1
            r2 = r33
            goto L_0x00d4
        L_0x0168:
            r33 = r2
            r2 = r15
            r3 = 0
            r16 = r3
            r3 = 10
            r2 = r33
            goto L_0x00a3
        L_0x0174:
            r2 = r15
            r20 = r2
            r27 = r4
            r26 = r5
            r24 = r6
            r29 = r7
            r25 = r8
            r23 = r9
            r19 = r10
            r30 = r11
            r28 = r12
            r22 = r13
            r21 = r14
        L_0x018d:
            r0.c(r1)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote r0 = new com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote
            r31 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PurchaseDetailsRemote purchaseDetailsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(purchaseDetailsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PurchaseDetailsRemote.write$Self$purchasehistorydata_implementation_release(purchaseDetailsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] access$get$childSerializers$cp = PurchaseDetailsRemote.$childSerializers;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(CostsRemote$$serializer.INSTANCE), C17294a.u(DateAndTimeRemote$$serializer.INSTANCE), C17294a.u(access$get$childSerializers$cp[7]), C17294a.u(DeliveryMethodRemote$Articles$$serializer.INSTANCE), C17294a.u(access$get$childSerializers$cp[9]), C17294a.u(access$get$childSerializers$cp[10])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
