package com.ingka.ikea.scanandgo.datalayer.model;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ScanAndGoSettings$$serializer implements N<ScanAndGoSettings> {
    public static final ScanAndGoSettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScanAndGoSettings$$serializer scanAndGoSettings$$serializer = new ScanAndGoSettings$$serializer();
        INSTANCE = scanAndGoSettings$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings", scanAndGoSettings$$serializer, 16);
        j02.p("countryCode", true);
        j02.p("languageCodes", true);
        j02.p("scanAndGoVersion", false);
        j02.p("storeName", false);
        j02.p("timeout", false);
        j02.p("digitalReceipt", false);
        j02.p("upptacka", true);
        j02.p("isCouponEnabled", false);
        j02.p("isPtagLinksSupported", true);
        j02.p("caasEnabled", true);
        j02.p("isCoworkerDiscountEnabled", true);
        j02.p("caasCheckoutEnabled", true);
        j02.p("caasFullserveEnabled", true);
        j02.p("showTotalPricesInclVat", true);
        j02.p("fullserveTimeSlotsEnabled", true);
        j02.p("fullserveEarlyPaymentEnabled", true);
        descriptor = j02;
    }

    private ScanAndGoSettings$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00fe, code lost:
        r7 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x016c, code lost:
        r7 = 15;
        r9 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01ad, code lost:
        r9 = 10;
        r10 = 9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings deserialize(kotlinx.serialization.encoding.Decoder r51) {
        /*
            r50 = this;
            r0 = r51
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings.f120143q
            boolean r3 = r0.q()
            r9 = 10
            r10 = 9
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 3
            r15 = 8
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L_0x00af
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r3 = r0.A(r1, r7, r3, r8)
            java.lang.String r3 = (java.lang.String) r3
            r7 = r2[r6]
            java.lang.Object r6 = r0.A(r1, r6, r7, r8)
            java.util.List r6 = (java.util.List) r6
            r2 = r2[r5]
            java.lang.Object r2 = r0.o(r1, r5, r2, r8)
            rz.N r2 = (rz.N) r2
            java.lang.String r5 = r0.n(r1, r14)
            jK.i0 r7 = jK.C17458i0.f144113a
            java.lang.Object r4 = r0.A(r1, r4, r7, r8)
            java.lang.Long r4 = (java.lang.Long) r4
            boolean r7 = r0.D(r1, r13)
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer r13 = com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r12, r13, r8)
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings r8 = (com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings) r8
            boolean r11 = r0.D(r1, r11)
            boolean r12 = r0.D(r1, r15)
            boolean r10 = r0.D(r1, r10)
            boolean r9 = r0.D(r1, r9)
            r13 = 11
            boolean r13 = r0.D(r1, r13)
            r14 = 12
            boolean r14 = r0.D(r1, r14)
            r15 = 13
            boolean r15 = r0.D(r1, r15)
            r17 = r2
            r2 = 14
            boolean r2 = r0.D(r1, r2)
            r16 = r7
            r7 = 15
            boolean r7 = r0.D(r1, r7)
            r18 = 65535(0xffff, float:9.1834E-41)
            r47 = r2
            r33 = r3
            r37 = r4
            r36 = r5
            r34 = r6
            r48 = r7
            r39 = r8
            r43 = r9
            r42 = r10
            r40 = r11
            r41 = r12
            r44 = r13
            r45 = r14
            r46 = r15
            r38 = r16
            r35 = r17
            r32 = r18
            goto L_0x01df
        L_0x00af:
            r3 = r7
            r7 = 15
            r4 = r3
            r19 = r4
            r20 = r19
            r23 = r20
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r6
            r5 = r8
            r6 = r5
            r14 = r6
            r21 = r14
            r22 = r21
            r3 = r22
            r8 = r29
        L_0x00d2:
            if (r30 == 0) goto L_0x01bb
            int r13 = r0.p(r1)
            switch(r13) {
                case -1: goto L_0x01b3;
                case 0: goto L_0x0199;
                case 1: goto L_0x018b;
                case 2: goto L_0x017d;
                case 3: goto L_0x0172;
                case 4: goto L_0x015f;
                case 5: goto L_0x0151;
                case 6: goto L_0x0143;
                case 7: goto L_0x0138;
                case 8: goto L_0x012d;
                case 9: goto L_0x0122;
                case 10: goto L_0x0117;
                case 11: goto L_0x010c;
                case 12: goto L_0x0101;
                case 13: goto L_0x00f4;
                case 14: goto L_0x00eb;
                case 15: goto L_0x00e1;
                default: goto L_0x00db;
            }
        L_0x00db:
            fK.E r0 = new fK.E
            r0.<init>((int) r13)
            throw r0
        L_0x00e1:
            boolean r20 = r0.D(r1, r7)
            r13 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r13
        L_0x00e9:
            r13 = 5
            goto L_0x00d2
        L_0x00eb:
            r13 = 14
            boolean r8 = r0.D(r1, r13)
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            goto L_0x00e9
        L_0x00f4:
            r7 = 13
            r13 = 14
            boolean r29 = r0.D(r1, r7)
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x00fe:
            r7 = 15
            goto L_0x00e9
        L_0x0101:
            r7 = 12
            r13 = 14
            boolean r28 = r0.D(r1, r7)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            goto L_0x00fe
        L_0x010c:
            r7 = 11
            r13 = 14
            boolean r27 = r0.D(r1, r7)
            r4 = r4 | 2048(0x800, float:2.87E-42)
            goto L_0x00fe
        L_0x0117:
            r7 = 11
            r13 = 14
            boolean r23 = r0.D(r1, r9)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            goto L_0x00fe
        L_0x0122:
            r7 = 11
            r13 = 14
            boolean r24 = r0.D(r1, r10)
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x00fe
        L_0x012d:
            r7 = 11
            r13 = 14
            boolean r26 = r0.D(r1, r15)
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x00fe
        L_0x0138:
            r7 = 11
            r13 = 14
            boolean r25 = r0.D(r1, r11)
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x00fe
        L_0x0143:
            r13 = 14
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer r7 = com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r12, r7, r14)
            r14 = r7
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings r14 = (com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings) r14
            r4 = r4 | 64
            goto L_0x00fe
        L_0x0151:
            r7 = 5
            r13 = 14
            boolean r19 = r0.D(r1, r7)
            r4 = r4 | 32
            r13 = r7
            r7 = 15
            goto L_0x00d2
        L_0x015f:
            r13 = 14
            jK.i0 r7 = jK.C17458i0.f144113a
            r9 = 4
            java.lang.Object r5 = r0.A(r1, r9, r7, r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r4 = r4 | 16
        L_0x016c:
            r7 = 15
            r9 = 10
            goto L_0x00e9
        L_0x0172:
            r7 = 3
            r9 = 4
            r13 = 14
            java.lang.String r22 = r0.n(r1, r7)
            r4 = r4 | 8
            goto L_0x016c
        L_0x017d:
            r7 = 2
            r13 = 14
            r9 = r2[r7]
            java.lang.Object r6 = r0.o(r1, r7, r9, r6)
            rz.N r6 = (rz.N) r6
            r4 = r4 | 4
            goto L_0x016c
        L_0x018b:
            r9 = 1
            r13 = 14
            r7 = r2[r9]
            java.lang.Object r3 = r0.A(r1, r9, r7, r3)
            java.util.List r3 = (java.util.List) r3
            r4 = r4 | 2
            goto L_0x016c
        L_0x0199:
            r9 = 1
            r13 = 14
            jK.Y0 r7 = jK.Y0.f144077a
            r9 = r21
            r10 = 0
            java.lang.Object r7 = r0.A(r1, r10, r7, r9)
            r21 = r7
            java.lang.String r21 = (java.lang.String) r21
            r4 = r4 | 1
            r7 = 15
        L_0x01ad:
            r9 = 10
            r10 = 9
            goto L_0x00e9
        L_0x01b3:
            r9 = r21
            r10 = 0
            r13 = 14
            r30 = r10
            goto L_0x01ad
        L_0x01bb:
            r9 = r21
            r34 = r3
            r32 = r4
            r37 = r5
            r35 = r6
            r47 = r8
            r33 = r9
            r39 = r14
            r38 = r19
            r48 = r20
            r36 = r22
            r43 = r23
            r42 = r24
            r40 = r25
            r41 = r26
            r44 = r27
            r45 = r28
            r46 = r29
        L_0x01df:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r0 = new com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings
            r31 = r0
            r49 = 0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ScanAndGoSettings scanAndGoSettings) {
        C17542s.j(encoder, "encoder");
        C17542s.j(scanAndGoSettings, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ScanAndGoSettings.t(scanAndGoSettings, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ScanAndGoSettings.f120143q;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(a10[1]);
        KSerializer<?> kSerializer = a10[2];
        KSerializer<?> u12 = C17294a.u(C17458i0.f144113a);
        KSerializer<?> u13 = C17294a.u(UpptackaSettings$$serializer.INSTANCE);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, kSerializer, y02, u12, iVar, u13, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
