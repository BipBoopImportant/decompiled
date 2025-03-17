package com.ingka.ikea.store.impl.data.remotemodel;

import XH.C16814e;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote;
import iK.C17395d;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote.AddressRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StoreDetailsRemote$AddressRemote$$serializer implements N<StoreDetailsRemote.AddressRemote> {
    public static final StoreDetailsRemote$AddressRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoreDetailsRemote$AddressRemote$$serializer storeDetailsRemote$AddressRemote$$serializer = new StoreDetailsRemote$AddressRemote$$serializer();
        INSTANCE = storeDetailsRemote$AddressRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote.AddressRemote", storeDetailsRemote$AddressRemote$$serializer, 17);
        j02.p("title", false);
        j02.p("firstName", false);
        j02.p("lastName", false);
        j02.p("companyName", false);
        j02.p("phone", false);
        j02.p("email", false);
        j02.p("mobile", false);
        j02.p("addressLine1", false);
        j02.p("addressLine2", false);
        j02.p("addressLine3", false);
        j02.p("streetName", false);
        j02.p("streetNumber", false);
        j02.p("postcode", false);
        j02.p("city", false);
        j02.p("state", false);
        j02.p(PlaceTypes.COUNTRY, false);
        j02.p("displayAddress", false);
        descriptor = j02;
    }

    private StoreDetailsRemote$AddressRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00ff, code lost:
        r2 = r2 | r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0100, code lost:
        r13 = r31;
        r14 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01de, code lost:
        r14 = r24;
        r3 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01fc, code lost:
        r13 = r23;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote.AddressRemote deserialize(kotlinx.serialization.encoding.Decoder r54) {
        /*
            r53 = this;
            r0 = r54
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r7 = 11
            r8 = 10
            r9 = 9
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 3
            r15 = 8
            r14 = 4
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x00c9
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r2, r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.A(r1, r4, r2, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A(r1, r3, r2, r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r13 = r0.A(r1, r13, r2, r6)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.A(r1, r14, r2, r6)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r0.A(r1, r12, r2, r6)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.A(r1, r11, r2, r6)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r2, r6)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r15 = r0.A(r1, r15, r2, r6)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r9 = r0.A(r1, r9, r2, r6)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.A(r1, r8, r2, r6)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.A(r1, r7, r2, r6)
            java.lang.String r7 = (java.lang.String) r7
            r20 = r3
            r3 = 12
            java.lang.Object r3 = r0.A(r1, r3, r2, r6)
            java.lang.String r3 = (java.lang.String) r3
            r19 = r3
            r3 = 13
            java.lang.Object r3 = r0.A(r1, r3, r2, r6)
            java.lang.String r3 = (java.lang.String) r3
            r18 = r3
            r3 = 14
            java.lang.Object r3 = r0.A(r1, r3, r2, r6)
            java.lang.String r3 = (java.lang.String) r3
            r17 = r3
            r3 = 15
            java.lang.Object r3 = r0.A(r1, r3, r2, r6)
            java.lang.String r3 = (java.lang.String) r3
            r16 = r3
            r3 = 16
            java.lang.Object r2 = r0.A(r1, r3, r2, r6)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 131071(0x1ffff, float:1.8367E-40)
            r51 = r2
            r34 = r3
            r36 = r4
            r35 = r5
            r46 = r7
            r45 = r8
            r44 = r9
            r42 = r10
            r41 = r11
            r40 = r12
            r38 = r13
            r39 = r14
            r43 = r15
            r50 = r16
            r49 = r17
            r48 = r18
            r47 = r19
            r37 = r20
            goto L_0x02a0
        L_0x00c9:
            r30 = r4
            r2 = r5
            r3 = r6
            r4 = r3
            r5 = r4
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r26 = r15
            r27 = r26
            r28 = r27
            r29 = r28
        L_0x00e0:
            if (r30 == 0) goto L_0x026e
            r31 = r13
            int r13 = r0.p(r1)
            switch(r13) {
                case -1: goto L_0x025c;
                case 0: goto L_0x023b;
                case 1: goto L_0x021c;
                case 2: goto L_0x01ff;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01b1;
                case 6: goto L_0x01a1;
                case 7: goto L_0x0190;
                case 8: goto L_0x017e;
                case 9: goto L_0x016c;
                case 10: goto L_0x015b;
                case 11: goto L_0x014a;
                case 12: goto L_0x0139;
                case 13: goto L_0x0128;
                case 14: goto L_0x0117;
                case 15: goto L_0x0105;
                case 16: goto L_0x00f1;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            fK.E r0 = new fK.E
            r0.<init>((int) r13)
            throw r0
        L_0x00f1:
            jK.Y0 r13 = jK.Y0.f144077a
            r32 = r14
            r14 = 16
            java.lang.Object r3 = r0.A(r1, r14, r13, r3)
            java.lang.String r3 = (java.lang.String) r3
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00ff:
            r2 = r2 | r13
        L_0x0100:
            r13 = r31
            r14 = r32
            goto L_0x00e0
        L_0x0105:
            r32 = r14
            r14 = 16
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 15
            java.lang.Object r4 = r0.A(r1, r14, r13, r4)
            java.lang.String r4 = (java.lang.String) r4
            r13 = 32768(0x8000, float:4.5918E-41)
            goto L_0x00ff
        L_0x0117:
            r32 = r14
            r14 = 15
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 14
            java.lang.Object r5 = r0.A(r1, r14, r13, r5)
            java.lang.String r5 = (java.lang.String) r5
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0100
        L_0x0128:
            r32 = r14
            r14 = 14
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 13
            java.lang.Object r6 = r0.A(r1, r14, r13, r6)
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0100
        L_0x0139:
            r32 = r14
            r14 = 13
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 12
            java.lang.Object r7 = r0.A(r1, r14, r13, r7)
            java.lang.String r7 = (java.lang.String) r7
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            goto L_0x0100
        L_0x014a:
            r32 = r14
            r14 = 12
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 11
            java.lang.Object r8 = r0.A(r1, r14, r13, r8)
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 2048(0x800, float:2.87E-42)
            goto L_0x0100
        L_0x015b:
            r32 = r14
            r14 = 11
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 10
            java.lang.Object r9 = r0.A(r1, r14, r13, r9)
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x0100
        L_0x016c:
            r32 = r14
            r14 = 10
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 9
            java.lang.Object r13 = r0.A(r1, r14, r13, r15)
            r15 = r13
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x0100
        L_0x017e:
            r32 = r14
            r14 = 9
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 8
            java.lang.Object r10 = r0.A(r1, r14, r13, r10)
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x0100
        L_0x0190:
            r32 = r14
            r14 = 8
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 7
            java.lang.Object r11 = r0.A(r1, r14, r13, r11)
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0100
        L_0x01a1:
            r32 = r14
            r14 = 7
            jK.Y0 r13 = jK.Y0.f144077a
            r14 = 6
            java.lang.Object r12 = r0.A(r1, r14, r13, r12)
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 64
            goto L_0x0100
        L_0x01b1:
            r32 = r14
            r14 = 6
            jK.Y0 r13 = jK.Y0.f144077a
            r25 = r3
            r3 = r32
            r14 = 5
            java.lang.Object r3 = r0.A(r1, r14, r13, r3)
            java.lang.String r3 = (java.lang.String) r3
            r2 = r2 | 32
            r14 = r3
            r3 = r25
            r13 = r31
            goto L_0x00e0
        L_0x01ca:
            r25 = r3
            r3 = r14
            r14 = 5
            jK.Y0 r13 = jK.Y0.f144077a
            r24 = r3
            r3 = r31
            r14 = 4
            java.lang.Object r3 = r0.A(r1, r14, r13, r3)
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 16
        L_0x01de:
            r14 = r24
            r3 = r25
            goto L_0x00e0
        L_0x01e4:
            r25 = r3
            r24 = r14
            r3 = r31
            r14 = 4
            jK.Y0 r13 = jK.Y0.f144077a
            r23 = r3
            r3 = r29
            r14 = 3
            java.lang.Object r3 = r0.A(r1, r14, r13, r3)
            r29 = r3
            java.lang.String r29 = (java.lang.String) r29
            r2 = r2 | 8
        L_0x01fc:
            r13 = r23
            goto L_0x01de
        L_0x01ff:
            r25 = r3
            r24 = r14
            r3 = r29
            r23 = r31
            r14 = 3
            jK.Y0 r13 = jK.Y0.f144077a
            r22 = r3
            r3 = r28
            r14 = 2
            java.lang.Object r3 = r0.A(r1, r14, r13, r3)
            r28 = r3
            java.lang.String r28 = (java.lang.String) r28
            r2 = r2 | 4
            r29 = r22
            goto L_0x01fc
        L_0x021c:
            r25 = r3
            r24 = r14
            r3 = r28
            r22 = r29
            r23 = r31
            r14 = 2
            jK.Y0 r13 = jK.Y0.f144077a
            r21 = r3
            r3 = r27
            r14 = 1
            java.lang.Object r3 = r0.A(r1, r14, r13, r3)
            r27 = r3
            java.lang.String r27 = (java.lang.String) r27
            r2 = r2 | 2
            r28 = r21
            goto L_0x01fc
        L_0x023b:
            r25 = r3
            r24 = r14
            r3 = r27
            r21 = r28
            r22 = r29
            r23 = r31
            r14 = 1
            jK.Y0 r13 = jK.Y0.f144077a
            r20 = r3
            r3 = r26
            r14 = 0
            java.lang.Object r3 = r0.A(r1, r14, r13, r3)
            r26 = r3
            java.lang.String r26 = (java.lang.String) r26
            r2 = r2 | 1
            r27 = r20
            goto L_0x01fc
        L_0x025c:
            r25 = r3
            r24 = r14
            r3 = r26
            r20 = r27
            r21 = r28
            r22 = r29
            r23 = r31
            r14 = 0
            r30 = r14
            goto L_0x01fc
        L_0x026e:
            r25 = r3
            r23 = r13
            r24 = r14
            r3 = r26
            r20 = r27
            r21 = r28
            r22 = r29
            r34 = r2
            r35 = r3
            r50 = r4
            r49 = r5
            r48 = r6
            r47 = r7
            r46 = r8
            r45 = r9
            r43 = r10
            r42 = r11
            r41 = r12
            r44 = r15
            r36 = r20
            r37 = r21
            r38 = r22
            r39 = r23
            r40 = r24
            r51 = r25
        L_0x02a0:
            r0.c(r1)
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote r0 = new com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote
            r33 = r0
            r52 = 0
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StoreDetailsRemote.AddressRemote addressRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(addressRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StoreDetailsRemote.AddressRemote.b(addressRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.serialization.KSerializer<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        /*
            r19 = this;
            jK.Y0 r0 = jK.Y0.f144077a
            kotlinx.serialization.KSerializer r1 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r2 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r3 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r4 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r5 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r6 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r7 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r8 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r9 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r10 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r11 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r12 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r13 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r14 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r15 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r16 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r0 = gK.C17294a.u(r0)
            r17 = r0
            r0 = 17
            kotlinx.serialization.KSerializer[] r0 = new kotlinx.serialization.KSerializer[r0]
            r18 = 0
            r0[r18] = r1
            r1 = 1
            r0[r1] = r2
            r1 = 2
            r0[r1] = r3
            r1 = 3
            r0[r1] = r4
            r1 = 4
            r0[r1] = r5
            r1 = 5
            r0[r1] = r6
            r1 = 6
            r0[r1] = r7
            r1 = 7
            r0[r1] = r8
            r1 = 8
            r0[r1] = r9
            r1 = 9
            r0[r1] = r10
            r1 = 10
            r0[r1] = r11
            r1 = 11
            r0[r1] = r12
            r1 = 12
            r0[r1] = r13
            r1 = 13
            r0[r1] = r14
            r1 = 14
            r0[r1] = r15
            r1 = 15
            r0[r1] = r16
            r1 = 16
            r0[r1] = r17
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsRemote$AddressRemote$$serializer.childSerializers():kotlinx.serialization.KSerializer[]");
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
