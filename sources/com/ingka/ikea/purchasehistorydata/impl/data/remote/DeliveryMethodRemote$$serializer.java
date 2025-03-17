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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class DeliveryMethodRemote$$serializer implements N<DeliveryMethodRemote> {
    public static final DeliveryMethodRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f119497a = 8;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryMethodRemote$$serializer deliveryMethodRemote$$serializer = new DeliveryMethodRemote$$serializer();
        INSTANCE = deliveryMethodRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote", deliveryMethodRemote$$serializer, 10);
        j02.p("id", false);
        j02.p("articles", false);
        j02.p("statusV2", false);
        j02.p("type", false);
        j02.p("deliveryDate", false);
        j02.p("trackingInformation", false);
        j02.p("carrier", false);
        j02.p("deliveryNumber", false);
        j02.p("displayAddress", false);
        j02.p("actions", false);
        descriptor = j02;
    }

    private DeliveryMethodRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.$childSerializers
            boolean r3 = r0.q()
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 5
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0088
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r13 = r0.A(r1, r13, r3, r14)
            java.lang.String r13 = (java.lang.String) r13
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer r15 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r12, r15, r14)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles r12 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.Articles) r12
            r15 = r2[r11]
            java.lang.Object r11 = r0.A(r1, r11, r15, r14)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r7 = r0.A(r1, r7, r3, r14)
            java.lang.String r7 = (java.lang.String) r7
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote$$serializer r15 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r9, r15, r14)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote r9 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.DeliveryDateRemote) r9
            r2 = r2[r10]
            java.lang.Object r2 = r0.A(r1, r10, r2, r14)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r0.A(r1, r6, r3, r14)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r0.A(r1, r5, r3, r14)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryAddressRemote$$serializer r5 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryAddressRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r8, r5, r14)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryAddressRemote r5 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.DeliveryAddressRemote) r5
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer r8 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r8, r14)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote r4 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote.OrderActionsRemote) r4
            r8 = 1023(0x3ff, float:1.434E-42)
            r24 = r2
            r26 = r3
            r28 = r4
            r27 = r5
            r25 = r6
            r22 = r7
            r18 = r8
            r23 = r9
            r21 = r11
            r20 = r12
            r19 = r13
            goto L_0x014b
        L_0x0088:
            r16 = r12
            r3 = r13
            r5 = r14
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x0094:
            if (r16 == 0) goto L_0x0135
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x0131;
                case 0: goto L_0x0123;
                case 1: goto L_0x0115;
                case 2: goto L_0x0108;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00ec;
                case 5: goto L_0x00df;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00b0;
                case 9: goto L_0x00a3;
                default: goto L_0x009d;
            }
        L_0x009d:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x00a3:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer r8 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r4, r8, r5)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote r5 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote.OrderActionsRemote) r5
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00ad:
            r8 = 8
            goto L_0x0094
        L_0x00b0:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryAddressRemote$$serializer r8 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryAddressRemote$$serializer.INSTANCE
            r4 = 8
            java.lang.Object r6 = r0.A(r1, r4, r8, r6)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryAddressRemote r6 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.DeliveryAddressRemote) r6
            r3 = r3 | 256(0x100, float:3.59E-43)
            r8 = r4
            r4 = 9
            goto L_0x0094
        L_0x00c0:
            r4 = 8
            jK.Y0 r8 = jK.Y0.f144077a
            r4 = 7
            java.lang.Object r8 = r0.A(r1, r4, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00ce:
            r4 = 9
            goto L_0x00ad
        L_0x00d1:
            r4 = 7
            jK.Y0 r8 = jK.Y0.f144077a
            r4 = 6
            java.lang.Object r8 = r0.A(r1, r4, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 64
            goto L_0x00ce
        L_0x00df:
            r8 = 5
            r4 = r2[r8]
            java.lang.Object r4 = r0.A(r1, r8, r4, r7)
            r7 = r4
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 32
            goto L_0x00ce
        L_0x00ec:
            r8 = 5
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote$$serializer r4 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote$$serializer.INSTANCE
            r8 = 4
            java.lang.Object r4 = r0.A(r1, r8, r4, r11)
            r11 = r4
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote r11 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.DeliveryDateRemote) r11
            r3 = r3 | 16
            goto L_0x00ce
        L_0x00fa:
            r8 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r8 = 3
            java.lang.Object r4 = r0.A(r1, r8, r4, r12)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x00ce
        L_0x0108:
            r4 = 2
            r8 = r2[r4]
            java.lang.Object r8 = r0.A(r1, r4, r8, r13)
            r13 = r8
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 4
            goto L_0x00ce
        L_0x0115:
            r4 = 2
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer r8 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles$$serializer.INSTANCE
            r4 = 1
            java.lang.Object r8 = r0.A(r1, r4, r8, r15)
            r15 = r8
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles r15 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.Articles) r15
            r3 = r3 | 2
            goto L_0x00ce
        L_0x0123:
            r4 = 1
            jK.Y0 r8 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r8 = r0.A(r1, r4, r8, r14)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 1
            goto L_0x00ce
        L_0x0131:
            r4 = 0
            r16 = r4
            goto L_0x00ce
        L_0x0135:
            r18 = r3
            r28 = r5
            r27 = r6
            r24 = r7
            r25 = r9
            r26 = r10
            r23 = r11
            r22 = r12
            r21 = r13
            r19 = r14
            r20 = r15
        L_0x014b:
            r0.c(r1)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote r0 = new com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, DeliveryMethodRemote deliveryMethodRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(deliveryMethodRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        DeliveryMethodRemote.write$Self$purchasehistorydata_implementation_release(deliveryMethodRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] access$get$childSerializers$cp = DeliveryMethodRemote.$childSerializers;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(DeliveryMethodRemote$Articles$$serializer.INSTANCE), C17294a.u(access$get$childSerializers$cp[2]), C17294a.u(y02), C17294a.u(DeliveryMethodRemote$DeliveryDateRemote$$serializer.INSTANCE), C17294a.u(access$get$childSerializers$cp[5]), C17294a.u(y02), C17294a.u(y02), C17294a.u(DeliveryMethodRemote$DeliveryAddressRemote$$serializer.INSTANCE), C17294a.u(PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
