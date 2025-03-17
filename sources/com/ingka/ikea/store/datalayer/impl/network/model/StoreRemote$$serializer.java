package com.ingka.ikea.store.datalayer.impl.network.model;

import XH.C16814e;
import com.google.android.libraries.places.api.model.PlaceTypes;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/store/datalayer/impl/network/model/StoreRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StoreRemote$$serializer implements N<StoreRemote> {
    public static final StoreRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoreRemote$$serializer storeRemote$$serializer = new StoreRemote$$serializer();
        INSTANCE = storeRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote", storeRemote$$serializer, 8);
        j02.p("title", false);
        j02.p(PlaceTypes.ADDRESS, false);
        j02.p("latitude", false);
        j02.p("longitude", false);
        j02.p("storeId", false);
        j02.p("storeSettings", false);
        j02.p("childStores", false);
        j02.p("buClassification", false);
        descriptor = j02;
    }

    private StoreRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote.f120387i
            boolean r3 = r0.q()
            r4 = 7
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 5
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0070
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r11 = r0.A(r1, r11, r3, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r3, r12)
            java.lang.String r10 = (java.lang.String) r10
            jK.C r13 = jK.C17438C.f144010a
            java.lang.Object r7 = r0.A(r1, r7, r13, r12)
            java.lang.Double r7 = (java.lang.Double) r7
            java.lang.Object r5 = r0.A(r1, r5, r13, r12)
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r3 = r0.A(r1, r6, r3, r12)
            java.lang.String r3 = (java.lang.String) r3
            r6 = r2[r9]
            java.lang.Object r6 = r0.o(r1, r9, r6, r12)
            java.util.List r6 = (java.util.List) r6
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r12)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote$BuClassificationRemote$$serializer r8 = com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote$BuClassificationRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r8, r12)
            com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote$BuClassificationRemote r4 = (com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote.BuClassificationRemote) r4
            r8 = 255(0xff, float:3.57E-43)
            r25 = r2
            r23 = r3
            r26 = r4
            r22 = r5
            r24 = r6
            r21 = r7
            r18 = r8
            r20 = r10
            r19 = r11
            goto L_0x010b
        L_0x0070:
            r16 = r10
            r3 = r11
            r5 = r12
            r7 = r5
            r10 = r7
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007a:
            if (r16 == 0) goto L_0x00f9
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00f5;
                case 0: goto L_0x00e7;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a1;
                case 6: goto L_0x0095;
                case 7: goto L_0x0089;
                default: goto L_0x0083;
            }
        L_0x0083:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0089:
            com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote$BuClassificationRemote$$serializer r6 = com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote$BuClassificationRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.o(r1, r4, r6, r5)
            com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote$BuClassificationRemote r5 = (com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote.BuClassificationRemote) r5
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0093:
            r6 = 4
            goto L_0x007a
        L_0x0095:
            r6 = r2[r8]
            java.lang.Object r6 = r0.o(r1, r8, r6, r7)
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 64
            goto L_0x0093
        L_0x00a1:
            r6 = r2[r9]
            java.lang.Object r6 = r0.o(r1, r9, r6, r10)
            r10 = r6
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 32
            goto L_0x0093
        L_0x00ad:
            jK.Y0 r6 = jK.Y0.f144077a
            r4 = 4
            java.lang.Object r6 = r0.A(r1, r4, r6, r11)
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 16
            r6 = r4
            r4 = 7
            goto L_0x007a
        L_0x00bc:
            r4 = 4
            jK.C r6 = jK.C17438C.f144010a
            r4 = 3
            java.lang.Object r6 = r0.A(r1, r4, r6, r15)
            r15 = r6
            java.lang.Double r15 = (java.lang.Double) r15
            r3 = r3 | 8
        L_0x00c9:
            r4 = 7
            goto L_0x0093
        L_0x00cb:
            r4 = 3
            jK.C r6 = jK.C17438C.f144010a
            r4 = 2
            java.lang.Object r6 = r0.A(r1, r4, r6, r14)
            r14 = r6
            java.lang.Double r14 = (java.lang.Double) r14
            r3 = r3 | 4
            goto L_0x00c9
        L_0x00d9:
            r4 = 2
            jK.Y0 r6 = jK.Y0.f144077a
            r4 = 1
            java.lang.Object r6 = r0.A(r1, r4, r6, r13)
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 2
            goto L_0x00c9
        L_0x00e7:
            r4 = 1
            jK.Y0 r6 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r6 = r0.A(r1, r4, r6, r12)
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1
            goto L_0x00c9
        L_0x00f5:
            r4 = 0
            r16 = r4
            goto L_0x00c9
        L_0x00f9:
            r18 = r3
            r26 = r5
            r25 = r7
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x010b:
            r0.c(r1)
            com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote r0 = new com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.store.datalayer.impl.network.model.StoreRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StoreRemote storeRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(storeRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StoreRemote.c(storeRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = StoreRemote.f120387i;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{u10, u11, C17294a.u(c10), C17294a.u(c10), C17294a.u(y02), a10[5], a10[6], StoreRemote$BuClassificationRemote$$serializer.INSTANCE};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
