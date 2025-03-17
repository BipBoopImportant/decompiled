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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/stockinfo/network/ItemRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/stockinfo/network/ItemRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/stockinfo/network/ItemRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/stockinfo/network/ItemRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ItemRemote$$serializer implements N<ItemRemote> {
    public static final ItemRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ItemRemote$$serializer itemRemote$$serializer = new ItemRemote$$serializer();
        INSTANCE = itemRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.stockinfo.network.ItemRemote", itemRemote$$serializer, 7);
        j02.p("title", false);
        j02.p("description", false);
        j02.p("articleNo", false);
        j02.p("productId", false);
        j02.p("productType", false);
        j02.p("itemLocation", false);
        j02.p("shelfOrRack", true);
        descriptor = j02;
    }

    private ItemRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.app.stockinfo.network.ItemRemote deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = r0.n(r1, r9)
            java.lang.String r8 = r0.n(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r5 = r0.n(r1, r5)
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r6, r9, r10)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.A(r1, r4, r9, r10)
            java.lang.String r4 = (java.lang.String) r4
            com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote$$serializer r9 = com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r3, r9, r10)
            com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote r3 = (com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote) r3
            r9 = 127(0x7f, float:1.78E-43)
            r19 = r2
            r25 = r3
            r24 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r20 = r8
            r18 = r9
            goto L_0x00c6
        L_0x0055:
            r16 = r8
            r2 = r9
            r9 = r10
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x005e:
            if (r16 == 0) goto L_0x00b6
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00b3;
                case 0: goto L_0x00a8;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0099;
                case 3: goto L_0x0092;
                case 4: goto L_0x0086;
                case 5: goto L_0x007a;
                case 6: goto L_0x006d;
                default: goto L_0x0067;
            }
        L_0x0067:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x006d:
            com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote$$serializer r8 = com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r3, r8, r9)
            r9 = r8
            com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote r9 = (com.ingka.ikea.app.stockinfo.network.ShelfOrRackRemote) r9
            r2 = r2 | 64
        L_0x0078:
            r8 = 1
            goto L_0x005e
        L_0x007a:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r15)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 32
            goto L_0x0078
        L_0x0086:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r6, r8, r14)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 16
            goto L_0x0078
        L_0x0092:
            java.lang.String r13 = r0.n(r1, r5)
            r2 = r2 | 8
            goto L_0x0078
        L_0x0099:
            java.lang.String r12 = r0.n(r1, r7)
            r2 = r2 | 4
            goto L_0x0078
        L_0x00a0:
            r8 = 1
            java.lang.String r11 = r0.n(r1, r8)
            r2 = r2 | 2
            goto L_0x005e
        L_0x00a8:
            r8 = 1
            r10 = 0
            java.lang.String r17 = r0.n(r1, r10)
            r2 = r2 | 1
            r10 = r17
            goto L_0x005e
        L_0x00b3:
            r16 = 0
            goto L_0x0078
        L_0x00b6:
            r18 = r2
            r25 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00c6:
            r0.c(r1)
            com.ingka.ikea.app.stockinfo.network.ItemRemote r0 = new com.ingka.ikea.app.stockinfo.network.ItemRemote
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.stockinfo.network.ItemRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.stockinfo.network.ItemRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ItemRemote itemRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(itemRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ItemRemote.b(itemRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, C17294a.u(y02), C17294a.u(y02), C17294a.u(ShelfOrRackRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
