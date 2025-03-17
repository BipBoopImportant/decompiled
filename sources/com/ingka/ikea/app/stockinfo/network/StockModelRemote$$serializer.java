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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/stockinfo/network/StockModelRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StockModelRemote$$serializer implements N<StockModelRemote> {
    public static final StockModelRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StockModelRemote$$serializer stockModelRemote$$serializer = new StockModelRemote$$serializer();
        INSTANCE = stockModelRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.stockinfo.network.StockModelRemote", stockModelRemote$$serializer, 7);
        j02.p("storeId", false);
        j02.p("itemNo", false);
        j02.p("itemType", false);
        j02.p("productLocation", false);
        j02.p("salePoint", false);
        j02.p("status", false);
        j02.p("locations", false);
        descriptor = j02;
    }

    private StockModelRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.app.stockinfo.network.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.app.stockinfo.network.StatusRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.app.stockinfo.network.StockModelRemote deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.stockinfo.network.StockModelRemote.f92618h
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 6
            r8 = 4
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r6 = r0.n(r1, r6)
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r10, r11)
            java.lang.String r5 = (java.lang.String) r5
            r10 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r10, r11)
            com.ingka.ikea.app.stockinfo.network.c r8 = (com.ingka.ikea.app.stockinfo.network.c) r8
            com.ingka.ikea.app.stockinfo.network.StatusRemote$$serializer r10 = com.ingka.ikea.app.stockinfo.network.StatusRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r10, r11)
            com.ingka.ikea.app.stockinfo.network.StatusRemote r4 = (com.ingka.ikea.app.stockinfo.network.StatusRemote) r4
            r2 = r2[r7]
            java.lang.Object r2 = r0.o(r1, r7, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r7 = 127(0x7f, float:1.78E-43)
            r26 = r2
            r20 = r3
            r25 = r4
            r23 = r5
            r22 = r6
            r19 = r7
            r24 = r8
            r21 = r9
            goto L_0x00dd
        L_0x005f:
            r17 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0068:
            if (r17 == 0) goto L_0x00cd
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00c8;
                case 0: goto L_0x00bb;
                case 1: goto L_0x00b0;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009c;
                case 4: goto L_0x0090;
                case 5: goto L_0x0084;
                case 6: goto L_0x0077;
                default: goto L_0x0071;
            }
        L_0x0071:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0077:
            r6 = r2[r7]
            java.lang.Object r6 = r0.o(r1, r7, r6, r9)
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            r3 = r3 | 64
        L_0x0082:
            r6 = 2
            goto L_0x0068
        L_0x0084:
            com.ingka.ikea.app.stockinfo.network.StatusRemote$$serializer r6 = com.ingka.ikea.app.stockinfo.network.StatusRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.o(r1, r4, r6, r10)
            r10 = r6
            com.ingka.ikea.app.stockinfo.network.StatusRemote r10 = (com.ingka.ikea.app.stockinfo.network.StatusRemote) r10
            r3 = r3 | 32
            goto L_0x0082
        L_0x0090:
            r6 = r2[r8]
            java.lang.Object r6 = r0.A(r1, r8, r6, r15)
            r15 = r6
            com.ingka.ikea.app.stockinfo.network.c r15 = (com.ingka.ikea.app.stockinfo.network.c) r15
            r3 = r3 | 16
            goto L_0x0082
        L_0x009c:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r5, r6, r14)
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 8
            goto L_0x0082
        L_0x00a8:
            r6 = 2
            java.lang.String r13 = r0.n(r1, r6)
            r3 = r3 | 4
            goto L_0x0068
        L_0x00b0:
            r6 = 2
            r12 = 1
            java.lang.String r16 = r0.n(r1, r12)
            r3 = r3 | 2
            r12 = r16
            goto L_0x0068
        L_0x00bb:
            r6 = 2
            r11 = 0
            r16 = 1
            java.lang.String r18 = r0.n(r1, r11)
            r3 = r3 | 1
            r11 = r18
            goto L_0x0068
        L_0x00c8:
            r16 = 1
            r17 = 0
            goto L_0x0082
        L_0x00cd:
            r19 = r3
            r26 = r9
            r25 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00dd:
            r0.c(r1)
            com.ingka.ikea.app.stockinfo.network.StockModelRemote r0 = new com.ingka.ikea.app.stockinfo.network.StockModelRemote
            r27 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.stockinfo.network.StockModelRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.stockinfo.network.StockModelRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StockModelRemote stockModelRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(stockModelRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StockModelRemote.c(stockModelRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = StockModelRemote.f92618h;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, C17294a.u(y02), C17294a.u(a10[4]), StatusRemote$$serializer.INSTANCE, a10[6]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
