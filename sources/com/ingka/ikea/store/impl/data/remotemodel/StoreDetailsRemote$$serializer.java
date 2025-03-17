package com.ingka.ikea.store.impl.data.remotemodel;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StoreDetailsRemote$$serializer implements N<StoreDetailsRemote> {
    public static final StoreDetailsRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoreDetailsRemote$$serializer storeDetailsRemote$$serializer = new StoreDetailsRemote$$serializer();
        INSTANCE = storeDetailsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote", storeDetailsRemote$$serializer, 12);
        j02.p("id", false);
        j02.p("name", false);
        j02.p("latitude", false);
        j02.p("longitude", false);
        j02.p(PlaceTypes.ADDRESS, false);
        j02.p("displayName", false);
        j02.p("displayNameAlternate", false);
        j02.p("storePageUrl", false);
        j02.p("placeId", false);
        j02.p("hours", false);
        j02.p("storeInformation", false);
        j02.p("smallStoreDetails", false);
        descriptor = j02;
    }

    private StoreDetailsRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c8, code lost:
        r4 = r19;
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0193, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote deserialize(kotlinx.serialization.encoding.Decoder r37) {
        /*
            r36 = this;
            r0 = r37
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote.f120442m
            boolean r3 = r0.q()
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 9
            r14 = 1
            r15 = 0
            r4 = 0
            if (r3 == 0) goto L_0x009a
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r15 = r0.A(r1, r15, r3, r4)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r0.A(r1, r14, r3, r4)
            java.lang.String r14 = (java.lang.String) r14
            jK.C r5 = jK.C17438C.f144010a
            java.lang.Object r12 = r0.A(r1, r12, r5, r4)
            java.lang.Double r12 = (java.lang.Double) r12
            java.lang.Object r5 = r0.A(r1, r9, r5, r4)
            java.lang.Double r5 = (java.lang.Double) r5
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote$$serializer r9 = com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r11, r9, r4)
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote r9 = (com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote.AddressRemote) r9
            java.lang.Object r8 = r0.A(r1, r8, r3, r4)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.A(r1, r7, r3, r4)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.A(r1, r6, r3, r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r0.A(r1, r10, r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            r2 = r2[r13]
            java.lang.Object r2 = r0.o(r1, r13, r2, r4)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote$$serializer r10 = com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote$$serializer.INSTANCE
            r11 = 10
            java.lang.Object r10 = r0.A(r1, r11, r10, r4)
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote r10 = (com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote) r10
            com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote$$serializer r11 = com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote$$serializer.INSTANCE
            r13 = 11
            java.lang.Object r4 = r0.A(r1, r13, r11, r4)
            com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote r4 = (com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote) r4
            r11 = 4095(0xfff, float:5.738E-42)
            r32 = r2
            r31 = r3
            r34 = r4
            r26 = r5
            r30 = r6
            r29 = r7
            r28 = r8
            r27 = r9
            r33 = r10
            r22 = r11
            r25 = r12
            r24 = r14
            r23 = r15
            goto L_0x01bf
        L_0x009a:
            r3 = r4
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r18 = r14
            r13 = r15
            r14 = r12
            r15 = r14
        L_0x00a8:
            if (r18 == 0) goto L_0x01a2
            r19 = r4
            int r4 = r0.p(r1)
            switch(r4) {
                case -1: goto L_0x0197;
                case 0: goto L_0x017d;
                case 1: goto L_0x0164;
                case 2: goto L_0x0153;
                case 3: goto L_0x0142;
                case 4: goto L_0x0132;
                case 5: goto L_0x0122;
                case 6: goto L_0x0112;
                case 7: goto L_0x0101;
                case 8: goto L_0x00ef;
                case 9: goto L_0x00df;
                case 10: goto L_0x00cd;
                case 11: goto L_0x00b9;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            fK.E r0 = new fK.E
            r0.<init>((int) r4)
            throw r0
        L_0x00b9:
            com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote$$serializer r4 = com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote$$serializer.INSTANCE
            r20 = r3
            r3 = 11
            java.lang.Object r4 = r0.A(r1, r3, r4, r10)
            r10 = r4
            com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote r10 = (com.ingka.ikea.store.impl.data.remotemodel.SmallStoreDetailsRemote) r10
            r13 = r13 | 2048(0x800, float:2.87E-42)
        L_0x00c8:
            r4 = r19
            r3 = r20
            goto L_0x00a8
        L_0x00cd:
            r20 = r3
            r3 = 11
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote$$serializer r4 = com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote$$serializer.INSTANCE
            r3 = 10
            java.lang.Object r4 = r0.A(r1, r3, r4, r6)
            r6 = r4
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote r6 = (com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsInformationRemote) r6
            r13 = r13 | 1024(0x400, float:1.435E-42)
            goto L_0x00c8
        L_0x00df:
            r20 = r3
            r4 = 9
            r3 = r2[r4]
            java.lang.Object r3 = r0.o(r1, r4, r3, r7)
            r7 = r3
            java.util.List r7 = (java.util.List) r7
            r13 = r13 | 512(0x200, float:7.175E-43)
            goto L_0x00c8
        L_0x00ef:
            r20 = r3
            r4 = 9
            jK.Y0 r3 = jK.Y0.f144077a
            r4 = 8
            java.lang.Object r3 = r0.A(r1, r4, r3, r8)
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r13 = r13 | 256(0x100, float:3.59E-43)
            goto L_0x00c8
        L_0x0101:
            r20 = r3
            r4 = 8
            jK.Y0 r3 = jK.Y0.f144077a
            r4 = 7
            java.lang.Object r3 = r0.A(r1, r4, r3, r11)
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r13 = r13 | 128(0x80, float:1.794E-43)
            goto L_0x00c8
        L_0x0112:
            r20 = r3
            r4 = 7
            jK.Y0 r3 = jK.Y0.f144077a
            r4 = 6
            java.lang.Object r3 = r0.A(r1, r4, r3, r9)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r13 = r13 | 64
            goto L_0x00c8
        L_0x0122:
            r20 = r3
            r4 = 6
            jK.Y0 r3 = jK.Y0.f144077a
            r4 = 5
            java.lang.Object r3 = r0.A(r1, r4, r3, r12)
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r13 = r13 | 32
            goto L_0x00c8
        L_0x0132:
            r20 = r3
            r4 = 5
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote$$serializer r3 = com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote$$serializer.INSTANCE
            r4 = 4
            java.lang.Object r3 = r0.A(r1, r4, r3, r14)
            r14 = r3
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote r14 = (com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote.AddressRemote) r14
            r13 = r13 | 16
            goto L_0x00c8
        L_0x0142:
            r20 = r3
            r4 = 4
            jK.C r3 = jK.C17438C.f144010a
            r4 = 3
            java.lang.Object r3 = r0.A(r1, r4, r3, r15)
            r15 = r3
            java.lang.Double r15 = (java.lang.Double) r15
            r13 = r13 | 8
            goto L_0x00c8
        L_0x0153:
            r20 = r3
            r4 = 3
            jK.C r3 = jK.C17438C.f144010a
            r4 = 2
            java.lang.Object r3 = r0.A(r1, r4, r3, r5)
            r5 = r3
            java.lang.Double r5 = (java.lang.Double) r5
            r13 = r13 | 4
            goto L_0x00c8
        L_0x0164:
            r20 = r3
            r4 = 2
            jK.Y0 r3 = jK.Y0.f144077a
            r17 = r2
            r2 = r20
            r4 = 1
            java.lang.Object r2 = r0.A(r1, r4, r3, r2)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            r13 = r13 | 2
            r2 = r17
            r4 = r19
            goto L_0x00a8
        L_0x017d:
            r17 = r2
            r2 = r3
            r4 = 1
            jK.Y0 r3 = jK.Y0.f144077a
            r16 = r2
            r2 = r19
            r4 = 0
            java.lang.Object r2 = r0.A(r1, r4, r3, r2)
            java.lang.String r2 = (java.lang.String) r2
            r13 = r13 | 1
            r4 = r2
            r3 = r16
        L_0x0193:
            r2 = r17
            goto L_0x00a8
        L_0x0197:
            r17 = r2
            r16 = r3
            r2 = r19
            r4 = 0
            r18 = r4
            r4 = r2
            goto L_0x0193
        L_0x01a2:
            r16 = r3
            r2 = r4
            r23 = r2
            r25 = r5
            r33 = r6
            r32 = r7
            r31 = r8
            r29 = r9
            r34 = r10
            r30 = r11
            r28 = r12
            r22 = r13
            r27 = r14
            r26 = r15
            r24 = r16
        L_0x01bf:
            r0.c(r1)
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote r0 = new com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote
            r35 = 0
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StoreDetailsRemote storeDetailsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(storeDetailsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StoreDetailsRemote.c(storeDetailsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = StoreDetailsRemote.f120442m;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{u10, u11, C17294a.u(c10), C17294a.u(c10), C17294a.u(StoreDetailsRemote$AddressRemote$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), a10[9], C17294a.u(StoreDetailsInformationRemote$$serializer.INSTANCE), C17294a.u(SmallStoreDetailsRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
