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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PurchaseHistoryEntryRemote$$serializer implements N<PurchaseHistoryEntryRemote> {
    public static final PurchaseHistoryEntryRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f119550a = 8;
    private static final SerialDescriptor descriptor;

    static {
        PurchaseHistoryEntryRemote$$serializer purchaseHistoryEntryRemote$$serializer = new PurchaseHistoryEntryRemote$$serializer();
        INSTANCE = purchaseHistoryEntryRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote", purchaseHistoryEntryRemote$$serializer, 7);
        j02.p("id", false);
        j02.p("type", false);
        j02.p("dateAndTime", false);
        j02.p("status", false);
        j02.p("storeName", false);
        j02.p("totalCost", false);
        j02.p("articles", false);
        descriptor = j02;
    }

    private PurchaseHistoryEntryRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$DateAndTime} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$TotalCost} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote.$childSerializers
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0065
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r10, r3, r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.A(r1, r9, r3, r11)
            java.lang.String r9 = (java.lang.String) r9
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$DateAndTime$$serializer r12 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$DateAndTime$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r12, r11)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$DateAndTime r7 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote.DateAndTime) r7
            java.lang.Object r5 = r0.A(r1, r5, r3, r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r0.A(r1, r6, r3, r11)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$TotalCost$$serializer r6 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$TotalCost$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r6, r11)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$TotalCost r4 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote.TotalCost) r4
            r2 = r2[r8]
            java.lang.Object r2 = r0.A(r1, r8, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r6 = 127(0x7f, float:1.78E-43)
            r25 = r2
            r23 = r3
            r24 = r4
            r22 = r5
            r18 = r6
            r21 = r7
            r20 = r9
            r19 = r10
            goto L_0x00ee
        L_0x0065:
            r16 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006e:
            if (r16 == 0) goto L_0x00de
            int r7 = r0.p(r1)
            switch(r7) {
                case -1: goto L_0x00da;
                case 0: goto L_0x00cc;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00ae;
                case 3: goto L_0x00a2;
                case 4: goto L_0x0096;
                case 5: goto L_0x008a;
                case 6: goto L_0x007d;
                default: goto L_0x0077;
            }
        L_0x0077:
            fK.E r0 = new fK.E
            r0.<init>((int) r7)
            throw r0
        L_0x007d:
            r7 = r2[r8]
            java.lang.Object r7 = r0.A(r1, r8, r7, r9)
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            r3 = r3 | 64
        L_0x0088:
            r7 = 2
            goto L_0x006e
        L_0x008a:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$TotalCost$$serializer r7 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$TotalCost$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r4, r7, r10)
            r10 = r7
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$TotalCost r10 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote.TotalCost) r10
            r3 = r3 | 32
            goto L_0x0088
        L_0x0096:
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r6, r7, r15)
            r15 = r7
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 16
            goto L_0x0088
        L_0x00a2:
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r5, r7, r14)
            r14 = r7
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 8
            goto L_0x0088
        L_0x00ae:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$DateAndTime$$serializer r7 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$DateAndTime$$serializer.INSTANCE
            r4 = 2
            java.lang.Object r7 = r0.A(r1, r4, r7, r13)
            r13 = r7
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$DateAndTime r13 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote.DateAndTime) r13
            r3 = r3 | 4
            r7 = r4
            r4 = 5
            goto L_0x006e
        L_0x00bd:
            r4 = 2
            jK.Y0 r7 = jK.Y0.f144077a
            r4 = 1
            java.lang.Object r7 = r0.A(r1, r4, r7, r12)
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 2
        L_0x00ca:
            r4 = 5
            goto L_0x0088
        L_0x00cc:
            r4 = 1
            jK.Y0 r7 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r7 = r0.A(r1, r4, r7, r11)
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 1
            goto L_0x00ca
        L_0x00da:
            r4 = 0
            r16 = r4
            goto L_0x00ca
        L_0x00de:
            r18 = r3
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00ee:
            r0.c(r1)
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote r0 = new com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PurchaseHistoryEntryRemote purchaseHistoryEntryRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(purchaseHistoryEntryRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PurchaseHistoryEntryRemote.write$Self$purchasehistorydata_implementation_release(purchaseHistoryEntryRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] access$get$childSerializers$cp = PurchaseHistoryEntryRemote.$childSerializers;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(PurchaseHistoryEntryRemote$DateAndTime$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(y02), C17294a.u(PurchaseHistoryEntryRemote$TotalCost$$serializer.INSTANCE), C17294a.u(access$get$childSerializers$cp[6])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
